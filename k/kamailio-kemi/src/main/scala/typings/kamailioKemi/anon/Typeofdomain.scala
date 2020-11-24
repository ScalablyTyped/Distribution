package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofdomain extends js.Object {
  
  def is_domain_local(sdomain: String): Double = js.native
  
  def is_from_local(): Double = js.native
  
  def is_uri_host_local(): Double = js.native
  
  def lookup_domain(_sdomain: String): Double = js.native
  
  def lookup_domain_prefix(_sdomain: String, _sprefix: String): Double = js.native
}
object Typeofdomain {
  
  @scala.inline
  def apply(
    is_domain_local: String => Double,
    is_from_local: () => Double,
    is_uri_host_local: () => Double,
    lookup_domain: String => Double,
    lookup_domain_prefix: (String, String) => Double
  ): Typeofdomain = {
    val __obj = js.Dynamic.literal(is_domain_local = js.Any.fromFunction1(is_domain_local), is_from_local = js.Any.fromFunction0(is_from_local), is_uri_host_local = js.Any.fromFunction0(is_uri_host_local), lookup_domain = js.Any.fromFunction1(lookup_domain), lookup_domain_prefix = js.Any.fromFunction2(lookup_domain_prefix))
    __obj.asInstanceOf[Typeofdomain]
  }
  
  @scala.inline
  implicit class TypeofdomainOps[Self <: Typeofdomain] (val x: Self) extends AnyVal {
    
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
    def setIs_domain_local(value: String => Double): Self = this.set("is_domain_local", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIs_from_local(value: () => Double): Self = this.set("is_from_local", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIs_uri_host_local(value: () => Double): Self = this.set("is_uri_host_local", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLookup_domain(value: String => Double): Self = this.set("lookup_domain", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLookup_domain_prefix(value: (String, String) => Double): Self = this.set("lookup_domain_prefix", js.Any.fromFunction2(value))
  }
}
