package typings.jsonpPromise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  // eslint-disable-next-line no-unnecessary-generics
  inline def apply[R](url: String): JsonpResult[R] = ^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any]).asInstanceOf[JsonpResult[R]]
  inline def apply[R](url: String, options: JsonpOptions): JsonpResult[R] = (^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[JsonpResult[R]]
  
  @JSImport("jsonp-promise", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait JsonpOptions extends StObject {
    
    var param: js.UndefOr[String] = js.undefined
    
    var prefix: js.UndefOr[String] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object JsonpOptions {
    
    inline def apply(): JsonpOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JsonpOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JsonpOptions] (val x: Self) extends AnyVal {
      
      inline def setParam(value: String): Self = StObject.set(x, "param", value.asInstanceOf[js.Any])
      
      inline def setParamUndefined: Self = StObject.set(x, "param", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  trait JsonpResult[R] extends StObject {
    
    def cancel(): Unit
    
    var promise: js.Promise[R]
  }
  object JsonpResult {
    
    inline def apply[R](cancel: () => Unit, promise: js.Promise[R]): JsonpResult[R] = {
      val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), promise = promise.asInstanceOf[js.Any])
      __obj.asInstanceOf[JsonpResult[R]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JsonpResult[?], R] (val x: Self & JsonpResult[R]) extends AnyVal {
      
      inline def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
      
      inline def setPromise(value: js.Promise[R]): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
    }
  }
}
