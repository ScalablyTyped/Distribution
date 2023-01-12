package typings.koaJwt

import typings.koa.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Custom extends StObject {
    
    var custom: js.UndefOr[js.Function1[/* ctx */ Context, Boolean]] = js.undefined
    
    var ext: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var method: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var path: js.UndefOr[String | js.RegExp | (js.Array[String | js.RegExp])] = js.undefined
  }
  object Custom {
    
    inline def apply(): Custom = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Custom]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Custom] (val x: Self) extends AnyVal {
      
      inline def setCustom(value: /* ctx */ Context => Boolean): Self = StObject.set(x, "custom", js.Any.fromFunction1(value))
      
      inline def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
      
      inline def setExt(value: String | js.Array[String]): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
      
      inline def setExtUndefined: Self = StObject.set(x, "ext", js.undefined)
      
      inline def setExtVarargs(value: String*): Self = StObject.set(x, "ext", js.Array(value*))
      
      inline def setMethod(value: String | js.Array[String]): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setMethodVarargs(value: String*): Self = StObject.set(x, "method", js.Array(value*))
      
      inline def setPath(value: String | js.RegExp | (js.Array[String | js.RegExp])): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPathVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "path", js.Array(value*))
    }
  }
}
