package typings.helmet

import typings.helmet.contentSecurityPolicyMod.ContentSecurityPolicyDirectives
import typings.helmet.contentSecurityPolicyMod.ContentSecurityPolicyOptions
import typings.helmet.expectCtMod.ExpectCtOptions
import typings.helmet.mod.MiddlewareOption
import typings.helmet.referrerPolicyMod.ReferrerPolicyOptions
import typings.helmet.strictTransportSecurityMod.StrictTransportSecurityOptions
import typings.helmet.xDnsPrefetchControlMod.XDnsPrefetchControlOptions
import typings.helmet.xFrameOptionsMod.XFrameOptionsOptions
import typings.helmet.xPermittedCrossDomainPoliciesMod.XPermittedCrossDomainPoliciesOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Readonly<helmet.helmet/dist/middlewares/content-security-policy.ContentSecurityPolicyOptions> */
  trait ReadonlyContentSecurityPo extends StObject {
    
    val directives: js.UndefOr[ContentSecurityPolicyDirectives] = js.undefined
    
    val reportOnly: js.UndefOr[Boolean] = js.undefined
  }
  object ReadonlyContentSecurityPo {
    
    inline def apply(): ReadonlyContentSecurityPo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlyContentSecurityPo]
    }
    
    extension [Self <: ReadonlyContentSecurityPo](x: Self) {
      
      inline def setDirectives(value: ContentSecurityPolicyDirectives): Self = StObject.set(x, "directives", value.asInstanceOf[js.Any])
      
      inline def setDirectivesUndefined: Self = StObject.set(x, "directives", js.undefined)
      
      inline def setReportOnly(value: Boolean): Self = StObject.set(x, "reportOnly", value.asInstanceOf[js.Any])
      
      inline def setReportOnlyUndefined: Self = StObject.set(x, "reportOnly", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<helmet.helmet/dist/middlewares/expect-ct.ExpectCtOptions> */
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
  
  /* Inlined std.Readonly<helmet.helmet/dist.HelmetOptions> */
  trait ReadonlyHelmetOptions extends StObject {
    
    val contentSecurityPolicy: js.UndefOr[MiddlewareOption[ContentSecurityPolicyOptions]] = js.undefined
    
    val dnsPrefetchControl: js.UndefOr[MiddlewareOption[XDnsPrefetchControlOptions]] = js.undefined
    
    val expectCt: js.UndefOr[MiddlewareOption[ExpectCtOptions]] = js.undefined
    
    val frameguard: js.UndefOr[MiddlewareOption[XFrameOptionsOptions]] = js.undefined
    
    val hidePoweredBy: js.UndefOr[MiddlewareOption[scala.Nothing]] = js.undefined
    
    val hsts: js.UndefOr[MiddlewareOption[StrictTransportSecurityOptions]] = js.undefined
    
    val ieNoOpen: js.UndefOr[MiddlewareOption[scala.Nothing]] = js.undefined
    
    val noSniff: js.UndefOr[MiddlewareOption[scala.Nothing]] = js.undefined
    
    val permittedCrossDomainPolicies: js.UndefOr[MiddlewareOption[XPermittedCrossDomainPoliciesOptions]] = js.undefined
    
    val referrerPolicy: js.UndefOr[MiddlewareOption[ReferrerPolicyOptions]] = js.undefined
    
    val xssFilter: js.UndefOr[MiddlewareOption[scala.Nothing]] = js.undefined
  }
  object ReadonlyHelmetOptions {
    
    inline def apply(): ReadonlyHelmetOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlyHelmetOptions]
    }
    
    extension [Self <: ReadonlyHelmetOptions](x: Self) {
      
      inline def setContentSecurityPolicy(value: MiddlewareOption[ContentSecurityPolicyOptions]): Self = StObject.set(x, "contentSecurityPolicy", value.asInstanceOf[js.Any])
      
      inline def setContentSecurityPolicyUndefined: Self = StObject.set(x, "contentSecurityPolicy", js.undefined)
      
      inline def setDnsPrefetchControl(value: MiddlewareOption[XDnsPrefetchControlOptions]): Self = StObject.set(x, "dnsPrefetchControl", value.asInstanceOf[js.Any])
      
      inline def setDnsPrefetchControlUndefined: Self = StObject.set(x, "dnsPrefetchControl", js.undefined)
      
      inline def setExpectCt(value: MiddlewareOption[ExpectCtOptions]): Self = StObject.set(x, "expectCt", value.asInstanceOf[js.Any])
      
      inline def setExpectCtUndefined: Self = StObject.set(x, "expectCt", js.undefined)
      
      inline def setFrameguard(value: MiddlewareOption[XFrameOptionsOptions]): Self = StObject.set(x, "frameguard", value.asInstanceOf[js.Any])
      
      inline def setFrameguardUndefined: Self = StObject.set(x, "frameguard", js.undefined)
      
      inline def setHidePoweredBy(value: MiddlewareOption[scala.Nothing]): Self = StObject.set(x, "hidePoweredBy", value.asInstanceOf[js.Any])
      
      inline def setHidePoweredByUndefined: Self = StObject.set(x, "hidePoweredBy", js.undefined)
      
      inline def setHsts(value: MiddlewareOption[StrictTransportSecurityOptions]): Self = StObject.set(x, "hsts", value.asInstanceOf[js.Any])
      
      inline def setHstsUndefined: Self = StObject.set(x, "hsts", js.undefined)
      
      inline def setIeNoOpen(value: MiddlewareOption[scala.Nothing]): Self = StObject.set(x, "ieNoOpen", value.asInstanceOf[js.Any])
      
      inline def setIeNoOpenUndefined: Self = StObject.set(x, "ieNoOpen", js.undefined)
      
      inline def setNoSniff(value: MiddlewareOption[scala.Nothing]): Self = StObject.set(x, "noSniff", value.asInstanceOf[js.Any])
      
      inline def setNoSniffUndefined: Self = StObject.set(x, "noSniff", js.undefined)
      
      inline def setPermittedCrossDomainPolicies(value: MiddlewareOption[XPermittedCrossDomainPoliciesOptions]): Self = StObject.set(x, "permittedCrossDomainPolicies", value.asInstanceOf[js.Any])
      
      inline def setPermittedCrossDomainPoliciesUndefined: Self = StObject.set(x, "permittedCrossDomainPolicies", js.undefined)
      
      inline def setReferrerPolicy(value: MiddlewareOption[ReferrerPolicyOptions]): Self = StObject.set(x, "referrerPolicy", value.asInstanceOf[js.Any])
      
      inline def setReferrerPolicyUndefined: Self = StObject.set(x, "referrerPolicy", js.undefined)
      
      inline def setXssFilter(value: MiddlewareOption[scala.Nothing]): Self = StObject.set(x, "xssFilter", value.asInstanceOf[js.Any])
      
      inline def setXssFilterUndefined: Self = StObject.set(x, "xssFilter", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<helmet.helmet/dist/middlewares/referrer-policy.ReferrerPolicyOptions> */
  trait ReadonlyReferrerPolicyOpt extends StObject {
    
    val policy: js.UndefOr[String | js.Array[String]] = js.undefined
  }
  object ReadonlyReferrerPolicyOpt {
    
    inline def apply(): ReadonlyReferrerPolicyOpt = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlyReferrerPolicyOpt]
    }
    
    extension [Self <: ReadonlyReferrerPolicyOpt](x: Self) {
      
      inline def setPolicy(value: String | js.Array[String]): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
      
      inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
      
      inline def setPolicyVarargs(value: String*): Self = StObject.set(x, "policy", js.Array(value :_*))
    }
  }
  
  /* Inlined std.Readonly<helmet.helmet/dist/middlewares/strict-transport-security.StrictTransportSecurityOptions> */
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
  
  /* Inlined std.Readonly<helmet.helmet/dist/middlewares/x-dns-prefetch-control.XDnsPrefetchControlOptions> */
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
  
  /* Inlined std.Readonly<helmet.helmet/dist/middlewares/x-frame-options.XFrameOptionsOptions> */
  trait ReadonlyXFrameOptionsOpti extends StObject {
    
    val action: js.UndefOr[String] = js.undefined
  }
  object ReadonlyXFrameOptionsOpti {
    
    inline def apply(): ReadonlyXFrameOptionsOpti = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlyXFrameOptionsOpti]
    }
    
    extension [Self <: ReadonlyXFrameOptionsOpti](x: Self) {
      
      inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<helmet.helmet/dist/middlewares/x-permitted-cross-domain-policies.XPermittedCrossDomainPoliciesOptions> */
  trait ReadonlyXPermittedCrossDo extends StObject {
    
    val permittedPolicies: js.UndefOr[String] = js.undefined
  }
  object ReadonlyXPermittedCrossDo {
    
    inline def apply(): ReadonlyXPermittedCrossDo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlyXPermittedCrossDo]
    }
    
    extension [Self <: ReadonlyXPermittedCrossDo](x: Self) {
      
      inline def setPermittedPolicies(value: String): Self = StObject.set(x, "permittedPolicies", value.asInstanceOf[js.Any])
      
      inline def setPermittedPoliciesUndefined: Self = StObject.set(x, "permittedPolicies", js.undefined)
    }
  }
}
