package typings.iitc

import typings.iitc.coreIitctypesMod.IITC.Portal
import typings.iitc.coreInteltypesMod.Intel.FieldDetails
import typings.iitc.coreInteltypesMod.Intel.LinkDetails
import typings.iitc.coreInteltypesMod.Intel.PortalDetails
import typings.iitc.iitcStrings.E
import typings.iitc.iitcStrings.N
import typings.iitc.iitcStrings.R
import typings.leaflet.mod.LatLngBounds_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreMapDataRenderMod {
  
  @JSImport("iitc/core/map_data_render", "Render")
  @js.native
  open class Render () extends StObject {
    
    /** add the portal to the visible map layer */
    def addPortalToMapLayer(portal: Portal): Unit = js.native
    
    /* private */ var bounds: LatLngBounds_ = js.native
    
    def bringPortalsToFront(): Unit = js.native
    
    def clearFieldsOutsideBounds(bounds: LatLngBounds_): Unit = js.native
    
    def clearPortalsOutsideBounds(bounds: LatLngBounds_): Unit = js.native
    
    def createFieldEntity(ent: FieldDetails): Unit = js.native
    
    def createLinkEntity(ent: LinkDetails): Unit = js.native
    
    /**
      * intel no longer returns portals at anything but the closest zoom
      * stock intel creates 'placeholder' portals from the data in links/fields - IITC needs to do the same
      * we only have the portal guid, lat/lng coords, and the faction - no other data
      * having the guid, at least, allows the portal details to be loaded once it's selected. however,
      * no highlighters, portal level numbers, portal names, useful counts of portals, etc are possible
      */
    def createPlaceholderPortalEntity(guid: String, latE6: Double, lngE6: Double, team: E | R | N): Unit = js.native
    
    def createPortalEntity(ent: PortalDetails): Unit = js.native
    
    def deleteEntity(guid: String): Unit = js.native
    
    def deleteFieldEntity(guid: String): Unit = js.native
    
    def deleteLinkEntity(guid: String): Unit = js.native
    
    def deletePortalEntity(guid: String): Unit = js.native
    
    /**
      * End a render pass. does any cleaning up required, postponed processing of data, etc. called when the render
      * is considered complete
      */
    def endRenderPass(): Unit = js.native
    
    /* private */ var isRendering: Boolean = js.native
    
    /* private */ var level: Double = js.native
    
    var portalMarkerScale: js.UndefOr[Double] = js.native
    
    def processDeletedGameEntityGuids(deleted: js.Object): Unit = js.native
    
    def processGameEntities(entities: js.Object): Unit = js.native
    
    /** process deleted entity list and entity data */
    def processTileData(tiledata: Any): Unit = js.native
    
    def removePortalFromMapLayer(portal: Portal): Unit = js.native
    
    def rescalePortalMarkers(): Unit = js.native
    
    /** start a render pass. called as we start to make the batch of data requests to the servers */
    def startRenderPass(level: Double, bounds: LatLngBounds_): Unit = js.native
  }
}
