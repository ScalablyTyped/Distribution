package typings
package ionicLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Images extends js.Object {
  var images: js.Array[ionicLib.definitionsMod.ResourcesImageConfig]
  var nodeAttributes: js.Array[java.lang.String]
  var nodeName: java.lang.String
}

object Anon_Images {
  @scala.inline
  def apply(
    images: js.Array[ionicLib.definitionsMod.ResourcesImageConfig],
    nodeAttributes: js.Array[java.lang.String],
    nodeName: java.lang.String
  ): Anon_Images = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("images")(images)
    __obj.updateDynamic("nodeAttributes")(nodeAttributes)
    __obj.updateDynamic("nodeName")(nodeName)
    __obj.asInstanceOf[Anon_Images]
  }
}

