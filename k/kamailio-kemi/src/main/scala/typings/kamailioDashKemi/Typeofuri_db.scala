package typings.kamailioDashKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofuri_db extends js.Object {
  def check_from(): Double
  def check_to(): Double
  def check_uri(suri: String): Double
  def check_uri_realm(suri: String, susername: String, srealm: String): Double
  def does_uri_exist(): Double
}

object Typeofuri_db {
  @scala.inline
  def apply(
    check_from: () => Double,
    check_to: () => Double,
    check_uri: String => Double,
    check_uri_realm: (String, String, String) => Double,
    does_uri_exist: () => Double
  ): Typeofuri_db = {
    val __obj = js.Dynamic.literal(check_from = js.Any.fromFunction0(check_from), check_to = js.Any.fromFunction0(check_to), check_uri = js.Any.fromFunction1(check_uri), check_uri_realm = js.Any.fromFunction3(check_uri_realm), does_uri_exist = js.Any.fromFunction0(does_uri_exist))
  
    __obj.asInstanceOf[Typeofuri_db]
  }
}

