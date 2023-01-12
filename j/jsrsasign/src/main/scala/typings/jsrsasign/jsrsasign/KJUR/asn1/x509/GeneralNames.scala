package typings.jsrsasign.jsrsasign.KJUR.asn1.x509

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * GeneralNames ASN.1 structure class
  * @example
  * gns = new KJUR.asn1.x509.GeneralNames([{'uri': 'http://aaa.com/'}, {'uri': 'http://bbb.com/'}]);
  *
  * GeneralNames ::= SEQUENCE SIZE (1..MAX) OF GeneralName
  */
trait GeneralNames extends StObject {
  
  def getEncodedHex(): String
  
  /**
    * set a array of `KJUR.asn1.x509.GeneralName` parameters
    * @param paramsArray Array of `KJUR.asn1.x509.GeneralNames`
    * @example
    * gns = new KJUR.asn1.x509.GeneralNames();
    * gns.setByParamArray([{uri: 'http://aaa.com/'}, {uri: 'http://bbb.com/'}]);
    */
  def setByParamArray(paramsArray: js.Array[GeneralNameParam]): Unit
}
object GeneralNames {
  
  inline def apply(getEncodedHex: () => String, setByParamArray: js.Array[GeneralNameParam] => Unit): GeneralNames = {
    val __obj = js.Dynamic.literal(getEncodedHex = js.Any.fromFunction0(getEncodedHex), setByParamArray = js.Any.fromFunction1(setByParamArray))
    __obj.asInstanceOf[GeneralNames]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GeneralNames] (val x: Self) extends AnyVal {
    
    inline def setGetEncodedHex(value: () => String): Self = StObject.set(x, "getEncodedHex", js.Any.fromFunction0(value))
    
    inline def setSetByParamArray(value: js.Array[GeneralNameParam] => Unit): Self = StObject.set(x, "setByParamArray", js.Any.fromFunction1(value))
  }
}
