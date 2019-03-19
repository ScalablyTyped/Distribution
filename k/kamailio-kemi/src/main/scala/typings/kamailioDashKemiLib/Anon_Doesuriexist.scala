package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Doesuriexist extends js.Object {
  def does_uri_exist(): scala.Double
  def does_uri_exist_uval(suri: java.lang.String): scala.Double
  def does_uri_user_exist(): scala.Double
  def does_uri_user_exist_uval(user: java.lang.String): scala.Double
  def is_user_in(user: java.lang.String, group: java.lang.String): scala.Double
  def load_callee_avps(user: java.lang.String): scala.Double
  def load_caller_avps(user: java.lang.String): scala.Double
}

object Anon_Doesuriexist {
  @scala.inline
  def apply(
    does_uri_exist: () => scala.Double,
    does_uri_exist_uval: java.lang.String => scala.Double,
    does_uri_user_exist: () => scala.Double,
    does_uri_user_exist_uval: java.lang.String => scala.Double,
    is_user_in: (java.lang.String, java.lang.String) => scala.Double,
    load_callee_avps: java.lang.String => scala.Double,
    load_caller_avps: java.lang.String => scala.Double
  ): Anon_Doesuriexist = {
    val __obj = js.Dynamic.literal(does_uri_exist = js.Any.fromFunction0(does_uri_exist), does_uri_exist_uval = js.Any.fromFunction1(does_uri_exist_uval), does_uri_user_exist = js.Any.fromFunction0(does_uri_user_exist), does_uri_user_exist_uval = js.Any.fromFunction1(does_uri_user_exist_uval), is_user_in = js.Any.fromFunction2(is_user_in), load_callee_avps = js.Any.fromFunction1(load_callee_avps), load_caller_avps = js.Any.fromFunction1(load_caller_avps))
  
    __obj.asInstanceOf[Anon_Doesuriexist]
  }
}

