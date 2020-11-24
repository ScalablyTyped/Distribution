package typings.iitc.portalDetailDisplayMod

import typings.iitc.iitctypesMod.IITC.Portal
import typings.iitc.iitctypesMod.IITC.PortalDataDetail
import typings.iitc.iitctypesMod.PortalGUID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  def getPortalMiscDetails(guid: PortalGUID): String = js.native
  def getPortalMiscDetails(guid: PortalGUID, details: PortalDataDetail): String = js.native
  
  def renderPortalDetails(guid: PortalGUID): Unit = js.native
  
  def resetScrollOnNewPortal(): Unit = js.native
  
  /**
    * highlights portal with given GUID. Automatically clears highlights
    * on old selection. Returns false if the selected portal changed.
    * @returns true if it's still the same portal that just needs an update.
    */
  def selectPortal(guid: PortalGUID): Boolean = js.native
  
  /**
    * draws link-range and hack-range circles around the portal with the
    * given details. Clear them if parameter 'd' is null.
    */
  def setPortalIndicators(p: Portal): Unit = js.native
}
