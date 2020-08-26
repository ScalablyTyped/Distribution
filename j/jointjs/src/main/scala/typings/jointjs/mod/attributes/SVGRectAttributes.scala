package typings.jointjs.mod.attributes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGRectAttributes extends SVGAttributes {
  var height: js.UndefOr[String | Double] = js.native
  var rx: js.UndefOr[String | Double] = js.native
  var ry: js.UndefOr[String | Double] = js.native
  var width: js.UndefOr[String | Double] = js.native
  var x: js.UndefOr[String | Double] = js.native
  var y: js.UndefOr[String | Double] = js.native
}

object SVGRectAttributes {
  @scala.inline
  def apply(): SVGRectAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SVGRectAttributes]
  }
  @scala.inline
  implicit class SVGRectAttributesOps[Self <: SVGRectAttributes] (val x: Self) extends AnyVal {
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
    def setHeight(value: String | Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setRx(value: String | Double): Self = this.set("rx", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRx: Self = this.set("rx", js.undefined)
    @scala.inline
    def setRy(value: String | Double): Self = this.set("ry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRy: Self = this.set("ry", js.undefined)
    @scala.inline
    def setWidth(value: String | Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setX(value: String | Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    @scala.inline
    def setY(value: String | Double): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
  
}

