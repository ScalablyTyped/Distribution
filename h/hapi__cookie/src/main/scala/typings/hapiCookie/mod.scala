package typings.hapiCookie

import org.scalablytyped.runtime.Shortcut
import typings.hapiCookie.anon.Clear
import typings.hapiCookie.anon.RedirectTo
import typings.hapiCookie.anon.ServerStateCookieOptionsn
import typings.hapiCookie.hapiCookieStrings.cookie
import typings.hapiHapi.mod.AuthCredentials
import typings.hapiHapi.mod.Plugin
import typings.hapiHapi.mod.Request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("@hapi/cookie", JSImport.Namespace)
  @js.native
  val ^ : Plugin[Unit] = js.native
  
  /**
    * Options passed to 'hapi.auth.strategy' when this plugin is used
    */
  trait Options extends StObject {
    
    /**
      * Only works if 'redirectTo' is true
      * If set to true, a string, or an object, appends the current request path to the query component of the 'redirectTo' URI.
      */
    var appendNext: js.UndefOr[Boolean | String] = js.undefined
    
    /**
      * Cookie options.
      *
      * @default { name: 'sid', clearInvalid: false, isSameSite: 'Strict', isSecure: true, isHttpOnly: true }
      */
    var cookie: js.UndefOr[ServerStateCookieOptionsn] = js.undefined
    
    /**
      * Automatically sets the session cookie after validation to extend the current session for a new TTL duration.
      *
      * @default false
      */
    var keepAlive: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Login URI or function that returns a URI to redirect unauthenticated requests to.
      * Note that it will only trigger when the authentication mode is 'required'.
      * Defaults to no redirection.
      */
    var redirectTo: js.UndefOr[String | RedirectToFunction] = js.undefined
    
    /**
      * A name to use with decorating the request object.
      * Using multiple decorator names for separate authentication strategies could allow a developer to call the methods for the wrong strategy.
      * Potentially resulting in unintended authorized access.
      *
      * @default 'cookieAuth'
      */
    var requestDecoratorName: js.UndefOr[String] = js.undefined
    
    /**
      * An optional session validation function used to validate the content of the session cookie on each request.
      * Used to verify that the internal session state is still valid (e.g. user account still exists).
      */
    var validateFunc: js.UndefOr[ValidateFunction] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAppendNext(value: Boolean | String): Self = StObject.set(x, "appendNext", value.asInstanceOf[js.Any])
      
      inline def setAppendNextUndefined: Self = StObject.set(x, "appendNext", js.undefined)
      
      inline def setCookie(value: ServerStateCookieOptionsn): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
      
      inline def setCookieUndefined: Self = StObject.set(x, "cookie", js.undefined)
      
      inline def setKeepAlive(value: Boolean): Self = StObject.set(x, "keepAlive", value.asInstanceOf[js.Any])
      
      inline def setKeepAliveUndefined: Self = StObject.set(x, "keepAlive", js.undefined)
      
      inline def setRedirectTo(value: String | RedirectToFunction): Self = StObject.set(x, "redirectTo", value.asInstanceOf[js.Any])
      
      inline def setRedirectToFunction1(value: /* request */ js.UndefOr[Request] => String): Self = StObject.set(x, "redirectTo", js.Any.fromFunction1(value))
      
      inline def setRedirectToUndefined: Self = StObject.set(x, "redirectTo", js.undefined)
      
      inline def setRequestDecoratorName(value: String): Self = StObject.set(x, "requestDecoratorName", value.asInstanceOf[js.Any])
      
      inline def setRequestDecoratorNameUndefined: Self = StObject.set(x, "requestDecoratorName", js.undefined)
      
      inline def setValidateFunc(
        value: (/* request */ js.UndefOr[Request], /* session */ js.UndefOr[js.Object]) => js.Promise[ValidateResponse]
      ): Self = StObject.set(x, "validateFunc", js.Any.fromFunction2(value))
      
      inline def setValidateFuncUndefined: Self = StObject.set(x, "validateFunc", js.undefined)
    }
  }
  
  type RedirectToFunction = js.Function1[/* request */ js.UndefOr[Request], String]
  
  type ValidateFunction = js.Function2[
    /* request */ js.UndefOr[Request], 
    /* session */ js.UndefOr[js.Object], 
    js.Promise[ValidateResponse]
  ]
  
  trait ValidateResponse extends StObject {
    
    var credentials: js.UndefOr[AuthCredentials] = js.undefined
    
    var valid: Boolean
  }
  object ValidateResponse {
    
    inline def apply(valid: Boolean): ValidateResponse = {
      val __obj = js.Dynamic.literal(valid = valid.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValidateResponse]
    }
    
    extension [Self <: ValidateResponse](x: Self) {
      
      inline def setCredentials(value: AuthCredentials): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      inline def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
      
      inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Plugin[Unit]
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Plugin[Unit] = ^
  
  /* augmented module */
  object hapiHapiAugmentingMod {
    
    trait PluginSpecificConfiguration extends StObject {
      
      var `hapi-auth-cookie`: js.UndefOr[RedirectTo] = js.undefined
    }
    object PluginSpecificConfiguration {
      
      inline def apply(): PluginSpecificConfiguration = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PluginSpecificConfiguration]
      }
      
      extension [Self <: PluginSpecificConfiguration](x: Self) {
        
        inline def `setHapi-auth-cookie`(value: RedirectTo): Self = StObject.set(x, "hapi-auth-cookie", value.asInstanceOf[js.Any])
        
        inline def `setHapi-auth-cookieUndefined`: Self = StObject.set(x, "hapi-auth-cookie", js.undefined)
      }
    }
    
    trait Request extends StObject {
      
      var cookieAuth: Clear
    }
    object Request {
      
      inline def apply(cookieAuth: Clear): typings.hapiCookie.mod.hapiHapiAugmentingMod.Request = {
        val __obj = js.Dynamic.literal(cookieAuth = cookieAuth.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.hapiCookie.mod.hapiHapiAugmentingMod.Request]
      }
      
      extension [Self <: typings.hapiCookie.mod.hapiHapiAugmentingMod.Request](x: Self) {
        
        inline def setCookieAuth(value: Clear): Self = StObject.set(x, "cookieAuth", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait ServerAuth extends StObject {
      
      @JSName("strategy")
      def strategy_cookie(name: String, scheme: cookie): Unit = js.native
      @JSName("strategy")
      def strategy_cookie(name: String, scheme: cookie, options: Options): Unit = js.native
    }
  }
}
