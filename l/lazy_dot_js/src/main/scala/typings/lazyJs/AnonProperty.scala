package typings.lazyJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonProperty extends js.Object {
  var property: String
  var value: js.Any
}

object AnonProperty {
  @scala.inline
  def apply(property: String, value: js.Any): AnonProperty = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonProperty]
  }
}

