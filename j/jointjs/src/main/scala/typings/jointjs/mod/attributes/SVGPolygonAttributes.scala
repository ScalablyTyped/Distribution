package typings.jointjs.mod.attributes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGPolygonAttributes extends SVGAttributes {
  var points: js.UndefOr[String] = js.native
}

object SVGPolygonAttributes {
  @scala.inline
  def apply(): SVGPolygonAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SVGPolygonAttributes]
  }
  @scala.inline
  implicit class SVGPolygonAttributesOps[Self <: SVGPolygonAttributes] (val x: Self) extends AnyVal {
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
    def setPoints(value: String): Self = this.set("points", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePoints: Self = this.set("points", js.undefined)
  }
  
}

