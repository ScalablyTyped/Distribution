package typings.ionicReact.createAnimationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropertyValue extends js.Object {
  var fromValue: js.Any
  var property: String
  var toValue: js.Any
}

object PropertyValue {
  @scala.inline
  def apply(fromValue: js.Any, property: String, toValue: js.Any): PropertyValue = {
    val __obj = js.Dynamic.literal(fromValue = fromValue.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], toValue = toValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyValue]
  }
}

