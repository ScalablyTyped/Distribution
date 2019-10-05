package typings.kendoDashUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartXAxisItemNotesDataItemLabel extends js.Object {
  var background: js.UndefOr[String] = js.undefined
  var border: js.UndefOr[ChartXAxisItemNotesDataItemLabelBorder] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var font: js.UndefOr[String] = js.undefined
  var format: js.UndefOr[String] = js.undefined
  var position: js.UndefOr[String] = js.undefined
  var rotation: js.UndefOr[Double] = js.undefined
  var template: js.UndefOr[String | js.Function] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object ChartXAxisItemNotesDataItemLabel {
  @scala.inline
  def apply(
    background: String = null,
    border: ChartXAxisItemNotesDataItemLabelBorder = null,
    color: String = null,
    font: String = null,
    format: String = null,
    position: String = null,
    rotation: Int | Double = null,
    template: String | js.Function = null,
    text: String = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): ChartXAxisItemNotesDataItemLabel = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background)
    if (border != null) __obj.updateDynamic("border")(border)
    if (color != null) __obj.updateDynamic("color")(color)
    if (font != null) __obj.updateDynamic("font")(font)
    if (format != null) __obj.updateDynamic("format")(format)
    if (position != null) __obj.updateDynamic("position")(position)
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[ChartXAxisItemNotesDataItemLabel]
  }
}

