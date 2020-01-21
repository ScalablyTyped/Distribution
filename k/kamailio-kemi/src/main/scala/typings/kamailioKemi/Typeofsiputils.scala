package typings.kamailioKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofsiputils extends js.Object {
  def has_totag(): Double
  def is_alphanum(tval: String): Double
  def is_alphanumex(tval: String, eset: String): Double
  def is_first_hop(): Double
  def is_numeric(tval: String): Double
  def is_reply(): Double
  def is_request(): Double
  def is_tel_number(tval: String): Double
  def is_uri(suri: String): Double
  def is_user(suser: String): Double
  def uri_param(sparam: String): Double
  def uri_param_value(sparam: String, svalue: String): Double
}

object Typeofsiputils {
  @scala.inline
  def apply(
    has_totag: () => Double,
    is_alphanum: String => Double,
    is_alphanumex: (String, String) => Double,
    is_first_hop: () => Double,
    is_numeric: String => Double,
    is_reply: () => Double,
    is_request: () => Double,
    is_tel_number: String => Double,
    is_uri: String => Double,
    is_user: String => Double,
    uri_param: String => Double,
    uri_param_value: (String, String) => Double
  ): Typeofsiputils = {
    val __obj = js.Dynamic.literal(has_totag = js.Any.fromFunction0(has_totag), is_alphanum = js.Any.fromFunction1(is_alphanum), is_alphanumex = js.Any.fromFunction2(is_alphanumex), is_first_hop = js.Any.fromFunction0(is_first_hop), is_numeric = js.Any.fromFunction1(is_numeric), is_reply = js.Any.fromFunction0(is_reply), is_request = js.Any.fromFunction0(is_request), is_tel_number = js.Any.fromFunction1(is_tel_number), is_uri = js.Any.fromFunction1(is_uri), is_user = js.Any.fromFunction1(is_user), uri_param = js.Any.fromFunction1(uri_param), uri_param_value = js.Any.fromFunction2(uri_param_value))
  
    __obj.asInstanceOf[Typeofsiputils]
  }
}

