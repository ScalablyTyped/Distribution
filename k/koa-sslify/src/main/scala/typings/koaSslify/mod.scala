package typings.koaSslify

import typings.koa.mod.Context
import typings.koa.mod.DefaultContext
import typings.koa.mod.DefaultState
import typings.koa.mod.Middleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("koa-sslify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(): Middleware[DefaultState, DefaultContext] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Middleware[DefaultState, DefaultContext]]
  @scala.inline
  def default(options: Options): Middleware[DefaultState, DefaultContext] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[Middleware[DefaultState, DefaultContext]]
  
  @scala.inline
  def azureResolver(ctx: Context): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("azureResolver")(ctx.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def customProtoHeaderResolver(header: String): js.Function1[/* ctx */ Context, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("customProtoHeaderResolver")(header.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ctx */ Context, Boolean]]
  
  @scala.inline
  def forwardedResolver(ctx: Context): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("forwardedResolver")(ctx.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def httpsResolver(ctx: Context): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("httpsResolver")(ctx.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def xForwardedProtoResolver(ctx: Context): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("xForwardedProtoResolver")(ctx.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  trait Options extends StObject {
    
    /**
      * Status returned for disallowed methods
      */
    var disallowStatus: js.UndefOr[Double] = js.undefined
    
    /**
      * Hostname for redirect (uses request host if not set)
      */
    var hostname: js.UndefOr[String] = js.undefined
    
    /**
      * Ignore url path (redirect to domain)
      */
    var ignoreUrl: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Port of HTTPS server
      */
    var port: js.UndefOr[Double] = js.undefined
    
    /**
      * Whitelist methods that should be redirected
      */
    var redirectMethods: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Function used to test if request is secure
      */
    var resolver: js.UndefOr[js.Function1[/* ctx */ Context, Boolean]] = js.undefined
    
    /**
      * Avoid :443 port in redirect url
      */
    var skipDefaultPort: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Temporary mode (use 307 Temporary Redirect)
      */
    var temporary: js.UndefOr[Boolean] = js.undefined
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
