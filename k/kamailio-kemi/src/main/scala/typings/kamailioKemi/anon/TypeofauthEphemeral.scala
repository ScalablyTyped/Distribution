package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofauthEphemeral extends js.Object {
  def autheph_authenticate(susername: String, spassword: String): Double = js.native
  def autheph_check(srealm: String): Double = js.native
  def autheph_proxy(srealm: String): Double = js.native
  def autheph_www(srealm: String): Double = js.native
  def autheph_www_method(srealm: String, smethod: String): Double = js.native
}

object TypeofauthEphemeral {
  @scala.inline
  def apply(
    autheph_authenticate: (String, String) => Double,
    autheph_check: String => Double,
    autheph_proxy: String => Double,
    autheph_www: String => Double,
    autheph_www_method: (String, String) => Double
  ): TypeofauthEphemeral = {
    val __obj = js.Dynamic.literal(autheph_authenticate = js.Any.fromFunction2(autheph_authenticate), autheph_check = js.Any.fromFunction1(autheph_check), autheph_proxy = js.Any.fromFunction1(autheph_proxy), autheph_www = js.Any.fromFunction1(autheph_www), autheph_www_method = js.Any.fromFunction2(autheph_www_method))
    __obj.asInstanceOf[TypeofauthEphemeral]
  }
  @scala.inline
  implicit class TypeofauthEphemeralOps[Self <: TypeofauthEphemeral] (val x: Self) extends AnyVal {
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
    def setAutheph_authenticate(value: (String, String) => Double): Self = this.set("autheph_authenticate", js.Any.fromFunction2(value))
    @scala.inline
    def setAutheph_check(value: String => Double): Self = this.set("autheph_check", js.Any.fromFunction1(value))
    @scala.inline
    def setAutheph_proxy(value: String => Double): Self = this.set("autheph_proxy", js.Any.fromFunction1(value))
    @scala.inline
    def setAutheph_www(value: String => Double): Self = this.set("autheph_www", js.Any.fromFunction1(value))
    @scala.inline
    def setAutheph_www_method(value: (String, String) => Double): Self = this.set("autheph_www_method", js.Any.fromFunction2(value))
  }
  
}

