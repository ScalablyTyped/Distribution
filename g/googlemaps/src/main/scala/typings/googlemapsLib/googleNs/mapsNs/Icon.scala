package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Icon extends js.Object {
  /**
       * The position at which to anchor an image in correspondence to the
       * location of the marker on the map. By default, the anchor is
       * located along the center point of the bottom of the image.
       */
  var anchor: js.UndefOr[Point] = js.undefined
  /**
       * The origin of the label relative to the top-left corner of the icon
       * image, if a label is supplied by the marker. By default, the origin
       * is located in the center point of the image.
       */
  var labelOrigin: js.UndefOr[Point] = js.undefined
  /**
       * The position of the image within a sprite, if any. By default, the
       * origin is located at the top left corner of the image (0, 0).
       */
  var origin: js.UndefOr[Point] = js.undefined
  /**
       * The size of the entire image after scaling, if any. Use this
       * property to stretch/ shrink an image or a sprite.
       */
  var scaledSize: js.UndefOr[Size] = js.undefined
  /**
       * The display size of the sprite or image. When using sprites, you
       * must specify the sprite size. If the size is not provided, it will
       * be set when the image loads.
       */
  var size: js.UndefOr[Size] = js.undefined
  /** The URL of the image or sprite sheet. */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

