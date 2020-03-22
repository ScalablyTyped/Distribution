package typings.ionicReact.createAnimationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PartialPropertyValue extends js.Object {
  var property: String
  var value: js.Any
}

object PartialPropertyValue {
  @scala.inline
  def apply(property: String, value: js.Any): PartialPropertyValue = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PartialPropertyValue]
  }
}

