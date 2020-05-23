package typings.jsrsasign.global.jsrsasign.KJUR.asn1

import typings.jsrsasign.jsrsasign.KJUR.asn1.ASN1ObjectParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.ExplicitParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.TagParam
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
@JSGlobal("jsrsasign.KJUR.asn1.DERTaggedObject")
@js.native
class DERTaggedObject ()
  extends typings.jsrsasign.jsrsasign.KJUR.asn1.DERTaggedObject {
  def this(params: ASN1ObjectParam) = this()
  def this(params: ExplicitParam) = this()
  def this(params: TagParam) = this()
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
  /**
    * set value by an ASN1Object
    * @param isExplicitFlag flag for explicit/implicit tag
    * @param tagNoHex hexadecimal string of ASN.1 tag
    * @param asn1Object ASN.1 to encapsulate
    */
  /* CompleteClass */
  override def setASN1Object(
    isExplicitFlag: Boolean,
    tagNoHex: String,
    asn1Object: typings.jsrsasign.jsrsasign.KJUR.asn1.ASN1Object
  ): Unit = js.native
}

