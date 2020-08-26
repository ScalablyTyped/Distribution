package typings.jimp.anon

import typings.jimp.mod.DepreciatedJimp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Idx extends js.Object {
  var idx: Double = js.native
  var image: DepreciatedJimp = js.native
  var x: Double = js.native
  var y: Double = js.native
}

object Idx {
  @scala.inline
  def apply(idx: Double, image: DepreciatedJimp, x: Double, y: Double): Idx = {
    val __obj = js.Dynamic.literal(idx = idx.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Idx]
  }
  @scala.inline
  implicit class IdxOps[Self <: Idx] (val x: Self) extends AnyVal {
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
    def setIdx(value: Double): Self = this.set("idx", value.asInstanceOf[js.Any])
    @scala.inline
    def setImage(value: DepreciatedJimp): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
  
}

