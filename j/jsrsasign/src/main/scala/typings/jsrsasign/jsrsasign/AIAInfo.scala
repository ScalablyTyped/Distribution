package typings.jsrsasign.jsrsasign

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AIAInfo extends StObject {
  
  var caissuer: js.Array[String]
  
  var ocsp: js.Array[String]
}
object AIAInfo {
  
  inline def apply(caissuer: js.Array[String], ocsp: js.Array[String]): AIAInfo = {
    val __obj = js.Dynamic.literal(caissuer = caissuer.asInstanceOf[js.Any], ocsp = ocsp.asInstanceOf[js.Any])
    __obj.asInstanceOf[AIAInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AIAInfo] (val x: Self) extends AnyVal {
    
    inline def setCaissuer(value: js.Array[String]): Self = StObject.set(x, "caissuer", value.asInstanceOf[js.Any])
    
    inline def setCaissuerVarargs(value: String*): Self = StObject.set(x, "caissuer", js.Array(value*))
    
    inline def setOcsp(value: js.Array[String]): Self = StObject.set(x, "ocsp", value.asInstanceOf[js.Any])
    
    inline def setOcspVarargs(value: String*): Self = StObject.set(x, "ocsp", js.Array(value*))
  }
}
