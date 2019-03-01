package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartSeriesDefaultsOverlay extends js.Object {
  var gradient: js.UndefOr[java.lang.String] = js.undefined
}

object ChartSeriesDefaultsOverlay {
  @scala.inline
  def apply(gradient: java.lang.String = null): ChartSeriesDefaultsOverlay = {
    val __obj = js.Dynamic.literal()
    if (gradient != null) __obj.updateDynamic("gradient")(gradient)
    __obj.asInstanceOf[ChartSeriesDefaultsOverlay]
  }
}

