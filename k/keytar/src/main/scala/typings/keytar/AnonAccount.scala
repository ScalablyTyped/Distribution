package typings.keytar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAccount extends js.Object {
  var account: String
  var password: String
}

object AnonAccount {
  @scala.inline
  def apply(account: String, password: String): AnonAccount = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAccount]
  }
}

