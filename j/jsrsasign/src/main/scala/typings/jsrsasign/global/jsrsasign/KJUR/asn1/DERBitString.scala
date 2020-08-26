package typings.jsrsasign.global.jsrsasign.KJUR.asn1

import typings.jsrsasign.jsrsasign.KJUR.asn1.ASN1ObjectParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.ArrayParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.BinParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.HexParam
import typings.jsrsasign.jsrsasignBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * class for ASN.1 DER encoded BitString primitive
  * @description
  * As for argument 'params' for constructor, you can specify one of
  * following properties:
  *
  * - bin - specify binary string (ex. '10111')
  * - array - specify array of boolean (ex. [true,false,true,true])
  * - hex - specify hexadecimal string of ASN.1 value(V) including unused bits
  * - obj - specify `KJUR.asn1.ASN1Util.newObject`
  *   argument for "BitString encapsulates" structure.
  *
  * NOTE1: 'params' can be omitted.
  * NOTE2: 'obj' parameter have been supported since
  * asn1 1.0.11, jsrsasign 6.1.1 (2016-Sep-25).
  *
  * @example
  * // default constructor
  * o = new KJUR.asn1.DERBitString();
  * // initialize with binary string
  * o = new KJUR.asn1.DERBitString({bin: "1011"});
  * // initialize with boolean array
  * o = new KJUR.asn1.DERBitString({array: [true,false,true,true]});
  * // initialize with hexadecimal string (04 is unused bits)
  * o = new KJUR.asn1.DEROctetString({hex: "04bac0"});
  * // initialize with ASN1Util.newObject argument for encapsulated
  * o = new KJUR.asn1.DERBitString({obj: {seq: [{int: 3}, {prnstr: 'aaa'}]}});
  * // above generates a ASN.1 data like this:
  * // BIT STRING, encapsulates {
  * //   SEQUENCE {
  * //     INTEGER 3
  * //     PrintableString 'aaa'
  * //     }
  * //   }
  */
@JSGlobal("jsrsasign.KJUR.asn1.DERBitString")
@js.native
class DERBitString ()
  extends typings.jsrsasign.jsrsasign.KJUR.asn1.DERBitString {
  def this(params: ASN1ObjectParam) = this()
  def this(params: ArrayParam[Boolean]) = this()
  def this(params: BinParam) = this()
  def this(params: HexParam) = this()
}

/* static members */
@JSGlobal("jsrsasign.KJUR.asn1.DERBitString")
@js.native
object DERBitString extends js.Object {
  /**
    * generate an array of falses with specified length
    * @param nLength length of array to generate
    * @return array of boolean falses
    * @description
    * This static method may be useful to initialize boolean array.
    * @example
    * o = new KJUR.asn1.DERBitString();
    * o.newFalseArray(3) → [false, false, false]
    */
  def newFalseArray(nLength: Double): js.Array[`false`] = js.native
}

