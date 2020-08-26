package typings.jointjs.mod.attributes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGTextAttributes extends SVGAttributes {
  var dx: js.UndefOr[String | Double] = js.native
  var dy: js.UndefOr[String | Double] = js.native
  var `length-adjust`: js.UndefOr[String] = js.native
  var lengthAdjust: js.UndefOr[String] = js.native
  var rotate: js.UndefOr[String] = js.native
  @JSName("text-anchor")
  var `text-anchor_SVGTextAttributes`: js.UndefOr[String] = js.native
  var `text-lenght`: js.UndefOr[Double] = js.native
  @JSName("textAnchor")
  var textAnchor_SVGTextAttributes: js.UndefOr[String] = js.native
  var textLength: js.UndefOr[Double] = js.native
  var x: js.UndefOr[String | Double] = js.native
  var y: js.UndefOr[String | Double] = js.native
}

object SVGTextAttributes {
  @scala.inline
  def apply(): SVGTextAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SVGTextAttributes]
  }
  @scala.inline
  implicit class SVGTextAttributesOps[Self <: SVGTextAttributes] (val x: Self) extends AnyVal {
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
    def setDx(value: String | Double): Self = this.set("dx", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDx: Self = this.set("dx", js.undefined)
    @scala.inline
    def setDy(value: String | Double): Self = this.set("dy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDy: Self = this.set("dy", js.undefined)
    @scala.inline
    def `setLength-adjust`(value: String): Self = this.set("length-adjust", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteLength-adjust`: Self = this.set("length-adjust", js.undefined)
    @scala.inline
    def setLengthAdjust(value: String): Self = this.set("lengthAdjust", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLengthAdjust: Self = this.set("lengthAdjust", js.undefined)
    @scala.inline
    def setRotate(value: String): Self = this.set("rotate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotate: Self = this.set("rotate", js.undefined)
    @scala.inline
    def `setText-anchor`(value: String): Self = this.set("text-anchor", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteText-anchor`: Self = this.set("text-anchor", js.undefined)
    @scala.inline
    def `setText-lenght`(value: Double): Self = this.set("text-lenght", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteText-lenght`: Self = this.set("text-lenght", js.undefined)
    @scala.inline
    def setTextAnchor(value: String): Self = this.set("textAnchor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextAnchor: Self = this.set("textAnchor", js.undefined)
    @scala.inline
    def setTextLength(value: Double): Self = this.set("textLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextLength: Self = this.set("textLength", js.undefined)
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

