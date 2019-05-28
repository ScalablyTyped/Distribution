package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofsiputils extends js.Object {
  def has_totag(): scala.Double
  def is_alphanum(tval: java.lang.String): scala.Double
  def is_alphanumex(tval: java.lang.String, eset: java.lang.String): scala.Double
  def is_first_hop(): scala.Double
  def is_numeric(tval: java.lang.String): scala.Double
  def is_reply(): scala.Double
  def is_request(): scala.Double
  def is_tel_number(tval: java.lang.String): scala.Double
  def is_uri(suri: java.lang.String): scala.Double
  def is_user(suser: java.lang.String): scala.Double
  def uri_param(sparam: java.lang.String): scala.Double
  def uri_param_value(sparam: java.lang.String, svalue: java.lang.String): scala.Double
}

object Typeofsiputils {
  @scala.inline
  def apply(
    has_totag: () => scala.Double,
    is_alphanum: java.lang.String => scala.Double,
    is_alphanumex: (java.lang.String, java.lang.String) => scala.Double,
    is_first_hop: () => scala.Double,
    is_numeric: java.lang.String => scala.Double,
    is_reply: () => scala.Double,
    is_request: () => scala.Double,
    is_tel_number: java.lang.String => scala.Double,
    is_uri: java.lang.String => scala.Double,
    is_user: java.lang.String => scala.Double,
    uri_param: java.lang.String => scala.Double,
    uri_param_value: (java.lang.String, java.lang.String) => scala.Double
  ): Typeofsiputils = {
    val __obj = js.Dynamic.literal(has_totag = js.Any.fromFunction0(has_totag), is_alphanum = js.Any.fromFunction1(is_alphanum), is_alphanumex = js.Any.fromFunction2(is_alphanumex), is_first_hop = js.Any.fromFunction0(is_first_hop), is_numeric = js.Any.fromFunction1(is_numeric), is_reply = js.Any.fromFunction0(is_reply), is_request = js.Any.fromFunction0(is_request), is_tel_number = js.Any.fromFunction1(is_tel_number), is_uri = js.Any.fromFunction1(is_uri), is_user = js.Any.fromFunction1(is_user), uri_param = js.Any.fromFunction1(uri_param), uri_param_value = js.Any.fromFunction2(uri_param_value))
  
    __obj.asInstanceOf[Typeofsiputils]
  }
}

