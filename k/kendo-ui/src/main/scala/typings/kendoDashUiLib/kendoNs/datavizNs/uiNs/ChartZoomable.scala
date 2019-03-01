package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartZoomable extends js.Object {
  var mousewheel: js.UndefOr[scala.Boolean | ChartZoomableMousewheel] = js.undefined
  var selection: js.UndefOr[scala.Boolean | ChartZoomableSelection] = js.undefined
}

object ChartZoomable {
  @scala.inline
  def apply(
    mousewheel: scala.Boolean | ChartZoomableMousewheel = null,
    selection: scala.Boolean | ChartZoomableSelection = null
  ): ChartZoomable = {
    val __obj = js.Dynamic.literal()
    if (mousewheel != null) __obj.updateDynamic("mousewheel")(mousewheel.asInstanceOf[js.Any])
    if (selection != null) __obj.updateDynamic("selection")(selection.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartZoomable]
  }
}

