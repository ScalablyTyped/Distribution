package typings
package ipDashAddressLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GroupIndividual extends js.Object {
  var groupIndividual: scala.Boolean
  var nonce: java.lang.String
  var reserved: scala.Boolean
  var universalLocal: scala.Boolean
}

object Anon_GroupIndividual {
  @scala.inline
  def apply(
    groupIndividual: scala.Boolean,
    nonce: java.lang.String,
    reserved: scala.Boolean,
    universalLocal: scala.Boolean
  ): Anon_GroupIndividual = {
    val __obj = js.Dynamic.literal(groupIndividual = groupIndividual, nonce = nonce, reserved = reserved, universalLocal = universalLocal)
  
    __obj.asInstanceOf[Anon_GroupIndividual]
  }
}

