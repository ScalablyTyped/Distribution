package typings.ipAddress.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupIndividual extends js.Object {
  var groupIndividual: Boolean
  var nonce: String
  var reserved: Boolean
  var universalLocal: Boolean
}

object GroupIndividual {
  @scala.inline
  def apply(groupIndividual: Boolean, nonce: String, reserved: Boolean, universalLocal: Boolean): GroupIndividual = {
    val __obj = js.Dynamic.literal(groupIndividual = groupIndividual.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any], reserved = reserved.asInstanceOf[js.Any], universalLocal = universalLocal.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupIndividual]
  }
}

