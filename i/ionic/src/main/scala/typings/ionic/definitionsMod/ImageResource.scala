package typings.ionic.definitionsMod

import typings.ionic.ionicStrings.landscape
import typings.ionic.ionicStrings.portrait
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageResource extends js.Object {
  var density: js.UndefOr[String] = js.native
  var dest: String = js.native
  var height: Double = js.native
  var imageId: js.UndefOr[String] = js.native
  var name: String = js.native
  var nodeAttributes: js.Array[String] = js.native
  var nodeName: String = js.native
  var orientation: js.UndefOr[landscape | portrait] = js.native
  var platform: String = js.native
  var resType: String = js.native
  var width: Double = js.native
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
    width: Double
  ): ImageResource = {
    val __obj = js.Dynamic.literal(dest = dest.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nodeAttributes = nodeAttributes.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], resType = resType.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageResource]
  }
  @scala.inline
  implicit class ImageResourceOps[Self <: ImageResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDest(value: String): Self = this.set("dest", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodeAttributesVarargs(value: String*): Self = this.set("nodeAttributes", js.Array(value :_*))
    @scala.inline
    def setNodeAttributes(value: js.Array[String]): Self = this.set("nodeAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodeName(value: String): Self = this.set("nodeName", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlatform(value: String): Self = this.set("platform", value.asInstanceOf[js.Any])
    @scala.inline
    def setResType(value: String): Self = this.set("resType", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def setDensity(value: String): Self = this.set("density", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDensity: Self = this.set("density", js.undefined)
    @scala.inline
    def setImageId(value: String): Self = this.set("imageId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageId: Self = this.set("imageId", js.undefined)
    @scala.inline
    def setOrientation(value: landscape | portrait): Self = this.set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
  }
  
}

