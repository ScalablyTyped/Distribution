package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofauth_xkeys extends js.Object {
  def auth_xkeys_add(shdr: java.lang.String, skey: java.lang.String, salg: java.lang.String, sdata: java.lang.String): scala.Double
  def auth_xkeys_check(shdr: java.lang.String, skey: java.lang.String, salg: java.lang.String, sdata: java.lang.String): scala.Double
}

object Typeofauth_xkeys {
  @scala.inline
  def apply(
    auth_xkeys_add: (java.lang.String, java.lang.String, java.lang.String, java.lang.String) => scala.Double,
    auth_xkeys_check: (java.lang.String, java.lang.String, java.lang.String, java.lang.String) => scala.Double
  ): Typeofauth_xkeys = {
    val __obj = js.Dynamic.literal(auth_xkeys_add = js.Any.fromFunction4(auth_xkeys_add), auth_xkeys_check = js.Any.fromFunction4(auth_xkeys_check))
  
    __obj.asInstanceOf[Typeofauth_xkeys]
  }
}

