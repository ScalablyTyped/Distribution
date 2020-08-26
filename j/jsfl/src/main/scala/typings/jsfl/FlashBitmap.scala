package typings.jsfl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlashBitmap extends js.Object {
  var bits: js.Any = js.native
  var cTab: js.UndefOr[js.Array[String]] = js.native
  var depth: js.Any = js.native
  var height: js.Any = js.native
  var width: js.Any = js.native
}

object FlashBitmap {
  @scala.inline
  def apply(bits: js.Any, depth: js.Any, height: js.Any, width: js.Any): FlashBitmap = {
    val __obj = js.Dynamic.literal(bits = bits.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlashBitmap]
  }
  @scala.inline
  implicit class FlashBitmapOps[Self <: FlashBitmap] (val x: Self) extends AnyVal {
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
    def setBits(value: js.Any): Self = this.set("bits", value.asInstanceOf[js.Any])
    @scala.inline
    def setDepth(value: js.Any): Self = this.set("depth", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: js.Any): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: js.Any): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def setCTabVarargs(value: String*): Self = this.set("cTab", js.Array(value :_*))
    @scala.inline
    def setCTab(value: js.Array[String]): Self = this.set("cTab", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCTab: Self = this.set("cTab", js.undefined)
  }
  
}

