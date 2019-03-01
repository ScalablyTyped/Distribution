package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartCategoryAxisItemNotesDataItemLabel extends js.Object {
  var background: js.UndefOr[java.lang.String] = js.undefined
  var border: js.UndefOr[ChartCategoryAxisItemNotesDataItemLabelBorder] = js.undefined
  var color: js.UndefOr[java.lang.String] = js.undefined
  var font: js.UndefOr[java.lang.String] = js.undefined
  var format: js.UndefOr[java.lang.String] = js.undefined
  var position: js.UndefOr[java.lang.String] = js.undefined
  var rotation: js.UndefOr[scala.Double] = js.undefined
  var template: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

object ChartCategoryAxisItemNotesDataItemLabel {
  @scala.inline
  def apply(
    background: java.lang.String = null,
    border: ChartCategoryAxisItemNotesDataItemLabelBorder = null,
    color: java.lang.String = null,
    font: java.lang.String = null,
    format: java.lang.String = null,
    position: java.lang.String = null,
    rotation: scala.Int | scala.Double = null,
    template: java.lang.String | js.Function = null,
    text: java.lang.String = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): ChartCategoryAxisItemNotesDataItemLabel = {
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
    __obj.asInstanceOf[ChartCategoryAxisItemNotesDataItemLabel]
  }
}

