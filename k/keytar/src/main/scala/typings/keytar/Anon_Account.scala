package typings.keytar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Account extends js.Object {
  var account: String
  var password: String
}

object Anon_Account {
  @scala.inline
  def apply(account: String, password: String): Anon_Account = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Account]
  }
}

