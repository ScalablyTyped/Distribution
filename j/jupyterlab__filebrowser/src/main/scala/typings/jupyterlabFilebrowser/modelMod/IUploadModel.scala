package typings.jupyterlabFilebrowser.modelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUploadModel extends js.Object {
  var path: String
  /**
    * % uploaded [0, 1)
    */
  var progress: Double
}

object IUploadModel {
  @scala.inline
  def apply(path: String, progress: Double): IUploadModel = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUploadModel]
  }
}

