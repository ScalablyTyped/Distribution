package typings.jsrsasign.jsrsasign.KJUR.asn1.cades

import typings.jsrsasign.jsrsasign.KJUR.asn1.ASN1Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * class for OtherHash ASN.1 object
  * @param params associative array of parameters
  * @description
  * ```
  * OtherHash ::= CHOICE {
  *    sha1Hash   OtherHashValue,  -- This contains a SHA-1 hash
  *    otherHash  OtherHashAlgAndValue}
  * OtherHashValue ::= OCTET STRING
  * ```
  * @example
  * o = new KJUR.asn1.cades.OtherHash("1234");
  * o = new KJUR.asn1.cades.OtherHash(certPEMStr); // default alg=sha256
  * o = new KJUR.asn1.cades.OtherHash({alg: 'sha256', hash: '1234'});
  * o = new KJUR.asn1.cades.OtherHash({alg: 'sha256', cert: certPEM});
  * o = new KJUR.asn1.cades.OtherHash({cert: certPEM});
  */
trait OtherHash extends ASN1Object {
  /**
    * set value by PEM string of certificate
    * @param certPEM PEM string of certificate
    * @description
    * This method will set value by a PEM string of a certificate.
    * An algorithm used to hash certificate data will
    * be defined by 'alg' property and 'sha256' is default.
    */
  def setByCertPEM(certPEM: String): Unit
}

object OtherHash {
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
  ): OtherHash = {
    val __obj = js.Dynamic.literal(getEncodedHex = js.Any.fromFunction0(getEncodedHex), getFreshValueHex = js.Any.fromFunction0(getFreshValueHex), getLengthHexFromValue = js.Any.fromFunction0(getLengthHexFromValue), getValueHex = js.Any.fromFunction0(getValueHex), hL = hL.asInstanceOf[js.Any], hT = hT.asInstanceOf[js.Any], hTLV = hTLV.asInstanceOf[js.Any], hV = hV.asInstanceOf[js.Any], isModified = isModified.asInstanceOf[js.Any], setByCertPEM = js.Any.fromFunction1(setByCertPEM))
    __obj.asInstanceOf[OtherHash]
  }
}

