package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign.X500Name
import typings.jsrsasign.jsrsasign._GeneralName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DnX500Name
  extends StObject
     with _GeneralName {
  
  var dn: X500Name
}
object DnX500Name {
  
  inline def apply(dn: X500Name): DnX500Name = {
    val __obj = js.Dynamic.literal(dn = dn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DnX500Name]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DnX500Name] (val x: Self) extends AnyVal {
    
    inline def setDn(value: X500Name): Self = StObject.set(x, "dn", value.asInstanceOf[js.Any])
  }
}
