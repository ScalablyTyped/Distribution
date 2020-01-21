package typings.kamailioKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofauthDb extends js.Object {
  def auth_check(srealm: String, stable: String, iflags: Double): Double
  def is_subscriber(suri: String, stable: String, iflags: Double): Double
}

object TypeofauthDb {
  @scala.inline
  def apply(auth_check: (String, String, Double) => Double, is_subscriber: (String, String, Double) => Double): TypeofauthDb = {
    val __obj = js.Dynamic.literal(auth_check = js.Any.fromFunction3(auth_check), is_subscriber = js.Any.fromFunction3(is_subscriber))
  
    __obj.asInstanceOf[TypeofauthDb]
  }
}

