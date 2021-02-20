package typings.kcors

import typings.koa.mod.Context
import typings.koa.mod.DefaultContext
import typings.koa.mod.DefaultState
import typings.koa.mod.Middleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("kcors", JSImport.Namespace)
  @js.native
  def apply(): Middleware[DefaultState, DefaultContext] = js.native
  @JSImport("kcors", JSImport.Namespace)
  @js.native
  def apply(options: Options): Middleware[DefaultState, DefaultContext] = js.native
  
  @js.native
  trait Options extends StObject {
    
    var allowHeaders: js.UndefOr[js.Array[String] | String] = js.native
    
    var allowMethods: js.UndefOr[js.Array[String] | String] = js.native
    
    var credentials: js.UndefOr[Boolean] = js.native
    
    var exposeHeaders: js.UndefOr[js.Array[String] | String] = js.native
    
    var keepHeadersOnError: js.UndefOr[Boolean] = js.native
    
    var maxAge: js.UndefOr[Double | String] = js.native
    
    var origin: js.UndefOr[(js.Function1[/* ctx */ Context, String]) | String] = js.native
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
      def setAllowHeaders(value: js.Array[String] | String): Self = StObject.set(x, "allowHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowHeadersUndefined: Self = StObject.set(x, "allowHeaders", js.undefined)
      
      @scala.inline
      def setAllowHeadersVarargs(value: String*): Self = StObject.set(x, "allowHeaders", js.Array(value :_*))
      
      @scala.inline
      def setAllowMethods(value: js.Array[String] | String): Self = StObject.set(x, "allowMethods", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowMethodsUndefined: Self = StObject.set(x, "allowMethods", js.undefined)
      
      @scala.inline
      def setAllowMethodsVarargs(value: String*): Self = StObject.set(x, "allowMethods", js.Array(value :_*))
      
      @scala.inline
      def setCredentials(value: Boolean): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
      
      @scala.inline
      def setExposeHeaders(value: js.Array[String] | String): Self = StObject.set(x, "exposeHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExposeHeadersUndefined: Self = StObject.set(x, "exposeHeaders", js.undefined)
      
      @scala.inline
      def setExposeHeadersVarargs(value: String*): Self = StObject.set(x, "exposeHeaders", js.Array(value :_*))
      
      @scala.inline
      def setKeepHeadersOnError(value: Boolean): Self = StObject.set(x, "keepHeadersOnError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepHeadersOnErrorUndefined: Self = StObject.set(x, "keepHeadersOnError", js.undefined)
      
      @scala.inline
      def setMaxAge(value: Double | String): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      @scala.inline
      def setOrigin(value: (js.Function1[/* ctx */ Context, String]) | String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginFunction1(value: /* ctx */ Context => String): Self = StObject.set(x, "origin", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    }
  }
}
