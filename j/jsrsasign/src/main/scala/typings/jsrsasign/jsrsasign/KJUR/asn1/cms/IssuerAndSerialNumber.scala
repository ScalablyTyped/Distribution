package typings.jsrsasign.jsrsasign.KJUR.asn1.cms

import typings.jsrsasign.jsrsasign.KJUR.asn1.ASN1Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * class for IssuerAndSerialNumber ASN.1 structure for CMS
  * @param params associative array of parameters
  * @description
  * ```
  * IssuerAndSerialNumber ::= SEQUENCE {
  *    issuer Name,
  *    serialNumber CertificateSerialNumber }
  * CertificateSerialNumber ::= INTEGER
  * ```
  * @example
  * // specify by X500Name and DERInteger
  * o = new KJUR.asn1.cms.IssuerAndSerialNumber(
  *      {issuer: {str: '/C=US/O=T1'}, serial {int: 3}});
  * // specify by PEM certificate
  * o = new KJUR.asn1.cms.IssuerAndSerialNumber({cert: certPEM});
  * o = new KJUR.asn1.cms.IssuerAndSerialNumber(certPEM); // since 1.0.3
  */
trait IssuerAndSerialNumber extends ASN1Object {
  def setByCertPEM(certPEM: String): Unit
}

object IssuerAndSerialNumber {
  @scala.inline
  def apply(
    getEncodedHex: () => String,
    getFreshValueHex: () => String,
    getLengthHexFromValue: () => String,
    getValueHex: () => String,
    hL: String,
    hT: String,
    hTLV: String,
    hV: String,
    isModified: String,
    setByCertPEM: String => Unit
  ): IssuerAndSerialNumber = {
    val __obj = js.Dynamic.literal(getEncodedHex = js.Any.fromFunction0(getEncodedHex), getFreshValueHex = js.Any.fromFunction0(getFreshValueHex), getLengthHexFromValue = js.Any.fromFunction0(getLengthHexFromValue), getValueHex = js.Any.fromFunction0(getValueHex), hL = hL.asInstanceOf[js.Any], hT = hT.asInstanceOf[js.Any], hTLV = hTLV.asInstanceOf[js.Any], hV = hV.asInstanceOf[js.Any], isModified = isModified.asInstanceOf[js.Any], setByCertPEM = js.Any.fromFunction1(setByCertPEM))
    __obj.asInstanceOf[IssuerAndSerialNumber]
  }
}

