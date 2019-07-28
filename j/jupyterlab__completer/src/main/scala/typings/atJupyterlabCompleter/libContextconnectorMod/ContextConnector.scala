package typings.atJupyterlabCompleter.libContextconnectorMod

import typings.atJupyterlabCompleter.libContextconnectorMod.ContextConnectorNs.IOptions
import typings.atJupyterlabCompleter.libHandlerMod.CompletionHandlerNs.IReply
import typings.atJupyterlabCompleter.libHandlerMod.CompletionHandlerNs.IRequest
import typings.atJupyterlabCoreutils.atJupyterlabCoreutilsMod.DataConnector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/completer/lib/contextconnector", "ContextConnector")
@js.native
class ContextConnector protected () extends DataConnector[IReply, Unit, IRequest] {
  /**
    * Create a new context connector for completion requests.
    *
    * @param options - The instatiation options for the context connector.
    */
  def this(options: IOptions) = this()
  var _editor: js.Any = js.native
}

