package typings.ionic

import typings.ionic.definitionsMod.ResourcesImageConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonImages extends js.Object {
  var images: js.Array[ResourcesImageConfig]
  var nodeAttributes: js.Array[String]
  var nodeName: String
}

object AnonImages {
  @scala.inline
  def apply(images: js.Array[ResourcesImageConfig], nodeAttributes: js.Array[String], nodeName: String): AnonImages = {
    val __obj = js.Dynamic.literal(images = images.asInstanceOf[js.Any], nodeAttributes = nodeAttributes.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonImages]
  }
}

