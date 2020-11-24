package typings.iitc.hooksMod.global

import typings.iitc.iitcStrings.portalAdded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("addHook")
@js.native
object addHook_portalAdded extends js.Object {
  
  /**
    * register a callback for an event
    * called when a portal has been received and is about to be added to its layer group.
    * Note that this does NOT mean it is already visible or will be, shortly after.
    * If a portal is added to a hidden layer it may never be shown at all.
    */
  def apply(event: portalAdded, callback: js.Function1[/* e */ EventPortalAdded, Unit]): Unit = js.native
}
