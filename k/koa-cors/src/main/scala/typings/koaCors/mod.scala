package typings.koaCors

import typings.koa.mod.DefaultContext
import typings.koa.mod.DefaultState
import typings.koa.mod.Middleware
import typings.koa.mod.Request
import typings.koaCors.koaCorsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(): Middleware[DefaultState, DefaultContext] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Middleware[DefaultState, DefaultContext]]
  @scala.inline
  def apply(options: Options): Middleware[DefaultState, DefaultContext] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Middleware[DefaultState, DefaultContext]]
  
  @JSImport("koa-cors", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    var credentials: js.UndefOr[`true`] = js.undefined
    
    var expose: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var headers: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var maxAge: js.UndefOr[Double] = js.undefined
    
    var methods: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var origin: js.UndefOr[Boolean | String | (js.Function1[/* request */ Request, String])] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCredentials(value: `true`): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
      
      @scala.inline
      def setExpose(value: String | js.Array[String]): Self = StObject.set(x, "expose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExposeUndefined: Self = StObject.set(x, "expose", js.undefined)
      
      @scala.inline
      def setExposeVarargs(value: String*): Self = StObject.set(x, "expose", js.Array(value :_*))
      
      @scala.inline
      def setHeaders(value: String | js.Array[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setHeadersVarargs(value: String*): Self = StObject.set(x, "headers", js.Array(value :_*))
      
      @scala.inline
      def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      @scala.inline
      def setMethods(value: String | js.Array[String]): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodsUndefined: Self = StObject.set(x, "methods", js.undefined)
      
      @scala.inline
      def setMethodsVarargs(value: String*): Self = StObject.set(x, "methods", js.Array(value :_*))
      
      @scala.inline
      def setOrigin(value: Boolean | String | (js.Function1[/* request */ Request, String])): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginFunction1(value: /* request */ Request => String): Self = StObject.set(x, "origin", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    }
  }
}
