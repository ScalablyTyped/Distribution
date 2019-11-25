package typings.ionic.definitionsMod

import typings.ionic.ionicStrings.landscape
import typings.ionic.ionicStrings.portrait
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageResource extends js.Object {
  var density: js.UndefOr[String] = js.undefined
  var dest: String
  var height: Double
  var imageId: js.UndefOr[String] = js.undefined
  var name: String
  var nodeAttributes: js.Array[String]
  var nodeName: String
  var orientation: js.UndefOr[landscape | portrait] = js.undefined
  var platform: String
  var resType: String
  var width: Double
}

object ImageResource {
  @scala.inline
  def apply(
    dest: String,
    height: Double,
    name: String,
    nodeAttributes: js.Array[String],
    nodeName: String,
    platform: String,
    resType: String,
    width: Double,
    density: String = null,
    imageId: String = null,
    orientation: landscape | portrait = null
  ): ImageResource = {
    val __obj = js.Dynamic.literal(dest = dest.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nodeAttributes = nodeAttributes.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], resType = resType.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (density != null) __obj.updateDynamic("density")(density.asInstanceOf[js.Any])
    if (imageId != null) __obj.updateDynamic("imageId")(imageId.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageResource]
  }
}

