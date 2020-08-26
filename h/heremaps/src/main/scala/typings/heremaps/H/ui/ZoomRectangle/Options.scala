package typings.heremaps.H.ui.ZoomRectangle

import typings.heremaps.H.Map_
import typings.heremaps.H.ui.LayoutAlignment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @property alignment {H.ui.LayoutAlignment=} - the layout alignment which should be applied to this control, default is H.ui.LayoutAlignment.BOTTOM_RIGHT
  * @property adjustZoom {function(number, H.Map): number=} - optional function that defines how zoom level should be changed, by default zoom level is picked to fit the
  * bounding rectangle into the view port.
  */
@js.native
trait Options extends js.Object {
  var adjustZoom: js.UndefOr[js.Function2[/* n */ Double, /* m */ Map_, Double]] = js.native
  var alignment: js.UndefOr[LayoutAlignment] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setAdjustZoom(value: (/* n */ Double, /* m */ Map_) => Double): Self = this.set("adjustZoom", js.Any.fromFunction2(value))
    @scala.inline
    def deleteAdjustZoom: Self = this.set("adjustZoom", js.undefined)
    @scala.inline
    def setAlignment(value: LayoutAlignment): Self = this.set("alignment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlignment: Self = this.set("alignment", js.undefined)
  }
  
}

