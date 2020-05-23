package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofuserblacklist extends js.Object {
  def check_user_blacklist(suser: String, sdomain: String): Double
  def check_user_blacklist_number(suser: String, sdomain: String, snumber: String): Double
  def check_user_blacklist_table(suser: String, sdomain: String, snumber: String, stable: String): Double
  def check_user_whitelist(suser: String, sdomain: String): Double
  def check_user_whitelist_number(suser: String, sdomain: String, snumber: String): Double
  def check_user_whitelist_table(suser: String, sdomain: String, snumber: String, stable: String): Double
}

object Typeofuserblacklist {
  @scala.inline
  def apply(
    check_user_blacklist: (String, String) => Double,
    check_user_blacklist_number: (String, String, String) => Double,
    check_user_blacklist_table: (String, String, String, String) => Double,
    check_user_whitelist: (String, String) => Double,
    check_user_whitelist_number: (String, String, String) => Double,
    check_user_whitelist_table: (String, String, String, String) => Double
  ): Typeofuserblacklist = {
    val __obj = js.Dynamic.literal(check_user_blacklist = js.Any.fromFunction2(check_user_blacklist), check_user_blacklist_number = js.Any.fromFunction3(check_user_blacklist_number), check_user_blacklist_table = js.Any.fromFunction4(check_user_blacklist_table), check_user_whitelist = js.Any.fromFunction2(check_user_whitelist), check_user_whitelist_number = js.Any.fromFunction3(check_user_whitelist_number), check_user_whitelist_table = js.Any.fromFunction4(check_user_whitelist_table))
    __obj.asInstanceOf[Typeofuserblacklist]
  }
}

