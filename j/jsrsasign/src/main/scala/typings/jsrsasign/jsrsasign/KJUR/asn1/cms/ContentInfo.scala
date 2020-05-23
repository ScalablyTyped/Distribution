package typings.jsrsasign.jsrsasign.KJUR.asn1.cms

import typings.jsrsasign.jsrsasign.KJUR.asn1.ASN1Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * class for ContentInfo ASN.1 structure for CMS
  * @param params associative array of parameters
  * @description
  * ```
  * ContentInfo ::= SEQUENCE {
  *    contentType ContentType,
  *    content [0] EXPLICIT ANY DEFINED BY contentType }
  * ContentType ::= OBJECT IDENTIFIER
  * ```
  * @example
  * a = [new KJUR.asn1.DERInteger({int: 1}),
  *      new KJUR.asn1.DERInteger({int: 2})];
  * seq = new KJUR.asn1.DERSequence({array: a});
  * o = new KJUR.asn1.cms.ContentInfo({type: 'data', obj: seq});
  */
trait ContentInfo extends ASN1Object {
  def setContentType(params: String): Unit
}

object ContentInfo {
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
    setContentType: String => Unit
  ): ContentInfo = {
    val __obj = js.Dynamic.literal(getEncodedHex = js.Any.fromFunction0(getEncodedHex), getFreshValueHex = js.Any.fromFunction0(getFreshValueHex), getLengthHexFromValue = js.Any.fromFunction0(getLengthHexFromValue), getValueHex = js.Any.fromFunction0(getValueHex), hL = hL.asInstanceOf[js.Any], hT = hT.asInstanceOf[js.Any], hTLV = hTLV.asInstanceOf[js.Any], hV = hV.asInstanceOf[js.Any], isModified = isModified.asInstanceOf[js.Any], setContentType = js.Any.fromFunction1(setContentType))
    __obj.asInstanceOf[ContentInfo]
  }
}

