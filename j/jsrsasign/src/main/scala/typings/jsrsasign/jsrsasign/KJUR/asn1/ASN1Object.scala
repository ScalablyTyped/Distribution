package typings.jsrsasign.jsrsasign.KJUR.asn1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** base class for ASN.1 DER encoder object */
trait ASN1Object extends StObject {
  
  /**
    * get hexadecimal string of ASN.1 TLV bytes
    * @return hexadecimal string of ASN.1 TLV
    */
  def getEncodedHex(): String
  
  def getFreshValueHex(): String
  
  /**
    * get hexadecimal ASN.1 TLV length(L) bytes from TLV value(V)
    * @return hexadecimal string of ASN.1 TLV length(L)
    */
  def getLengthHexFromValue(): String
  
  /**
    * get hexadecimal string of ASN.1 TLV value(V) bytes
    * @return hexadecimal string of ASN.1 TLV value(V) bytes
    */
  def getValueHex(): String
  
  /** hexadecimal string of ASN.1 TLV length(L) */
  var hL: String
  
  /** hexadecimal string of ASN.1 TLV tag(T) */
  var hT: String
  
  /** hexadecimal string of ASN.1 TLV */
  var hTLV: String
  
  /** hexadecimal string of ASN.1 TLV value(V) */
  var hV: String
  
  /** flag whether internal data was changed */
  var isModified: String
}
object ASN1Object {
  
  inline def apply(
    getEncodedHex: () => String,
    getFreshValueHex: () => String,
    getLengthHexFromValue: () => String,
    getValueHex: () => String,
    hL: String,
    hT: String,
    hTLV: String,
    hV: String,
    isModified: String
  ): ASN1Object = {
    val __obj = js.Dynamic.literal(getEncodedHex = js.Any.fromFunction0(getEncodedHex), getFreshValueHex = js.Any.fromFunction0(getFreshValueHex), getLengthHexFromValue = js.Any.fromFunction0(getLengthHexFromValue), getValueHex = js.Any.fromFunction0(getValueHex), hL = hL.asInstanceOf[js.Any], hT = hT.asInstanceOf[js.Any], hTLV = hTLV.asInstanceOf[js.Any], hV = hV.asInstanceOf[js.Any], isModified = isModified.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASN1Object]
  }
  
  extension [Self <: ASN1Object](x: Self) {
    
    inline def setGetEncodedHex(value: () => String): Self = StObject.set(x, "getEncodedHex", js.Any.fromFunction0(value))
    
    inline def setGetFreshValueHex(value: () => String): Self = StObject.set(x, "getFreshValueHex", js.Any.fromFunction0(value))
    
    inline def setGetLengthHexFromValue(value: () => String): Self = StObject.set(x, "getLengthHexFromValue", js.Any.fromFunction0(value))
    
    inline def setGetValueHex(value: () => String): Self = StObject.set(x, "getValueHex", js.Any.fromFunction0(value))
    
    inline def setHL(value: String): Self = StObject.set(x, "hL", value.asInstanceOf[js.Any])
    
    inline def setHT(value: String): Self = StObject.set(x, "hT", value.asInstanceOf[js.Any])
    
    inline def setHTLV(value: String): Self = StObject.set(x, "hTLV", value.asInstanceOf[js.Any])
    
    inline def setHV(value: String): Self = StObject.set(x, "hV", value.asInstanceOf[js.Any])
    
    inline def setIsModified(value: String): Self = StObject.set(x, "isModified", value.asInstanceOf[js.Any])
  }
}
