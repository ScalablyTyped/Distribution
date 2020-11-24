package typings.iitc.hooksMod.global

import typings.iitc.iitcStrings.fieldRemoved
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("addHook")
@js.native
object addHook_fieldRemoved extends js.Object {
  
  /**
    * register a callback for an event
    * called when a field has been removed
    */
  def apply(event: fieldRemoved, callback: js.Function1[/* e */ EventFieldRemoved, Unit]): Unit = js.native
}
