package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A structure representing a Marker icon image.
  * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Icon Maps JavaScript API}
  */
trait Icon extends js.Object {
  /**
    * The position at which to anchor an image in correspondence to the
    * location of the marker on the map. By default, the anchor is located
    * along the center point of the bottom of the image.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Icon.anchor Maps JavaScript API}
    */
  var anchor: js.UndefOr[Point] = js.undefined
  /**
    * The origin of the label relative to the top-left corner of the icon
    * image, if a label is supplied by the marker. By default, the origin is
    * located in the center point of the image.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Icon.labelOrigin Maps JavaScript API}
    */
  var labelOrigin: js.UndefOr[Point] = js.undefined
  /**
    * The position of the image within a sprite, if any.
    * @default new google.maps.Point(0, 0)
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Icon.origin Maps JavaScript API}
    */
  var origin: js.UndefOr[Point] = js.undefined
  /**
    * The size of the entire image after scaling, if any. Use this property to
    * stretch/shrink an image or a sprite.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Icon.scaledSize Maps JavaScript API}
    */
  var scaledSize: js.UndefOr[Size] = js.undefined
  /**
    * The display size of the sprite or image. When using sprites, you must
    * specify the sprite size. If the size is not provided, it will be set when
    * the image loads.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Icon.size Maps JavaScript API}
    */
  var size: js.UndefOr[Size] = js.undefined
  /**
    * The URL of the image or sprite sheet.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Icon.url Maps JavaScript API}
    */
  var url: String
}

object Icon {
  @scala.inline
  def apply(
    url: String,
    anchor: Point = null,
    labelOrigin: Point = null,
    origin: Point = null,
    scaledSize: Size = null,
    size: Size = null
  ): Icon = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (anchor != null) __obj.updateDynamic("anchor")(anchor.asInstanceOf[js.Any])
    if (labelOrigin != null) __obj.updateDynamic("labelOrigin")(labelOrigin.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    if (scaledSize != null) __obj.updateDynamic("scaledSize")(scaledSize.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Icon]
  }
}

