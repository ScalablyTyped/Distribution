package typings.kamailioDashKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofauth extends js.Object {
  def auth_challenge(realm: String, flags: Double): Double
  def consume_credentials(): Double
  def has_credentials(srealm: String): Double
  def pv_auth_check(srealm: String, spasswd: String, vflags: Double, vchecks: Double): Double
}

object Typeofauth {
  @scala.inline
  def apply(
    auth_challenge: (String, Double) => Double,
    consume_credentials: () => Double,
    has_credentials: String => Double,
    pv_auth_check: (String, String, Double, Double) => Double
  ): Typeofauth = {
    val __obj = js.Dynamic.literal(auth_challenge = js.Any.fromFunction2(auth_challenge), consume_credentials = js.Any.fromFunction0(consume_credentials), has_credentials = js.Any.fromFunction1(has_credentials), pv_auth_check = js.Any.fromFunction4(pv_auth_check))
  
    __obj.asInstanceOf[Typeofauth]
  }
}

