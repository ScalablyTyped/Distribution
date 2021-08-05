package typings.jsrsasign.jsrsasign.KJUR.asn1

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
trait DERBitString
  extends StObject
     with ASN1Object {
  
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
  def setByBinaryString(binaryString: String): Unit
  
  /**
    * set ASN.1 TLV value(V) by an array of boolean
    * @param booleanArray array of boolean (ex. [true, false, true])
    * @description
    * NOTE: Trailing falses will be ignored in the ASN.1 DER Object.
    * @example
    * o = new KJUR.asn1.DERBitString();
    * o.setByBooleanArray([false, true, false, true, true]);
    */
  def setByBooleanArray(booleanArray: js.Array[Boolean]): Unit
  
  /**
    * set ASN.1 value(V) by a hexadecimal string including unused bits
    */
  def setHexValueIncludingUnusedBits(newHexStringIncludingUnusedBits: String): Unit
  
  /**
    * set ASN.1 value(V) by unused bit and hexadecimal string of value
    */
  def setUnusedBitsAndHexValue(unusedBits: Double, hValue: String): Unit
}
object DERBitString {
  
  inline def apply(
    getEncodedHex: () => String,
    getFreshValueHex: () => String,
    getLengthHexFromValue: () => String,
    getValueHex: () => String,
    hL: String,
    hT: String,
    hTLV: String,
    hV: String,
    isModified: String,
    setByBinaryString: String => Unit,
    setByBooleanArray: js.Array[Boolean] => Unit,
    setHexValueIncludingUnusedBits: String => Unit,
    setUnusedBitsAndHexValue: (Double, String) => Unit
  ): DERBitString = {
    val __obj = js.Dynamic.literal(getEncodedHex = js.Any.fromFunction0(getEncodedHex), getFreshValueHex = js.Any.fromFunction0(getFreshValueHex), getLengthHexFromValue = js.Any.fromFunction0(getLengthHexFromValue), getValueHex = js.Any.fromFunction0(getValueHex), hL = hL.asInstanceOf[js.Any], hT = hT.asInstanceOf[js.Any], hTLV = hTLV.asInstanceOf[js.Any], hV = hV.asInstanceOf[js.Any], isModified = isModified.asInstanceOf[js.Any], setByBinaryString = js.Any.fromFunction1(setByBinaryString), setByBooleanArray = js.Any.fromFunction1(setByBooleanArray), setHexValueIncludingUnusedBits = js.Any.fromFunction1(setHexValueIncludingUnusedBits), setUnusedBitsAndHexValue = js.Any.fromFunction2(setUnusedBitsAndHexValue))
    __obj.asInstanceOf[DERBitString]
  }
  
  extension [Self <: DERBitString](x: Self) {
    
    inline def setSetByBinaryString(value: String => Unit): Self = StObject.set(x, "setByBinaryString", js.Any.fromFunction1(value))
    
    inline def setSetByBooleanArray(value: js.Array[Boolean] => Unit): Self = StObject.set(x, "setByBooleanArray", js.Any.fromFunction1(value))
    
    inline def setSetHexValueIncludingUnusedBits(value: String => Unit): Self = StObject.set(x, "setHexValueIncludingUnusedBits", js.Any.fromFunction1(value))
    
    inline def setSetUnusedBitsAndHexValue(value: (Double, String) => Unit): Self = StObject.set(x, "setUnusedBitsAndHexValue", js.Any.fromFunction2(value))
  }
}
