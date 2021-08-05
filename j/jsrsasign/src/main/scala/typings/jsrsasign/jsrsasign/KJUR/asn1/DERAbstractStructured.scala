package typings.jsrsasign.jsrsasign.KJUR.asn1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** base class for ASN.1 DER structured class */
trait DERAbstractStructured extends StObject {
  
  /**
    * append an ASN1Object to internal array
    * @param asn1Object object to add
    */
  def appendASN1Object(asn1Object: ASN1Object): Unit
  
  var asn1Array: js.Array[ASN1Object]
  
  /**
    * set value by array of ASN1Object
    * @param asn1ObjectArray array of ASN1Object to set
    */
  def setByASN1ObjectArray(asn1ObjectArray: js.Array[ASN1Object]): String
}
object DERAbstractStructured {
  
  inline def apply(
    appendASN1Object: ASN1Object => Unit,
    asn1Array: js.Array[ASN1Object],
    setByASN1ObjectArray: js.Array[ASN1Object] => String
  ): DERAbstractStructured = {
    val __obj = js.Dynamic.literal(appendASN1Object = js.Any.fromFunction1(appendASN1Object), asn1Array = asn1Array.asInstanceOf[js.Any], setByASN1ObjectArray = js.Any.fromFunction1(setByASN1ObjectArray))
    __obj.asInstanceOf[DERAbstractStructured]
  }
  
  extension [Self <: DERAbstractStructured](x: Self) {
    
    inline def setAppendASN1Object(value: ASN1Object => Unit): Self = StObject.set(x, "appendASN1Object", js.Any.fromFunction1(value))
    
    inline def setAsn1Array(value: js.Array[ASN1Object]): Self = StObject.set(x, "asn1Array", value.asInstanceOf[js.Any])
    
    inline def setAsn1ArrayVarargs(value: ASN1Object*): Self = StObject.set(x, "asn1Array", js.Array(value :_*))
    
    inline def setSetByASN1ObjectArray(value: js.Array[ASN1Object] => String): Self = StObject.set(x, "setByASN1ObjectArray", js.Any.fromFunction1(value))
  }
}
