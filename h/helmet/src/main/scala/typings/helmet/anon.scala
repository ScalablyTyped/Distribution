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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Readonly<helmet.helmet/dist/middlewares/content-security-policy.ContentSecurityPolicyOptions> */
  @js.native
  trait ReadonlyContentSecurityPo extends StObject {
    
    val directives: js.UndefOr[ContentSecurityPolicyDirectives] = js.native
    
    val reportOnly: js.UndefOr[Boolean] = js.native
  }
  object ReadonlyContentSecurityPo {
    
    @scala.inline
    def apply(): ReadonlyContentSecurityPo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlyContentSecurityPo]
    }
    
    @scala.inline
    implicit class ReadonlyContentSecurityPoMutableBuilder[Self <: ReadonlyContentSecurityPo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDirectives(value: ContentSecurityPolicyDirectives): Self = StObject.set(x, "directives", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectivesUndefined: Self = StObject.set(x, "directives", js.undefined)
      
      @scala.inline
      def setReportOnly(value: Boolean): Self = StObject.set(x, "reportOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReportOnlyUndefined: Self = StObject.set(x, "reportOnly", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<helmet.helmet/dist/middlewares/expect-ct.ExpectCtOptions> */
  @js.native
  trait ReadonlyExpectCtOptions extends StObject {
    
    val enforce: js.UndefOr[Boolean] = js.native
    
    val maxAge: js.UndefOr[Double] = js.native
    
    val reportUri: js.UndefOr[String] = js.native
  }
  object ReadonlyExpectCtOptions {
    
    @scala.inline
    def apply(): ReadonlyExpectCtOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlyExpectCtOptions]
    }
    
    @scala.inline
    implicit class ReadonlyExpectCtOptionsMutableBuilder[Self <: ReadonlyExpectCtOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnforce(value: Boolean): Self = StObject.set(x, "enforce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnforceUndefined: Self = StObject.set(x, "enforce", js.undefined)
      
      @scala.inline
      def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      @scala.inline
      def setReportUri(value: String): Self = StObject.set(x, "reportUri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReportUriUndefined: Self = StObject.set(x, "reportUri", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<helmet.helmet/dist.HelmetOptions> */
  @js.native
  trait ReadonlyHelmetOptions extends StObject {
    
    val contentSecurityPolicy: js.UndefOr[MiddlewareOption[ContentSecurityPolicyOptions]] = js.native
    
    val dnsPrefetchControl: js.UndefOr[MiddlewareOption[XDnsPrefetchControlOptions]] = js.native
    
    val expectCt: js.UndefOr[MiddlewareOption[ExpectCtOptions]] = js.native
    
    val frameguard: js.UndefOr[MiddlewareOption[XFrameOptionsOptions]] = js.native
    
    val hidePoweredBy: js.UndefOr[MiddlewareOption[scala.Nothing]] = js.native
    
    val hsts: js.UndefOr[MiddlewareOption[StrictTransportSecurityOptions]] = js.native
    
    val ieNoOpen: js.UndefOr[MiddlewareOption[scala.Nothing]] = js.native
    
    val noSniff: js.UndefOr[MiddlewareOption[scala.Nothing]] = js.native
    
    val permittedCrossDomainPolicies: js.UndefOr[MiddlewareOption[XPermittedCrossDomainPoliciesOptions]] = js.native
    
    val referrerPolicy: js.UndefOr[MiddlewareOption[ReferrerPolicyOptions]] = js.native
    
    val xssFilter: js.UndefOr[MiddlewareOption[scala.Nothing]] = js.native
  }
  object ReadonlyHelmetOptions {
    
    @scala.inline
    def apply(): ReadonlyHelmetOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlyHelmetOptions]
    }
    
    @scala.inline
    implicit class ReadonlyHelmetOptionsMutableBuilder[Self <: ReadonlyHelmetOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContentSecurityPolicy(value: MiddlewareOption[ContentSecurityPolicyOptions]): Self = StObject.set(x, "contentSecurityPolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentSecurityPolicyUndefined: Self = StObject.set(x, "contentSecurityPolicy", js.undefined)
      
      @scala.inline
      def setDnsPrefetchControl(value: MiddlewareOption[XDnsPrefetchControlOptions]): Self = StObject.set(x, "dnsPrefetchControl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDnsPrefetchControlUndefined: Self = StObject.set(x, "dnsPrefetchControl", js.undefined)
      
      @scala.inline
      def setExpectCt(value: MiddlewareOption[ExpectCtOptions]): Self = StObject.set(x, "expectCt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpectCtUndefined: Self = StObject.set(x, "expectCt", js.undefined)
      
      @scala.inline
      def setFrameguard(value: MiddlewareOption[XFrameOptionsOptions]): Self = StObject.set(x, "frameguard", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrameguardUndefined: Self = StObject.set(x, "frameguard", js.undefined)
      
      @scala.inline
      def setHidePoweredBy(value: MiddlewareOption[scala.Nothing]): Self = StObject.set(x, "hidePoweredBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHidePoweredByUndefined: Self = StObject.set(x, "hidePoweredBy", js.undefined)
      
      @scala.inline
      def setHsts(value: MiddlewareOption[StrictTransportSecurityOptions]): Self = StObject.set(x, "hsts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHstsUndefined: Self = StObject.set(x, "hsts", js.undefined)
      
      @scala.inline
      def setIeNoOpen(value: MiddlewareOption[scala.Nothing]): Self = StObject.set(x, "ieNoOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIeNoOpenUndefined: Self = StObject.set(x, "ieNoOpen", js.undefined)
      
      @scala.inline
      def setNoSniff(value: MiddlewareOption[scala.Nothing]): Self = StObject.set(x, "noSniff", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoSniffUndefined: Self = StObject.set(x, "noSniff", js.undefined)
      
      @scala.inline
      def setPermittedCrossDomainPolicies(value: MiddlewareOption[XPermittedCrossDomainPoliciesOptions]): Self = StObject.set(x, "permittedCrossDomainPolicies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPermittedCrossDomainPoliciesUndefined: Self = StObject.set(x, "permittedCrossDomainPolicies", js.undefined)
      
      @scala.inline
      def setReferrerPolicy(value: MiddlewareOption[ReferrerPolicyOptions]): Self = StObject.set(x, "referrerPolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReferrerPolicyUndefined: Self = StObject.set(x, "referrerPolicy", js.undefined)
      
      @scala.inline
      def setXssFilter(value: MiddlewareOption[scala.Nothing]): Self = StObject.set(x, "xssFilter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXssFilterUndefined: Self = StObject.set(x, "xssFilter", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<helmet.helmet/dist/middlewares/referrer-policy.ReferrerPolicyOptions> */
  @js.native
  trait ReadonlyReferrerPolicyOpt extends StObject {
    
    val policy: js.UndefOr[String | js.Array[String]] = js.native
  }
  object ReadonlyReferrerPolicyOpt {
    
    @scala.inline
    def apply(): ReadonlyReferrerPolicyOpt = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlyReferrerPolicyOpt]
    }
    
    @scala.inline
    implicit class ReadonlyReferrerPolicyOptMutableBuilder[Self <: ReadonlyReferrerPolicyOpt] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPolicy(value: String | js.Array[String]): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
      
      @scala.inline
      def setPolicyVarargs(value: String*): Self = StObject.set(x, "policy", js.Array(value :_*))
    }
  }
  
  /* Inlined std.Readonly<helmet.helmet/dist/middlewares/strict-transport-security.StrictTransportSecurityOptions> */
  @js.native
  trait ReadonlyStrictTransportSe extends StObject {
    
    val includeSubDomains: js.UndefOr[Boolean] = js.native
    
    val maxAge: js.UndefOr[Double] = js.native
    
    val preload: js.UndefOr[Boolean] = js.native
  }
  object ReadonlyStrictTransportSe {
    
    @scala.inline
    def apply(): ReadonlyStrictTransportSe = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlyStrictTransportSe]
    }
    
    @scala.inline
    implicit class ReadonlyStrictTransportSeMutableBuilder[Self <: ReadonlyStrictTransportSe] (val x: Self) extends AnyVal {
      
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
  
  /* Inlined std.Readonly<helmet.helmet/dist/middlewares/x-dns-prefetch-control.XDnsPrefetchControlOptions> */
  @js.native
  trait ReadonlyXDnsPrefetchContr extends StObject {
    
    val allow: js.UndefOr[Boolean] = js.native
  }
  object ReadonlyXDnsPrefetchContr {
    
    @scala.inline
    def apply(): ReadonlyXDnsPrefetchContr = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlyXDnsPrefetchContr]
    }
    
    @scala.inline
    implicit class ReadonlyXDnsPrefetchContrMutableBuilder[Self <: ReadonlyXDnsPrefetchContr] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllow(value: Boolean): Self = StObject.set(x, "allow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowUndefined: Self = StObject.set(x, "allow", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<helmet.helmet/dist/middlewares/x-frame-options.XFrameOptionsOptions> */
  @js.native
  trait ReadonlyXFrameOptionsOpti extends StObject {
    
    val action: js.UndefOr[String] = js.native
  }
  object ReadonlyXFrameOptionsOpti {
    
    @scala.inline
    def apply(): ReadonlyXFrameOptionsOpti = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlyXFrameOptionsOpti]
    }
    
    @scala.inline
    implicit class ReadonlyXFrameOptionsOptiMutableBuilder[Self <: ReadonlyXFrameOptionsOpti] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<helmet.helmet/dist/middlewares/x-permitted-cross-domain-policies.XPermittedCrossDomainPoliciesOptions> */
  @js.native
  trait ReadonlyXPermittedCrossDo extends StObject {
    
    val permittedPolicies: js.UndefOr[String] = js.native
  }
  object ReadonlyXPermittedCrossDo {
    
    @scala.inline
    def apply(): ReadonlyXPermittedCrossDo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlyXPermittedCrossDo]
    }
    
    @scala.inline
    implicit class ReadonlyXPermittedCrossDoMutableBuilder[Self <: ReadonlyXPermittedCrossDo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPermittedPolicies(value: String): Self = StObject.set(x, "permittedPolicies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPermittedPoliciesUndefined: Self = StObject.set(x, "permittedPolicies", js.undefined)
    }
  }
}
