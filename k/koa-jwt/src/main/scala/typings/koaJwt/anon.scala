package typings.koaJwt

import typings.koa.mod.Context
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Custom extends StObject {
    
    var custom: js.UndefOr[js.Function1[/* ctx */ Context, Boolean]] = js.undefined
    
    var ext: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var method: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var path: js.UndefOr[String | RegExp | (js.Array[String | RegExp])] = js.undefined
  }
  object Custom {
    
    @scala.inline
    def apply(): Custom = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Custom]
    }
    
    @scala.inline
    implicit class CustomMutableBuilder[Self <: Custom] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustom(value: /* ctx */ Context => Boolean): Self = StObject.set(x, "custom", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
      
      @scala.inline
      def setExt(value: String | js.Array[String]): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtUndefined: Self = StObject.set(x, "ext", js.undefined)
      
      @scala.inline
      def setExtVarargs(value: String*): Self = StObject.set(x, "ext", js.Array(value :_*))
      
      @scala.inline
      def setMethod(value: String | js.Array[String]): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setMethodVarargs(value: String*): Self = StObject.set(x, "method", js.Array(value :_*))
      
      @scala.inline
      def setPath(value: String | RegExp | (js.Array[String | RegExp])): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setPathVarargs(value: (String | RegExp)*): Self = StObject.set(x, "path", js.Array(value :_*))
    }
  }
}
