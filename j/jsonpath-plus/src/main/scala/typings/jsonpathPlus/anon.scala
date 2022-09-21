package typings.jsonpathPlus

import typings.jsonpathPlus.mod.JSONPathCallback
import typings.jsonpathPlus.mod.JSONPathOtherTypeCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Callback extends StObject {
    
    var callback: js.UndefOr[JSONPathCallback] = js.undefined
    
    var json: Null | Boolean | Double | String | js.Object | js.Array[Any]
    
    var otherTypeCallback: js.UndefOr[JSONPathOtherTypeCallback] = js.undefined
    
    var path: String | js.Array[Any]
  }
  object Callback {
    
    inline def apply(path: String | js.Array[Any]): Callback = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], json = null)
      __obj.asInstanceOf[Callback]
    }
    
    extension [Self <: Callback](x: Self) {
      
      inline def setCallback(value: (/* payload */ Any, /* payloadType */ Any, /* fullPayload */ Any) => Any): Self = StObject.set(x, "callback", js.Any.fromFunction3(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setJson(value: Boolean | Double | String | js.Object | js.Array[Any]): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      inline def setJsonNull: Self = StObject.set(x, "json", null)
      
      inline def setJsonVarargs(value: Any*): Self = StObject.set(x, "json", js.Array(value*))
      
      inline def setOtherTypeCallback(value: JSONPathOtherTypeCallback): Self = StObject.set(x, "otherTypeCallback", value.asInstanceOf[js.Any])
      
      inline def setOtherTypeCallbackUndefined: Self = StObject.set(x, "otherTypeCallback", js.undefined)
      
      inline def setPath(value: String | js.Array[Any]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathVarargs(value: Any*): Self = StObject.set(x, "path", js.Array(value*))
    }
  }
}
