package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign.KJUR.asn1.x509.GeneralNameParam
import typings.jsrsasign.jsrsasign._GeneralName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dns
  extends StObject
     with GeneralNameParam
     with _GeneralName {
  
  var dns: String
}
object Dns {
  
  inline def apply(dns: String): Dns = {
    val __obj = js.Dynamic.literal(dns = dns.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dns]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Dns] (val x: Self) extends AnyVal {
    
    inline def setDns(value: String): Self = StObject.set(x, "dns", value.asInstanceOf[js.Any])
  }
}
