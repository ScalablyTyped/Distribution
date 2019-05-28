package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofuri_db extends js.Object {
  def check_from(): scala.Double
  def check_to(): scala.Double
  def check_uri(suri: java.lang.String): scala.Double
  def check_uri_realm(suri: java.lang.String, susername: java.lang.String, srealm: java.lang.String): scala.Double
  def does_uri_exist(): scala.Double
}

object Typeofuri_db {
  @scala.inline
  def apply(
    check_from: () => scala.Double,
    check_to: () => scala.Double,
    check_uri: java.lang.String => scala.Double,
    check_uri_realm: (java.lang.String, java.lang.String, java.lang.String) => scala.Double,
    does_uri_exist: () => scala.Double
  ): Typeofuri_db = {
    val __obj = js.Dynamic.literal(check_from = js.Any.fromFunction0(check_from), check_to = js.Any.fromFunction0(check_to), check_uri = js.Any.fromFunction1(check_uri), check_uri_realm = js.Any.fromFunction3(check_uri_realm), does_uri_exist = js.Any.fromFunction0(does_uri_exist))
  
    __obj.asInstanceOf[Typeofuri_db]
  }
}

