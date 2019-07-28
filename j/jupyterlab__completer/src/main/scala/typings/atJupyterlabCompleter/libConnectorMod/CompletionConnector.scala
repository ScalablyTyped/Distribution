package typings.atJupyterlabCompleter.libConnectorMod

import typings.atJupyterlabCompleter.libConnectorMod.CompletionConnectorNs.IOptions
import typings.atJupyterlabCompleter.libHandlerMod.CompletionHandlerNs.IReply
import typings.atJupyterlabCompleter.libHandlerMod.CompletionHandlerNs.IRequest
import typings.atJupyterlabCoreutils.atJupyterlabCoreutilsMod.DataConnector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/completer/lib/connector", "CompletionConnector")
@js.native
class CompletionConnector protected () extends DataConnector[IReply, Unit, IRequest] {
  /**
    * Create a new connector for completion requests.
    *
    * @param options - The instatiation options for the connector.
    */
  def this(options: IOptions) = this()
  var _context: js.Any = js.native
  var _kernel: js.Any = js.native
}

