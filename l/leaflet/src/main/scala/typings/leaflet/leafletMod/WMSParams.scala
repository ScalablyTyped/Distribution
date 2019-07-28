package typings.leaflet.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WMSParams extends js.Object {
  var format: js.UndefOr[String] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var layers: String
  var request: js.UndefOr[String] = js.undefined
  var service: js.UndefOr[String] = js.undefined
  var styles: js.UndefOr[String] = js.undefined
  var transparent: js.UndefOr[Boolean] = js.undefined
  var version: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object WMSParams {
  @scala.inline
  def apply(
    layers: String,
    format: String = null,
    height: Int | Double = null,
    request: String = null,
    service: String = null,
    styles: String = null,
    transparent: js.UndefOr[Boolean] = js.undefined,
    version: String = null,
    width: Int | Double = null
  ): WMSParams = {
    val __obj = js.Dynamic.literal(layers = layers)
    if (format != null) __obj.updateDynamic("format")(format)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (request != null) __obj.updateDynamic("request")(request)
    if (service != null) __obj.updateDynamic("service")(service)
    if (styles != null) __obj.updateDynamic("styles")(styles)
    if (!js.isUndefined(transparent)) __obj.updateDynamic("transparent")(transparent)
    if (version != null) __obj.updateDynamic("version")(version)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[WMSParams]
  }
}

