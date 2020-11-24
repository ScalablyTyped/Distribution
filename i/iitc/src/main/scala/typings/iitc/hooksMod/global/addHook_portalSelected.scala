package typings.iitc.hooksMod.global

import typings.iitc.iitcStrings.portalSelected
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("addHook")
@js.native
object addHook_portalSelected extends js.Object {
  
  /**
    * register a callback for an event
    * called when portal on map is selected/unselected
    */
  def apply(event: portalSelected, callback: js.Function1[/* e */ EventPortalSelected, Unit]): Unit = js.native
}
