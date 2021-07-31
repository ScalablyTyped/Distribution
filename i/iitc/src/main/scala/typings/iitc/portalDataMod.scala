package typings.iitc

import typings.iitc.anon.CaptureAp
import typings.iitc.anon.In
import typings.iitc.iitctypesMod.FieldGUID
import typings.iitc.iitctypesMod.PortalGUID
import typings.leaflet.mod.LatLng_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object portalDataMod {
  
  object global {
    
    /** find guid by position E6 */
    @scala.inline
    def findPortalGuidByPositionE6(latE6: Double, lngE6: Double): PortalGUID | Null = (js.Dynamic.global.applyDynamic("findPortalGuidByPositionE6")(latE6.asInstanceOf[js.Any], lngE6.asInstanceOf[js.Any])).asInstanceOf[PortalGUID | Null]
    
    /**
      * find the lat/lon for a portal, using any and all available data
      * (we have the list of portals, the cached portal details, plus links and fields as sources of portal locations)
      */
    @scala.inline
    def findPortalLatLng(guid: PortalGUID): js.UndefOr[LatLng_] = js.Dynamic.global.applyDynamic("findPortalLatLng")(guid.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[LatLng_]]
    
    /**
      * get the AP gains from a portal, based only on the brief summary data from portals, links and fields
      * not entirely accurate - but available for all portals on the screen
      */
    @scala.inline
    def getPortalApGain(guid: PortalGUID): js.UndefOr[Double] = js.Dynamic.global.applyDynamic("getPortalApGain")(guid.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
    
    @scala.inline
    def getPortalFields(guid: PortalGUID): Double = js.Dynamic.global.applyDynamic("getPortalFields")(guid.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Get Fields of portal
      * search through the fields for all that reference a portal
      */
    @scala.inline
    def getPortalFields_Array(guid: PortalGUID): js.Array[FieldGUID] = js.Dynamic.global.applyDynamic("getPortalFields")(guid.asInstanceOf[js.Any]).asInstanceOf[js.Array[FieldGUID]]
    
    /**
      * Get Links of portal
      * search through the links data for all that link from or to a portal. returns an object with separate lists of in
      * and out links. may or may not be as accurate as the portal details, depending on how much data the API returns
      */
    @scala.inline
    def getPortalLinks(guid: PortalGUID): In = js.Dynamic.global.applyDynamic("getPortalLinks")(guid.asInstanceOf[js.Any]).asInstanceOf[In]
    
    @scala.inline
    def getPortalLinksCount(guid: PortalGUID): Double = js.Dynamic.global.applyDynamic("getPortalLinksCount")(guid.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * given counts of resonators, links and fields, calculate the available AP
      * doesn't take account AP for resonator upgrades or AP for adding mods
      */
    @scala.inline
    def portalApGainMaths(resCount: Double, linkCount: Double, fieldCount: Double): CaptureAp = (js.Dynamic.global.applyDynamic("portalApGainMaths")(resCount.asInstanceOf[js.Any], linkCount.asInstanceOf[js.Any], fieldCount.asInstanceOf[js.Any])).asInstanceOf[CaptureAp]
    
    @scala.inline
    def pushPortalGuidPositionCache(guid: PortalGUID, latE6: Double, lngE6: Double): Unit = (js.Dynamic.global.applyDynamic("pushPortalGuidPositionCache")(guid.asInstanceOf[js.Any], latE6.asInstanceOf[js.Any], lngE6.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
