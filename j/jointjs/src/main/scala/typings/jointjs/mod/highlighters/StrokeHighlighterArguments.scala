package typings.jointjs.mod.highlighters

import typings.jointjs.mod.attributes.NativeSVGAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StrokeHighlighterArguments extends js.Object {
  var attrs: js.UndefOr[NativeSVGAttributes] = js.native
  var padding: js.UndefOr[Double] = js.native
  var rx: js.UndefOr[Double] = js.native
  var ry: js.UndefOr[Double] = js.native
}

object StrokeHighlighterArguments {
  @scala.inline
  def apply(): StrokeHighlighterArguments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrokeHighlighterArguments]
  }
  @scala.inline
  implicit class StrokeHighlighterArgumentsOps[Self <: StrokeHighlighterArguments] (val x: Self) extends AnyVal {
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
    def setAttrs(value: NativeSVGAttributes): Self = this.set("attrs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttrs: Self = this.set("attrs", js.undefined)
    @scala.inline
    def setPadding(value: Double): Self = this.set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    @scala.inline
    def setRx(value: Double): Self = this.set("rx", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRx: Self = this.set("rx", js.undefined)
    @scala.inline
    def setRy(value: Double): Self = this.set("ry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRy: Self = this.set("ry", js.undefined)
  }
  
}

