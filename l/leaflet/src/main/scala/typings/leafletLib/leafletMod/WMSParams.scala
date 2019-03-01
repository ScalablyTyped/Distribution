package typings
package leafletLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WMSParams extends js.Object {
  var format: js.UndefOr[java.lang.String] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var layers: java.lang.String
  var request: js.UndefOr[java.lang.String] = js.undefined
  var service: js.UndefOr[java.lang.String] = js.undefined
  var styles: js.UndefOr[java.lang.String] = js.undefined
  var transparent: js.UndefOr[scala.Boolean] = js.undefined
  var version: js.UndefOr[java.lang.String] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object WMSParams {
  @scala.inline
  def apply(
    layers: java.lang.String,
    format: java.lang.String = null,
    height: scala.Int | scala.Double = null,
    request: java.lang.String = null,
    service: java.lang.String = null,
    styles: java.lang.String = null,
    transparent: js.UndefOr[scala.Boolean] = js.undefined,
    version: java.lang.String = null,
    width: scala.Int | scala.Double = null
  ): WMSParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("layers")(layers)
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

