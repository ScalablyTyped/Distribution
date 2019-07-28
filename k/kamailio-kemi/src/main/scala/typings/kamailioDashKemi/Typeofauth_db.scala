package typings.kamailioDashKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofauth_db extends js.Object {
  def auth_check(srealm: String, stable: String, iflags: Double): Double
  def is_subscriber(suri: String, stable: String, iflags: Double): Double
}

object Typeofauth_db {
  @scala.inline
  def apply(auth_check: (String, String, Double) => Double, is_subscriber: (String, String, Double) => Double): Typeofauth_db = {
    val __obj = js.Dynamic.literal(auth_check = js.Any.fromFunction3(auth_check), is_subscriber = js.Any.fromFunction3(is_subscriber))
  
    __obj.asInstanceOf[Typeofauth_db]
  }
}

