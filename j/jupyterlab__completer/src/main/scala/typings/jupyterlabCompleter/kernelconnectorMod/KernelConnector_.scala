package typings.jupyterlabCompleter.kernelconnectorMod

import typings.jupyterlabCompleter.handlerMod.CompletionHandler.IReply
import typings.jupyterlabCompleter.handlerMod.CompletionHandler.IRequest
import typings.jupyterlabCompleter.kernelconnectorMod.KernelConnector.IOptions
import typings.jupyterlabStatedb.dataconnectorMod.DataConnector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/completer/lib/kernelconnector", "KernelConnector")
@js.native
class KernelConnector_ protected () extends DataConnector[IReply, Unit, IRequest, String] {
  /**
    * Create a new kernel connector for completion requests.
    *
    * @param options - The instantiation options for the kernel connector.
    */
  def this(options: IOptions) = this()
  var _session: js.Any = js.native
}

