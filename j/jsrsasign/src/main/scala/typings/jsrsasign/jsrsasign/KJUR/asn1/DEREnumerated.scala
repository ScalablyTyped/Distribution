package typings.jsrsasign.jsrsasign.KJUR.asn1

import typings.jsrsasign.jsrsasign.BigInteger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * class for ASN.1 DER Enumerated
  * @description
  * As for argument 'params' for constructor, you can specify one of
  * following properties:
  *
  * - int - specify initial ASN.1 value(V) by integer value
  * - hex - specify initial ASN.1 value(V) by a hexadecimal string
  *
  * NOTE: 'params' can be omitted.
  * @example
  * new KJUR.asn1.DEREnumerated(123);
  * new KJUR.asn1.DEREnumerated({int: 123});
  * new KJUR.asn1.DEREnumerated({hex: '1fad'});
  */
@JSGlobal("jsrsasign.KJUR.asn1.DEREnumerated")
@js.native
class DEREnumerated () extends ASN1Object {
  def this(params: Double) = this()
  def this(params: HexParam) = this()
  def this(params: IntegerParam) = this()
  /**
    * set value by Tom Wu's BigInteger object
    * @param bigIntegerValue value to set
    */
  def setByBigInteger(bigIntegerValue: BigInteger): Unit = js.native
  /**
    * set value by integer value
    * @param intValue integer value to set
    */
  def setByInteger(intValue: Double): Unit = js.native
  /**
    * set value by integer value
    * @param newHexString hexadecimal string of integer value
    * @description
    * NOTE: Value shall be represented by minimum octet length of
    * two's complement representation.
    */
  def setValueHex(newHexString: String): Unit = js.native
}

