package typings.jsonpathPlus

import typings.jsonpathPlus.mod.JSONPathCallback
import typings.jsonpathPlus.mod.JSONPathOtherTypeCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Callback extends StObject {
    
    var callback: js.UndefOr[JSONPathCallback] = js.undefined
    
    var json: Null | Boolean | Double | String | js.Object | js.Array[js.Any]
    
    var otherTypeCallback: js.UndefOr[JSONPathOtherTypeCallback] = js.undefined
    
    var path: String | js.Array[js.Any]
  }
  object Callback {
    
    @scala.inline
    def apply(path: String | js.Array[js.Any]): Callback = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], json = null)
      __obj.asInstanceOf[Callback]
    }
    
    @scala.inline
    implicit class CallbackMutableBuilder[Self <: Callback] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallback(value: (/* payload */ js.Any, /* payloadType */ js.Any, /* fullPayload */ js.Any) => js.Any): Self = StObject.set(x, "callback", js.Any.fromFunction3(value))
      
      @scala.inline
      def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      @scala.inline
      def setJson(value: Boolean | Double | String | js.Object | js.Array[js.Any]): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsonNull: Self = StObject.set(x, "json", null)
      
      @scala.inline
      def setJsonVarargs(value: js.Any*): Self = StObject.set(x, "json", js.Array(value :_*))
      
      @scala.inline
      def setOtherTypeCallback(value: JSONPathOtherTypeCallback): Self = StObject.set(x, "otherTypeCallback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOtherTypeCallbackUndefined: Self = StObject.set(x, "otherTypeCallback", js.undefined)
      
      @scala.inline
      def setPath(value: String | js.Array[js.Any]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathVarargs(value: js.Any*): Self = StObject.set(x, "path", js.Array(value :_*))
    }
  }
}
