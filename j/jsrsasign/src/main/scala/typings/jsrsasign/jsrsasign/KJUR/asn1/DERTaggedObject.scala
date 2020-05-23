package typings.jsrsasign.jsrsasign.KJUR.asn1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * class for ASN.1 DER TaggedObject
  *
  * @description
  * Parameter 'tagNoNex' is ASN.1 tag(T) value for this object.
  * For example, if you find '[1]' tag in a ASN.1 dump,
  * 'tagNoHex' will be 'a1'.
  *
  * As for optional argument 'params' for constructor, you can specify *ANY* of
  * following properties:
  *
  * - explicit - specify true if this is explicit tag otherwise false
  *   (default is 'true').
  * - tag - specify tag (default is 'a0' which means [0])
  * - obj - specify ASN1Object which is tagged
  *
  * @example
  * d1 = new KJUR.asn1.DERUTF8String({'str':'a'});
  * d2 = new KJUR.asn1.DERTaggedObject({'obj': d1});
  * hex = d2.getEncodedHex();
  */
trait DERTaggedObject extends ASN1Object {
  /**
    * set value by an ASN1Object
    * @param isExplicitFlag flag for explicit/implicit tag
    * @param tagNoHex hexadecimal string of ASN.1 tag
    * @param asn1Object ASN.1 to encapsulate
    */
  def setASN1Object(isExplicitFlag: Boolean, tagNoHex: String, asn1Object: ASN1Object): Unit
}

object DERTaggedObject {
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
    setASN1Object: (Boolean, String, ASN1Object) => Unit
  ): DERTaggedObject = {
    val __obj = js.Dynamic.literal(getEncodedHex = js.Any.fromFunction0(getEncodedHex), getFreshValueHex = js.Any.fromFunction0(getFreshValueHex), getLengthHexFromValue = js.Any.fromFunction0(getLengthHexFromValue), getValueHex = js.Any.fromFunction0(getValueHex), hL = hL.asInstanceOf[js.Any], hT = hT.asInstanceOf[js.Any], hTLV = hTLV.asInstanceOf[js.Any], hV = hV.asInstanceOf[js.Any], isModified = isModified.asInstanceOf[js.Any], setASN1Object = js.Any.fromFunction3(setASN1Object))
    __obj.asInstanceOf[DERTaggedObject]
  }
}

