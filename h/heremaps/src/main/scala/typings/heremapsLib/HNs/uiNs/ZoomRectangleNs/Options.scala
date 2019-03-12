package typings
package heremapsLib.HNs.uiNs.ZoomRectangleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @property alignment {H.ui.LayoutAlignment=} - the layout alignment which should be applied to this control, default is H.ui.LayoutAlignment.BOTTOM_RIGHT
  * @property adjustZoom {function(number, H.Map): number=} - optional function that defines how zoom level should be changed, by default zoom level is picked to fit the
  * bounding rectangle into the view port.
  */
trait Options extends js.Object {
  var adjustZoom: js.UndefOr[js.Function2[/* n */ scala.Double, /* m */ heremapsLib.HNs.Map, scala.Double]] = js.undefined
  var alignment: js.UndefOr[heremapsLib.HNs.uiNs.LayoutAlignment] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    adjustZoom: (/* n */ scala.Double, /* m */ heremapsLib.HNs.Map) => scala.Double = null,
    alignment: heremapsLib.HNs.uiNs.LayoutAlignment = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (adjustZoom != null) __obj.updateDynamic("adjustZoom")(js.Any.fromFunction2(adjustZoom))
    if (alignment != null) __obj.updateDynamic("alignment")(alignment)
    __obj.asInstanceOf[Options]
  }
}

