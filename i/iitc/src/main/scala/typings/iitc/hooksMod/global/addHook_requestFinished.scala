package typings.iitc.hooksMod.global

import typings.iitc.iitcStrings.requestFinished
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("addHook")
@js.native
object addHook_requestFinished extends js.Object {
  
  /**
    * register a callback for an event
    * called after each map data request finished.
    */
  def apply(event: requestFinished, callback: js.Function1[/* e */ EventRequestFinished, Unit]): Unit = js.native
}
