package typings
package atJupyterlabCompleterLib.libConnectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/completer/lib/connector", "CompletionConnector")
@js.native
class CompletionConnector protected ()
  extends atJupyterlabCoreutilsLib.atJupyterlabCoreutilsMod.DataConnector[
      atJupyterlabCompleterLib.libHandlerMod.CompletionHandlerNs.IReply, 
      scala.Unit, 
      atJupyterlabCompleterLib.libHandlerMod.CompletionHandlerNs.IRequest
    ] {
  /**
    * Create a new connector for completion requests.
    *
    * @param options - The instatiation options for the connector.
    */
  def this(options: atJupyterlabCompleterLib.libConnectorMod.CompletionConnectorNs.IOptions) = this()
  var _context: js.Any = js.native
  var _kernel: js.Any = js.native
}

