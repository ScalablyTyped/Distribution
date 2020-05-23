package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinearGaugeOptions extends js.Object {
  var gaugeArea: js.UndefOr[LinearGaugeGaugeArea] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var pointer: js.UndefOr[js.Array[LinearGaugePointerItem]] = js.undefined
  var renderAs: js.UndefOr[String] = js.undefined
  var scale: js.UndefOr[LinearGaugeScale] = js.undefined
  var theme: js.UndefOr[String] = js.undefined
  var transitions: js.UndefOr[Boolean] = js.undefined
}

object LinearGaugeOptions {
  @scala.inline
  def apply(
    gaugeArea: LinearGaugeGaugeArea = null,
    name: String = null,
    pointer: js.Array[LinearGaugePointerItem] = null,
    renderAs: String = null,
    scale: LinearGaugeScale = null,
    theme: String = null,
    transitions: js.UndefOr[Boolean] = js.undefined
  ): LinearGaugeOptions = {
    val __obj = js.Dynamic.literal()
    if (gaugeArea != null) __obj.updateDynamic("gaugeArea")(gaugeArea.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (pointer != null) __obj.updateDynamic("pointer")(pointer.asInstanceOf[js.Any])
    if (renderAs != null) __obj.updateDynamic("renderAs")(renderAs.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (!js.isUndefined(transitions)) __obj.updateDynamic("transitions")(transitions.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinearGaugeOptions]
  }
}

