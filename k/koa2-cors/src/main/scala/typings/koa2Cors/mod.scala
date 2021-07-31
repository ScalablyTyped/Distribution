package typings.koa2Cors

import typings.koa.mod.Context
import typings.koa.mod.DefaultContext
import typings.koa.mod.DefaultState
import typings.koa.mod.Middleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(): Middleware[DefaultState, DefaultContext] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Middleware[DefaultState, DefaultContext]]
  @scala.inline
  def apply(options: Options): Middleware[DefaultState, DefaultContext] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Middleware[DefaultState, DefaultContext]]
  
  @JSImport("koa2-cors", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    var allowHeaders: js.UndefOr[js.Array[String]] = js.undefined
    
    var allowMethods: js.UndefOr[js.Array[String]] = js.undefined
    
    var credentials: js.UndefOr[Boolean] = js.undefined
    
    var exposeHeaders: js.UndefOr[js.Array[String]] = js.undefined
    
    var maxAge: js.UndefOr[Double] = js.undefined
    
    var origin: js.UndefOr[String | (js.Function1[/* ctx */ Context, Boolean | String])] = js.undefined
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
      def setAllowHeaders(value: js.Array[String]): Self = StObject.set(x, "allowHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowHeadersUndefined: Self = StObject.set(x, "allowHeaders", js.undefined)
      
      @scala.inline
      def setAllowHeadersVarargs(value: String*): Self = StObject.set(x, "allowHeaders", js.Array(value :_*))
      
      @scala.inline
      def setAllowMethods(value: js.Array[String]): Self = StObject.set(x, "allowMethods", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowMethodsUndefined: Self = StObject.set(x, "allowMethods", js.undefined)
      
      @scala.inline
      def setAllowMethodsVarargs(value: String*): Self = StObject.set(x, "allowMethods", js.Array(value :_*))
      
      @scala.inline
      def setCredentials(value: Boolean): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
      
      @scala.inline
      def setExposeHeaders(value: js.Array[String]): Self = StObject.set(x, "exposeHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExposeHeadersUndefined: Self = StObject.set(x, "exposeHeaders", js.undefined)
      
      @scala.inline
      def setExposeHeadersVarargs(value: String*): Self = StObject.set(x, "exposeHeaders", js.Array(value :_*))
      
      @scala.inline
      def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      @scala.inline
      def setOrigin(value: String | (js.Function1[/* ctx */ Context, Boolean | String])): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginFunction1(value: /* ctx */ Context => Boolean | String): Self = StObject.set(x, "origin", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    }
  }
}
