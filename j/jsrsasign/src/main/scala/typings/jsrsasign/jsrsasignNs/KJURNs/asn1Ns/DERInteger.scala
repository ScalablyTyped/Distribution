package typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns

import typings.jsrsasign.jsrsasignNs.BigInteger
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
@JSGlobal("jsrsasign.KJUR.asn1.DERInteger")
@js.native
class DERInteger () extends ASN1Object {
  def this(params: Double) = this()
  def this(params: BigIntegerParam) = this()
  def this(params: HexParam) = this()
  def this(params: IntegerParam) = this()
  /**
    * set value by Tom Wu's BigInteger object
    * @param bigIntegerValue to set
    */
  def setByBigInteger(bigIntegerValue: BigInteger): Unit = js.native
  /**
    * set value by integer value
    * @param integer value to set
    */
  def setByInteger(intValue: Double): Unit = js.native
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
  def setValueHex(newHexString: String): Unit = js.native
}

