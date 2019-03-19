package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Authchallenge extends js.Object {
  def auth_challenge(realm: java.lang.String, flags: scala.Double): scala.Double
  def consume_credentials(): scala.Double
  def has_credentials(srealm: java.lang.String): scala.Double
  def pv_auth_check(srealm: java.lang.String, spasswd: java.lang.String, vflags: scala.Double, vchecks: scala.Double): scala.Double
}

object Anon_Authchallenge {
  @scala.inline
  def apply(
    auth_challenge: (java.lang.String, scala.Double) => scala.Double,
    consume_credentials: () => scala.Double,
    has_credentials: java.lang.String => scala.Double,
    pv_auth_check: (java.lang.String, java.lang.String, scala.Double, scala.Double) => scala.Double
  ): Anon_Authchallenge = {
    val __obj = js.Dynamic.literal(auth_challenge = js.Any.fromFunction2(auth_challenge), consume_credentials = js.Any.fromFunction0(consume_credentials), has_credentials = js.Any.fromFunction1(has_credentials), pv_auth_check = js.Any.fromFunction4(pv_auth_check))
  
    __obj.asInstanceOf[Anon_Authchallenge]
  }
}

