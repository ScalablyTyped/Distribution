package typings.jsrsasign.jsrsasign.KJUR.asn1.cms

import typings.jsrsasign.jsrsasign.KJUR.asn1.ASN1Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * class for Attributes ASN.1 structure for CMS
  * @param params associative array of parameters
  * @description
  * ```
  * Attributes ::= SET OF Attribute
  * Attribute ::= SEQUENCE {
  *    type               OBJECT IDENTIFIER,
  *    values             AttributeSetValue }
  * ```
  * @example
  * // specify by X500Name and DERInteger
  * o = new KJUR.asn1.cms.AttributeList({sorted: false}); // ASN.1 BER unsorted SET OF
  * o = new KJUR.asn1.cms.AttributeList();  // ASN.1 DER sorted by default
  * o.clear();                              // clear list of Attributes
  * n = o.length();                         // get number of Attribute
  * o.add(new KJUR.asn1.cms.SigningTime()); // add SigningTime attribute
  * hex = o.getEncodedHex();                // get hex encoded ASN.1 data
  */
trait AttributeList extends ASN1Object {
  def add(item: Attribute): Unit
  def clear(): Unit
  def length(): Double
}

object AttributeList {
  @scala.inline
  def apply(
    add: Attribute => Unit,
    clear: () => Unit,
    getEncodedHex: () => String,
    getFreshValueHex: () => String,
    getLengthHexFromValue: () => String,
    getValueHex: () => String,
    hL: String,
    hT: String,
    hTLV: String,
    hV: String,
    isModified: String,
    length: () => Double
  ): AttributeList = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), clear = js.Any.fromFunction0(clear), getEncodedHex = js.Any.fromFunction0(getEncodedHex), getFreshValueHex = js.Any.fromFunction0(getFreshValueHex), getLengthHexFromValue = js.Any.fromFunction0(getLengthHexFromValue), getValueHex = js.Any.fromFunction0(getValueHex), hL = hL.asInstanceOf[js.Any], hT = hT.asInstanceOf[js.Any], hTLV = hTLV.asInstanceOf[js.Any], hV = hV.asInstanceOf[js.Any], isModified = isModified.asInstanceOf[js.Any], length = js.Any.fromFunction0(length))
    __obj.asInstanceOf[AttributeList]
  }
}

