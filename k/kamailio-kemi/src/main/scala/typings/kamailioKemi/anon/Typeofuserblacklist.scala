package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofuserblacklist extends js.Object {
  
  def check_user_blacklist(suser: String, sdomain: String): Double = js.native
  
  def check_user_blacklist_number(suser: String, sdomain: String, snumber: String): Double = js.native
  
  def check_user_blacklist_table(suser: String, sdomain: String, snumber: String, stable: String): Double = js.native
  
  def check_user_whitelist(suser: String, sdomain: String): Double = js.native
  
  def check_user_whitelist_number(suser: String, sdomain: String, snumber: String): Double = js.native
  
  def check_user_whitelist_table(suser: String, sdomain: String, snumber: String, stable: String): Double = js.native
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
  
  @scala.inline
  implicit class TypeofuserblacklistOps[Self <: Typeofuserblacklist] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCheck_user_blacklist(value: (String, String) => Double): Self = this.set("check_user_blacklist", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCheck_user_blacklist_number(value: (String, String, String) => Double): Self = this.set("check_user_blacklist_number", js.Any.fromFunction3(value))
    
    @scala.inline
    def setCheck_user_blacklist_table(value: (String, String, String, String) => Double): Self = this.set("check_user_blacklist_table", js.Any.fromFunction4(value))
    
    @scala.inline
    def setCheck_user_whitelist(value: (String, String) => Double): Self = this.set("check_user_whitelist", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCheck_user_whitelist_number(value: (String, String, String) => Double): Self = this.set("check_user_whitelist_number", js.Any.fromFunction3(value))
    
    @scala.inline
    def setCheck_user_whitelist_table(value: (String, String, String, String) => Double): Self = this.set("check_user_whitelist_table", js.Any.fromFunction4(value))
  }
}
