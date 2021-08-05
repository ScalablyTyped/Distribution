package typings.jsrsasign.jsrsasign.KJUR.asn1.x509

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.jsrsasign.anon.Rfc822
  - typings.jsrsasign.anon.Dns
  - typings.jsrsasign.anon.UriString
  - typings.jsrsasign.anon.Dn
  - typings.jsrsasign.anon.Ldapdn
  - typings.jsrsasign.anon.CertissuerString
  - typings.jsrsasign.anon.Certsubj
*/
trait GeneralNameParam extends StObject
object GeneralNameParam {
  
  inline def CertissuerString(certissuer: String): typings.jsrsasign.anon.CertissuerString = {
    val __obj = js.Dynamic.literal(certissuer = certissuer.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jsrsasign.anon.CertissuerString]
  }
  
  inline def Certsubj(certsubj: String): typings.jsrsasign.anon.Certsubj = {
    val __obj = js.Dynamic.literal(certsubj = certsubj.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jsrsasign.anon.Certsubj]
  }
  
  inline def Dn(dn: String): typings.jsrsasign.anon.Dn = {
    val __obj = js.Dynamic.literal(dn = dn.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jsrsasign.anon.Dn]
  }
  
  inline def Dns(dns: String): typings.jsrsasign.anon.Dns = {
    val __obj = js.Dynamic.literal(dns = dns.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jsrsasign.anon.Dns]
  }
  
  inline def Ldapdn(ldapdn: String): typings.jsrsasign.anon.Ldapdn = {
    val __obj = js.Dynamic.literal(ldapdn = ldapdn.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jsrsasign.anon.Ldapdn]
  }
  
  inline def Rfc822(rfc822: String): typings.jsrsasign.anon.Rfc822 = {
    val __obj = js.Dynamic.literal(rfc822 = rfc822.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jsrsasign.anon.Rfc822]
  }
  
  inline def UriString(uri: String): typings.jsrsasign.anon.UriString = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jsrsasign.anon.UriString]
  }
}
