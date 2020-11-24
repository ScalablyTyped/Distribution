package typings.jsrsasign.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Certissuer extends js.Object {
  
  var certissuer: js.UndefOr[String] = js.native
  
  var certsubject: js.UndefOr[String] = js.native
  
  var ldapstr: String = js.native
}
object Certissuer {
  
  @scala.inline
  def apply(ldapstr: String): Certissuer = {
    val __obj = js.Dynamic.literal(ldapstr = ldapstr.asInstanceOf[js.Any])
    __obj.asInstanceOf[Certissuer]
  }
  
  @scala.inline
  implicit class CertissuerOps[Self <: Certissuer] (val x: Self) extends AnyVal {
    
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
    def setLdapstr(value: String): Self = this.set("ldapstr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertissuer(value: String): Self = this.set("certissuer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertissuer: Self = this.set("certissuer", js.undefined)
    
    @scala.inline
    def setCertsubject(value: String): Self = this.set("certsubject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertsubject: Self = this.set("certsubject", js.undefined)
  }
}
