package typings.kendoDashUi.kendoNs.datavizNs.uiNs

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
    height: Int | Double = null,
    name: String = null,
    padding: BarcodePadding = null,
    renderAs: String = null,
    text: BarcodeText = null,
    `type`: String = null,
    value: String = null,
    width: Int | Double = null
  ): BarcodeOptions = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background)
    if (border != null) __obj.updateDynamic("border")(border)
    if (!js.isUndefined(checksum)) __obj.updateDynamic("checksum")(checksum)
    if (color != null) __obj.updateDynamic("color")(color)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (padding != null) __obj.updateDynamic("padding")(padding)
    if (renderAs != null) __obj.updateDynamic("renderAs")(renderAs)
    if (text != null) __obj.updateDynamic("text")(text)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarcodeOptions]
  }
}

