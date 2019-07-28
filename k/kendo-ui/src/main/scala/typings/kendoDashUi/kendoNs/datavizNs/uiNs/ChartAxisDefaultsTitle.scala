package typings.kendoDashUi.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartAxisDefaultsTitle extends js.Object {
  var background: js.UndefOr[String] = js.undefined
  var border: js.UndefOr[ChartAxisDefaultsTitleBorder] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var font: js.UndefOr[String] = js.undefined
  var margin: js.UndefOr[ChartAxisDefaultsTitleMargin] = js.undefined
  var padding: js.UndefOr[ChartAxisDefaultsTitlePadding] = js.undefined
  var position: js.UndefOr[String] = js.undefined
  var rotation: js.UndefOr[Double] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
  var visual: js.UndefOr[js.Function] = js.undefined
}

object ChartAxisDefaultsTitle {
  @scala.inline
  def apply(
    background: String = null,
    border: ChartAxisDefaultsTitleBorder = null,
    color: String = null,
    font: String = null,
    margin: ChartAxisDefaultsTitleMargin = null,
    padding: ChartAxisDefaultsTitlePadding = null,
    position: String = null,
    rotation: Int | Double = null,
    text: String = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    visual: js.Function = null
  ): ChartAxisDefaultsTitle = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background)
    if (border != null) __obj.updateDynamic("border")(border)
    if (color != null) __obj.updateDynamic("color")(color)
    if (font != null) __obj.updateDynamic("font")(font)
    if (margin != null) __obj.updateDynamic("margin")(margin)
    if (padding != null) __obj.updateDynamic("padding")(padding)
    if (position != null) __obj.updateDynamic("position")(position)
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (visual != null) __obj.updateDynamic("visual")(visual)
    __obj.asInstanceOf[ChartAxisDefaultsTitle]
  }
}

