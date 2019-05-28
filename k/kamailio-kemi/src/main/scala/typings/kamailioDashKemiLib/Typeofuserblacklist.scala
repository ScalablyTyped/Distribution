package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofuserblacklist extends js.Object {
  def check_user_blacklist(suser: java.lang.String, sdomain: java.lang.String): scala.Double
  def check_user_blacklist_number(suser: java.lang.String, sdomain: java.lang.String, snumber: java.lang.String): scala.Double
  def check_user_blacklist_table(
    suser: java.lang.String,
    sdomain: java.lang.String,
    snumber: java.lang.String,
    stable: java.lang.String
  ): scala.Double
  def check_user_whitelist(suser: java.lang.String, sdomain: java.lang.String): scala.Double
  def check_user_whitelist_number(suser: java.lang.String, sdomain: java.lang.String, snumber: java.lang.String): scala.Double
  def check_user_whitelist_table(
    suser: java.lang.String,
    sdomain: java.lang.String,
    snumber: java.lang.String,
    stable: java.lang.String
  ): scala.Double
}

object Typeofuserblacklist {
  @scala.inline
  def apply(
    check_user_blacklist: (java.lang.String, java.lang.String) => scala.Double,
    check_user_blacklist_number: (java.lang.String, java.lang.String, java.lang.String) => scala.Double,
    check_user_blacklist_table: (java.lang.String, java.lang.String, java.lang.String, java.lang.String) => scala.Double,
    check_user_whitelist: (java.lang.String, java.lang.String) => scala.Double,
    check_user_whitelist_number: (java.lang.String, java.lang.String, java.lang.String) => scala.Double,
    check_user_whitelist_table: (java.lang.String, java.lang.String, java.lang.String, java.lang.String) => scala.Double
  ): Typeofuserblacklist = {
    val __obj = js.Dynamic.literal(check_user_blacklist = js.Any.fromFunction2(check_user_blacklist), check_user_blacklist_number = js.Any.fromFunction3(check_user_blacklist_number), check_user_blacklist_table = js.Any.fromFunction4(check_user_blacklist_table), check_user_whitelist = js.Any.fromFunction2(check_user_whitelist), check_user_whitelist_number = js.Any.fromFunction3(check_user_whitelist_number), check_user_whitelist_table = js.Any.fromFunction4(check_user_whitelist_table))
  
    __obj.asInstanceOf[Typeofuserblacklist]
  }
}

