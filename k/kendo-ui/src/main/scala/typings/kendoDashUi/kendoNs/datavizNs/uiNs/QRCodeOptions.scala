package typings.kendoDashUi.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QRCodeOptions extends js.Object {
  var background: js.UndefOr[String] = js.undefined
  var border: js.UndefOr[QRCodeBorder] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var encoding: js.UndefOr[String] = js.undefined
  var errorCorrection: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var padding: js.UndefOr[Double] = js.undefined
  var renderAs: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[Double | String] = js.undefined
  var value: js.UndefOr[Double | String] = js.undefined
}

object QRCodeOptions {
  @scala.inline
  def apply(
    background: String = null,
    border: QRCodeBorder = null,
    color: String = null,
    encoding: String = null,
    errorCorrection: String = null,
    name: String = null,
    padding: Int | Double = null,
    renderAs: String = null,
    size: Double | String = null,
    value: Double | String = null
  ): QRCodeOptions = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background)
    if (border != null) __obj.updateDynamic("border")(border)
    if (color != null) __obj.updateDynamic("color")(color)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (errorCorrection != null) __obj.updateDynamic("errorCorrection")(errorCorrection)
    if (name != null) __obj.updateDynamic("name")(name)
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (renderAs != null) __obj.updateDynamic("renderAs")(renderAs)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[QRCodeOptions]
  }
}

