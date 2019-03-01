package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArcGaugeColor extends js.Object {
  var color: js.UndefOr[java.lang.String] = js.undefined
  var from: js.UndefOr[scala.Double] = js.undefined
  var to: js.UndefOr[scala.Double] = js.undefined
}

object ArcGaugeColor {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    from: scala.Int | scala.Double = null,
    to: scala.Int | scala.Double = null
  ): ArcGaugeColor = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArcGaugeColor]
  }
}

