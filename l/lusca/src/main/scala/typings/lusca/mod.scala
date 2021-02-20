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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("lusca", JSImport.Namespace)
  @js.native
  def apply(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  @JSImport("lusca", JSImport.Namespace)
  @js.native
  def apply(options: LuscaOptions): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  
  @JSImport("lusca", "csp")
  @js.native
  def csp(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  @JSImport("lusca", "csp")
  @js.native
  def csp(options: cspOptions): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  
  @JSImport("lusca", "csrf")
  @js.native
  def csrf(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  @JSImport("lusca", "csrf")
  @js.native
  def csrf(options: csrfOptions): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  
  @JSImport("lusca", "hsts")
  @js.native
  def hsts(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  @JSImport("lusca", "hsts")
  @js.native
  def hsts(options: hstsOptions): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  
  @JSImport("lusca", "nosniff")
  @js.native
  def nosniff(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  
  @JSImport("lusca", "p3p")
  @js.native
  def p3p(value: String): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  
  @JSImport("lusca", "referrerPolicy")
  @js.native
  def referrerPolicy(value: String): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  
  @JSImport("lusca", "xframe")
  @js.native
  def xframe(value: String): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  
  @JSImport("lusca", "xssProtection")
  @js.native
  def xssProtection(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  @JSImport("lusca", "xssProtection")
  @js.native
  def xssProtection(options: xssProtectionOptions): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  @JSImport("lusca", "xssProtection")
  @js.native
  def xssProtection_true(options: `true`): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  
  /*~ Documentation declares that:
    *~ Setting any value to false will disable it.
    */
  @js.native
  trait LuscaOptions extends StObject {
    
    var csp: js.UndefOr[cspOptions | `false`] = js.native
    
    var csrf: js.UndefOr[csrfOptions | Boolean] = js.native
    
    var hsts: js.UndefOr[hstsOptions | `false`] = js.native
    
    var nosniff: js.UndefOr[Boolean] = js.native
    
    var p3p: js.UndefOr[String | `false`] = js.native
    
    var referrerPolicy: js.UndefOr[String | `false`] = js.native
    
    var xframe: js.UndefOr[String | `false`] = js.native
    
    var xssProtection: js.UndefOr[xssProtectionOptions | Boolean] = js.native
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
  
  @js.native
  trait cspOptions extends StObject {
    
    var policy: js.UndefOr[String | js.Object | (js.Array[js.Object | String])] = js.native
    
    var reportOnly: js.UndefOr[Boolean] = js.native
    
    var reportUri: js.UndefOr[String] = js.native
    
    var scriptNonce: js.UndefOr[Boolean] = js.native
    
    var styleNonce: js.UndefOr[Boolean] = js.native
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
  
  type csrfOptions = csrfOptionsBase with csrfOptionsAngularOrNonAngular with csrfOptionsBlacklistOrWhitelist
  
  @js.native
  trait csrfOptionsAngular extends csrfOptionsAngularOrNonAngular {
    
    var angular: `true` = js.native
    
    var cookie: js.UndefOr[String | Options] = js.native
  }
  object csrfOptionsAngular {
    
    @scala.inline
    def apply(angular: `true`): csrfOptionsAngular = {
      val __obj = js.Dynamic.literal(angular = angular.asInstanceOf[js.Any])
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
    def csrfOptionsAngular(angular: `true`): typings.lusca.mod.csrfOptionsAngular = {
      val __obj = js.Dynamic.literal(angular = angular.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.lusca.mod.csrfOptionsAngular]
    }
    
    @scala.inline
    def csrfOptionsNonAngular(): typings.lusca.mod.csrfOptionsNonAngular = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.lusca.mod.csrfOptionsNonAngular]
    }
  }
  
  @js.native
  trait csrfOptionsBase extends StObject {
    
    /**
      * The name of the response header containing the CSRF token
      * @default 'x-csrf-token'
      */
    var header: js.UndefOr[String] = js.native
    
    /**
      *  An object with create/validate methods for custom tokens
      */
    var impl: js.UndefOr[js.Function0[_]] = js.native
    
    /**
      * The name of the CSRF token in the model.
      * @default '_csrf'
      */
    var key: js.UndefOr[String] = js.native
    
    /**
      * @default '_csrfSecret'
      */
    var secret: js.UndefOr[String] = js.native
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
      def setImpl(value: () => _): Self = StObject.set(x, "impl", js.Any.fromFunction0(value))
      
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
  
  @js.native
  trait csrfOptionsBlacklist extends csrfOptionsBlacklistOrWhitelist {
    
    var blacklist: js.UndefOr[js.Array[String]] = js.native
    
    var whitelist: js.UndefOr[scala.Nothing] = js.native
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
  
  @js.native
  trait csrfOptionsNonAngular extends csrfOptionsAngularOrNonAngular {
    
    var angular: js.UndefOr[`false`] = js.native
    
    var cookie: js.UndefOr[String | Name] = js.native
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
  
  @js.native
  trait csrfOptionsWhitelist extends csrfOptionsBlacklistOrWhitelist {
    
    var blacklist: js.UndefOr[scala.Nothing] = js.native
    
    var whitelist: js.UndefOr[js.Array[String]] = js.native
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
  
  @js.native
  trait hstsOptions extends StObject {
    
    var includeSubDomains: js.UndefOr[Boolean] = js.native
    
    var maxAge: js.UndefOr[Double] = js.native
    
    var preload: js.UndefOr[Boolean] = js.native
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
  
  @js.native
  trait xssProtectionOptions extends StObject {
    
    var enabled: js.UndefOr[Boolean] = js.native
    
    var mode: js.UndefOr[String] = js.native
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
