package typings.ionic

import typings.ionic.definitionsMod.ResourcesImageConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Images extends js.Object {
  var images: js.Array[ResourcesImageConfig]
  var nodeAttributes: js.Array[String]
  var nodeName: String
}

object Anon_Images {
  @scala.inline
  def apply(images: js.Array[ResourcesImageConfig], nodeAttributes: js.Array[String], nodeName: String): Anon_Images = {
    val __obj = js.Dynamic.literal(images = images, nodeAttributes = nodeAttributes, nodeName = nodeName)
  
    __obj.asInstanceOf[Anon_Images]
  }
}

