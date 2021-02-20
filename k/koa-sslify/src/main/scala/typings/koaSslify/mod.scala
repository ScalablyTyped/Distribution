package typings.koaSslify

import typings.koa.mod.Context
import typings.koa.mod.DefaultContext
import typings.koa.mod.DefaultState
import typings.koa.mod.Middleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("koa-sslify", JSImport.Default)
  @js.native
  def default(): Middleware[DefaultState, DefaultContext] = js.native
  @JSImport("koa-sslify", JSImport.Default)
  @js.native
  def default(options: Options): Middleware[DefaultState, DefaultContext] = js.native
  
  @JSImport("koa-sslify", "azureResolver")
  @js.native
  def azureResolver(ctx: Context): Boolean = js.native
  
  @JSImport("koa-sslify", "customProtoHeaderResolver")
  @js.native
  def customProtoHeaderResolver(header: String): js.Function1[/* ctx */ Context, Boolean] = js.native
  
  @JSImport("koa-sslify", "forwardedResolver")
  @js.native
  def forwardedResolver(ctx: Context): Boolean = js.native
  
  @JSImport("koa-sslify", "httpsResolver")
  @js.native
  def httpsResolver(ctx: Context): Boolean = js.native
  
  @JSImport("koa-sslify", "xForwardedProtoResolver")
  @js.native
  def xForwardedProtoResolver(ctx: Context): Boolean = js.native
  
  @js.native
  trait Options extends StObject {
    
    /**
      * Status returned for disallowed methods
      */
    var disallowStatus: js.UndefOr[Double] = js.native
    
    /**
      * Hostname for redirect (uses request host if not set)
      */
    var hostname: js.UndefOr[String] = js.native
    
    /**
      * Ignore url path (redirect to domain)
      */
    var ignoreUrl: js.UndefOr[Boolean] = js.native
    
    /**
      * Port of HTTPS server
      */
    var port: js.UndefOr[Double] = js.native
    
    /**
      * Whitelist methods that should be redirected
      */
    var redirectMethods: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * Function used to test if request is secure
      */
    var resolver: js.UndefOr[js.Function1[/* ctx */ Context, Boolean]] = js.native
    
    /**
      * Avoid :443 port in redirect url
      */
    var skipDefaultPort: js.UndefOr[Boolean] = js.native
    
    /**
      * Temporary mode (use 307 Temporary Redirect)
      */
    var temporary: js.UndefOr[Boolean] = js.native
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
      def setDisallowStatus(value: Double): Self = StObject.set(x, "disallowStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisallowStatusUndefined: Self = StObject.set(x, "disallowStatus", js.undefined)
      
      @scala.inline
      def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      @scala.inline
      def setIgnoreUrl(value: Boolean): Self = StObject.set(x, "ignoreUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreUrlUndefined: Self = StObject.set(x, "ignoreUrl", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setRedirectMethods(value: js.Array[String]): Self = StObject.set(x, "redirectMethods", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedirectMethodsUndefined: Self = StObject.set(x, "redirectMethods", js.undefined)
      
      @scala.inline
      def setRedirectMethodsVarargs(value: String*): Self = StObject.set(x, "redirectMethods", js.Array(value :_*))
      
      @scala.inline
      def setResolver(value: /* ctx */ Context => Boolean): Self = StObject.set(x, "resolver", js.Any.fromFunction1(value))
      
      @scala.inline
      def setResolverUndefined: Self = StObject.set(x, "resolver", js.undefined)
      
      @scala.inline
      def setSkipDefaultPort(value: Boolean): Self = StObject.set(x, "skipDefaultPort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipDefaultPortUndefined: Self = StObject.set(x, "skipDefaultPort", js.undefined)
      
      @scala.inline
      def setTemporary(value: Boolean): Self = StObject.set(x, "temporary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemporaryUndefined: Self = StObject.set(x, "temporary", js.undefined)
    }
  }
}
