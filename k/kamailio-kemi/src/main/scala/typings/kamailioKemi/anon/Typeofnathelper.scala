package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofnathelper extends js.Object {
  
  def add_contact_alias(): Double = js.native
  
  def add_contact_alias_addr(ip_str: String, port_str: String, proto_str: String): Double = js.native
  
  def add_rcv_param(upos: Double): Double = js.native
  
  def fix_nated_contact(): Double = js.native
  
  def fix_nated_register(): Double = js.native
  
  def fix_nated_sdp(level: Double): Double = js.native
  
  def fix_nated_sdp_ip(level: Double, ip: String): Double = js.native
  
  def handle_ruri_alias(): Double = js.native
  
  def is_rfc1918(address: String): Double = js.native
  
  def nat_uac_test(tests: Double): Double = js.native
  
  def set_contact_alias(): Double = js.native
}
object Typeofnathelper {
  
  @scala.inline
  def apply(
    add_contact_alias: () => Double,
    add_contact_alias_addr: (String, String, String) => Double,
    add_rcv_param: Double => Double,
    fix_nated_contact: () => Double,
    fix_nated_register: () => Double,
    fix_nated_sdp: Double => Double,
    fix_nated_sdp_ip: (Double, String) => Double,
    handle_ruri_alias: () => Double,
    is_rfc1918: String => Double,
    nat_uac_test: Double => Double,
    set_contact_alias: () => Double
  ): Typeofnathelper = {
    val __obj = js.Dynamic.literal(add_contact_alias = js.Any.fromFunction0(add_contact_alias), add_contact_alias_addr = js.Any.fromFunction3(add_contact_alias_addr), add_rcv_param = js.Any.fromFunction1(add_rcv_param), fix_nated_contact = js.Any.fromFunction0(fix_nated_contact), fix_nated_register = js.Any.fromFunction0(fix_nated_register), fix_nated_sdp = js.Any.fromFunction1(fix_nated_sdp), fix_nated_sdp_ip = js.Any.fromFunction2(fix_nated_sdp_ip), handle_ruri_alias = js.Any.fromFunction0(handle_ruri_alias), is_rfc1918 = js.Any.fromFunction1(is_rfc1918), nat_uac_test = js.Any.fromFunction1(nat_uac_test), set_contact_alias = js.Any.fromFunction0(set_contact_alias))
    __obj.asInstanceOf[Typeofnathelper]
  }
  
  @scala.inline
  implicit class TypeofnathelperOps[Self <: Typeofnathelper] (val x: Self) extends AnyVal {
    
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
    def setAdd_contact_alias(value: () => Double): Self = this.set("add_contact_alias", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAdd_contact_alias_addr(value: (String, String, String) => Double): Self = this.set("add_contact_alias_addr", js.Any.fromFunction3(value))
    
    @scala.inline
    def setAdd_rcv_param(value: Double => Double): Self = this.set("add_rcv_param", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFix_nated_contact(value: () => Double): Self = this.set("fix_nated_contact", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFix_nated_register(value: () => Double): Self = this.set("fix_nated_register", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFix_nated_sdp(value: Double => Double): Self = this.set("fix_nated_sdp", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFix_nated_sdp_ip(value: (Double, String) => Double): Self = this.set("fix_nated_sdp_ip", js.Any.fromFunction2(value))
    
    @scala.inline
    def setHandle_ruri_alias(value: () => Double): Self = this.set("handle_ruri_alias", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIs_rfc1918(value: String => Double): Self = this.set("is_rfc1918", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNat_uac_test(value: Double => Double): Self = this.set("nat_uac_test", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_contact_alias(value: () => Double): Self = this.set("set_contact_alias", js.Any.fromFunction0(value))
  }
}
