package typings.jsrsasign.global.jsrsasign.KJUR.asn1

import typings.jsrsasign.jsrsasign.KJUR.asn1.ASN1ObjectParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.ArrayParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.BinParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.HexParam
import typings.jsrsasign.jsrsasignBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  extends StObject
     with typings.jsrsasign.jsrsasign.KJUR.asn1.DERBitString {
  def this(params: ASN1ObjectParam) = this()
  def this(params: ArrayParam[Boolean]) = this()
  def this(params: BinParam) = this()
  def this(params: HexParam) = this()
  
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
  
  /** hexadecimal string of ASN.1 TLV length(L) */
  /* CompleteClass */
  var hL: String = js.native
  
  /** hexadecimal string of ASN.1 TLV tag(T) */
  /* CompleteClass */
  var hT: String = js.native
  
  /** hexadecimal string of ASN.1 TLV */
  /* CompleteClass */
  var hTLV: String = js.native
  
  /** hexadecimal string of ASN.1 TLV value(V) */
  /* CompleteClass */
  var hV: String = js.native
  
  /** flag whether internal data was changed */
  /* CompleteClass */
  var isModified: String = js.native
  
  /**
    * set ASN.1 DER BitString by binary string
    * @param binaryString binary value string (i.e. '10111')
    * @description
    * Its unused bits will be calculated automatically by length of
    * 'binaryValue'.
    *
    * NOTE: Trailing zeros '0' will be ignored.
    * @example
    * o = new KJUR.asn1.DERBitString();
    * o.setByBooleanArray("01011");
    */
  /* CompleteClass */
  override def setByBinaryString(binaryString: String): Unit = js.native
  
  /**
    * set ASN.1 TLV value(V) by an array of boolean
    * @param booleanArray array of boolean (ex. [true, false, true])
    * @description
    * NOTE: Trailing falses will be ignored in the ASN.1 DER Object.
    * @example
    * o = new KJUR.asn1.DERBitString();
    * o.setByBooleanArray([false, true, false, true, true]);
    */
  /* CompleteClass */
  override def setByBooleanArray(booleanArray: js.Array[Boolean]): Unit = js.native
  
  /**
    * set ASN.1 value(V) by a hexadecimal string including unused bits
    */
  /* CompleteClass */
  override def setHexValueIncludingUnusedBits(newHexStringIncludingUnusedBits: String): Unit = js.native
  
  /**
    * set ASN.1 value(V) by unused bit and hexadecimal string of value
    */
  /* CompleteClass */
  override def setUnusedBitsAndHexValue(unusedBits: Double, hValue: String): Unit = js.native
}
object DERBitString {
  
  @JSGlobal("jsrsasign.KJUR.asn1.DERBitString")
  @js.native
  val ^ : js.Any = js.native
  
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
  /* static member */
  @scala.inline
  def newFalseArray(nLength: Double): js.Array[`false`] = ^.asInstanceOf[js.Dynamic].applyDynamic("newFalseArray")(nLength.asInstanceOf[js.Any]).asInstanceOf[js.Array[`false`]]
}
