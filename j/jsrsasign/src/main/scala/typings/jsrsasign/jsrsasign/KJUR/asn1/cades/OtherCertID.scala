package typings.jsrsasign.jsrsasign.KJUR.asn1.cades

import typings.jsrsasign.jsrsasign.KJUR.asn1.ASN1Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * class for OtherCertID ASN.1 object
  * @param params associative array of parameters
  * @description
  * ```
  * OtherCertID ::= SEQUENCE {
  *    otherCertHash    OtherHash,
  *    issuerSerial     IssuerSerial OPTIONAL }
  * ```
  * @example
  * o = new KJUR.asn1.cades.OtherCertID(certPEM);
  * o = new KJUR.asn1.cades.OtherCertID({cert:certPEM, hasis: false});
  */
trait OtherCertID extends ASN1Object {
  /**
    * set value by PEM string of certificate
    * @param certPEM PEM string of certificate
    * @description
    * This method will set value by a PEM string of a certificate.
    * This will add IssuerAndSerialNumber by default
    * which depends on hasIssuerSerial flag.
    */
  def setByCertPEM(certPEM: String): Unit
}

object OtherCertID {
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
  ): OtherCertID = {
    val __obj = js.Dynamic.literal(getEncodedHex = js.Any.fromFunction0(getEncodedHex), getFreshValueHex = js.Any.fromFunction0(getFreshValueHex), getLengthHexFromValue = js.Any.fromFunction0(getLengthHexFromValue), getValueHex = js.Any.fromFunction0(getValueHex), hL = hL.asInstanceOf[js.Any], hT = hT.asInstanceOf[js.Any], hTLV = hTLV.asInstanceOf[js.Any], hV = hV.asInstanceOf[js.Any], isModified = isModified.asInstanceOf[js.Any], setByCertPEM = js.Any.fromFunction1(setByCertPEM))
    __obj.asInstanceOf[OtherCertID]
  }
}

