package typings.jupyterlabServices

import typings.jupyterlabServices.restapiMod.ISpecModel
import typings.jupyterlabServices.restapiMod.ISpecModels
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/services/lib/kernelspec/validate", JSImport.Namespace)
@js.native
object kernelspecValidateMod extends js.Object {
  def validateSpecModel(data: js.Any): ISpecModel = js.native
  def validateSpecModels(data: js.Any): ISpecModels = js.native
}

