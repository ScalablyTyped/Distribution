package typings.ipAddress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGroupIndividual extends js.Object {
  var groupIndividual: Boolean
  var nonce: String
  var reserved: Boolean
  var universalLocal: Boolean
}

object AnonGroupIndividual {
  @scala.inline
  def apply(groupIndividual: Boolean, nonce: String, reserved: Boolean, universalLocal: Boolean): AnonGroupIndividual = {
    val __obj = js.Dynamic.literal(groupIndividual = groupIndividual.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any], reserved = reserved.asInstanceOf[js.Any], universalLocal = universalLocal.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonGroupIndividual]
  }
}

