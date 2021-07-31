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
  
  @scala.inline
  def apply(): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  @scala.inline
  def apply(options: LuscaOptions): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  
  @JSImport("lusca", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def csp(): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = ^.asInstanceOf[js.Dynamic].applyDynamic("csp")().asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  @scala.inline
  def csp(options: cspOptions): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = ^.asInstanceOf[js.Dynamic].applyDynamic("csp")(options.asInstanceOf[js.Any]).asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  
  @scala.inline
  def csrf(): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = ^.asInstanceOf[js.Dynamic].applyDynamic("csrf")().asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  @scala.inline
  def csrf(options: csrfOptions): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = ^.asInstanceOf[js.Dynamic].applyDynamic("csrf")(options.asInstanceOf[js.Any]).asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  
  @scala.inline
  def hsts(): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = ^.asInstanceOf[js.Dynamic].applyDynamic("hsts")().asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  @scala.inline
  def hsts(options: hstsOptions): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = ^.asInstanceOf[js.Dynamic].applyDynamic("hsts")(options.asInstanceOf[js.Any]).asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  
  @scala.inline
  def nosniff(): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = ^.asInstanceOf[js.Dynamic].applyDynamic("nosniff")().asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  
  @scala.inline
  def p3p(value: String): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = ^.asInstanceOf[js.Dynamic].applyDynamic("p3p")(value.asInstanceOf[js.Any]).asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  
  @scala.inline
  def referrerPolicy(value: String): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = ^.asInstanceOf[js.Dynamic].applyDynamic("referrerPolicy")(value.asInstanceOf[js.Any]).asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  
  @scala.inline
  def xframe(value: String): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = ^.asInstanceOf[js.Dynamic].applyDynamic("xframe")(value.asInstanceOf[js.Any]).asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  
  @scala.inline
  def xssProtection(): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = ^.asInstanceOf[js.Dynamic].applyDynamic("xssProtection")().asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  @scala.inline
  def xssProtection(options: xssProtectionOptions): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = ^.asInstanceOf[js.Dynamic].applyDynamic("xssProtection")(options.asInstanceOf[js.Any]).asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  
  @scala.inline
  def xssProtection_true(options: `true`): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = ^.asInstanceOf[js.Dynamic].applyDynamic("xssProtection")(options.asInstanceOf[js.Any]).asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  
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
    
    @scala.inline
    def apply(): LuscaOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LuscaOptions]
    }
    
    @scala.inline
    implicit class LuscaOptionsMutableBuilder[Self <: LuscaOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCsp(value: cspOptions | `false`): Self = StObject.set(x, "csp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCspUndefined: Self = StObject.set(x, "csp", js.undefined)
      
      @scala.inline
      def setCsrf(value: csrfOptions | Boolean): Self = StObject.set(x, "csrf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCsrfUndefined: Self = StObject.set(x, "csrf", js.undefined)
      
      @scala.inline
      def setHsts(value: hstsOptions | `false`): Self = StObject.set(x, "hsts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHstsUndefined: Self = StObject.set(x, "hsts", js.undefined)
      
      @scala.inline
      def setNosniff(value: Boolean): Self = StObject.set(x, "nosniff", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNosniffUndefined: Self = StObject.set(x, "nosniff", js.undefined)
      
      @scala.inline
      def setP3p(value: String | `false`): Self = StObject.set(x, "p3p", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setP3pUndefined: Self = StObject.set(x, "p3p", js.undefined)
      
      @scala.inline
      def setReferrerPolicy(value: String | `false`): Self = StObject.set(x, "referrerPolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReferrerPolicyUndefined: Self = StObject.set(x, "referrerPolicy", js.undefined)
      
      @scala.inline
      def setXframe(value: String | `false`): Self = StObject.set(x, "xframe", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXframeUndefined: Self = StObject.set(x, "xframe", js.undefined)
      
      @scala.inline
      def setXssProtection(value: xssProtectionOptions | Boolean): Self = StObject.set(x, "xssProtection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXssProtectionUndefined: Self = StObject.set(x, "xssProtection", js.undefined)
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
    
    @scala.inline
    def apply(): cspOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[cspOptions]
    }
    
    @scala.inline
    implicit class cspOptionsMutableBuilder[Self <: cspOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPolicy(value: String | js.Object | (js.Array[js.Object | String])): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
      
      @scala.inline
      def setPolicyVarargs(value: (js.Object | String)*): Self = StObject.set(x, "policy", js.Array(value :_*))
      
      @scala.inline
      def setReportOnly(value: Boolean): Self = StObject.set(x, "reportOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReportOnlyUndefined: Self = StObject.set(x, "reportOnly", js.undefined)
      
      @scala.inline
      def setReportUri(value: String): Self = StObject.set(x, "reportUri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReportUriUndefined: Self = StObject.set(x, "reportUri", js.undefined)
      
      @scala.inline
      def setScriptNonce(value: Boolean): Self = StObject.set(x, "scriptNonce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScriptNonceUndefined: Self = StObject.set(x, "scriptNonce", js.undefined)
      
      @scala.inline
      def setStyleNonce(value: Boolean): Self = StObject.set(x, "styleNonce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleNonceUndefined: Self = StObject.set(x, "styleNonce", js.undefined)
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
    
    @scala.inline
    def apply(): csrfOptionsAngular = {
      val __obj = js.Dynamic.literal(angular = true)
      __obj.asInstanceOf[csrfOptionsAngular]
    }
    
    @scala.inline
    implicit class csrfOptionsAngularMutableBuilder[Self <: csrfOptionsAngular] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAngular(value: `true`): Self = StObject.set(x, "angular", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookie(value: String | Options): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookieUndefined: Self = StObject.set(x, "cookie", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.lusca.mod.csrfOptionsAngular
    - typings.lusca.mod.csrfOptionsNonAngular
  */
  trait csrfOptionsAngularOrNonAngular extends StObject
  object csrfOptionsAngularOrNonAngular {
    
    @scala.inline
    def csrfOptionsAngular(): typings.lusca.mod.csrfOptionsAngular = {
      val __obj = js.Dynamic.literal(angular = true)
      __obj.asInstanceOf[typings.lusca.mod.csrfOptionsAngular]
    }
    
    @scala.inline
    def csrfOptionsNonAngular(): typings.lusca.mod.csrfOptionsNonAngular = {
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
    
    @scala.inline
    def apply(): csrfOptionsBase = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[csrfOptionsBase]
    }
    
    @scala.inline
    implicit class csrfOptionsBaseMutableBuilder[Self <: csrfOptionsBase] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setImpl(value: () => js.Any): Self = StObject.set(x, "impl", js.Any.fromFunction0(value))
      
      @scala.inline
      def setImplUndefined: Self = StObject.set(x, "impl", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecretUndefined: Self = StObject.set(x, "secret", js.undefined)
    }
  }
  
  trait csrfOptionsBlacklist
    extends StObject
       with csrfOptionsBlacklistOrWhitelist {
    
    var blacklist: js.UndefOr[js.Array[String]] = js.undefined
    
    var whitelist: js.UndefOr[scala.Nothing] = js.undefined
  }
  object csrfOptionsBlacklist {
    
    @scala.inline
    def apply(): csrfOptionsBlacklist = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[csrfOptionsBlacklist]
    }
    
    @scala.inline
    implicit class csrfOptionsBlacklistMutableBuilder[Self <: csrfOptionsBlacklist] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlacklist(value: js.Array[String]): Self = StObject.set(x, "blacklist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlacklistUndefined: Self = StObject.set(x, "blacklist", js.undefined)
      
      @scala.inline
      def setBlacklistVarargs(value: String*): Self = StObject.set(x, "blacklist", js.Array(value :_*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.lusca.mod.csrfOptionsBlacklist
    - typings.lusca.mod.csrfOptionsWhitelist
  */
  trait csrfOptionsBlacklistOrWhitelist extends StObject
  object csrfOptionsBlacklistOrWhitelist {
    
    @scala.inline
    def csrfOptionsBlacklist(): typings.lusca.mod.csrfOptionsBlacklist = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.lusca.mod.csrfOptionsBlacklist]
    }
    
    @scala.inline
    def csrfOptionsWhitelist(): typings.lusca.mod.csrfOptionsWhitelist = {
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
    
    @scala.inline
    def apply(): csrfOptionsNonAngular = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[csrfOptionsNonAngular]
    }
    
    @scala.inline
    implicit class csrfOptionsNonAngularMutableBuilder[Self <: csrfOptionsNonAngular] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAngular(value: `false`): Self = StObject.set(x, "angular", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAngularUndefined: Self = StObject.set(x, "angular", js.undefined)
      
      @scala.inline
      def setCookie(value: String | Name): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookieUndefined: Self = StObject.set(x, "cookie", js.undefined)
    }
  }
  
  trait csrfOptionsWhitelist
    extends StObject
       with csrfOptionsBlacklistOrWhitelist {
    
    var blacklist: js.UndefOr[scala.Nothing] = js.undefined
    
    var whitelist: js.UndefOr[js.Array[String]] = js.undefined
  }
  object csrfOptionsWhitelist {
    
    @scala.inline
    def apply(): csrfOptionsWhitelist = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[csrfOptionsWhitelist]
    }
    
    @scala.inline
    implicit class csrfOptionsWhitelistMutableBuilder[Self <: csrfOptionsWhitelist] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setWhitelist(value: js.Array[String]): Self = StObject.set(x, "whitelist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWhitelistUndefined: Self = StObject.set(x, "whitelist", js.undefined)
      
      @scala.inline
      def setWhitelistVarargs(value: String*): Self = StObject.set(x, "whitelist", js.Array(value :_*))
    }
  }
  
  trait hstsOptions extends StObject {
    
    var includeSubDomains: js.UndefOr[Boolean] = js.undefined
    
    var maxAge: js.UndefOr[Double] = js.undefined
    
    var preload: js.UndefOr[Boolean] = js.undefined
  }
  object hstsOptions {
    
    @scala.inline
    def apply(): hstsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[hstsOptions]
    }
    
    @scala.inline
    implicit class hstsOptionsMutableBuilder[Self <: hstsOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIncludeSubDomains(value: Boolean): Self = StObject.set(x, "includeSubDomains", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeSubDomainsUndefined: Self = StObject.set(x, "includeSubDomains", js.undefined)
      
      @scala.inline
      def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      @scala.inline
      def setPreload(value: Boolean): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreloadUndefined: Self = StObject.set(x, "preload", js.undefined)
    }
  }
  
  trait xssProtectionOptions extends StObject {
    
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    var mode: js.UndefOr[String] = js.undefined
  }
  object xssProtectionOptions {
    
    @scala.inline
    def apply(): xssProtectionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[xssProtectionOptions]
    }
    
    @scala.inline
    implicit class xssProtectionOptionsMutableBuilder[Self <: xssProtectionOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    }
  }
}
