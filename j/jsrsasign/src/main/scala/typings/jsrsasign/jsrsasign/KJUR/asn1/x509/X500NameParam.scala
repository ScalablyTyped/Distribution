package typings.jsrsasign.jsrsasign.KJUR.asn1.x509

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait X500NameParam extends StObject {
  
  var C: String
  
  var CN: String
  
  var O: String
}
object X500NameParam {
  
  inline def apply(C: String, CN: String, O: String): X500NameParam = {
    val __obj = js.Dynamic.literal(C = C.asInstanceOf[js.Any], CN = CN.asInstanceOf[js.Any], O = O.asInstanceOf[js.Any])
    __obj.asInstanceOf[X500NameParam]
  }
  
  extension [Self <: X500NameParam](x: Self) {
    
    inline def setC(value: String): Self = StObject.set(x, "C", value.asInstanceOf[js.Any])
    
    inline def setCN(value: String): Self = StObject.set(x, "CN", value.asInstanceOf[js.Any])
    
    inline def setO(value: String): Self = StObject.set(x, "O", value.asInstanceOf[js.Any])
  }
}
