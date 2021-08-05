package typings.hlsParser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Uri extends StObject {
  
  var byterange: js.UndefOr[typings.hlsParser.mod.Byterange] = js.undefined
  
  var uri: String
}
object Uri {
  
  inline def apply(uri: String): Uri = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[Uri]
  }
  
  extension [Self <: Uri](x: Self) {
    
    inline def setByterange(value: typings.hlsParser.mod.Byterange): Self = StObject.set(x, "byterange", value.asInstanceOf[js.Any])
    
    inline def setByterangeUndefined: Self = StObject.set(x, "byterange", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
