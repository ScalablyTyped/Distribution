package typings.jupyterlabInspector.kernelconnectorMod

import typings.jupyterlabInspector.handlerMod.InspectionHandler.IReply
import typings.jupyterlabInspector.handlerMod.InspectionHandler.IRequest
import typings.jupyterlabInspector.kernelconnectorMod.KernelConnector.IOptions
import typings.jupyterlabStatedb.dataconnectorMod.DataConnector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/inspector/lib/kernelconnector", "KernelConnector")
@js.native
class KernelConnector_ protected () extends DataConnector[IReply, Unit, IRequest, String] {
  /**
    * Create a new kernel connector for inspection requests.
    *
    * @param options - The instatiation options for the kernel connector.
    */
  def this(options: IOptions) = this()
  var _sessionContext: js.Any = js.native
}

