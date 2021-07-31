package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign.KJUR.asn1.x509.GeneralNameParam
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dns
  extends StObject
     with GeneralNameParam {
  
  var dns: String
}
object Dns {
  
  @scala.inline
  def apply(dns: String): Dns = {
    val __obj = js.Dynamic.literal(dns = dns.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dns]
  }
  
  @scala.inline
  implicit class DnsMutableBuilder[Self <: Dns] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDns(value: String): Self = StObject.set(x, "dns", value.asInstanceOf[js.Any])
  }
}
