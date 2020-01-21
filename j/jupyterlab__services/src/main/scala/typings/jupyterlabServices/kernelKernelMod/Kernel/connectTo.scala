package typings.jupyterlabServices.kernelKernelMod.Kernel

import typings.jupyterlabServices.serverconnectionMod.ServerConnection.ISettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/services/lib/kernel/kernel", "Kernel.connectTo")
@js.native
object connectTo extends js.Object {
  /**
    * Connect to a running kernel.
    *
    * @param model - The model of the running kernel.
    *
    * @param settings - The server settings for the request.
    *
    * @returns The kernel object.
    *
    * #### Notes
    * If the kernel was already started via `startNewKernel`, the existing
    * Kernel object info is used to create another instance.
    */
  def apply(model: IModel): IKernel = js.native
  def apply(model: IModel, settings: ISettings): IKernel = js.native
}

