package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BarcodeOptions extends js.Object {
  var background: js.UndefOr[java.lang.String] = js.undefined
  var border: js.UndefOr[BarcodeBorder] = js.undefined
  var checksum: js.UndefOr[scala.Boolean] = js.undefined
  var color: js.UndefOr[java.lang.String] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var padding: js.UndefOr[BarcodePadding] = js.undefined
  var renderAs: js.UndefOr[java.lang.String] = js.undefined
  var text: js.UndefOr[BarcodeText] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[java.lang.String] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object BarcodeOptions {
  @scala.inline
  def apply(
    background: java.lang.String = null,
    border: BarcodeBorder = null,
    checksum: js.UndefOr[scala.Boolean] = js.undefined,
    color: java.lang.String = null,
    height: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    padding: BarcodePadding = null,
    renderAs: java.lang.String = null,
    text: BarcodeText = null,
    `type`: java.lang.String = null,
    value: java.lang.String = null,
    width: scala.Int | scala.Double = null
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

