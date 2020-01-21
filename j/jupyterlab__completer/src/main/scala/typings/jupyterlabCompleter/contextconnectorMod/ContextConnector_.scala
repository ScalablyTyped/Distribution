package typings.jupyterlabCompleter.contextconnectorMod

import typings.jupyterlabCompleter.contextconnectorMod.ContextConnector.IOptions
import typings.jupyterlabCompleter.handlerMod.CompletionHandler.IReply
import typings.jupyterlabCompleter.handlerMod.CompletionHandler.IRequest
import typings.jupyterlabCoreutils.dataconnectorMod.DataConnector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/completer/lib/contextconnector", "ContextConnector")
@js.native
class ContextConnector_ protected () extends DataConnector[IReply, Unit, IRequest] {
  /**
    * Create a new context connector for completion requests.
    *
    * @param options - The instatiation options for the context connector.
    */
  def this(options: IOptions) = this()
  var _editor: js.Any = js.native
}

