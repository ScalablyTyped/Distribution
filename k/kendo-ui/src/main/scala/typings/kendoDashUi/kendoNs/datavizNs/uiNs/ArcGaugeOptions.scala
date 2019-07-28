package typings.kendoDashUi.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArcGaugeOptions extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var colors: js.UndefOr[js.Array[ArcGaugeColor]] = js.undefined
  var gaugeArea: js.UndefOr[ArcGaugeGaugeArea] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var renderAs: js.UndefOr[String] = js.undefined
  var scale: js.UndefOr[ArcGaugeScale] = js.undefined
  var theme: js.UndefOr[String] = js.undefined
  var transitions: js.UndefOr[Boolean] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
}

object ArcGaugeOptions {
  @scala.inline
  def apply(
    color: String = null,
    colors: js.Array[ArcGaugeColor] = null,
    gaugeArea: ArcGaugeGaugeArea = null,
    name: String = null,
    opacity: Int | Double = null,
    renderAs: String = null,
    scale: ArcGaugeScale = null,
    theme: String = null,
    transitions: js.UndefOr[Boolean] = js.undefined,
    value: Int | Double = null
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

