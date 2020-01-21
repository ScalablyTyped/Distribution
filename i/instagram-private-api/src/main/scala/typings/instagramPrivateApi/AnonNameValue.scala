package typings.instagramPrivateApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNameValue extends js.Object {
  var name: String
  var value: Double
}

object AnonNameValue {
  @scala.inline
  def apply(name: String, value: Double): AnonNameValue = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonNameValue]
  }
}

