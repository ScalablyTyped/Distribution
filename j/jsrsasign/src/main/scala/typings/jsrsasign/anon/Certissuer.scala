package typings.jsrsasign.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Certissuer extends StObject {
  
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
  implicit class CertissuerMutableBuilder[Self <: Certissuer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertissuer(value: String): Self = StObject.set(x, "certissuer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertissuerUndefined: Self = StObject.set(x, "certissuer", js.undefined)
    
    @scala.inline
    def setCertsubject(value: String): Self = StObject.set(x, "certsubject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertsubjectUndefined: Self = StObject.set(x, "certsubject", js.undefined)
    
    @scala.inline
    def setLdapstr(value: String): Self = StObject.set(x, "ldapstr", value.asInstanceOf[js.Any])
  }
}
