package typings.iitc.portalMarkerMod

import typings.iitc.iitctypesMod.IITC.Portal
import typings.iitc.iitctypesMod.IITC.PortalData
import typings.iitc.iitctypesMod.IITC.PortalOptions
import typings.leaflet.mod.LatLng_
import typings.leaflet.mod.PathOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  /**
    *  create a new marker. 'data' contain the IITC-specific entity data to be stored in the object options
    */
  def createMarker(latlng: LatLng_, data: PortalData): Portal = js.native
  
  def getMarkerStyleOptions(details: PortalOptions): PathOptions = js.native
  
  def portalMarkerScale(): Double = js.native
  
  def setMarkerStyle(marker: Portal, selected: Boolean): Unit = js.native
}
