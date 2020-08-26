package typings.jointjs.mod.shapes.logic

import typings.jointjs.mod.attributes.SVGCircleAttributes
import typings.jointjs.mod.attributes.SVGPathAttributes
import typings.jointjs.mod.attributes.SVGRectAttributes
import typings.jointjs.mod.attributes.SVGTextAttributes
import typings.jointjs.mod.dia.Cell.Selectors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GateSelectors extends Selectors {
  @JSName(".body")
  var Dotbody: js.UndefOr[SVGRectAttributes] = js.native
  @JSName(".wire")
  var Dotwire: js.UndefOr[SVGPathAttributes] = js.native
  var circle: js.UndefOr[SVGCircleAttributes] = js.native
  var text: js.UndefOr[SVGTextAttributes] = js.native
}

object GateSelectors {
  @scala.inline
  def apply(): GateSelectors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GateSelectors]
  }
  @scala.inline
  implicit class GateSelectorsOps[Self <: GateSelectors] (val x: Self) extends AnyVal {
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
    def setDotbody(value: SVGRectAttributes): Self = this.set(".body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDotbody: Self = this.set(".body", js.undefined)
    @scala.inline
    def setDotwire(value: SVGPathAttributes): Self = this.set(".wire", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDotwire: Self = this.set(".wire", js.undefined)
    @scala.inline
    def setCircle(value: SVGCircleAttributes): Self = this.set("circle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCircle: Self = this.set("circle", js.undefined)
    @scala.inline
    def setText(value: SVGTextAttributes): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
  
}

