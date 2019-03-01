package typings
package googlemapsLib.googleNs.mapsNs.adsenseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdUnitOptions extends js.Object {
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  var borderColor: js.UndefOr[java.lang.String] = js.undefined
  var channelNumber: js.UndefOr[java.lang.String] = js.undefined
  var format: js.UndefOr[AdFormat] = js.undefined
  var map: js.UndefOr[googlemapsLib.googleNs.mapsNs.Map] = js.undefined
  var position: js.UndefOr[googlemapsLib.googleNs.mapsNs.ControlPosition] = js.undefined
  var publisherId: js.UndefOr[java.lang.String] = js.undefined
  var textColor: js.UndefOr[java.lang.String] = js.undefined
  var titleColor: js.UndefOr[java.lang.String] = js.undefined
  var urlColor: js.UndefOr[java.lang.String] = js.undefined
}

object AdUnitOptions {
  @scala.inline
  def apply(
    backgroundColor: java.lang.String = null,
    borderColor: java.lang.String = null,
    channelNumber: java.lang.String = null,
    format: AdFormat = null,
    map: googlemapsLib.googleNs.mapsNs.Map = null,
    position: googlemapsLib.googleNs.mapsNs.ControlPosition = null,
    publisherId: java.lang.String = null,
    textColor: java.lang.String = null,
    titleColor: java.lang.String = null,
    urlColor: java.lang.String = null
  ): AdUnitOptions = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor)
    if (channelNumber != null) __obj.updateDynamic("channelNumber")(channelNumber)
    if (format != null) __obj.updateDynamic("format")(format)
    if (map != null) __obj.updateDynamic("map")(map)
    if (position != null) __obj.updateDynamic("position")(position)
    if (publisherId != null) __obj.updateDynamic("publisherId")(publisherId)
    if (textColor != null) __obj.updateDynamic("textColor")(textColor)
    if (titleColor != null) __obj.updateDynamic("titleColor")(titleColor)
    if (urlColor != null) __obj.updateDynamic("urlColor")(urlColor)
    __obj.asInstanceOf[AdUnitOptions]
  }
}

