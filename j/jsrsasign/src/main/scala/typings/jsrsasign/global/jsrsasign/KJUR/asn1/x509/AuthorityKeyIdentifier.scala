package typings.jsrsasign.global.jsrsasign.KJUR.asn1.x509

import typings.jsrsasign.anon.Critical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * AuthorityKeyIdentifier ASN.1 structure class
  * @param params associative array of parameters (ex. {'uri': 'http://a.com/', 'critical': true})
  * @description
  * ```
  * d-ce-authorityKeyIdentifier OBJECT IDENTIFIER ::=  { id-ce 35 }
  * AuthorityKeyIdentifier ::= SEQUENCE {
  *    keyIdentifier             [0] KeyIdentifier           OPTIONAL,
  *    authorityCertIssuer       [1] GeneralNames            OPTIONAL,
  *    authorityCertSerialNumber [2] CertificateSerialNumber OPTIONAL  }
  * KeyIdentifier ::= OCTET STRING
  * ```
  * @example
  * e1 = new KJUR.asn1.x509.AuthorityKeyIdentifier({
  *   critical: true,
  *   kid:    {hex: '89ab'},
  *   issuer: {str: '/C=US/CN=a'},
  *   sn:     {hex: '1234'}
  * });
  */
@JSGlobal("jsrsasign.KJUR.asn1.x509.AuthorityKeyIdentifier")
@js.native
class AuthorityKeyIdentifier ()
  extends typings.jsrsasign.jsrsasign.KJUR.asn1.x509.AuthorityKeyIdentifier {
  def this(params: Critical) = this()
}

