package typings.ionic.definitionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SSLConfig extends StObject {
  
  var cafile: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var certfile: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var keyfile: js.UndefOr[String | js.Array[String]] = js.undefined
}
object SSLConfig {
  
  inline def apply(): SSLConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SSLConfig]
  }
  
  extension [Self <: SSLConfig](x: Self) {
    
    inline def setCafile(value: String | js.Array[String]): Self = StObject.set(x, "cafile", value.asInstanceOf[js.Any])
    
    inline def setCafileUndefined: Self = StObject.set(x, "cafile", js.undefined)
    
    inline def setCafileVarargs(value: String*): Self = StObject.set(x, "cafile", js.Array(value*))
    
    inline def setCertfile(value: String | js.Array[String]): Self = StObject.set(x, "certfile", value.asInstanceOf[js.Any])
    
    inline def setCertfileUndefined: Self = StObject.set(x, "certfile", js.undefined)
    
    inline def setCertfileVarargs(value: String*): Self = StObject.set(x, "certfile", js.Array(value*))
    
    inline def setKeyfile(value: String | js.Array[String]): Self = StObject.set(x, "keyfile", value.asInstanceOf[js.Any])
    
    inline def setKeyfileUndefined: Self = StObject.set(x, "keyfile", js.undefined)
    
    inline def setKeyfileVarargs(value: String*): Self = StObject.set(x, "keyfile", js.Array(value*))
  }
}
