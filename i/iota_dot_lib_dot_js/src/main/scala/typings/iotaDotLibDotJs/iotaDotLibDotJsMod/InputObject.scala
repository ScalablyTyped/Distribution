package typings.iotaDotLibDotJs.iotaDotLibDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputObject extends js.Object {
  var address: String
  var balance: Double
  var keyIndex: Double
  var security: Security
}

object InputObject {
  @scala.inline
  def apply(address: String, balance: Double, keyIndex: Double, security: Security): InputObject = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], balance = balance.asInstanceOf[js.Any], keyIndex = keyIndex.asInstanceOf[js.Any], security = security.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InputObject]
  }
}

