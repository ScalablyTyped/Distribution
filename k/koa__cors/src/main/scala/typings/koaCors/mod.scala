package typings.koaCors

import typings.koa.mod.Context
import typings.koa.mod.DefaultContext
import typings.koa.mod.DefaultState
import typings.koa.mod.Middleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * CORS middleware factory.
    * @param options - Configuration options.
    * @returns cors middleware
    */
  @scala.inline
  def apply(): Middleware[DefaultState, DefaultContext] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Middleware[DefaultState, DefaultContext]]
  @scala.inline
  def apply(options: Options): Middleware[DefaultState, DefaultContext] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Middleware[DefaultState, DefaultContext]]
  
  @JSImport("@koa/cors", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Middleware configration options.
    */
  trait Options extends StObject {
    
    /**
      * `Access-Control-Allow-Headers`
      */
    var allowHeaders: js.UndefOr[js.Array[String] | String] = js.undefined
    
    /**
      * `Access-Control-Allow-Methods`, default is
      * 'GET,HEAD,PUT,POST,DELETE,PATCH'
      */
    var allowMethods: js.UndefOr[js.Array[String] | String] = js.undefined
    
    /**
      * `Access-Control-Allow-Credentials`
      */
    var credentials: js.UndefOr[Boolean] = js.undefined
    
    /**
      * `Access-Control-Expose-Headers`
      */
    var exposeHeaders: js.UndefOr[js.Array[String] | String] = js.undefined
    
    /**
      * Add set headers to `err.header` if an error is thrown
      */
    var keepHeadersOnError: js.UndefOr[Boolean] = js.undefined
    
    /**
      * `Access-Control-Max-Age` in seconds
      */
    var maxAge: js.UndefOr[Double | String] = js.undefined
    
    /**
      * `Access-Control-Allow-Origin`, default is request Origin header.
      *
      * @remarks
      * If a function is provided, it will be called for each request with
      * the koa context object. It may return a string or a promise that
      * will resolve with a string.
      */
    var origin: js.UndefOr[(js.Function1[/* ctx */ Context, String | js.Thenable[String]]) | String] = js.undefined
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
      def setOrigin(value: (js.Function1[/* ctx */ Context, String | js.Thenable[String]]) | String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginFunction1(value: /* ctx */ Context => String | js.Thenable[String]): Self = StObject.set(x, "origin", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    }
  }
}
