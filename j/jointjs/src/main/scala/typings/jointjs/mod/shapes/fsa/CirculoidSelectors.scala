package typings.jointjs.mod.shapes.fsa

import typings.jointjs.mod.attributes.SVGCircleAttributes
import typings.jointjs.mod.dia.Cell.Selectors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CirculoidSelectors extends Selectors {
  @JSName(".inner")
  var Dotinner: js.UndefOr[SVGCircleAttributes] = js.native
  @JSName(".outer")
  var Dotouter: js.UndefOr[SVGCircleAttributes] = js.native
}

object CirculoidSelectors {
  @scala.inline
  def apply(): CirculoidSelectors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CirculoidSelectors]
  }
  @scala.inline
  implicit class CirculoidSelectorsOps[Self <: CirculoidSelectors] (val x: Self) extends AnyVal {
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
    def setDotinner(value: SVGCircleAttributes): Self = this.set(".inner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDotinner: Self = this.set(".inner", js.undefined)
    @scala.inline
    def setDotouter(value: SVGCircleAttributes): Self = this.set(".outer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDotouter: Self = this.set(".outer", js.undefined)
  }
  
}

