package typings
package atJupyterlabFilebrowserLib.libModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUploadModel extends js.Object {
  var path: java.lang.String
  /**
    * % uploaded [0, 1)
    */
  var progress: scala.Double
}

object IUploadModel {
  @scala.inline
  def apply(path: java.lang.String, progress: scala.Double): IUploadModel = {
    val __obj = js.Dynamic.literal(path = path, progress = progress)
  
    __obj.asInstanceOf[IUploadModel]
  }
}

