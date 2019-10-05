package typings.atJupyterlabCompleter

import typings.atJupyterlabCompleter.libConnectorMod.CompletionConnector.IOptions
import typings.atJupyterlabCompleter.libHandlerMod.CompletionHandler.IReply
import typings.atJupyterlabCompleter.libHandlerMod.CompletionHandler.IRequest
import typings.atJupyterlabCoreutils.atJupyterlabCoreutilsMod.DataConnector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/completer/lib/connector", JSImport.Namespace)
@js.native
object libConnectorMod extends js.Object {
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
  
  @js.native
  object CompletionConnector extends js.Object {
    /**
      * The instantiation options for cell completion handlers.
      */
    type IOptions = typings.atJupyterlabCompleter.libKernelconnectorMod.KernelConnector.IOptions with typings.atJupyterlabCompleter.libContextconnectorMod.ContextConnector.IOptions
  }
  
}

