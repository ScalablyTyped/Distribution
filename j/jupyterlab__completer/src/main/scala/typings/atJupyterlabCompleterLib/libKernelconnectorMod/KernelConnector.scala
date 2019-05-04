package typings
package atJupyterlabCompleterLib.libKernelconnectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/completer/lib/kernelconnector", "KernelConnector")
@js.native
class KernelConnector protected ()
  extends atJupyterlabCoreutilsLib.atJupyterlabCoreutilsMod.DataConnector[
      atJupyterlabCompleterLib.libHandlerMod.CompletionHandlerNs.IReply, 
      scala.Unit, 
      atJupyterlabCompleterLib.libHandlerMod.CompletionHandlerNs.IRequest
    ] {
  /**
    * Create a new kernel connector for completion requests.
    *
    * @param options - The instatiation options for the kernel connector.
    */
  def this(options: atJupyterlabCompleterLib.libKernelconnectorMod.KernelConnectorNs.IOptions) = this()
  var _session: js.Any = js.native
}

