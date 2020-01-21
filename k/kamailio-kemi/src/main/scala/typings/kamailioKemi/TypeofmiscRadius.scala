package typings.kamailioKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofmiscRadius extends js.Object {
  def does_uri_exist(): Double
  def does_uri_exist_uval(suri: String): Double
  def does_uri_user_exist(): Double
  def does_uri_user_exist_uval(user: String): Double
  def is_user_in(user: String, group: String): Double
  def load_callee_avps(user: String): Double
  def load_caller_avps(user: String): Double
}

object TypeofmiscRadius {
  @scala.inline
  def apply(
    does_uri_exist: () => Double,
    does_uri_exist_uval: String => Double,
    does_uri_user_exist: () => Double,
    does_uri_user_exist_uval: String => Double,
    is_user_in: (String, String) => Double,
    load_callee_avps: String => Double,
    load_caller_avps: String => Double
  ): TypeofmiscRadius = {
    val __obj = js.Dynamic.literal(does_uri_exist = js.Any.fromFunction0(does_uri_exist), does_uri_exist_uval = js.Any.fromFunction1(does_uri_exist_uval), does_uri_user_exist = js.Any.fromFunction0(does_uri_user_exist), does_uri_user_exist_uval = js.Any.fromFunction1(does_uri_user_exist_uval), is_user_in = js.Any.fromFunction2(is_user_in), load_callee_avps = js.Any.fromFunction1(load_callee_avps), load_caller_avps = js.Any.fromFunction1(load_caller_avps))
  
    __obj.asInstanceOf[TypeofmiscRadius]
  }
}

