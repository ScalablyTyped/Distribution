package typings.jupyterlabServices.kernelKernelMod.Kernel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/services/lib/kernel/kernel", "Kernel.startNew")
@js.native
object startNew extends js.Object {
  /**
    * Start a new kernel.
    *
    * @param options - The options used to create the kernel.
    *
    * @returns A promise that resolves with a kernel object.
    *
    * #### Notes
    * Uses the [Jupyter Notebook API](http://petstore.swagger.io/?url=https://raw.githubusercontent.com/jupyter/notebook/master/notebook/services/api/api.yaml#!/kernels) and validates the response model.
    *
    * If no options are given or the kernel name is not given, the
    * default kernel will by started by the server.
    *
    * Wraps the result in a Kernel object. The promise is fulfilled
    * when the kernel is started by the server, otherwise the promise is rejected.
    */
  def apply(): js.Promise[IKernel] = js.native
  def apply(options: IOptions): js.Promise[IKernel] = js.native
}

