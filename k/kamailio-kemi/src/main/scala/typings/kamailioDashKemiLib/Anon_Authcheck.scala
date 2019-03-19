package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Authcheck extends js.Object {
  def auth_check(srealm: java.lang.String, stable: java.lang.String, iflags: scala.Double): scala.Double
  def is_subscriber(suri: java.lang.String, stable: java.lang.String, iflags: scala.Double): scala.Double
}

object Anon_Authcheck {
  @scala.inline
  def apply(
    auth_check: (java.lang.String, java.lang.String, scala.Double) => scala.Double,
    is_subscriber: (java.lang.String, java.lang.String, scala.Double) => scala.Double
  ): Anon_Authcheck = {
    val __obj = js.Dynamic.literal(auth_check = js.Any.fromFunction3(auth_check), is_subscriber = js.Any.fromFunction3(is_subscriber))
  
    __obj.asInstanceOf[Anon_Authcheck]
  }
}

