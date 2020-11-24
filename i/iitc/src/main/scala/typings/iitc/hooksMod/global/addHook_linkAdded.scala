package typings.iitc.hooksMod.global

import typings.iitc.iitcStrings.linkAdded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("addHook")
@js.native
object addHook_linkAdded extends js.Object {
  
  /**
    * register a callback for an event
    * called when a link is about to be added to the map
    */
  def apply(event: linkAdded, callback: js.Function1[/* e */ EventLinkAdded, Unit]): Unit = js.native
}
