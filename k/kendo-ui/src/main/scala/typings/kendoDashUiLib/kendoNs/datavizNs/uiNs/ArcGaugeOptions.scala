package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArcGaugeOptions extends js.Object {
  var color: js.UndefOr[java.lang.String] = js.undefined
  var colors: js.UndefOr[js.Array[ArcGaugeColor]] = js.undefined
  var gaugeArea: js.UndefOr[ArcGaugeGaugeArea] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var opacity: js.UndefOr[scala.Double] = js.undefined
  var renderAs: js.UndefOr[java.lang.String] = js.undefined
  var scale: js.UndefOr[ArcGaugeScale] = js.undefined
  var theme: js.UndefOr[java.lang.String] = js.undefined
  var transitions: js.UndefOr[scala.Boolean] = js.undefined
  var value: js.UndefOr[scala.Double] = js.undefined
}

object ArcGaugeOptions {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    colors: js.Array[ArcGaugeColor] = null,
    gaugeArea: ArcGaugeGaugeArea = null,
    name: java.lang.String = null,
    opacity: scala.Int | scala.Double = null,
    renderAs: java.lang.String = null,
    scale: ArcGaugeScale = null,
    theme: java.lang.String = null,
    transitions: js.UndefOr[scala.Boolean] = js.undefined,
    value: scala.Int | scala.Double = null
  ): ArcGaugeOptions = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (colors != null) __obj.updateDynamic("colors")(colors)
    if (gaugeArea != null) __obj.updateDynamic("gaugeArea")(gaugeArea)
    if (name != null) __obj.updateDynamic("name")(name)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (renderAs != null) __obj.updateDynamic("renderAs")(renderAs)
    if (scale != null) __obj.updateDynamic("scale")(scale)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (!js.isUndefined(transitions)) __obj.updateDynamic("transitions")(transitions)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArcGaugeOptions]
  }
}

