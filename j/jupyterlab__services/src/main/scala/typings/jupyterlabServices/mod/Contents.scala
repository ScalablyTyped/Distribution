package typings.jupyterlabServices.mod

import typings.jupyterlabServices.contentsMod.Contents.ICheckpointModel
import typings.jupyterlabServices.contentsMod.Contents.IModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/services", "Contents")
@js.native
object Contents extends js.Object {
  /**
    * Validates an ICheckpointModel, thowing an error if it does not pass.
    */
  def validateCheckpointModel(checkpoint: ICheckpointModel): Unit = js.native
  /**
    * Validates an IModel, thowing an error if it does not pass.
    */
  def validateContentsModel(contents: IModel): Unit = js.native
}

