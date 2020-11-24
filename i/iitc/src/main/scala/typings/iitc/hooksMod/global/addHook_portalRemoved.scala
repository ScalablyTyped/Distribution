package typings.iitc.hooksMod.global

import typings.iitc.iitcStrings.portalRemoved
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("addHook")
@js.native
object addHook_portalRemoved extends js.Object {
  
  /**
    * register a callback for an event
    * called when a portal has been removed
    */
  def apply(event: portalRemoved, callback: js.Function1[/* e */ EventPortalRemoved, Unit]): Unit = js.native
}
