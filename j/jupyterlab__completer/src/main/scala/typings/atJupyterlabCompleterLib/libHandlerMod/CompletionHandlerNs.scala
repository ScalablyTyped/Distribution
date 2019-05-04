package typings
package atJupyterlabCompleterLib.libHandlerMod

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
    var completer: atJupyterlabCompleterLib.libWidgetMod.Completer
    /**
      * The data connector used to populate completion requests.
      *
      * #### Notes
      * The only method of this connector that will ever be called is `fetch`, so
      * it is acceptable for the other methods to be simple functions that return
      * rejected promises.
      */
    var connector: atJupyterlabCoreutilsLib.libInterfacesMod.IDataConnector[IReply, scala.Unit, IRequest]
  }
  
  /**
    * A reply to a completion request.
    */
  trait IReply extends js.Object {
    /**
      * The end index for the substring being replaced by completion.
      */
    var end: scala.Double
    /**
      * A list of matching completion strings.
      */
    var matches: js.Array[java.lang.String]
    /**
      * Any metadata that accompanies the completion reply.
      */
    var metadata: atPhosphorCoreutilsLib.libJsonMod.ReadonlyJSONObject
    /**
      * The starting index for the substring being replaced by completion.
      */
    var start: scala.Double
  }
  
  /**
    * The details of a completion request.
    */
  trait IRequest extends js.Object {
    /**
      * The cursor offset position within the text being completed.
      */
    var offset: scala.Double
    /**
      * The text being completed.
      */
    var text: java.lang.String
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
    val InvokeRequest: atPhosphorMessagingLib.atPhosphorMessagingMod.Message = js.native
  }
  
}

