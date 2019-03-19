package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Authephauthenticate extends js.Object {
  def autheph_authenticate(susername: java.lang.String, spassword: java.lang.String): scala.Double
  def autheph_check(srealm: java.lang.String): scala.Double
  def autheph_proxy(srealm: java.lang.String): scala.Double
  def autheph_www(srealm: java.lang.String): scala.Double
  def autheph_www_method(srealm: java.lang.String, smethod: java.lang.String): scala.Double
}

object Anon_Authephauthenticate {
  @scala.inline
  def apply(
    autheph_authenticate: (java.lang.String, java.lang.String) => scala.Double,
    autheph_check: java.lang.String => scala.Double,
    autheph_proxy: java.lang.String => scala.Double,
    autheph_www: java.lang.String => scala.Double,
    autheph_www_method: (java.lang.String, java.lang.String) => scala.Double
  ): Anon_Authephauthenticate = {
    val __obj = js.Dynamic.literal(autheph_authenticate = js.Any.fromFunction2(autheph_authenticate), autheph_check = js.Any.fromFunction1(autheph_check), autheph_proxy = js.Any.fromFunction1(autheph_proxy), autheph_www = js.Any.fromFunction1(autheph_www), autheph_www_method = js.Any.fromFunction2(autheph_www_method))
  
    __obj.asInstanceOf[Anon_Authephauthenticate]
  }
}

