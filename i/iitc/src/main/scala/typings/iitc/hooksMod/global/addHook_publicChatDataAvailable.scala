package typings.iitc.hooksMod.global

import typings.iitc.iitcStrings.publicChatDataAvailable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("addHook")
@js.native
object addHook_publicChatDataAvailable extends js.Object {
  
  /**
    * register a callback for an event
    * this hook runs after data for any of the public chats has been received and processed, but not
    * yet been displayed. The data hash contains both the unprocessed raw ajax response as well as the processed
    * chat data that is going to be used for display.
    */
  def apply(event: publicChatDataAvailable, callback: js.Function1[/* e */ EventPublicChatDataAvailable, Unit]): Unit = js.native
}
