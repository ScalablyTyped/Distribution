package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceImage extends js.Object {
  var cachedId: js.UndefOr[java.lang.String] = js.undefined
  var ext: java.lang.String
  var height: scala.Double
  var imageId: js.UndefOr[java.lang.String] = js.undefined
  var path: java.lang.String
  var platform: java.lang.String
  var resType: java.lang.String
  var vector: scala.Boolean
  var width: scala.Double
}

object SourceImage {
  @scala.inline
  def apply(
    ext: java.lang.String,
    height: scala.Double,
    path: java.lang.String,
    platform: java.lang.String,
    resType: java.lang.String,
    vector: scala.Boolean,
    width: scala.Double,
    cachedId: java.lang.String = null,
    imageId: java.lang.String = null
  ): SourceImage = {
    val __obj = js.Dynamic.literal(ext = ext, height = height, path = path, platform = platform, resType = resType, vector = vector, width = width)
    if (cachedId != null) __obj.updateDynamic("cachedId")(cachedId)
    if (imageId != null) __obj.updateDynamic("imageId")(imageId)
    __obj.asInstanceOf[SourceImage]
  }
}

