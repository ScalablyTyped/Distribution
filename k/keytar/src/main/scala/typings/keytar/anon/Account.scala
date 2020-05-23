package typings.keytar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Account extends js.Object {
  var account: String
  var password: String
}

object Account {
  @scala.inline
  def apply(account: String, password: String): Account = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any])
    __obj.asInstanceOf[Account]
  }
}

