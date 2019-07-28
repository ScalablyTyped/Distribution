package typings.heremaps.HNs.uiNs.ZoomRectangleNs

import typings.heremaps.HNs.Map
import typings.heremaps.HNs.uiNs.LayoutAlignment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @property alignment {H.ui.LayoutAlignment=} - the layout alignment which should be applied to this control, default is H.ui.LayoutAlignment.BOTTOM_RIGHT
  * @property adjustZoom {function(number, H.Map): number=} - optional function that defines how zoom level should be changed, by default zoom level is picked to fit the
  * bounding rectangle into the view port.
  */
trait Options extends js.Object {
  var adjustZoom: js.UndefOr[js.Function2[/* n */ Double, /* m */ Map, Double]] = js.undefined
  var alignment: js.UndefOr[LayoutAlignment] = js.undefined
}

object Options {
  @scala.inline
  def apply(adjustZoom: (/* n */ Double, /* m */ Map) => Double = null, alignment: LayoutAlignment = null): Options = {
    val __obj = js.Dynamic.literal()
    if (adjustZoom != null) __obj.updateDynamic("adjustZoom")(js.Any.fromFunction2(adjustZoom))
    if (alignment != null) __obj.updateDynamic("alignment")(alignment)
    __obj.asInstanceOf[Options]
  }
}

