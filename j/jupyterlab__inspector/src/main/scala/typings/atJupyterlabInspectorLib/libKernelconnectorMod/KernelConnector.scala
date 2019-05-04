package typings
package atJupyterlabInspectorLib.libKernelconnectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/inspector/lib/kernelconnector", "KernelConnector")
@js.native
class KernelConnector protected ()
  extends atJupyterlabCoreutilsLib.atJupyterlabCoreutilsMod.DataConnector[
      atJupyterlabInspectorLib.libHandlerMod.InspectionHandlerNs.IReply, 
      scala.Unit, 
      atJupyterlabInspectorLib.libHandlerMod.InspectionHandlerNs.IRequest
    ] {
  /**
    * Create a new kernel connector for inspection requests.
    *
    * @param options - The instatiation options for the kernel connector.
    */
  def this(options: atJupyterlabInspectorLib.libKernelconnectorMod.KernelConnectorNs.IOptions) = this()
  var _session: js.Any = js.native
}

