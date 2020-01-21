package typings.ibmOpenapiValidator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait validatorResultItem extends js.Object {
  var message: String
  var path: String
}

object validatorResultItem {
  @scala.inline
  def apply(message: String, path: String): validatorResultItem = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[validatorResultItem]
  }
}

