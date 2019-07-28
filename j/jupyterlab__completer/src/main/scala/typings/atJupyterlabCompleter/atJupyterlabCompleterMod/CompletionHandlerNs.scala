package typings.atJupyterlabCompleter.atJupyterlabCompleterMod

import typings.atPhosphorMessaging.atPhosphorMessagingMod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/completer", "CompletionHandler")
@js.native
object CompletionHandlerNs extends js.Object {
  /**
    * A namespace for completion handler messages.
    */
  @JSName("Msg")
  @js.native
  object MsgNs extends js.Object {
    /**
      * A singleton `'invoke-request'` message.
      */
    val InvokeRequest: Message = js.native
  }
  
}

