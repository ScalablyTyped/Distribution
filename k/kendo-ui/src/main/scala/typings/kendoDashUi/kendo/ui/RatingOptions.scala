package typings.kendoDashUi.kendo.ui

import typings.kendoDashUi.kendoDashUiStrings.continuous
import typings.kendoDashUi.kendoDashUiStrings.half
import typings.kendoDashUi.kendoDashUiStrings.item
import typings.kendoDashUi.kendoDashUiStrings.single
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RatingOptions extends js.Object {
  var change: js.UndefOr[js.Function1[/* e */ RatingChangeEvent, Unit]] = js.undefined
  var enabled: js.UndefOr[Boolean] = js.undefined
  var hoveredTemplate: js.UndefOr[String | js.Function] = js.undefined
  var itemTemplate: js.UndefOr[String | js.Function] = js.undefined
  var label: js.UndefOr[Boolean | RatingLabel] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var precision: String | item | half
  var readonly: js.UndefOr[Boolean] = js.undefined
  var select: js.UndefOr[js.Function1[/* e */ RatingSelectEvent, Unit]] = js.undefined
  var selectValueOnFocus: js.UndefOr[Double] = js.undefined
  var selectedTemplate: js.UndefOr[String | js.Function] = js.undefined
  var selection: String | continuous | single
  var tooltip: js.UndefOr[Boolean] = js.undefined
}

object RatingOptions {
  @scala.inline
  def apply(
    precision: String | item | half,
    selection: String | continuous | single,
    change: /* e */ RatingChangeEvent => Unit = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    hoveredTemplate: String | js.Function = null,
    itemTemplate: String | js.Function = null,
    label: Boolean | RatingLabel = null,
    max: Int | Double = null,
    min: Int | Double = null,
    name: String = null,
    readonly: js.UndefOr[Boolean] = js.undefined,
    select: /* e */ RatingSelectEvent => Unit = null,
    selectValueOnFocus: Int | Double = null,
    selectedTemplate: String | js.Function = null,
    tooltip: js.UndefOr[Boolean] = js.undefined
  ): RatingOptions = {
    val __obj = js.Dynamic.literal(precision = precision.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any])
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1(change))
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (hoveredTemplate != null) __obj.updateDynamic("hoveredTemplate")(hoveredTemplate.asInstanceOf[js.Any])
    if (itemTemplate != null) __obj.updateDynamic("itemTemplate")(itemTemplate.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(readonly)) __obj.updateDynamic("readonly")(readonly)
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction1(select))
    if (selectValueOnFocus != null) __obj.updateDynamic("selectValueOnFocus")(selectValueOnFocus.asInstanceOf[js.Any])
    if (selectedTemplate != null) __obj.updateDynamic("selectedTemplate")(selectedTemplate.asInstanceOf[js.Any])
    if (!js.isUndefined(tooltip)) __obj.updateDynamic("tooltip")(tooltip)
    __obj.asInstanceOf[RatingOptions]
  }
}

