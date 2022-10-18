package typings.helmet

import typings.helmet.distTypesMiddlewaresContentSecurityPolicyMod.ContentSecurityPolicyDirectiveValue
import typings.helmet.distTypesMiddlewaresContentSecurityPolicyMod.ContentSecurityPolicyOptions
import typings.helmet.distTypesMiddlewaresCrossOriginOpenerPolicyMod.CrossOriginOpenerPolicyOptions
import typings.helmet.distTypesMiddlewaresCrossOriginResourcePolicyMod.CrossOriginResourcePolicyOptions
import typings.helmet.distTypesMiddlewaresExpectCtMod.ExpectCtOptions
import typings.helmet.distTypesMiddlewaresReferrerPolicyMod.ReferrerPolicyOptions
import typings.helmet.distTypesMiddlewaresReferrerPolicyMod.ReferrerPolicyToken
import typings.helmet.distTypesMiddlewaresStrictTransportSecurityMod.StrictTransportSecurityOptions
import typings.helmet.distTypesMiddlewaresXDnsPrefetchControlMod.XDnsPrefetchControlOptions
import typings.helmet.distTypesMiddlewaresXFrameOptionsMod.XFrameOptionsOptions
import typings.helmet.distTypesMiddlewaresXPermittedCrossDomainPoliciesMod.XPermittedCrossDomainPoliciesOptions
import typings.helmet.helmetStrings.`by-content-type`
import typings.helmet.helmetStrings.`cross-origin`
import typings.helmet.helmetStrings.`master-only`
import typings.helmet.helmetStrings.`require-corp`
import typings.helmet.helmetStrings.`same-origin-allow-popups`
import typings.helmet.helmetStrings.`same-origin`
import typings.helmet.helmetStrings.`same-site`
import typings.helmet.helmetStrings.`unsafe-none`
import typings.helmet.helmetStrings.all
import typings.helmet.helmetStrings.credentialless
import typings.helmet.helmetStrings.deny
import typings.helmet.helmetStrings.none
import typings.helmet.helmetStrings.sameorigin
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Readonly<helmet.helmet/dist/types/middlewares/content-security-policy.ContentSecurityPolicyOptions> */
  trait ReadonlyContentSecurityPo extends StObject {
    
    val directives: js.UndefOr[
        Record[String, Null | js.Iterable[ContentSecurityPolicyDirectiveValue] | js.Symbol]
      ] = js.undefined
    
    val reportOnly: js.UndefOr[Boolean] = js.undefined
    
    val useDefaults: js.UndefOr[Boolean] = js.undefined
  }
  object ReadonlyContentSecurityPo {
    
    inline def apply(): ReadonlyContentSecurityPo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlyContentSecurityPo]
    }
    
    extension [Self <: ReadonlyContentSecurityPo](x: Self) {
      
      inline def setDirectives(value: Record[String, Null | js.Iterable[ContentSecurityPolicyDirectiveValue] | js.Symbol]): Self = StObject.set(x, "directives", value.asInstanceOf[js.Any])
      
      inline def setDirectivesUndefined: Self = StObject.set(x, "directives", js.undefined)
      
      inline def setReportOnly(value: Boolean): Self = StObject.set(x, "reportOnly", value.asInstanceOf[js.Any])
      
      inline def setReportOnlyUndefined: Self = StObject.set(x, "reportOnly", js.undefined)
      
      inline def setUseDefaults(value: Boolean): Self = StObject.set(x, "useDefaults", value.asInstanceOf[js.Any])
      
      inline def setUseDefaultsUndefined: Self = StObject.set(x, "useDefaults", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<helmet.helmet/dist/types/middlewares/cross-origin-embedder-policy.CrossOriginEmbedderPolicyOptions> */
  trait ReadonlyCrossOriginEmbedd extends StObject {
    
    val policy: js.UndefOr[`require-corp` | credentialless] = js.undefined
  }
  object ReadonlyCrossOriginEmbedd {
    
    inline def apply(): ReadonlyCrossOriginEmbedd = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlyCrossOriginEmbedd]
    }
    
    extension [Self <: ReadonlyCrossOriginEmbedd](x: Self) {
      
      inline def setPolicy(value: `require-corp` | credentialless): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
      
      inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<helmet.helmet/dist/types/middlewares/cross-origin-opener-policy.CrossOriginOpenerPolicyOptions> */
  trait ReadonlyCrossOriginOpener extends StObject {
    
    val policy: js.UndefOr[`same-origin` | `same-origin-allow-popups` | `unsafe-none`] = js.undefined
  }
  object ReadonlyCrossOriginOpener {
    
    inline def apply(): ReadonlyCrossOriginOpener = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlyCrossOriginOpener]
    }
    
    extension [Self <: ReadonlyCrossOriginOpener](x: Self) {
      
      inline def setPolicy(value: `same-origin` | `same-origin-allow-popups` | `unsafe-none`): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
      
      inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<helmet.helmet/dist/types/middlewares/cross-origin-resource-policy.CrossOriginResourcePolicyOptions> */
  trait ReadonlyCrossOriginResour extends StObject {
    
    val policy: js.UndefOr[`same-origin` | `same-site` | `cross-origin`] = js.undefined
  }
  object ReadonlyCrossOriginResour {
    
    inline def apply(): ReadonlyCrossOriginResour = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlyCrossOriginResour]
    }
    
    extension [Self <: ReadonlyCrossOriginResour](x: Self) {
      
      inline def setPolicy(value: `same-origin` | `same-site` | `cross-origin`): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
      
      inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<helmet.helmet/dist/types/middlewares/expect-ct.ExpectCtOptions> */
  trait ReadonlyExpectCtOptions extends StObject {
    
    val enforce: js.UndefOr[Boolean] = js.undefined
    
    val maxAge: js.UndefOr[Double] = js.undefined
    
    val reportUri: js.UndefOr[String] = js.undefined
  }
  object ReadonlyExpectCtOptions {
    
    inline def apply(): ReadonlyExpectCtOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlyExpectCtOptions]
    }
    
    extension [Self <: ReadonlyExpectCtOptions](x: Self) {
      
      inline def setEnforce(value: Boolean): Self = StObject.set(x, "enforce", value.asInstanceOf[js.Any])
      
      inline def setEnforceUndefined: Self = StObject.set(x, "enforce", js.undefined)
      
      inline def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      inline def setReportUri(value: String): Self = StObject.set(x, "reportUri", value.asInstanceOf[js.Any])
      
      inline def setReportUriUndefined: Self = StObject.set(x, "reportUri", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<helmet.helmet.HelmetOptions> */
  trait ReadonlyHelmetOptions extends StObject {
    
    val contentSecurityPolicy: js.UndefOr[ContentSecurityPolicyOptions | Boolean] = js.undefined
    
    val crossOriginEmbedderPolicy: js.UndefOr[Boolean] = js.undefined
    
    val crossOriginOpenerPolicy: js.UndefOr[CrossOriginOpenerPolicyOptions | Boolean] = js.undefined
    
    val crossOriginResourcePolicy: js.UndefOr[CrossOriginResourcePolicyOptions | Boolean] = js.undefined
    
    val dnsPrefetchControl: js.UndefOr[XDnsPrefetchControlOptions | Boolean] = js.undefined
    
    val expectCt: js.UndefOr[ExpectCtOptions | Boolean] = js.undefined
    
    val frameguard: js.UndefOr[XFrameOptionsOptions | Boolean] = js.undefined
    
    val hidePoweredBy: js.UndefOr[Boolean] = js.undefined
    
    val hsts: js.UndefOr[StrictTransportSecurityOptions | Boolean] = js.undefined
    
    val ieNoOpen: js.UndefOr[Boolean] = js.undefined
    
    val noSniff: js.UndefOr[Boolean] = js.undefined
    
    val originAgentCluster: js.UndefOr[Boolean] = js.undefined
    
    val permittedCrossDomainPolicies: js.UndefOr[XPermittedCrossDomainPoliciesOptions | Boolean] = js.undefined
    
    val referrerPolicy: js.UndefOr[ReferrerPolicyOptions | Boolean] = js.undefined
    
    val xssFilter: js.UndefOr[Boolean] = js.undefined
  }
  object ReadonlyHelmetOptions {
    
    inline def apply(): ReadonlyHelmetOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlyHelmetOptions]
    }
    
    extension [Self <: ReadonlyHelmetOptions](x: Self) {
      
      inline def setContentSecurityPolicy(value: ContentSecurityPolicyOptions | Boolean): Self = StObject.set(x, "contentSecurityPolicy", value.asInstanceOf[js.Any])
      
      inline def setContentSecurityPolicyUndefined: Self = StObject.set(x, "contentSecurityPolicy", js.undefined)
      
      inline def setCrossOriginEmbedderPolicy(value: Boolean): Self = StObject.set(x, "crossOriginEmbedderPolicy", value.asInstanceOf[js.Any])
      
      inline def setCrossOriginEmbedderPolicyUndefined: Self = StObject.set(x, "crossOriginEmbedderPolicy", js.undefined)
      
      inline def setCrossOriginOpenerPolicy(value: CrossOriginOpenerPolicyOptions | Boolean): Self = StObject.set(x, "crossOriginOpenerPolicy", value.asInstanceOf[js.Any])
      
      inline def setCrossOriginOpenerPolicyUndefined: Self = StObject.set(x, "crossOriginOpenerPolicy", js.undefined)
      
      inline def setCrossOriginResourcePolicy(value: CrossOriginResourcePolicyOptions | Boolean): Self = StObject.set(x, "crossOriginResourcePolicy", value.asInstanceOf[js.Any])
      
      inline def setCrossOriginResourcePolicyUndefined: Self = StObject.set(x, "crossOriginResourcePolicy", js.undefined)
      
      inline def setDnsPrefetchControl(value: XDnsPrefetchControlOptions | Boolean): Self = StObject.set(x, "dnsPrefetchControl", value.asInstanceOf[js.Any])
      
      inline def setDnsPrefetchControlUndefined: Self = StObject.set(x, "dnsPrefetchControl", js.undefined)
      
      inline def setExpectCt(value: ExpectCtOptions | Boolean): Self = StObject.set(x, "expectCt", value.asInstanceOf[js.Any])
      
      inline def setExpectCtUndefined: Self = StObject.set(x, "expectCt", js.undefined)
      
      inline def setFrameguard(value: XFrameOptionsOptions | Boolean): Self = StObject.set(x, "frameguard", value.asInstanceOf[js.Any])
      
      inline def setFrameguardUndefined: Self = StObject.set(x, "frameguard", js.undefined)
      
      inline def setHidePoweredBy(value: Boolean): Self = StObject.set(x, "hidePoweredBy", value.asInstanceOf[js.Any])
      
      inline def setHidePoweredByUndefined: Self = StObject.set(x, "hidePoweredBy", js.undefined)
      
      inline def setHsts(value: StrictTransportSecurityOptions | Boolean): Self = StObject.set(x, "hsts", value.asInstanceOf[js.Any])
      
      inline def setHstsUndefined: Self = StObject.set(x, "hsts", js.undefined)
      
      inline def setIeNoOpen(value: Boolean): Self = StObject.set(x, "ieNoOpen", value.asInstanceOf[js.Any])
      
      inline def setIeNoOpenUndefined: Self = StObject.set(x, "ieNoOpen", js.undefined)
      
      inline def setNoSniff(value: Boolean): Self = StObject.set(x, "noSniff", value.asInstanceOf[js.Any])
      
      inline def setNoSniffUndefined: Self = StObject.set(x, "noSniff", js.undefined)
      
      inline def setOriginAgentCluster(value: Boolean): Self = StObject.set(x, "originAgentCluster", value.asInstanceOf[js.Any])
      
      inline def setOriginAgentClusterUndefined: Self = StObject.set(x, "originAgentCluster", js.undefined)
      
      inline def setPermittedCrossDomainPolicies(value: XPermittedCrossDomainPoliciesOptions | Boolean): Self = StObject.set(x, "permittedCrossDomainPolicies", value.asInstanceOf[js.Any])
      
      inline def setPermittedCrossDomainPoliciesUndefined: Self = StObject.set(x, "permittedCrossDomainPolicies", js.undefined)
      
      inline def setReferrerPolicy(value: ReferrerPolicyOptions | Boolean): Self = StObject.set(x, "referrerPolicy", value.asInstanceOf[js.Any])
      
      inline def setReferrerPolicyUndefined: Self = StObject.set(x, "referrerPolicy", js.undefined)
      
      inline def setXssFilter(value: Boolean): Self = StObject.set(x, "xssFilter", value.asInstanceOf[js.Any])
      
      inline def setXssFilterUndefined: Self = StObject.set(x, "xssFilter", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<helmet.helmet/dist/types/middlewares/referrer-policy.ReferrerPolicyOptions> */
  trait ReadonlyReferrerPolicyOpt extends StObject {
    
    val policy: js.UndefOr[ReferrerPolicyToken | js.Array[ReferrerPolicyToken]] = js.undefined
  }
  object ReadonlyReferrerPolicyOpt {
    
    inline def apply(): ReadonlyReferrerPolicyOpt = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlyReferrerPolicyOpt]
    }
    
    extension [Self <: ReadonlyReferrerPolicyOpt](x: Self) {
      
      inline def setPolicy(value: ReferrerPolicyToken | js.Array[ReferrerPolicyToken]): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
      
      inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
      
      inline def setPolicyVarargs(value: ReferrerPolicyToken*): Self = StObject.set(x, "policy", js.Array(value*))
    }
  }
  
  /* Inlined std.Readonly<helmet.helmet/dist/types/middlewares/strict-transport-security.StrictTransportSecurityOptions> */
  trait ReadonlyStrictTransportSe extends StObject {
    
    val includeSubDomains: js.UndefOr[Boolean] = js.undefined
    
    val maxAge: js.UndefOr[Double] = js.undefined
    
    val preload: js.UndefOr[Boolean] = js.undefined
  }
  object ReadonlyStrictTransportSe {
    
    inline def apply(): ReadonlyStrictTransportSe = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlyStrictTransportSe]
    }
    
    extension [Self <: ReadonlyStrictTransportSe](x: Self) {
      
      inline def setIncludeSubDomains(value: Boolean): Self = StObject.set(x, "includeSubDomains", value.asInstanceOf[js.Any])
      
      inline def setIncludeSubDomainsUndefined: Self = StObject.set(x, "includeSubDomains", js.undefined)
      
      inline def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      inline def setPreload(value: Boolean): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
      
      inline def setPreloadUndefined: Self = StObject.set(x, "preload", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<helmet.helmet/dist/types/middlewares/x-dns-prefetch-control.XDnsPrefetchControlOptions> */
  trait ReadonlyXDnsPrefetchContr extends StObject {
    
    val allow: js.UndefOr[Boolean] = js.undefined
  }
  object ReadonlyXDnsPrefetchContr {
    
    inline def apply(): ReadonlyXDnsPrefetchContr = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlyXDnsPrefetchContr]
    }
    
    extension [Self <: ReadonlyXDnsPrefetchContr](x: Self) {
      
      inline def setAllow(value: Boolean): Self = StObject.set(x, "allow", value.asInstanceOf[js.Any])
      
      inline def setAllowUndefined: Self = StObject.set(x, "allow", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<helmet.helmet/dist/types/middlewares/x-frame-options.XFrameOptionsOptions> */
  trait ReadonlyXFrameOptionsOpti extends StObject {
    
    val action: js.UndefOr[deny | sameorigin] = js.undefined
  }
  object ReadonlyXFrameOptionsOpti {
    
    inline def apply(): ReadonlyXFrameOptionsOpti = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlyXFrameOptionsOpti]
    }
    
    extension [Self <: ReadonlyXFrameOptionsOpti](x: Self) {
      
      inline def setAction(value: deny | sameorigin): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<helmet.helmet/dist/types/middlewares/x-permitted-cross-domain-policies.XPermittedCrossDomainPoliciesOptions> */
  trait ReadonlyXPermittedCrossDo extends StObject {
    
    val permittedPolicies: js.UndefOr[none | `master-only` | `by-content-type` | all] = js.undefined
  }
  object ReadonlyXPermittedCrossDo {
    
    inline def apply(): ReadonlyXPermittedCrossDo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlyXPermittedCrossDo]
    }
    
    extension [Self <: ReadonlyXPermittedCrossDo](x: Self) {
      
      inline def setPermittedPolicies(value: none | `master-only` | `by-content-type` | all): Self = StObject.set(x, "permittedPolicies", value.asInstanceOf[js.Any])
      
      inline def setPermittedPoliciesUndefined: Self = StObject.set(x, "permittedPolicies", js.undefined)
    }
  }
}
