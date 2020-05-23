package typings.jsrsasign.mod.KJUR.asn1.x509

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
@JSImport("jsrsasign", "KJUR.asn1.x509.AuthorityKeyIdentifier")
@js.native
class AuthorityKeyIdentifier ()
  extends typings.jsrsasign.jsrsasign.KJUR.asn1.x509.AuthorityKeyIdentifier {
  def this(params: Critical) = this()
  /** hexadecimal string of ASN.1 TLV length(L) */
  /* CompleteClass */
  override var hL: String = js.native
  /** hexadecimal string of ASN.1 TLV tag(T) */
  /* CompleteClass */
  override var hT: String = js.native
  /** hexadecimal string of ASN.1 TLV */
  /* CompleteClass */
  override var hTLV: String = js.native
  /** hexadecimal string of ASN.1 TLV value(V) */
  /* CompleteClass */
  override var hV: String = js.native
  /** flag whether internal data was changed */
  /* CompleteClass */
  override var isModified: String = js.native
  /**
    * get hexadecimal string of ASN.1 TLV bytes
    * @return hexadecimal string of ASN.1 TLV
    */
  /* CompleteClass */
  override def getEncodedHex(): String = js.native
  /* CompleteClass */
  override def getFreshValueHex(): String = js.native
  /**
    * get hexadecimal ASN.1 TLV length(L) bytes from TLV value(V)
    * @return hexadecimal string of ASN.1 TLV length(L)
    */
  /* CompleteClass */
  override def getLengthHexFromValue(): String = js.native
  /**
    * get hexadecimal string of ASN.1 TLV value(V) bytes
    * @return hexadecimal string of ASN.1 TLV value(V) bytes
    */
  /* CompleteClass */
  override def getValueHex(): String = js.native
}

