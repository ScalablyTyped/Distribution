package typings.atJupyterlabCompleter.libKernelconnectorMod

import typings.atJupyterlabCompleter.libHandlerMod.CompletionHandler.IReply
import typings.atJupyterlabCompleter.libHandlerMod.CompletionHandler.IRequest
import typings.atJupyterlabCompleter.libKernelconnectorMod.KernelConnector.IOptions
import typings.atJupyterlabCoreutils.atJupyterlabCoreutilsMod.DataConnector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/completer/lib/kernelconnector", "KernelConnector")
@js.native
class KernelConnector_ protected () extends DataConnector[IReply, Unit, IRequest] {
  /**
    * Create a new kernel connector for completion requests.
    *
    * @param options - The instatiation options for the kernel connector.
    */
  def this(options: IOptions) = this()
  var _session: js.Any = js.native
}

