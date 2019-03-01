package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartCategoryAxisItemSelectMousewheel extends js.Object {
  var reverse: js.UndefOr[scala.Boolean] = js.undefined
  var zoom: js.UndefOr[java.lang.String] = js.undefined
}

object ChartCategoryAxisItemSelectMousewheel {
  @scala.inline
  def apply(reverse: js.UndefOr[scala.Boolean] = js.undefined, zoom: java.lang.String = null): ChartCategoryAxisItemSelectMousewheel = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse)
    if (zoom != null) __obj.updateDynamic("zoom")(zoom)
    __obj.asInstanceOf[ChartCategoryAxisItemSelectMousewheel]
  }
}

