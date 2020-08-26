package typings.jointjs.mod.shapes.uml

import typings.jointjs.mod.attributes.SVGCircleAttributes
import typings.jointjs.mod.dia.Cell.Selectors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndStateSelectors extends Selectors {
  @JSName("circle.inner")
  var circleDotinner: js.UndefOr[SVGCircleAttributes] = js.native
  @JSName("circle.outer")
  var circleDotouter: js.UndefOr[SVGCircleAttributes] = js.native
}

object EndStateSelectors {
  @scala.inline
  def apply(): EndStateSelectors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndStateSelectors]
  }
  @scala.inline
  implicit class EndStateSelectorsOps[Self <: EndStateSelectors] (val x: Self) extends AnyVal {
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
    def setCircleDotinner(value: SVGCircleAttributes): Self = this.set("circle.inner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCircleDotinner: Self = this.set("circle.inner", js.undefined)
    @scala.inline
    def setCircleDotouter(value: SVGCircleAttributes): Self = this.set("circle.outer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCircleDotouter: Self = this.set("circle.outer", js.undefined)
  }
  
}

