package typings.makerJs.anon

import typings.makerJs.MakerJs.IModel
import typings.makerJs.MakerJs.IPath
import typings.makerJs.MakerJs.IPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Offset extends js.Object {
  var offset: IPoint
  var path: IPath | IModel
}

object Offset {
  @scala.inline
  def apply(offset: IPoint, path: IPath | IModel): Offset = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Offset]
  }
}

