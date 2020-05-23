package typings.jsrsasign.jsrsasign.KJUR.asn1.x509

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.jsrsasign.anon.Rfc822
  - typings.jsrsasign.anon.Dns
  - typings.jsrsasign.anon.UriString
  - typings.jsrsasign.anon.Dn
  - typings.jsrsasign.anon.Ldapdn
  - typings.jsrsasign.anon.CertissuerString
  - typings.jsrsasign.anon.Certsubj
*/
trait GeneralNameParam extends js.Object

object GeneralNameParam {
  @scala.inline
  def Rfc822(rfc822: String): GeneralNameParam = {
    val __obj = js.Dynamic.literal(rfc822 = rfc822.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeneralNameParam]
  }
  @scala.inline
  def Certsubj(certsubj: String): GeneralNameParam = {
    val __obj = js.Dynamic.literal(certsubj = certsubj.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeneralNameParam]
  }
  @scala.inline
  def Dns(dns: String): GeneralNameParam = {
    val __obj = js.Dynamic.literal(dns = dns.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeneralNameParam]
  }
  @scala.inline
  def Dn(dn: String): GeneralNameParam = {
    val __obj = js.Dynamic.literal(dn = dn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeneralNameParam]
  }
  @scala.inline
  def Ldapdn(ldapdn: String): GeneralNameParam = {
    val __obj = js.Dynamic.literal(ldapdn = ldapdn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeneralNameParam]
  }
  @scala.inline
  def CertissuerString(certissuer: String): GeneralNameParam = {
    val __obj = js.Dynamic.literal(certissuer = certissuer.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeneralNameParam]
  }
  @scala.inline
  def UriString(uri: String): GeneralNameParam = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeneralNameParam]
  }
}

