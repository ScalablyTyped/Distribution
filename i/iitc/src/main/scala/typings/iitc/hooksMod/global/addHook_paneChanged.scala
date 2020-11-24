package typings.iitc.hooksMod.global

import typings.iitc.iitcStrings.paneChanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("addHook")
@js.native
object addHook_paneChanged extends js.Object {
  
  /**
    * register a callback for an event
    * called when the current pane has changed. On desktop, this only selects the current chat pane; on mobile, it
    * also switches between map, info and other panes defined by plugins
    */
  def apply(event: paneChanged, callback: js.Function1[/* e */ EventPaneChanged, Unit]): Unit = js.native
}
