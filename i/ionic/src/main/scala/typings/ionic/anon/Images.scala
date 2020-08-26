package typings.ionic.anon

import typings.ionic.definitionsMod.ResourcesImageConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Images extends js.Object {
  var images: js.Array[ResourcesImageConfig] = js.native
  var nodeAttributes: js.Array[String] = js.native
  var nodeName: String = js.native
}

object Images {
  @scala.inline
  def apply(images: js.Array[ResourcesImageConfig], nodeAttributes: js.Array[String], nodeName: String): Images = {
    val __obj = js.Dynamic.literal(images = images.asInstanceOf[js.Any], nodeAttributes = nodeAttributes.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Images]
  }
  @scala.inline
  implicit class ImagesOps[Self <: Images] (val x: Self) extends AnyVal {
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
    def setImagesVarargs(value: ResourcesImageConfig*): Self = this.set("images", js.Array(value :_*))
    @scala.inline
    def setImages(value: js.Array[ResourcesImageConfig]): Self = this.set("images", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodeAttributesVarargs(value: String*): Self = this.set("nodeAttributes", js.Array(value :_*))
    @scala.inline
    def setNodeAttributes(value: js.Array[String]): Self = this.set("nodeAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodeName(value: String): Self = this.set("nodeName", value.asInstanceOf[js.Any])
  }
  
}

