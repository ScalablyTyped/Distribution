package typings.jsrsasign.jsrsasign

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HashOfKeyInformation extends StObject {
  
  var cipher: js.UndefOr[String] = js.undefined
  
  var data: js.UndefOr[String] = js.undefined
  
  var ivsalt: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object HashOfKeyInformation {
  
  inline def apply(): HashOfKeyInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HashOfKeyInformation]
  }
  
  extension [Self <: HashOfKeyInformation](x: Self) {
    
    inline def setCipher(value: String): Self = StObject.set(x, "cipher", value.asInstanceOf[js.Any])
    
    inline def setCipherUndefined: Self = StObject.set(x, "cipher", js.undefined)
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setIvsalt(value: String): Self = StObject.set(x, "ivsalt", value.asInstanceOf[js.Any])
    
    inline def setIvsaltUndefined: Self = StObject.set(x, "ivsalt", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
