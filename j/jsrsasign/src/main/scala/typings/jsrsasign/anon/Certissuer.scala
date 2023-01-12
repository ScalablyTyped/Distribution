package typings.jsrsasign.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Certissuer extends StObject {
  
  var certissuer: js.UndefOr[String] = js.undefined
  
  var certsubject: js.UndefOr[String] = js.undefined
  
  var ldapstr: String
}
object Certissuer {
  
  inline def apply(ldapstr: String): Certissuer = {
    val __obj = js.Dynamic.literal(ldapstr = ldapstr.asInstanceOf[js.Any])
    __obj.asInstanceOf[Certissuer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Certissuer] (val x: Self) extends AnyVal {
    
    inline def setCertissuer(value: String): Self = StObject.set(x, "certissuer", value.asInstanceOf[js.Any])
    
    inline def setCertissuerUndefined: Self = StObject.set(x, "certissuer", js.undefined)
    
    inline def setCertsubject(value: String): Self = StObject.set(x, "certsubject", value.asInstanceOf[js.Any])
    
    inline def setCertsubjectUndefined: Self = StObject.set(x, "certsubject", js.undefined)
    
    inline def setLdapstr(value: String): Self = StObject.set(x, "ldapstr", value.asInstanceOf[js.Any])
  }
}
