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
  
  inline def default(): Middleware[DefaultState, DefaultContext] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Middleware[DefaultState, DefaultContext]]
  inline def default(options: Options): Middleware[DefaultState, DefaultContext] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[Middleware[DefaultState, DefaultContext]]
  
  inline def azureResolver(ctx: Context): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("azureResolver")(ctx.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def customProtoHeaderResolver(header: String): js.Function1[/* ctx */ Context, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("customProtoHeaderResolver")(header.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ctx */ Context, Boolean]]
  
  inline def forwardedResolver(ctx: Context): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("forwardedResolver")(ctx.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def httpsResolver(ctx: Context): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("httpsResolver")(ctx.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def xForwardedProtoResolver(ctx: Context): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("xForwardedProtoResolver")(ctx.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
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
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setDisallowStatus(value: Double): Self = StObject.set(x, "disallowStatus", value.asInstanceOf[js.Any])
      
      inline def setDisallowStatusUndefined: Self = StObject.set(x, "disallowStatus", js.undefined)
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      inline def setIgnoreUrl(value: Boolean): Self = StObject.set(x, "ignoreUrl", value.asInstanceOf[js.Any])
      
      inline def setIgnoreUrlUndefined: Self = StObject.set(x, "ignoreUrl", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setRedirectMethods(value: js.Array[String]): Self = StObject.set(x, "redirectMethods", value.asInstanceOf[js.Any])
      
      inline def setRedirectMethodsUndefined: Self = StObject.set(x, "redirectMethods", js.undefined)
      
      inline def setRedirectMethodsVarargs(value: String*): Self = StObject.set(x, "redirectMethods", js.Array(value :_*))
      
      inline def setResolver(value: /* ctx */ Context => Boolean): Self = StObject.set(x, "resolver", js.Any.fromFunction1(value))
      
      inline def setResolverUndefined: Self = StObject.set(x, "resolver", js.undefined)
      
      inline def setSkipDefaultPort(value: Boolean): Self = StObject.set(x, "skipDefaultPort", value.asInstanceOf[js.Any])
      
      inline def setSkipDefaultPortUndefined: Self = StObject.set(x, "skipDefaultPort", js.undefined)
      
      inline def setTemporary(value: Boolean): Self = StObject.set(x, "temporary", value.asInstanceOf[js.Any])
      
      inline def setTemporaryUndefined: Self = StObject.set(x, "temporary", js.undefined)
    }
  }
}
