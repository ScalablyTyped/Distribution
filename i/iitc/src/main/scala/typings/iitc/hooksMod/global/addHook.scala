package typings.iitc.hooksMod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("addHook")
@js.native
object addHook extends js.Object {
  
  /**
    * register a callback for an event
    * (user defined hooks)
    */
  def apply(event: String, callback: HookCallback): Unit = js.native
}
