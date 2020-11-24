package typings.iitc.hooksMod.global

import typings.iitc.iitcStrings.iitcLoaded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("addHook")
@js.native
object addHook_iitcLoaded extends js.Object {
  
  /**
    * register a callback for an event
    * called after IITC and all plugins loaded
    * NOTE: if iitc is already loaded this event never happens. Check the @see iitcLoaded flag
    */
  def apply(event: iitcLoaded, callback: js.Function0[Unit]): Unit = js.native
}
