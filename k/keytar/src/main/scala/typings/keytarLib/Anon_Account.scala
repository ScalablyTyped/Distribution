package typings
package keytarLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Account extends js.Object {
  var account: java.lang.String
  var password: java.lang.String
}

object Anon_Account {
  @scala.inline
  def apply(account: java.lang.String, password: java.lang.String): Anon_Account = {
    val __obj = js.Dynamic.literal(account = account, password = password)
  
    __obj.asInstanceOf[Anon_Account]
  }
}

