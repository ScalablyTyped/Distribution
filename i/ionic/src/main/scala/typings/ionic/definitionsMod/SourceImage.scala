package typings.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceImage extends js.Object {
  var cachedId: js.UndefOr[String] = js.undefined
  var ext: String
  var height: Double
  var imageId: js.UndefOr[String] = js.undefined
  var path: String
  var platform: String
  var resType: String
  var vector: Boolean
  var width: Double
}

object SourceImage {
  @scala.inline
  def apply(
    ext: String,
    height: Double,
    path: String,
    platform: String,
    resType: String,
    vector: Boolean,
    width: Double,
    cachedId: String = null,
    imageId: String = null
  ): SourceImage = {
    val __obj = js.Dynamic.literal(ext = ext, height = height, path = path, platform = platform, resType = resType, vector = vector, width = width)
    if (cachedId != null) __obj.updateDynamic("cachedId")(cachedId)
    if (imageId != null) __obj.updateDynamic("imageId")(imageId)
    __obj.asInstanceOf[SourceImage]
  }
}

