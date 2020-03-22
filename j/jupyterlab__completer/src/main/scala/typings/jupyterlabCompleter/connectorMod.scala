package typings.jupyterlabCompleter

import typings.jupyterlabCompleter.connectorMod.CompletionConnector.IOptions
import typings.jupyterlabCompleter.handlerMod.CompletionHandler.IReply
import typings.jupyterlabCompleter.handlerMod.CompletionHandler.IRequest
import typings.jupyterlabStatedb.dataconnectorMod.DataConnector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/completer/lib/connector", JSImport.Namespace)
@js.native
object connectorMod extends js.Object {
  @js.native
  class CompletionConnector protected () extends DataConnector[IReply, Unit, IRequest, String] {
    /**
      * Create a new connector for completion requests.
      *
      * @param options - The instatiation options for the connector.
      */
    def this(options: IOptions) = this()
    var _context: js.Any = js.native
    var _kernel: js.Any = js.native
  }
  
  @js.native
  object CompletionConnector extends js.Object {
    /**
      * The instantiation options for cell completion handlers.
      */
    type IOptions = typings.jupyterlabCompleter.kernelconnectorMod.KernelConnector.IOptions with typings.jupyterlabCompleter.contextconnectorMod.ContextConnector.IOptions
  }
  
}

