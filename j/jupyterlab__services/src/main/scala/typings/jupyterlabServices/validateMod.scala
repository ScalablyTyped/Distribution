package typings.jupyterlabServices

import typings.jupyterlabServices.contentsMod.Contents.ICheckpointModel
import typings.jupyterlabServices.contentsMod.Contents.IModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/services/lib/contents/validate", JSImport.Namespace)
@js.native
object validateMod extends js.Object {
  def validateCheckpointModel(model: ICheckpointModel): Unit = js.native
  def validateContentsModel(model: IModel): Unit = js.native
}

