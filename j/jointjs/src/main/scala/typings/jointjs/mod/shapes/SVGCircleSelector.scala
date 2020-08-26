package typings.jointjs.mod.shapes

import typings.jointjs.mod.attributes.SVGCircleAttributes
import typings.jointjs.mod.dia.Cell.Selectors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGCircleSelector extends Selectors {
  var circle: js.UndefOr[SVGCircleAttributes] = js.native
}

object SVGCircleSelector {
  @scala.inline
  def apply(): SVGCircleSelector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SVGCircleSelector]
  }
  @scala.inline
  implicit class SVGCircleSelectorOps[Self <: SVGCircleSelector] (val x: Self) extends AnyVal {
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
    def setCircle(value: SVGCircleAttributes): Self = this.set("circle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCircle: Self = this.set("circle", js.undefined)
  }
  
}

