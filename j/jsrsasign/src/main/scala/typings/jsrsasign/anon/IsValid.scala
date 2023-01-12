package typings.jsrsasign.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsValid extends StObject {
  
  var isValid: Boolean
  
  var parse: CertsIdx
  
  var signerInfos: js.Array[Any]
}
object IsValid {
  
  inline def apply(isValid: Boolean, parse: CertsIdx, signerInfos: js.Array[Any]): IsValid = {
    val __obj = js.Dynamic.literal(isValid = isValid.asInstanceOf[js.Any], parse = parse.asInstanceOf[js.Any], signerInfos = signerInfos.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsValid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IsValid] (val x: Self) extends AnyVal {
    
    inline def setIsValid(value: Boolean): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
    
    inline def setParse(value: CertsIdx): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
    
    inline def setSignerInfos(value: js.Array[Any]): Self = StObject.set(x, "signerInfos", value.asInstanceOf[js.Any])
    
    inline def setSignerInfosVarargs(value: Any*): Self = StObject.set(x, "signerInfos", js.Array(value*))
  }
}
