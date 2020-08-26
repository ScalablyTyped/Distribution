package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofauthXkeys extends js.Object {
  def auth_xkeys_add(shdr: String, skey: String, salg: String, sdata: String): Double = js.native
  def auth_xkeys_check(shdr: String, skey: String, salg: String, sdata: String): Double = js.native
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
  @scala.inline
  implicit class TypeofauthXkeysOps[Self <: TypeofauthXkeys] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAuth_xkeys_add(value: (String, String, String, String) => Double): Self = this.set("auth_xkeys_add", js.Any.fromFunction4(value))
    @scala.inline
    def setAuth_xkeys_check(value: (String, String, String, String) => Double): Self = this.set("auth_xkeys_check", js.Any.fromFunction4(value))
  }
  
}

