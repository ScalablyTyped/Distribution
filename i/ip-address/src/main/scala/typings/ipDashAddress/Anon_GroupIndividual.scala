package typings.ipDashAddress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GroupIndividual extends js.Object {
  var groupIndividual: Boolean
  var nonce: String
  var reserved: Boolean
  var universalLocal: Boolean
}

object Anon_GroupIndividual {
  @scala.inline
  def apply(groupIndividual: Boolean, nonce: String, reserved: Boolean, universalLocal: Boolean): Anon_GroupIndividual = {
    val __obj = js.Dynamic.literal(groupIndividual = groupIndividual, nonce = nonce, reserved = reserved, universalLocal = universalLocal)
  
    __obj.asInstanceOf[Anon_GroupIndividual]
  }
}

