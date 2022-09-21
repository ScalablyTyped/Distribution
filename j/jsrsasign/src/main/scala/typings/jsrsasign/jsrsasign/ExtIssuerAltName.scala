package typings.jsrsasign.jsrsasign

import typings.jsrsasign.jsrsasignStrings.issuerAltName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtIssuerAltName
  extends StObject
     with ExtParam {
  
  var array: js.Array[GeneralName]
  
  var extname: issuerAltName
}
object ExtIssuerAltName {
  
  inline def apply(array: js.Array[GeneralName]): ExtIssuerAltName = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any], extname = "issuerAltName")
    __obj.asInstanceOf[ExtIssuerAltName]
  }
  
  extension [Self <: ExtIssuerAltName](x: Self) {
    
    inline def setArray(value: js.Array[GeneralName]): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
    
    inline def setArrayVarargs(value: GeneralName*): Self = StObject.set(x, "array", js.Array(value*))
    
    inline def setExtname(value: issuerAltName): Self = StObject.set(x, "extname", value.asInstanceOf[js.Any])
  }
}
