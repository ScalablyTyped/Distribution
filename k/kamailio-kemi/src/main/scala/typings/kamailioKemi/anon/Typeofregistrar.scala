package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofregistrar extends js.Object {
  
  def add_sock_hdr(hdr_name: String): Double = js.native
  
  def lookup(table: String): Double = js.native
  
  def lookup_branches(_dtable: String): Double = js.native
  
  def lookup_to_dset(table: String, uri: String): Double = js.native
  
  def lookup_uri(table: String, uri: String): Double = js.native
  
  def reg_fetch_contacts(dtable: String, uri: String, profile: String): Double = js.native
  
  def reg_free_contacts(profile: String): Double = js.native
  
  def registered(table: String): Double = js.native
  
  def registered_action(_dtable: String, _uri: String, _f: Double, _aflags: Double): Double = js.native
  
  def registered_flags(_dtable: String, _uri: String, _f: Double): Double = js.native
  
  def registered_uri(_dtable: String, _uri: String): Double = js.native
  
  def save(table: String, flags: Double): Double = js.native
  
  def save_uri(table: String, flags: Double, uri: String): Double = js.native
  
  def set_q_override(new_q: String): Double = js.native
  
  def unregister(_dtable: String, _uri: String): Double = js.native
  
  def unregister_ruid(_dtable: String, _uri: String, _ruid: String): Double = js.native
}
object Typeofregistrar {
  
  @scala.inline
  def apply(
    add_sock_hdr: String => Double,
    lookup: String => Double,
    lookup_branches: String => Double,
    lookup_to_dset: (String, String) => Double,
    lookup_uri: (String, String) => Double,
    reg_fetch_contacts: (String, String, String) => Double,
    reg_free_contacts: String => Double,
    registered: String => Double,
    registered_action: (String, String, Double, Double) => Double,
    registered_flags: (String, String, Double) => Double,
    registered_uri: (String, String) => Double,
    save: (String, Double) => Double,
    save_uri: (String, Double, String) => Double,
    set_q_override: String => Double,
    unregister: (String, String) => Double,
    unregister_ruid: (String, String, String) => Double
  ): Typeofregistrar = {
    val __obj = js.Dynamic.literal(add_sock_hdr = js.Any.fromFunction1(add_sock_hdr), lookup = js.Any.fromFunction1(lookup), lookup_branches = js.Any.fromFunction1(lookup_branches), lookup_to_dset = js.Any.fromFunction2(lookup_to_dset), lookup_uri = js.Any.fromFunction2(lookup_uri), reg_fetch_contacts = js.Any.fromFunction3(reg_fetch_contacts), reg_free_contacts = js.Any.fromFunction1(reg_free_contacts), registered = js.Any.fromFunction1(registered), registered_action = js.Any.fromFunction4(registered_action), registered_flags = js.Any.fromFunction3(registered_flags), registered_uri = js.Any.fromFunction2(registered_uri), save = js.Any.fromFunction2(save), save_uri = js.Any.fromFunction3(save_uri), set_q_override = js.Any.fromFunction1(set_q_override), unregister = js.Any.fromFunction2(unregister), unregister_ruid = js.Any.fromFunction3(unregister_ruid))
    __obj.asInstanceOf[Typeofregistrar]
  }
  
  @scala.inline
  implicit class TypeofregistrarOps[Self <: Typeofregistrar] (val x: Self) extends AnyVal {
    
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
    def setAdd_sock_hdr(value: String => Double): Self = this.set("add_sock_hdr", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLookup(value: String => Double): Self = this.set("lookup", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLookup_branches(value: String => Double): Self = this.set("lookup_branches", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLookup_to_dset(value: (String, String) => Double): Self = this.set("lookup_to_dset", js.Any.fromFunction2(value))
    
    @scala.inline
    def setLookup_uri(value: (String, String) => Double): Self = this.set("lookup_uri", js.Any.fromFunction2(value))
    
    @scala.inline
    def setReg_fetch_contacts(value: (String, String, String) => Double): Self = this.set("reg_fetch_contacts", js.Any.fromFunction3(value))
    
    @scala.inline
    def setReg_free_contacts(value: String => Double): Self = this.set("reg_free_contacts", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRegistered(value: String => Double): Self = this.set("registered", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRegistered_action(value: (String, String, Double, Double) => Double): Self = this.set("registered_action", js.Any.fromFunction4(value))
    
    @scala.inline
    def setRegistered_flags(value: (String, String, Double) => Double): Self = this.set("registered_flags", js.Any.fromFunction3(value))
    
    @scala.inline
    def setRegistered_uri(value: (String, String) => Double): Self = this.set("registered_uri", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSave(value: (String, Double) => Double): Self = this.set("save", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSave_uri(value: (String, Double, String) => Double): Self = this.set("save_uri", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSet_q_override(value: String => Double): Self = this.set("set_q_override", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnregister(value: (String, String) => Double): Self = this.set("unregister", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUnregister_ruid(value: (String, String, String) => Double): Self = this.set("unregister_ruid", js.Any.fromFunction3(value))
  }
}
