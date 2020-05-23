package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BarcodeOptions extends js.Object {
  var background: js.UndefOr[String] = js.undefined
  var border: js.UndefOr[BarcodeBorder] = js.undefined
  var checksum: js.UndefOr[Boolean] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var padding: js.UndefOr[BarcodePadding] = js.undefined
  var renderAs: js.UndefOr[String] = js.undefined
  var text: js.UndefOr[BarcodeText] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object BarcodeOptions {
  @scala.inline
  def apply(
    background: String = null,
    border: BarcodeBorder = null,
    checksum: js.UndefOr[Boolean] = js.undefined,
    color: String = null,
    height: js.UndefOr[Double] = js.undefined,
    name: String = null,
    padding: BarcodePadding = null,
    renderAs: String = null,
    text: BarcodeText = null,
    `type`: String = null,
    value: String = null,
    width: js.UndefOr[Double] = js.undefined
  ): BarcodeOptions = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (!js.isUndefined(checksum)) __obj.updateDynamic("checksum")(checksum.get.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (renderAs != null) __obj.updateDynamic("renderAs")(renderAs.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarcodeOptions]
  }
}

