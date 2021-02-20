package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign.KJUR.asn1.x509.GeneralNameParam
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ldapdn extends GeneralNameParam {
  
  var ldapdn: String = js.native
}
object Ldapdn {
  
  @scala.inline
  def apply(ldapdn: String): Ldapdn = {
    val __obj = js.Dynamic.literal(ldapdn = ldapdn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ldapdn]
  }
  
  @scala.inline
  implicit class LdapdnMutableBuilder[Self <: Ldapdn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLdapdn(value: String): Self = StObject.set(x, "ldapdn", value.asInstanceOf[js.Any])
  }
}
