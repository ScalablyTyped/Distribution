package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign.KJUR.asn1.x509.GeneralNameParam
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ldapdn
  extends StObject
     with GeneralNameParam {
  
  var ldapdn: String
}
object Ldapdn {
  
  inline def apply(ldapdn: String): Ldapdn = {
    val __obj = js.Dynamic.literal(ldapdn = ldapdn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ldapdn]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ldapdn] (val x: Self) extends AnyVal {
    
    inline def setLdapdn(value: String): Self = StObject.set(x, "ldapdn", value.asInstanceOf[js.Any])
  }
}
