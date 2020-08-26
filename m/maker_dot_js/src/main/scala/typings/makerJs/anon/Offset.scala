package typings.makerJs.anon

import typings.makerJs.MakerJs.IModel
import typings.makerJs.MakerJs.IPath
import typings.makerJs.MakerJs.IPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Offset extends js.Object {
  var offset: IPoint = js.native
  var path: IPath | IModel = js.native
}

object Offset {
  @scala.inline
  def apply(offset: IPoint, path: IPath | IModel): Offset = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Offset]
  }
  @scala.inline
  implicit class OffsetOps[Self <: Offset] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOffset(value: IPoint): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: IPath | IModel): Self = this.set("path", value.asInstanceOf[js.Any])
  }
  
}

