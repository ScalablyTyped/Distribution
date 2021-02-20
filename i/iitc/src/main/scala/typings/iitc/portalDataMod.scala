package typings.iitc

import typings.iitc.anon.CaptureAp
import typings.iitc.anon.In
import typings.iitc.iitctypesMod.FieldGUID
import typings.iitc.iitctypesMod.PortalGUID
import typings.leaflet.mod.LatLng_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object portalDataMod {
  
  object global {
    
    /** find guid by position E6 */
    @JSGlobal("findPortalGuidByPositionE6")
    @js.native
    def findPortalGuidByPositionE6(latE6: Double, lngE6: Double): PortalGUID | Null = js.native
    
    /**
      * find the lat/lon for a portal, using any and all available data
      * (we have the list of portals, the cached portal details, plus links and fields as sources of portal locations)
      */
    @JSGlobal("findPortalLatLng")
    @js.native
    def findPortalLatLng(guid: PortalGUID): js.UndefOr[LatLng_] = js.native
    
    /**
      * get the AP gains from a portal, based only on the brief summary data from portals, links and fields
      * not entirely accurate - but available for all portals on the screen
      */
    @JSGlobal("getPortalApGain")
    @js.native
    def getPortalApGain(guid: PortalGUID): js.UndefOr[Double] = js.native
    
    @JSGlobal("getPortalFields")
    @js.native
    def getPortalFields(guid: PortalGUID): Double = js.native
    /**
      * Get Fields of portal
      * search through the fields for all that reference a portal
      */
    @JSGlobal("getPortalFields")
    @js.native
    def getPortalFields_Array(guid: PortalGUID): js.Array[FieldGUID] = js.native
    
    /**
      * Get Links of portal
      * search through the links data for all that link from or to a portal. returns an object with separate lists of in
      * and out links. may or may not be as accurate as the portal details, depending on how much data the API returns
      */
    @JSGlobal("getPortalLinks")
    @js.native
    def getPortalLinks(guid: PortalGUID): In = js.native
    
    @JSGlobal("getPortalLinksCount")
    @js.native
    def getPortalLinksCount(guid: PortalGUID): Double = js.native
    
    /**
      * given counts of resonators, links and fields, calculate the available AP
      * doesn't take account AP for resonator upgrades or AP for adding mods
      */
    @JSGlobal("portalApGainMaths")
    @js.native
    def portalApGainMaths(resCount: Double, linkCount: Double, fieldCount: Double): CaptureAp = js.native
    
    @JSGlobal("pushPortalGuidPositionCache")
    @js.native
    def pushPortalGuidPositionCache(guid: PortalGUID, latE6: Double, lngE6: Double): Unit = js.native
  }
}
