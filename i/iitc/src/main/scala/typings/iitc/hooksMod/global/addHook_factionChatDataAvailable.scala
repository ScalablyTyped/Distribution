package typings.iitc.hooksMod.global

import typings.iitc.iitcStrings.factionChatDataAvailable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("addHook")
@js.native
object addHook_factionChatDataAvailable extends js.Object {
  
  /**
    * register a callback for an event
    * this hook runs after data for the faction chat has been received and processed, but not yet been
    * displayed. The data hash contains both the unprocessed raw ajax response as well as the processed chat data
    * that is going to be used for display.
    */
  def apply(
    event: factionChatDataAvailable,
    callback: js.Function1[/* e */ EventFactionChatDataAvailable, Unit]
  ): Unit = js.native
}
