package typings.atJupyterlabCompleter.libHandlerMod

import typings.atJupyterlabCompleter.libHandlerMod.CompletionHandlerNs.IReply
import typings.atJupyterlabCompleter.libHandlerMod.CompletionHandlerNs.IRequest
import typings.atJupyterlabCompleter.libWidgetMod.Completer
import typings.atJupyterlabCoreutils.libInterfacesMod.IDataConnector
import typings.atPhosphorCoreutils.libJsonMod.ReadonlyJSONObject
import typings.atPhosphorMessaging.atPhosphorMessagingMod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/completer/lib/handler", "CompletionHandler")
@js.native
object CompletionHandlerNs extends js.Object {
  /**
    * The instantiation options for cell completion handlers.
    */
  trait IOptions extends js.Object {
    /**
      * The completion widget the handler will connect to.
      */
    var completer: Completer
    /**
      * The data connector used to populate completion requests.
      *
      * #### Notes
      * The only method of this connector that will ever be called is `fetch`, so
      * it is acceptable for the other methods to be simple functions that return
      * rejected promises.
      */
    var connector: IDataConnector[IReply, Unit, IRequest]
  }
  
  /**
    * A reply to a completion request.
    */
  trait IReply extends js.Object {
    /**
      * The end index for the substring being replaced by completion.
      */
    var end: Double
    /**
      * A list of matching completion strings.
      */
    var matches: js.Array[String]
    /**
      * Any metadata that accompanies the completion reply.
      */
    var metadata: ReadonlyJSONObject
    /**
      * The starting index for the substring being replaced by completion.
      */
    var start: Double
  }
  
  /**
    * The details of a completion request.
    */
  trait IRequest extends js.Object {
    /**
      * The cursor offset position within the text being completed.
      */
    var offset: Double
    /**
      * The text being completed.
      */
    var text: String
  }
  
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

