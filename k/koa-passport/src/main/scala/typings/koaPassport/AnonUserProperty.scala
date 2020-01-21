package typings.koaPassport

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonUserProperty extends js.Object {
  var userProperty: String
}

object AnonUserProperty {
  @scala.inline
  def apply(userProperty: String): AnonUserProperty = {
    val __obj = js.Dynamic.literal(userProperty = userProperty.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonUserProperty]
  }
}

