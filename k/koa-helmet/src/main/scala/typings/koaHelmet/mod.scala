package typings.koaHelmet

import org.scalablytyped.runtime.Shortcut
import typings.koa.mod.Context
import typings.koa.mod.DefaultContext
import typings.koa.mod.DefaultState
import typings.koa.mod.Middleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("koa-helmet", JSImport.Namespace)
  @js.native
  val ^ : KoaHelmet = js.native
  
  type HelmetOptions = /* import warning: importer.ImportType#apply Failed type conversion: std.Required<std.Parameters<koa-helmet.anon.Typeofhelmet>>[0] */ js.Any
  
  @js.native
  trait KoaHelmet extends StObject {
    
    def apply(): Middleware[DefaultState, DefaultContext, Any] = js.native
    def apply(options: HelmetOptions): Middleware[DefaultState, DefaultContext, Any] = js.native
    
    def contentSecurityPolicy(): Middleware[DefaultState, DefaultContext, Any] = js.native
    def contentSecurityPolicy(options: KoaHelmetContentSecurityPolicyConfiguration): Middleware[DefaultState, DefaultContext, Any] = js.native
    
    def dnsPrefetchControl(): Middleware[DefaultState, DefaultContext, Any] = js.native
    @JSName("dnsPrefetchControl")
    def dnsPrefetchControl_dnsPrefetchControl(
      options: /* import warning: importer.ImportType#apply Failed type conversion: koa-helmet.koa-helmet.HelmetOptions['dnsPrefetchControl'] */ js.Any
    ): Middleware[DefaultState, DefaultContext, Any] = js.native
    
    def expectCt(): Middleware[DefaultState, DefaultContext, Any] = js.native
    @JSName("expectCt")
    def expectCt_expectCt(
      options: /* import warning: importer.ImportType#apply Failed type conversion: koa-helmet.koa-helmet.HelmetOptions['expectCt'] */ js.Any
    ): Middleware[DefaultState, DefaultContext, Any] = js.native
    
    def frameguard(): Middleware[DefaultState, DefaultContext, Any] = js.native
    @JSName("frameguard")
    def frameguard_frameguard(
      options: /* import warning: importer.ImportType#apply Failed type conversion: koa-helmet.koa-helmet.HelmetOptions['frameguard'] */ js.Any
    ): Middleware[DefaultState, DefaultContext, Any] = js.native
    
    def hidePoweredBy(): Middleware[DefaultState, DefaultContext, Any] = js.native
    @JSName("hidePoweredBy")
    def hidePoweredBy_hidePoweredBy(
      options: /* import warning: importer.ImportType#apply Failed type conversion: koa-helmet.koa-helmet.HelmetOptions['hidePoweredBy'] */ js.Any
    ): Middleware[DefaultState, DefaultContext, Any] = js.native
    
    def hsts(): Middleware[DefaultState, DefaultContext, Any] = js.native
    @JSName("hsts")
    def hsts_hsts(
      options: /* import warning: importer.ImportType#apply Failed type conversion: koa-helmet.koa-helmet.HelmetOptions['hsts'] */ js.Any
    ): Middleware[DefaultState, DefaultContext, Any] = js.native
    
    def ieNoOpen(): Middleware[DefaultState, DefaultContext, Any] = js.native
    @JSName("ieNoOpen")
    def ieNoOpen_ieNoOpen(
      options: /* import warning: importer.ImportType#apply Failed type conversion: koa-helmet.koa-helmet.HelmetOptions['ieNoOpen'] */ js.Any
    ): Middleware[DefaultState, DefaultContext, Any] = js.native
    
    def noSniff(): Middleware[DefaultState, DefaultContext, Any] = js.native
    @JSName("noSniff")
    def noSniff_noSniff(
      options: /* import warning: importer.ImportType#apply Failed type conversion: koa-helmet.koa-helmet.HelmetOptions['noSniff'] */ js.Any
    ): Middleware[DefaultState, DefaultContext, Any] = js.native
    
    def permittedCrossDomainPolicies(): Middleware[DefaultState, DefaultContext, Any] = js.native
    @JSName("permittedCrossDomainPolicies")
    def permittedCrossDomainPolicies_permittedCrossDomainPolicies(
      options: /* import warning: importer.ImportType#apply Failed type conversion: koa-helmet.koa-helmet.HelmetOptions['permittedCrossDomainPolicies'] */ js.Any
    ): Middleware[DefaultState, DefaultContext, Any] = js.native
    
    def referrerPolicy(): Middleware[DefaultState, DefaultContext, Any] = js.native
    @JSName("referrerPolicy")
    def referrerPolicy_referrerPolicy(
      options: /* import warning: importer.ImportType#apply Failed type conversion: koa-helmet.koa-helmet.HelmetOptions['referrerPolicy'] */ js.Any
    ): Middleware[DefaultState, DefaultContext, Any] = js.native
    
    def xssFilter(): Middleware[DefaultState, DefaultContext, Any] = js.native
    @JSName("xssFilter")
    def xssFilter_xssFilter(
      options: /* import warning: importer.ImportType#apply Failed type conversion: koa-helmet.koa-helmet.HelmetOptions['xssFilter'] */ js.Any
    ): Middleware[DefaultState, DefaultContext, Any] = js.native
  }
  
  trait KoaHelmetContentSecurityPolicyConfiguration extends StObject {
    
    var directives: js.UndefOr[KoaHelmetContentSecurityPolicyDirectives] = js.undefined
    
    var reportOnly: js.UndefOr[Boolean] = js.undefined
    
    var useDefaults: js.UndefOr[Boolean] = js.undefined
  }
  object KoaHelmetContentSecurityPolicyConfiguration {
    
    inline def apply(): KoaHelmetContentSecurityPolicyConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KoaHelmetContentSecurityPolicyConfiguration]
    }
    
    extension [Self <: KoaHelmetContentSecurityPolicyConfiguration](x: Self) {
      
      inline def setDirectives(value: KoaHelmetContentSecurityPolicyDirectives): Self = StObject.set(x, "directives", value.asInstanceOf[js.Any])
      
      inline def setDirectivesUndefined: Self = StObject.set(x, "directives", js.undefined)
      
      inline def setReportOnly(value: Boolean): Self = StObject.set(x, "reportOnly", value.asInstanceOf[js.Any])
      
      inline def setReportOnlyUndefined: Self = StObject.set(x, "reportOnly", js.undefined)
      
      inline def setUseDefaults(value: Boolean): Self = StObject.set(x, "useDefaults", value.asInstanceOf[js.Any])
      
      inline def setUseDefaultsUndefined: Self = StObject.set(x, "useDefaults", js.undefined)
    }
  }
  
  type KoaHelmetContentSecurityPolicyDirectiveFunction = js.Function1[/* ctx */ Context, String]
  
  trait KoaHelmetContentSecurityPolicyDirectives extends StObject {
    
    var baseUri: js.UndefOr[js.Array[KoaHelmetCspDirectiveValue]] = js.undefined
    
    var childSrc: js.UndefOr[js.Array[KoaHelmetCspDirectiveValue]] = js.undefined
    
    var connectSrc: js.UndefOr[js.Array[KoaHelmetCspDirectiveValue]] = js.undefined
    
    var defaultSrc: js.UndefOr[js.Array[KoaHelmetCspDirectiveValue]] = js.undefined
    
    var fontSrc: js.UndefOr[js.Array[KoaHelmetCspDirectiveValue]] = js.undefined
    
    var formAction: js.UndefOr[js.Array[KoaHelmetCspDirectiveValue]] = js.undefined
    
    var frameAncestors: js.UndefOr[js.Array[KoaHelmetCspDirectiveValue]] = js.undefined
    
    var frameSrc: js.UndefOr[js.Array[KoaHelmetCspDirectiveValue]] = js.undefined
    
    var imgSrc: js.UndefOr[js.Array[KoaHelmetCspDirectiveValue]] = js.undefined
    
    var mediaSrc: js.UndefOr[js.Array[KoaHelmetCspDirectiveValue]] = js.undefined
    
    var objectSrc: js.UndefOr[js.Array[KoaHelmetCspDirectiveValue]] = js.undefined
    
    var pluginTypes: js.UndefOr[js.Array[KoaHelmetCspDirectiveValue]] = js.undefined
    
    var reportUri: js.UndefOr[String] = js.undefined
    
    var sandbox: js.UndefOr[js.Array[KoaHelmetCspDirectiveValue]] = js.undefined
    
    var scriptSrc: js.UndefOr[js.Array[KoaHelmetCspDirectiveValue]] = js.undefined
    
    var styleSrc: js.UndefOr[js.Array[KoaHelmetCspDirectiveValue]] = js.undefined
  }
  object KoaHelmetContentSecurityPolicyDirectives {
    
    inline def apply(): KoaHelmetContentSecurityPolicyDirectives = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KoaHelmetContentSecurityPolicyDirectives]
    }
    
    extension [Self <: KoaHelmetContentSecurityPolicyDirectives](x: Self) {
      
      inline def setBaseUri(value: js.Array[KoaHelmetCspDirectiveValue]): Self = StObject.set(x, "baseUri", value.asInstanceOf[js.Any])
      
      inline def setBaseUriUndefined: Self = StObject.set(x, "baseUri", js.undefined)
      
      inline def setBaseUriVarargs(value: KoaHelmetCspDirectiveValue*): Self = StObject.set(x, "baseUri", js.Array(value*))
      
      inline def setChildSrc(value: js.Array[KoaHelmetCspDirectiveValue]): Self = StObject.set(x, "childSrc", value.asInstanceOf[js.Any])
      
      inline def setChildSrcUndefined: Self = StObject.set(x, "childSrc", js.undefined)
      
      inline def setChildSrcVarargs(value: KoaHelmetCspDirectiveValue*): Self = StObject.set(x, "childSrc", js.Array(value*))
      
      inline def setConnectSrc(value: js.Array[KoaHelmetCspDirectiveValue]): Self = StObject.set(x, "connectSrc", value.asInstanceOf[js.Any])
      
      inline def setConnectSrcUndefined: Self = StObject.set(x, "connectSrc", js.undefined)
      
      inline def setConnectSrcVarargs(value: KoaHelmetCspDirectiveValue*): Self = StObject.set(x, "connectSrc", js.Array(value*))
      
      inline def setDefaultSrc(value: js.Array[KoaHelmetCspDirectiveValue]): Self = StObject.set(x, "defaultSrc", value.asInstanceOf[js.Any])
      
      inline def setDefaultSrcUndefined: Self = StObject.set(x, "defaultSrc", js.undefined)
      
      inline def setDefaultSrcVarargs(value: KoaHelmetCspDirectiveValue*): Self = StObject.set(x, "defaultSrc", js.Array(value*))
      
      inline def setFontSrc(value: js.Array[KoaHelmetCspDirectiveValue]): Self = StObject.set(x, "fontSrc", value.asInstanceOf[js.Any])
      
      inline def setFontSrcUndefined: Self = StObject.set(x, "fontSrc", js.undefined)
      
      inline def setFontSrcVarargs(value: KoaHelmetCspDirectiveValue*): Self = StObject.set(x, "fontSrc", js.Array(value*))
      
      inline def setFormAction(value: js.Array[KoaHelmetCspDirectiveValue]): Self = StObject.set(x, "formAction", value.asInstanceOf[js.Any])
      
      inline def setFormActionUndefined: Self = StObject.set(x, "formAction", js.undefined)
      
      inline def setFormActionVarargs(value: KoaHelmetCspDirectiveValue*): Self = StObject.set(x, "formAction", js.Array(value*))
      
      inline def setFrameAncestors(value: js.Array[KoaHelmetCspDirectiveValue]): Self = StObject.set(x, "frameAncestors", value.asInstanceOf[js.Any])
      
      inline def setFrameAncestorsUndefined: Self = StObject.set(x, "frameAncestors", js.undefined)
      
      inline def setFrameAncestorsVarargs(value: KoaHelmetCspDirectiveValue*): Self = StObject.set(x, "frameAncestors", js.Array(value*))
      
      inline def setFrameSrc(value: js.Array[KoaHelmetCspDirectiveValue]): Self = StObject.set(x, "frameSrc", value.asInstanceOf[js.Any])
      
      inline def setFrameSrcUndefined: Self = StObject.set(x, "frameSrc", js.undefined)
      
      inline def setFrameSrcVarargs(value: KoaHelmetCspDirectiveValue*): Self = StObject.set(x, "frameSrc", js.Array(value*))
      
      inline def setImgSrc(value: js.Array[KoaHelmetCspDirectiveValue]): Self = StObject.set(x, "imgSrc", value.asInstanceOf[js.Any])
      
      inline def setImgSrcUndefined: Self = StObject.set(x, "imgSrc", js.undefined)
      
      inline def setImgSrcVarargs(value: KoaHelmetCspDirectiveValue*): Self = StObject.set(x, "imgSrc", js.Array(value*))
      
      inline def setMediaSrc(value: js.Array[KoaHelmetCspDirectiveValue]): Self = StObject.set(x, "mediaSrc", value.asInstanceOf[js.Any])
      
      inline def setMediaSrcUndefined: Self = StObject.set(x, "mediaSrc", js.undefined)
      
      inline def setMediaSrcVarargs(value: KoaHelmetCspDirectiveValue*): Self = StObject.set(x, "mediaSrc", js.Array(value*))
      
      inline def setObjectSrc(value: js.Array[KoaHelmetCspDirectiveValue]): Self = StObject.set(x, "objectSrc", value.asInstanceOf[js.Any])
      
      inline def setObjectSrcUndefined: Self = StObject.set(x, "objectSrc", js.undefined)
      
      inline def setObjectSrcVarargs(value: KoaHelmetCspDirectiveValue*): Self = StObject.set(x, "objectSrc", js.Array(value*))
      
      inline def setPluginTypes(value: js.Array[KoaHelmetCspDirectiveValue]): Self = StObject.set(x, "pluginTypes", value.asInstanceOf[js.Any])
      
      inline def setPluginTypesUndefined: Self = StObject.set(x, "pluginTypes", js.undefined)
      
      inline def setPluginTypesVarargs(value: KoaHelmetCspDirectiveValue*): Self = StObject.set(x, "pluginTypes", js.Array(value*))
      
      inline def setReportUri(value: String): Self = StObject.set(x, "reportUri", value.asInstanceOf[js.Any])
      
      inline def setReportUriUndefined: Self = StObject.set(x, "reportUri", js.undefined)
      
      inline def setSandbox(value: js.Array[KoaHelmetCspDirectiveValue]): Self = StObject.set(x, "sandbox", value.asInstanceOf[js.Any])
      
      inline def setSandboxUndefined: Self = StObject.set(x, "sandbox", js.undefined)
      
      inline def setSandboxVarargs(value: KoaHelmetCspDirectiveValue*): Self = StObject.set(x, "sandbox", js.Array(value*))
      
      inline def setScriptSrc(value: js.Array[KoaHelmetCspDirectiveValue]): Self = StObject.set(x, "scriptSrc", value.asInstanceOf[js.Any])
      
      inline def setScriptSrcUndefined: Self = StObject.set(x, "scriptSrc", js.undefined)
      
      inline def setScriptSrcVarargs(value: KoaHelmetCspDirectiveValue*): Self = StObject.set(x, "scriptSrc", js.Array(value*))
      
      inline def setStyleSrc(value: js.Array[KoaHelmetCspDirectiveValue]): Self = StObject.set(x, "styleSrc", value.asInstanceOf[js.Any])
      
      inline def setStyleSrcUndefined: Self = StObject.set(x, "styleSrc", js.undefined)
      
      inline def setStyleSrcVarargs(value: KoaHelmetCspDirectiveValue*): Self = StObject.set(x, "styleSrc", js.Array(value*))
    }
  }
  
  type KoaHelmetCspDirectiveValue = String | KoaHelmetContentSecurityPolicyDirectiveFunction
  
  type _To = KoaHelmet
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: KoaHelmet = ^
}
