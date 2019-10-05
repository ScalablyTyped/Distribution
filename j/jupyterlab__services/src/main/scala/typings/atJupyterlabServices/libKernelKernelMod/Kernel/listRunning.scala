package typings.atJupyterlabServices.libKernelKernelMod.Kernel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/services/lib/kernel/kernel", "Kernel.listRunning")
@js.native
object listRunning extends js.Object {
  /**
    * Fetch the running kernels.
    *
    * @param settings - The optional server settings.
    *
    * @returns A promise that resolves with the list of running kernels.
    *
    * #### Notes
    * Uses the [Jupyter Notebook API](http://petstore.swagger.io/?url=https://raw.githubusercontent.com/jupyter/notebook/master/notebook/services/api/api.yaml#!/kernels) and validates the response model.
    *
    * The promise is fulfilled on a valid response and rejected otherwise.
    */
  def apply(): js.Promise[js.Array[IModel]] = js.native
  def apply(
    settings: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ServerConnection.ISettings */ js.Any
  ): js.Promise[js.Array[IModel]] = js.native
}

