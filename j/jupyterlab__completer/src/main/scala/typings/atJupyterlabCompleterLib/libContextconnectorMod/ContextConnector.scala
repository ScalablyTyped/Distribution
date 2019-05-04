package typings
package atJupyterlabCompleterLib.libContextconnectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/completer/lib/contextconnector", "ContextConnector")
@js.native
class ContextConnector protected ()
  extends atJupyterlabCoreutilsLib.atJupyterlabCoreutilsMod.DataConnector[
      atJupyterlabCompleterLib.libHandlerMod.CompletionHandlerNs.IReply, 
      scala.Unit, 
      atJupyterlabCompleterLib.libHandlerMod.CompletionHandlerNs.IRequest
    ] {
  /**
    * Create a new context connector for completion requests.
    *
    * @param options - The instatiation options for the context connector.
    */
  def this(options: atJupyterlabCompleterLib.libContextconnectorMod.ContextConnectorNs.IOptions) = this()
  var _editor: js.Any = js.native
}

