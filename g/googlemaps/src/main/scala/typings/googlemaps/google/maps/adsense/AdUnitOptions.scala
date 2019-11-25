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
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (channelNumber != null) __obj.updateDynamic("channelNumber")(channelNumber.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (publisherId != null) __obj.updateDynamic("publisherId")(publisherId.asInstanceOf[js.Any])
    if (textColor != null) __obj.updateDynamic("textColor")(textColor.asInstanceOf[js.Any])
    if (titleColor != null) __obj.updateDynamic("titleColor")(titleColor.asInstanceOf[js.Any])
    if (urlColor != null) __obj.updateDynamic("urlColor")(urlColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdUnitOptions]
  }
}

