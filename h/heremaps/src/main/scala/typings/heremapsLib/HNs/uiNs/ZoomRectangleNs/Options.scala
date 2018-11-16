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

