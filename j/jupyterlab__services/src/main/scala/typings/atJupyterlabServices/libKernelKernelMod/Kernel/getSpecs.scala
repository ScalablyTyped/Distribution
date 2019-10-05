package typings.atJupyterlabServices.libKernelKernelMod.Kernel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/services/lib/kernel/kernel", "Kernel.getSpecs")
@js.native
object getSpecs extends js.Object {
  /**
    * Fetch all of the kernel specs.
    *
    * @param settings - The optional server settings.
    *
    * @returns A promise that resolves with the kernel specs.
    *
    * #### Notes
    * Uses the [Jupyter Notebook API](http://petstore.swagger.io/?url=https://raw.githubusercontent.com/jupyter/notebook/master/notebook/services/api/api.yaml#!/kernelspecs).
    */
  def apply(): js.Promise[ISpecModels] = js.native
  def apply(
    settings: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ServerConnection.ISettings */ js.Any
  ): js.Promise[ISpecModels] = js.native
}

