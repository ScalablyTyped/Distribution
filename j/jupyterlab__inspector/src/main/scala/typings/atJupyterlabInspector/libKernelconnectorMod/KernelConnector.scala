package typings.atJupyterlabInspector.libKernelconnectorMod

import typings.atJupyterlabCoreutils.atJupyterlabCoreutilsMod.DataConnector
import typings.atJupyterlabInspector.libHandlerMod.InspectionHandlerNs.IReply
import typings.atJupyterlabInspector.libHandlerMod.InspectionHandlerNs.IRequest
import typings.atJupyterlabInspector.libKernelconnectorMod.KernelConnectorNs.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/inspector/lib/kernelconnector", "KernelConnector")
@js.native
class KernelConnector protected () extends DataConnector[IReply, Unit, IRequest] {
  /**
    * Create a new kernel connector for inspection requests.
    *
    * @param options - The instatiation options for the kernel connector.
    */
  def this(options: IOptions) = this()
  var _session: js.Any = js.native
}

