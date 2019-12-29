package typings.jsrsasign.jsrsasign.KJUR.asn1.x509

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.jsrsasign.Anon_Rfc822
  - typings.jsrsasign.Anon_Dns
  - typings.jsrsasign.Anon_Uri
  - typings.jsrsasign.Anon_Dn
  - typings.jsrsasign.Anon_Ldapdn
  - typings.jsrsasign.Anon_CertissuerString
  - typings.jsrsasign.Anon_Certsubj
*/
trait GeneralNameParam extends js.Object

object GeneralNameParam {
  @scala.inline
  def Anon_Certsubj(certsubj: String): GeneralNameParam = {
    val __obj = js.Dynamic.literal(certsubj = certsubj.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GeneralNameParam]
  }
  @scala.inline
  def Anon_Ldapdn(ldapdn: String): GeneralNameParam = {
    val __obj = js.Dynamic.literal(ldapdn = ldapdn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GeneralNameParam]
  }
  @scala.inline
  def Anon_Uri(uri: String): GeneralNameParam = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GeneralNameParam]
  }
  @scala.inline
  def Anon_Dns(dns: String): GeneralNameParam = {
    val __obj = js.Dynamic.literal(dns = dns.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GeneralNameParam]
  }
  @scala.inline
  def Anon_Dn(dn: String): GeneralNameParam = {
    val __obj = js.Dynamic.literal(dn = dn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GeneralNameParam]
  }
  @scala.inline
  def Anon_CertissuerString(certissuer: String): GeneralNameParam = {
    val __obj = js.Dynamic.literal(certissuer = certissuer.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GeneralNameParam]
  }
  @scala.inline
  def Anon_Rfc822(rfc822: String): GeneralNameParam = {
    val __obj = js.Dynamic.literal(rfc822 = rfc822.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GeneralNameParam]
  }
}

