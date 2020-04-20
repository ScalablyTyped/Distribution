package typings.kamailioKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofauthXkeys extends js.Object {
  def auth_xkeys_add(shdr: String, skey: String, salg: String, sdata: String): Double
  def auth_xkeys_check(shdr: String, skey: String, salg: String, sdata: String): Double
}

object TypeofauthXkeys {
  @scala.inline
  def apply(
    auth_xkeys_add: (String, String, String, String) => Double,
    auth_xkeys_check: (String, String, String, String) => Double
  ): TypeofauthXkeys = {
    val __obj = js.Dynamic.literal(auth_xkeys_add = js.Any.fromFunction4(auth_xkeys_add), auth_xkeys_check = js.Any.fromFunction4(auth_xkeys_check))
    __obj.asInstanceOf[TypeofauthXkeys]
  }
}

