package typings.jsrsasign.jsrsasign.KJUR.asn1

import typings.jsrsasign.jsrsasign.BigInteger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
trait DEREnumerated
  extends StObject
     with ASN1Object {
  
  /**
    * set value by Tom Wu's BigInteger object
    * @param bigIntegerValue value to set
    */
  def setByBigInteger(bigIntegerValue: BigInteger): Unit
  
  /**
    * set value by integer value
    * @param intValue integer value to set
    */
  def setByInteger(intValue: Double): Unit
  
  /**
    * set value by integer value
    * @param newHexString hexadecimal string of integer value
    * @description
    * NOTE: Value shall be represented by minimum octet length of
    * two's complement representation.
    */
  def setValueHex(newHexString: String): Unit
}
object DEREnumerated {
  
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
    setByBigInteger: BigInteger => Unit,
    setByInteger: Double => Unit,
    setValueHex: String => Unit
  ): DEREnumerated = {
    val __obj = js.Dynamic.literal(getEncodedHex = js.Any.fromFunction0(getEncodedHex), getFreshValueHex = js.Any.fromFunction0(getFreshValueHex), getLengthHexFromValue = js.Any.fromFunction0(getLengthHexFromValue), getValueHex = js.Any.fromFunction0(getValueHex), hL = hL.asInstanceOf[js.Any], hT = hT.asInstanceOf[js.Any], hTLV = hTLV.asInstanceOf[js.Any], hV = hV.asInstanceOf[js.Any], isModified = isModified.asInstanceOf[js.Any], setByBigInteger = js.Any.fromFunction1(setByBigInteger), setByInteger = js.Any.fromFunction1(setByInteger), setValueHex = js.Any.fromFunction1(setValueHex), params = null)
    __obj.asInstanceOf[DEREnumerated]
  }
  
  extension [Self <: DEREnumerated](x: Self) {
    
    inline def setSetByBigInteger(value: BigInteger => Unit): Self = StObject.set(x, "setByBigInteger", js.Any.fromFunction1(value))
    
    inline def setSetByInteger(value: Double => Unit): Self = StObject.set(x, "setByInteger", js.Any.fromFunction1(value))
    
    inline def setSetValueHex(value: String => Unit): Self = StObject.set(x, "setValueHex", js.Any.fromFunction1(value))
  }
}
