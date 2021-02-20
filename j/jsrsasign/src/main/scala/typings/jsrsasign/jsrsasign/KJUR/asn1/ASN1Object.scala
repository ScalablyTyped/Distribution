package typings.jsrsasign.jsrsasign.KJUR.asn1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** base class for ASN.1 DER encoder object */
@js.native
trait ASN1Object extends StObject {
  
  /**
    * get hexadecimal string of ASN.1 TLV bytes
    * @return hexadecimal string of ASN.1 TLV
    */
  def getEncodedHex(): String = js.native
  
  def getFreshValueHex(): String = js.native
  
  /**
    * get hexadecimal ASN.1 TLV length(L) bytes from TLV value(V)
    * @return hexadecimal string of ASN.1 TLV length(L)
    */
  def getLengthHexFromValue(): String = js.native
  
  /**
    * get hexadecimal string of ASN.1 TLV value(V) bytes
    * @return hexadecimal string of ASN.1 TLV value(V) bytes
    */
  def getValueHex(): String = js.native
  
  /** hexadecimal string of ASN.1 TLV length(L) */
  var hL: String = js.native
  
  /** hexadecimal string of ASN.1 TLV tag(T) */
  var hT: String = js.native
  
  /** hexadecimal string of ASN.1 TLV */
  var hTLV: String = js.native
  
  /** hexadecimal string of ASN.1 TLV value(V) */
  var hV: String = js.native
  
  /** flag whether internal data was changed */
  var isModified: String = js.native
}
object ASN1Object {
  
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
    isModified: String
  ): ASN1Object = {
    val __obj = js.Dynamic.literal(getEncodedHex = js.Any.fromFunction0(getEncodedHex), getFreshValueHex = js.Any.fromFunction0(getFreshValueHex), getLengthHexFromValue = js.Any.fromFunction0(getLengthHexFromValue), getValueHex = js.Any.fromFunction0(getValueHex), hL = hL.asInstanceOf[js.Any], hT = hT.asInstanceOf[js.Any], hTLV = hTLV.asInstanceOf[js.Any], hV = hV.asInstanceOf[js.Any], isModified = isModified.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASN1Object]
  }
  
  @scala.inline
  implicit class ASN1ObjectMutableBuilder[Self <: ASN1Object] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetEncodedHex(value: () => String): Self = StObject.set(x, "getEncodedHex", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFreshValueHex(value: () => String): Self = StObject.set(x, "getFreshValueHex", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLengthHexFromValue(value: () => String): Self = StObject.set(x, "getLengthHexFromValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetValueHex(value: () => String): Self = StObject.set(x, "getValueHex", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHL(value: String): Self = StObject.set(x, "hL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHT(value: String): Self = StObject.set(x, "hT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHTLV(value: String): Self = StObject.set(x, "hTLV", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHV(value: String): Self = StObject.set(x, "hV", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsModified(value: String): Self = StObject.set(x, "isModified", value.asInstanceOf[js.Any])
  }
}
