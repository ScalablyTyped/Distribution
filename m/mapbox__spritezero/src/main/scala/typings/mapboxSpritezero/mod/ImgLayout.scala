package typings.mapboxSpritezero.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImgLayout extends js.Object {
  var height: Double = js.native
  var items: js.Array[ImageItem] = js.native
  var width: Double = js.native
}

object ImgLayout {
  @scala.inline
  def apply(height: Double, items: js.Array[ImageItem], width: Double): ImgLayout = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImgLayout]
  }
  @scala.inline
  implicit class ImgLayoutOps[Self <: ImgLayout] (val x: Self) extends AnyVal {
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
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemsVarargs(value: ImageItem*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[ImageItem]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
  
}

