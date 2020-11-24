package typings.iitc.hooksMod.global

import typings.iitc.iitcStrings.linkRemoved
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("addHook")
@js.native
object addHook_linkRemoved extends js.Object {
  
  /**
    * register a callback for an event
    * called when a link has been removed
    */
  def apply(event: linkRemoved, callback: js.Function1[/* e */ EventLinkRemoved, Unit]): Unit = js.native
}
