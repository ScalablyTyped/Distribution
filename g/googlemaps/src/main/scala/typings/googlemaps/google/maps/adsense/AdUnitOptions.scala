package typings.googlemaps.google.maps.adsense

import typings.googlemaps.google.maps.ControlPosition
import typings.googlemaps.google.maps.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdUnitOptions extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.undefined
  var borderColor: js.UndefOr[String] = js.undefined
  var channelNumber: js.UndefOr[String] = js.undefined
  var format: js.UndefOr[AdFormat] = js.undefined
  var map: js.UndefOr[Map] = js.undefined
  var position: js.UndefOr[ControlPosition] = js.undefined
  var publisherId: js.UndefOr[String] = js.undefined
  var textColor: js.UndefOr[String] = js.undefined
  var titleColor: js.UndefOr[String] = js.undefined
  var urlColor: js.UndefOr[String] = js.undefined
}

object AdUnitOptions {
  @scala.inline
  def apply(
    backgroundColor: String = null,
    borderColor: String = null,
    channelNumber: String = null,
    format: AdFormat = null,
    map: Map = null,
    position: ControlPosition = null,
    publisherId: String = null,
    textColor: String = null,
    titleColor: String = null,
    urlColor: String = null
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

