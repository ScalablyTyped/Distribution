package typings.iitc

import typings.iitc.iitctypesMod.IITC.Portal
import typings.iitc.iitctypesMod.IITC.PortalDataDetail
import typings.iitc.iitctypesMod.PortalGUID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object portalDetailDisplayMod {
  
  object global {
    
    @JSGlobal("getPortalMiscDetails")
    @js.native
    def getPortalMiscDetails(guid: PortalGUID): String = js.native
    @JSGlobal("getPortalMiscDetails")
    @js.native
    def getPortalMiscDetails(guid: PortalGUID, details: PortalDataDetail): String = js.native
    
    @JSGlobal("renderPortalDetails")
    @js.native
    def renderPortalDetails(guid: PortalGUID): Unit = js.native
    
    @JSGlobal("resetScrollOnNewPortal")
    @js.native
    def resetScrollOnNewPortal(): Unit = js.native
    
    /**
      * highlights portal with given GUID. Automatically clears highlights
      * on old selection. Returns false if the selected portal changed.
      * @returns true if it's still the same portal that just needs an update.
      */
    @JSGlobal("selectPortal")
    @js.native
    def selectPortal(guid: PortalGUID): Boolean = js.native
    
    /**
      * draws link-range and hack-range circles around the portal with the
      * given details. Clear them if parameter 'd' is null.
      */
    @JSGlobal("setPortalIndicators")
    @js.native
    def setPortalIndicators(p: Portal): Unit = js.native
  }
}
