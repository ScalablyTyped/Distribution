package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArcGaugeOptions extends js.Object {
  var centerTemplate: js.UndefOr[String | js.Function] = js.undefined
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
    centerTemplate: String | js.Function = null,
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
    if (centerTemplate != null) __obj.updateDynamic("centerTemplate")(centerTemplate.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (gaugeArea != null) __obj.updateDynamic("gaugeArea")(gaugeArea.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (renderAs != null) __obj.updateDynamic("renderAs")(renderAs.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (!js.isUndefined(transitions)) __obj.updateDynamic("transitions")(transitions.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArcGaugeOptions]
  }
}

