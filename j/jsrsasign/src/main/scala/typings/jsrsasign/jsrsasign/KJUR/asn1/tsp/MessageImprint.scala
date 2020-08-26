package typings.jsrsasign.jsrsasign.KJUR.asn1.tsp

import typings.jsrsasign.jsrsasign.KJUR.asn1.ASN1Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * class for TSP MessageImprint ASN.1 object
  * @param params associative array of parameters
  * @description
  * ```
  * MessageImprint ::= SEQUENCE  {
  *      hashAlgorithm                AlgorithmIdentifier,
  *      hashedMessage                OCTET STRING  }
  * ```
  * @example
  * o = new KJUR.asn1.tsp.MessageImprint({hashAlg: 'sha1',
  *                                       hashValue: '1f3dea...'});
  */
@js.native
trait MessageImprint extends ASN1Object

object MessageImprint {
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
    isModified: String
  ): MessageImprint = {
    val __obj = js.Dynamic.literal(getEncodedHex = js.Any.fromFunction0(getEncodedHex), getFreshValueHex = js.Any.fromFunction0(getFreshValueHex), getLengthHexFromValue = js.Any.fromFunction0(getLengthHexFromValue), getValueHex = js.Any.fromFunction0(getValueHex), hL = hL.asInstanceOf[js.Any], hT = hT.asInstanceOf[js.Any], hTLV = hTLV.asInstanceOf[js.Any], hV = hV.asInstanceOf[js.Any], isModified = isModified.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageImprint]
  }
}

