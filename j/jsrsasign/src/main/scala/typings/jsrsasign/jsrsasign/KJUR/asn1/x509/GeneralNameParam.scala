package typings.jsrsasign.jsrsasign.KJUR.asn1.x509

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.jsrsasign.AnonRfc822
  - typings.jsrsasign.AnonDns
  - typings.jsrsasign.AnonUri
  - typings.jsrsasign.AnonDn
  - typings.jsrsasign.AnonLdapdn
  - typings.jsrsasign.AnonCertissuerString
  - typings.jsrsasign.AnonCertsubj
*/
trait GeneralNameParam extends js.Object

object GeneralNameParam {
  @scala.inline
  def AnonLdapdn(ldapdn: String): GeneralNameParam = {
    val __obj = js.Dynamic.literal(ldapdn = ldapdn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GeneralNameParam]
  }
  @scala.inline
  def AnonCertsubj(certsubj: String): GeneralNameParam = {
    val __obj = js.Dynamic.literal(certsubj = certsubj.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GeneralNameParam]
  }
  @scala.inline
  def AnonUri(uri: String): GeneralNameParam = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GeneralNameParam]
  }
  @scala.inline
  def AnonDn(dn: String): GeneralNameParam = {
    val __obj = js.Dynamic.literal(dn = dn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GeneralNameParam]
  }
  @scala.inline
  def AnonCertissuerString(certissuer: String): GeneralNameParam = {
    val __obj = js.Dynamic.literal(certissuer = certissuer.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GeneralNameParam]
  }
  @scala.inline
  def AnonRfc822(rfc822: String): GeneralNameParam = {
    val __obj = js.Dynamic.literal(rfc822 = rfc822.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GeneralNameParam]
  }
  @scala.inline
  def AnonDns(dns: String): GeneralNameParam = {
    val __obj = js.Dynamic.literal(dns = dns.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GeneralNameParam]
  }
}

