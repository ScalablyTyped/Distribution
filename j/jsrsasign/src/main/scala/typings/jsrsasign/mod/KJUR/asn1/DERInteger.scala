package typings.jsrsasign.mod.KJUR.asn1

import typings.jsrsasign.jsrsasign.BigInteger
import typings.jsrsasign.jsrsasign.KJUR.asn1.BigIntegerParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.HexParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.IntegerParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * class for ASN.1 DER Integer
  * @description
  * As for argument 'params' for constructor, you can specify one of
  * following properties:
  *
  * - int - specify initial ASN.1 value(V) by integer value
  * - bigint - specify initial ASN.1 value(V) by BigInteger object
  * - hex - specify initial ASN.1 value(V) by a hexadecimal string
  *
  * NOTE: 'params' can be omitted.
  */
@JSImport("jsrsasign", "KJUR.asn1.DERInteger")
@js.native
class DERInteger ()
  extends typings.jsrsasign.jsrsasign.KJUR.asn1.DERInteger {
  def this(params: Double) = this()
  def this(params: BigIntegerParam) = this()
  def this(params: HexParam) = this()
  def this(params: IntegerParam) = this()
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
    * set value by Tom Wu's BigInteger object
    * @param bigIntegerValue to set
    */
  /* CompleteClass */
  override def setByBigInteger(bigIntegerValue: BigInteger): Unit = js.native
  /**
    * set value by integer value
    * @param integer value to set
    */
  /* CompleteClass */
  override def setByInteger(intValue: Double): Unit = js.native
  /**
    * set value by hex string
    * @param newHexString hexadecimal string of integer value
    * @description
    * NOTE: Value shall be represented by minimum octet length of
    * two's complement representation.
    * @example
    * new KJUR.asn1.DERInteger(123);
    * new KJUR.asn1.DERInteger({'int': 123});
    * new KJUR.asn1.DERInteger({'hex': '1fad'});
    */
  /* CompleteClass */
  override def setValueHex(newHexString: String): Unit = js.native
}

