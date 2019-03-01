package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageResource extends js.Object {
  var density: js.UndefOr[java.lang.String] = js.undefined
  var dest: java.lang.String
  var height: scala.Double
  var imageId: js.UndefOr[java.lang.String] = js.undefined
  var name: java.lang.String
  var nodeAttributes: js.Array[java.lang.String]
  var nodeName: java.lang.String
  var orientation: js.UndefOr[ionicLib.ionicLibStrings.landscape | ionicLib.ionicLibStrings.portrait] = js.undefined
  var platform: java.lang.String
  var resType: java.lang.String
  var width: scala.Double
}

object ImageResource {
  @scala.inline
  def apply(
    dest: java.lang.String,
    height: scala.Double,
    name: java.lang.String,
    nodeAttributes: js.Array[java.lang.String],
    nodeName: java.lang.String,
    platform: java.lang.String,
    resType: java.lang.String,
    width: scala.Double,
    density: java.lang.String = null,
    imageId: java.lang.String = null,
    orientation: ionicLib.ionicLibStrings.landscape | ionicLib.ionicLibStrings.portrait = null
  ): ImageResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dest")(dest)
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("nodeAttributes")(nodeAttributes)
    __obj.updateDynamic("nodeName")(nodeName)
    __obj.updateDynamic("platform")(platform)
    __obj.updateDynamic("resType")(resType)
    __obj.updateDynamic("width")(width)
    if (density != null) __obj.updateDynamic("density")(density)
    if (imageId != null) __obj.updateDynamic("imageId")(imageId)
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageResource]
  }
}

