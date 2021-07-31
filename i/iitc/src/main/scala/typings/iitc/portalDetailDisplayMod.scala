package typings.iitc

import typings.iitc.iitctypesMod.IITC.Portal
import typings.iitc.iitctypesMod.IITC.PortalDataDetail
import typings.iitc.iitctypesMod.PortalGUID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object portalDetailDisplayMod {
  
  object global {
    
    @scala.inline
    def getPortalMiscDetails(guid: PortalGUID): String = js.Dynamic.global.applyDynamic("getPortalMiscDetails")(guid.asInstanceOf[js.Any]).asInstanceOf[String]
    @scala.inline
    def getPortalMiscDetails(guid: PortalGUID, details: PortalDataDetail): String = (js.Dynamic.global.applyDynamic("getPortalMiscDetails")(guid.asInstanceOf[js.Any], details.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @scala.inline
    def renderPortalDetails(guid: PortalGUID): Unit = js.Dynamic.global.applyDynamic("renderPortalDetails")(guid.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def resetScrollOnNewPortal(): Unit = js.Dynamic.global.applyDynamic("resetScrollOnNewPortal")().asInstanceOf[Unit]
    
    /**
      * highlights portal with given GUID. Automatically clears highlights
      * on old selection. Returns false if the selected portal changed.
      * @returns true if it's still the same portal that just needs an update.
      */
    @scala.inline
    def selectPortal(guid: PortalGUID): Boolean = js.Dynamic.global.applyDynamic("selectPortal")(guid.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * draws link-range and hack-range circles around the portal with the
      * given details. Clear them if parameter 'd' is null.
      */
    @scala.inline
    def setPortalIndicators(p: Portal): Unit = js.Dynamic.global.applyDynamic("setPortalIndicators")(p.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}
