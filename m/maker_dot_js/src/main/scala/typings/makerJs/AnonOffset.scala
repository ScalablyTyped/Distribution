package typings.makerJs

import typings.makerJs.MakerJs.IModel
import typings.makerJs.MakerJs.IPath
import typings.makerJs.MakerJs.IPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOffset extends js.Object {
  var offset: IPoint
  var path: IPath | IModel
}

object AnonOffset {
  @scala.inline
  def apply(offset: IPoint, path: IPath | IModel): AnonOffset = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOffset]
  }
}

