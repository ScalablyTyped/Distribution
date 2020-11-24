package typings.iitc.hooksMod.global

import typings.iitc.iitcStrings.fieldAdded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("addHook")
@js.native
object addHook_fieldAdded extends js.Object {
  
  /**
    * register a callback for an event
    * called when a field is about to be added to the map
    */
  def apply(event: fieldAdded, callback: js.Function1[/* e */ EventFieldAdded, Unit]): Unit = js.native
}
