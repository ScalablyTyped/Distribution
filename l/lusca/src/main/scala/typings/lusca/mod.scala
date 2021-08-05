package typings.lusca

import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.lusca.anon.Name
import typings.lusca.anon.Options
import typings.lusca.luscaBooleans.`false`
import typings.lusca.luscaBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  inline def apply(options: LuscaOptions): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  
  @JSImport("lusca", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def csp(): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = ^.asInstanceOf[js.Dynamic].applyDynamic("csp")().asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  inline def csp(options: cspOptions): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = ^.asInstanceOf[js.Dynamic].applyDynamic("csp")(options.asInstanceOf[js.Any]).asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  
  inline def csrf(): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = ^.asInstanceOf[js.Dynamic].applyDynamic("csrf")().asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  inline def csrf(options: csrfOptions): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = ^.asInstanceOf[js.Dynamic].applyDynamic("csrf")(options.asInstanceOf[js.Any]).asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  
  inline def hsts(): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = ^.asInstanceOf[js.Dynamic].applyDynamic("hsts")().asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  inline def hsts(options: hstsOptions): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = ^.asInstanceOf[js.Dynamic].applyDynamic("hsts")(options.asInstanceOf[js.Any]).asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  
  inline def nosniff(): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = ^.asInstanceOf[js.Dynamic].applyDynamic("nosniff")().asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  
  inline def p3p(value: String): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = ^.asInstanceOf[js.Dynamic].applyDynamic("p3p")(value.asInstanceOf[js.Any]).asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  
  inline def referrerPolicy(value: String): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = ^.asInstanceOf[js.Dynamic].applyDynamic("referrerPolicy")(value.asInstanceOf[js.Any]).asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  
  inline def xframe(value: String): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = ^.asInstanceOf[js.Dynamic].applyDynamic("xframe")(value.asInstanceOf[js.Any]).asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  
  inline def xssProtection(): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = ^.asInstanceOf[js.Dynamic].applyDynamic("xssProtection")().asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  inline def xssProtection(options: xssProtectionOptions): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = ^.asInstanceOf[js.Dynamic].applyDynamic("xssProtection")(options.asInstanceOf[js.Any]).asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  
  inline def xssProtection_true(options: `true`): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = ^.asInstanceOf[js.Dynamic].applyDynamic("xssProtection")(options.asInstanceOf[js.Any]).asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  
  /*~ Documentation declares that:
    *~ Setting any value to false will disable it.
    */
  trait LuscaOptions extends StObject {
    
    var csp: js.UndefOr[cspOptions | `false`] = js.undefined
    
    var csrf: js.UndefOr[csrfOptions | Boolean] = js.undefined
    
    var hsts: js.UndefOr[hstsOptions | `false`] = js.undefined
    
    var nosniff: js.UndefOr[Boolean] = js.undefined
    
    var p3p: js.UndefOr[String | `false`] = js.undefined
    
    var referrerPolicy: js.UndefOr[String | `false`] = js.undefined
    
    var xframe: js.UndefOr[String | `false`] = js.undefined
    
    var xssProtection: js.UndefOr[xssProtectionOptions | Boolean] = js.undefined
  }
  object LuscaOptions {
    
    inline def apply(): LuscaOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LuscaOptions]
    }
    
    extension [Self <: LuscaOptions](x: Self) {
      
      inline def setCsp(value: cspOptions | `false`): Self = StObject.set(x, "csp", value.asInstanceOf[js.Any])
      
      inline def setCspUndefined: Self = StObject.set(x, "csp", js.undefined)
      
      inline def setCsrf(value: csrfOptions | Boolean): Self = StObject.set(x, "csrf", value.asInstanceOf[js.Any])
      
      inline def setCsrfUndefined: Self = StObject.set(x, "csrf", js.undefined)
      
      inline def setHsts(value: hstsOptions | `false`): Self = StObject.set(x, "hsts", value.asInstanceOf[js.Any])
      
      inline def setHstsUndefined: Self = StObject.set(x, "hsts", js.undefined)
      
      inline def setNosniff(value: Boolean): Self = StObject.set(x, "nosniff", value.asInstanceOf[js.Any])
      
      inline def setNosniffUndefined: Self = StObject.set(x, "nosniff", js.undefined)
      
      inline def setP3p(value: String | `false`): Self = StObject.set(x, "p3p", value.asInstanceOf[js.Any])
      
      inline def setP3pUndefined: Self = StObject.set(x, "p3p", js.undefined)
      
      inline def setReferrerPolicy(value: String | `false`): Self = StObject.set(x, "referrerPolicy", value.asInstanceOf[js.Any])
      
      inline def setReferrerPolicyUndefined: Self = StObject.set(x, "referrerPolicy", js.undefined)
      
      inline def setXframe(value: String | `false`): Self = StObject.set(x, "xframe", value.asInstanceOf[js.Any])
      
      inline def setXframeUndefined: Self = StObject.set(x, "xframe", js.undefined)
      
      inline def setXssProtection(value: xssProtectionOptions | Boolean): Self = StObject.set(x, "xssProtection", value.asInstanceOf[js.Any])
      
      inline def setXssProtectionUndefined: Self = StObject.set(x, "xssProtection", js.undefined)
    }
  }
  
  trait cspOptions extends StObject {
    
    var policy: js.UndefOr[String | js.Object | (js.Array[js.Object | String])] = js.undefined
    
    var reportOnly: js.UndefOr[Boolean] = js.undefined
    
    var reportUri: js.UndefOr[String] = js.undefined
    
    var scriptNonce: js.UndefOr[Boolean] = js.undefined
    
    var styleNonce: js.UndefOr[Boolean] = js.undefined
  }
  object cspOptions {
    
    inline def apply(): cspOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[cspOptions]
    }
    
    extension [Self <: cspOptions](x: Self) {
      
      inline def setPolicy(value: String | js.Object | (js.Array[js.Object | String])): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
      
      inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
      
      inline def setPolicyVarargs(value: (js.Object | String)*): Self = StObject.set(x, "policy", js.Array(value :_*))
      
      inline def setReportOnly(value: Boolean): Self = StObject.set(x, "reportOnly", value.asInstanceOf[js.Any])
      
      inline def setReportOnlyUndefined: Self = StObject.set(x, "reportOnly", js.undefined)
      
      inline def setReportUri(value: String): Self = StObject.set(x, "reportUri", value.asInstanceOf[js.Any])
      
      inline def setReportUriUndefined: Self = StObject.set(x, "reportUri", js.undefined)
      
      inline def setScriptNonce(value: Boolean): Self = StObject.set(x, "scriptNonce", value.asInstanceOf[js.Any])
      
      inline def setScriptNonceUndefined: Self = StObject.set(x, "scriptNonce", js.undefined)
      
      inline def setStyleNonce(value: Boolean): Self = StObject.set(x, "styleNonce", value.asInstanceOf[js.Any])
      
      inline def setStyleNonceUndefined: Self = StObject.set(x, "styleNonce", js.undefined)
    }
  }
  
  type csrfOptions = csrfOptionsBase & csrfOptionsAngularOrNonAngular & csrfOptionsBlacklistOrWhitelist
  
  trait csrfOptionsAngular
    extends StObject
       with csrfOptionsAngularOrNonAngular {
    
    var angular: `true`
    
    var cookie: js.UndefOr[String | Options] = js.undefined
  }
  object csrfOptionsAngular {
    
    inline def apply(): csrfOptionsAngular = {
      val __obj = js.Dynamic.literal(angular = true)
      __obj.asInstanceOf[csrfOptionsAngular]
    }
    
    extension [Self <: csrfOptionsAngular](x: Self) {
      
      inline def setAngular(value: `true`): Self = StObject.set(x, "angular", value.asInstanceOf[js.Any])
      
      inline def setCookie(value: String | Options): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
      
      inline def setCookieUndefined: Self = StObject.set(x, "cookie", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.lusca.mod.csrfOptionsAngular
    - typings.lusca.mod.csrfOptionsNonAngular
  */
  trait csrfOptionsAngularOrNonAngular extends StObject
  object csrfOptionsAngularOrNonAngular {
    
    inline def csrfOptionsAngular(): typings.lusca.mod.csrfOptionsAngular = {
      val __obj = js.Dynamic.literal(angular = true)
      __obj.asInstanceOf[typings.lusca.mod.csrfOptionsAngular]
    }
    
    inline def csrfOptionsNonAngular(): typings.lusca.mod.csrfOptionsNonAngular = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.lusca.mod.csrfOptionsNonAngular]
    }
  }
  
  trait csrfOptionsBase extends StObject {
    
    /**
      * The name of the response header containing the CSRF token
      * @default 'x-csrf-token'
      */
    var header: js.UndefOr[String] = js.undefined
    
    /**
      *  An object with create/validate methods for custom tokens
      */
    var impl: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    /**
      * The name of the CSRF token in the model.
      * @default '_csrf'
      */
    var key: js.UndefOr[String] = js.undefined
    
    /**
      * @default '_csrfSecret'
      */
    var secret: js.UndefOr[String] = js.undefined
  }
  object csrfOptionsBase {
    
    inline def apply(): csrfOptionsBase = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[csrfOptionsBase]
    }
    
    extension [Self <: csrfOptionsBase](x: Self) {
      
      inline def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setImpl(value: () => js.Any): Self = StObject.set(x, "impl", js.Any.fromFunction0(value))
      
      inline def setImplUndefined: Self = StObject.set(x, "impl", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
      
      inline def setSecretUndefined: Self = StObject.set(x, "secret", js.undefined)
    }
  }
  
  trait csrfOptionsBlacklist
    extends StObject
       with csrfOptionsBlacklistOrWhitelist {
    
    var blacklist: js.UndefOr[js.Array[String]] = js.undefined
    
    var whitelist: js.UndefOr[scala.Nothing] = js.undefined
  }
  object csrfOptionsBlacklist {
    
    inline def apply(): csrfOptionsBlacklist = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[csrfOptionsBlacklist]
    }
    
    extension [Self <: csrfOptionsBlacklist](x: Self) {
      
      inline def setBlacklist(value: js.Array[String]): Self = StObject.set(x, "blacklist", value.asInstanceOf[js.Any])
      
      inline def setBlacklistUndefined: Self = StObject.set(x, "blacklist", js.undefined)
      
      inline def setBlacklistVarargs(value: String*): Self = StObject.set(x, "blacklist", js.Array(value :_*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.lusca.mod.csrfOptionsBlacklist
    - typings.lusca.mod.csrfOptionsWhitelist
  */
  trait csrfOptionsBlacklistOrWhitelist extends StObject
  object csrfOptionsBlacklistOrWhitelist {
    
    inline def csrfOptionsBlacklist(): typings.lusca.mod.csrfOptionsBlacklist = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.lusca.mod.csrfOptionsBlacklist]
    }
    
    inline def csrfOptionsWhitelist(): typings.lusca.mod.csrfOptionsWhitelist = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.lusca.mod.csrfOptionsWhitelist]
    }
  }
  
  trait csrfOptionsNonAngular
    extends StObject
       with csrfOptionsAngularOrNonAngular {
    
    var angular: js.UndefOr[`false`] = js.undefined
    
    var cookie: js.UndefOr[String | Name] = js.undefined
  }
  object csrfOptionsNonAngular {
    
    inline def apply(): csrfOptionsNonAngular = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[csrfOptionsNonAngular]
    }
    
    extension [Self <: csrfOptionsNonAngular](x: Self) {
      
      inline def setAngular(value: `false`): Self = StObject.set(x, "angular", value.asInstanceOf[js.Any])
      
      inline def setAngularUndefined: Self = StObject.set(x, "angular", js.undefined)
      
      inline def setCookie(value: String | Name): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
      
      inline def setCookieUndefined: Self = StObject.set(x, "cookie", js.undefined)
    }
  }
  
  trait csrfOptionsWhitelist
    extends StObject
       with csrfOptionsBlacklistOrWhitelist {
    
    var blacklist: js.UndefOr[scala.Nothing] = js.undefined
    
    var whitelist: js.UndefOr[js.Array[String]] = js.undefined
  }
  object csrfOptionsWhitelist {
    
    inline def apply(): csrfOptionsWhitelist = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[csrfOptionsWhitelist]
    }
    
    extension [Self <: csrfOptionsWhitelist](x: Self) {
      
      inline def setWhitelist(value: js.Array[String]): Self = StObject.set(x, "whitelist", value.asInstanceOf[js.Any])
      
      inline def setWhitelistUndefined: Self = StObject.set(x, "whitelist", js.undefined)
      
      inline def setWhitelistVarargs(value: String*): Self = StObject.set(x, "whitelist", js.Array(value :_*))
    }
  }
  
  trait hstsOptions extends StObject {
    
    var includeSubDomains: js.UndefOr[Boolean] = js.undefined
    
    var maxAge: js.UndefOr[Double] = js.undefined
    
    var preload: js.UndefOr[Boolean] = js.undefined
  }
  object hstsOptions {
    
    inline def apply(): hstsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[hstsOptions]
    }
    
    extension [Self <: hstsOptions](x: Self) {
      
      inline def setIncludeSubDomains(value: Boolean): Self = StObject.set(x, "includeSubDomains", value.asInstanceOf[js.Any])
      
      inline def setIncludeSubDomainsUndefined: Self = StObject.set(x, "includeSubDomains", js.undefined)
      
      inline def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      inline def setPreload(value: Boolean): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
      
      inline def setPreloadUndefined: Self = StObject.set(x, "preload", js.undefined)
    }
  }
  
  trait xssProtectionOptions extends StObject {
    
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    var mode: js.UndefOr[String] = js.undefined
  }
  object xssProtectionOptions {
    
    inline def apply(): xssProtectionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[xssProtectionOptions]
    }
    
    extension [Self <: xssProtectionOptions](x: Self) {
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    }
  }
}
