package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofauthEphemeral extends js.Object {
  def autheph_authenticate(susername: String, spassword: String): Double
  def autheph_check(srealm: String): Double
  def autheph_proxy(srealm: String): Double
  def autheph_www(srealm: String): Double
  def autheph_www_method(srealm: String, smethod: String): Double
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
}

