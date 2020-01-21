package typings.graphqlTools

import typings.graphqlTools.interfacesMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTransforms extends js.Object {
  var transforms: js.Array[Transform]
}

object AnonTransforms {
  @scala.inline
  def apply(transforms: js.Array[Transform]): AnonTransforms = {
    val __obj = js.Dynamic.literal(transforms = transforms.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonTransforms]
  }
}

