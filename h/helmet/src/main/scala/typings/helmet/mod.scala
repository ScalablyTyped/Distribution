package typings.helmet

import org.scalablytyped.runtime.StringDictionary
import typings.helmet.anon.ReadonlyContentSecurityPo
import typings.helmet.anon.ReadonlyExpectCtOptions
import typings.helmet.anon.ReadonlyHelmetOptions
import typings.helmet.anon.ReadonlyReferrerPolicyOpt
import typings.helmet.anon.ReadonlyStrictTransportSe
import typings.helmet.anon.ReadonlyXDnsPrefetchContr
import typings.helmet.anon.ReadonlyXFrameOptionsOpti
import typings.helmet.anon.ReadonlyXPermittedCrossDo
import typings.helmet.contentSecurityPolicyMod.ContentSecurityPolicyDirectiveValue
import typings.helmet.contentSecurityPolicyMod.ContentSecurityPolicyOptions
import typings.helmet.expectCtMod.ExpectCtOptions
import typings.helmet.helmetBooleans.`false`
import typings.helmet.referrerPolicyMod.ReferrerPolicyOptions
import typings.helmet.strictTransportSecurityMod.StrictTransportSecurityOptions
import typings.helmet.xDnsPrefetchControlMod.XDnsPrefetchControlOptions
import typings.helmet.xFrameOptionsMod.XFrameOptionsOptions
import typings.helmet.xPermittedCrossDomainPoliciesMod.XPermittedCrossDomainPoliciesOptions
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.std.Error
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("helmet/dist", JSImport.Namespace)
  @js.native
  def apply(): js.Function3[
    /* req */ IncomingMessage, 
    /* res */ ServerResponse, 
    /* next */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], 
    Unit
  ] = js.native
  @JSImport("helmet/dist", JSImport.Namespace)
  @js.native
  def apply(options: ReadonlyHelmetOptions): js.Function3[
    /* req */ IncomingMessage, 
    /* res */ ServerResponse, 
    /* next */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], 
    Unit
  ] = js.native
  
  @JSImport("helmet/dist", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object contentSecurityPolicy {
    
    @JSImport("helmet/dist", "contentSecurityPolicy")
    @js.native
    def apply(): js.Function3[
        /* req */ IncomingMessage, 
        /* res */ ServerResponse, 
        /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
        Unit
      ] = js.native
    @JSImport("helmet/dist", "contentSecurityPolicy")
    @js.native
    def apply(options: ReadonlyContentSecurityPo): js.Function3[
        /* req */ IncomingMessage, 
        /* res */ ServerResponse, 
        /* next */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
        Unit
      ] = js.native
    @JSImport("helmet/dist", "contentSecurityPolicy")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("helmet/dist", "contentSecurityPolicy.getDefaultDirectives")
    @js.native
    def getDefaultDirectives(): StringDictionary[Iterable[ContentSecurityPolicyDirectiveValue]] = js.native
    @JSImport("helmet/dist", "contentSecurityPolicy.getDefaultDirectives")
    @js.native
    def getDefaultDirectives_FcontentSecurityPolicy: js.Function0[StringDictionary[Iterable[ContentSecurityPolicyDirectiveValue]]] = js.native
    
    @scala.inline
    def getDefaultDirectives_FcontentSecurityPolicy_=(x: js.Function0[StringDictionary[Iterable[ContentSecurityPolicyDirectiveValue]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getDefaultDirectives")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("helmet/dist", "dnsPrefetchControl")
  @js.native
  def dnsPrefetchControl: js.Function1[
    /* options */ js.UndefOr[ReadonlyXDnsPrefetchContr], 
    js.Function3[
      /* _req */ IncomingMessage, 
      /* res */ ServerResponse, 
      /* next */ js.Function0[Unit], 
      Unit
    ]
  ] = js.native
  @scala.inline
  def dnsPrefetchControl_=(
    x: js.Function1[
      /* options */ js.UndefOr[ReadonlyXDnsPrefetchContr], 
      js.Function3[
        /* _req */ IncomingMessage, 
        /* res */ ServerResponse, 
        /* next */ js.Function0[Unit], 
        Unit
      ]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dnsPrefetchControl")(x.asInstanceOf[js.Any])
  
  @JSImport("helmet/dist", "expectCt")
  @js.native
  def expectCt: js.Function1[
    /* options */ js.UndefOr[ReadonlyExpectCtOptions], 
    js.Function3[
      /* _req */ IncomingMessage, 
      /* res */ ServerResponse, 
      /* next */ js.Function0[Unit], 
      Unit
    ]
  ] = js.native
  @scala.inline
  def expectCt_=(
    x: js.Function1[
      /* options */ js.UndefOr[ReadonlyExpectCtOptions], 
      js.Function3[
        /* _req */ IncomingMessage, 
        /* res */ ServerResponse, 
        /* next */ js.Function0[Unit], 
        Unit
      ]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("expectCt")(x.asInstanceOf[js.Any])
  
  @JSImport("helmet/dist", "featurePolicy")
  @js.native
  def featurePolicy: js.Function0[scala.Nothing] = js.native
  @scala.inline
  def featurePolicy_=(x: js.Function0[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("featurePolicy")(x.asInstanceOf[js.Any])
  
  @JSImport("helmet/dist", "frameguard")
  @js.native
  def frameguard: js.Function1[
    /* options */ js.UndefOr[ReadonlyXFrameOptionsOpti], 
    js.Function3[
      /* _req */ IncomingMessage, 
      /* res */ ServerResponse, 
      /* next */ js.Function0[Unit], 
      Unit
    ]
  ] = js.native
  @scala.inline
  def frameguard_=(
    x: js.Function1[
      /* options */ js.UndefOr[ReadonlyXFrameOptionsOpti], 
      js.Function3[
        /* _req */ IncomingMessage, 
        /* res */ ServerResponse, 
        /* next */ js.Function0[Unit], 
        Unit
      ]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("frameguard")(x.asInstanceOf[js.Any])
  
  @JSImport("helmet/dist", "hidePoweredBy")
  @js.native
  def hidePoweredBy: js.Function0[
    js.Function3[
      /* _req */ IncomingMessage, 
      /* res */ ServerResponse, 
      /* next */ js.Function0[Unit], 
      Unit
    ]
  ] = js.native
  @scala.inline
  def hidePoweredBy_=(
    x: js.Function0[
      js.Function3[
        /* _req */ IncomingMessage, 
        /* res */ ServerResponse, 
        /* next */ js.Function0[Unit], 
        Unit
      ]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hidePoweredBy")(x.asInstanceOf[js.Any])
  
  @JSImport("helmet/dist", "hpkp")
  @js.native
  def hpkp: js.Function0[scala.Nothing] = js.native
  @scala.inline
  def hpkp_=(x: js.Function0[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hpkp")(x.asInstanceOf[js.Any])
  
  @JSImport("helmet/dist", "hsts")
  @js.native
  def hsts: js.Function1[
    /* options */ js.UndefOr[ReadonlyStrictTransportSe], 
    js.Function3[
      /* _req */ IncomingMessage, 
      /* res */ ServerResponse, 
      /* next */ js.Function0[Unit], 
      Unit
    ]
  ] = js.native
  @scala.inline
  def hsts_=(
    x: js.Function1[
      /* options */ js.UndefOr[ReadonlyStrictTransportSe], 
      js.Function3[
        /* _req */ IncomingMessage, 
        /* res */ ServerResponse, 
        /* next */ js.Function0[Unit], 
        Unit
      ]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hsts")(x.asInstanceOf[js.Any])
  
  @JSImport("helmet/dist", "ieNoOpen")
  @js.native
  def ieNoOpen: js.Function0[
    js.Function3[
      /* _req */ IncomingMessage, 
      /* res */ ServerResponse, 
      /* next */ js.Function0[Unit], 
      Unit
    ]
  ] = js.native
  @scala.inline
  def ieNoOpen_=(
    x: js.Function0[
      js.Function3[
        /* _req */ IncomingMessage, 
        /* res */ ServerResponse, 
        /* next */ js.Function0[Unit], 
        Unit
      ]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ieNoOpen")(x.asInstanceOf[js.Any])
  
  @JSImport("helmet/dist", "noCache")
  @js.native
  def noCache: js.Function0[scala.Nothing] = js.native
  @scala.inline
  def noCache_=(x: js.Function0[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("noCache")(x.asInstanceOf[js.Any])
  
  @JSImport("helmet/dist", "noSniff")
  @js.native
  def noSniff: js.Function0[
    js.Function3[
      /* _req */ IncomingMessage, 
      /* res */ ServerResponse, 
      /* next */ js.Function0[Unit], 
      Unit
    ]
  ] = js.native
  @scala.inline
  def noSniff_=(
    x: js.Function0[
      js.Function3[
        /* _req */ IncomingMessage, 
        /* res */ ServerResponse, 
        /* next */ js.Function0[Unit], 
        Unit
      ]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("noSniff")(x.asInstanceOf[js.Any])
  
  @JSImport("helmet/dist", "permittedCrossDomainPolicies")
  @js.native
  def permittedCrossDomainPolicies: js.Function1[
    /* options */ js.UndefOr[ReadonlyXPermittedCrossDo], 
    js.Function3[
      /* _req */ IncomingMessage, 
      /* res */ ServerResponse, 
      /* next */ js.Function0[Unit], 
      Unit
    ]
  ] = js.native
  @scala.inline
  def permittedCrossDomainPolicies_=(
    x: js.Function1[
      /* options */ js.UndefOr[ReadonlyXPermittedCrossDo], 
      js.Function3[
        /* _req */ IncomingMessage, 
        /* res */ ServerResponse, 
        /* next */ js.Function0[Unit], 
        Unit
      ]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("permittedCrossDomainPolicies")(x.asInstanceOf[js.Any])
  
  @JSImport("helmet/dist", "referrerPolicy")
  @js.native
  def referrerPolicy: js.Function1[
    /* options */ js.UndefOr[ReadonlyReferrerPolicyOpt], 
    js.Function3[
      /* _req */ IncomingMessage, 
      /* res */ ServerResponse, 
      /* next */ js.Function0[Unit], 
      Unit
    ]
  ] = js.native
  @scala.inline
  def referrerPolicy_=(
    x: js.Function1[
      /* options */ js.UndefOr[ReadonlyReferrerPolicyOpt], 
      js.Function3[
        /* _req */ IncomingMessage, 
        /* res */ ServerResponse, 
        /* next */ js.Function0[Unit], 
        Unit
      ]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("referrerPolicy")(x.asInstanceOf[js.Any])
  
  @JSImport("helmet/dist", "xssFilter")
  @js.native
  def xssFilter: js.Function0[
    js.Function3[
      /* _req */ IncomingMessage, 
      /* res */ ServerResponse, 
      /* next */ js.Function0[Unit], 
      Unit
    ]
  ] = js.native
  @scala.inline
  def xssFilter_=(
    x: js.Function0[
      js.Function3[
        /* _req */ IncomingMessage, 
        /* res */ ServerResponse, 
        /* next */ js.Function0[Unit], 
        Unit
      ]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("xssFilter")(x.asInstanceOf[js.Any])
  
  @js.native
  trait HelmetOptions extends StObject {
    
    var contentSecurityPolicy: js.UndefOr[MiddlewareOption[ContentSecurityPolicyOptions]] = js.native
    
    var dnsPrefetchControl: js.UndefOr[MiddlewareOption[XDnsPrefetchControlOptions]] = js.native
    
    var expectCt: js.UndefOr[MiddlewareOption[ExpectCtOptions]] = js.native
    
    var frameguard: js.UndefOr[MiddlewareOption[XFrameOptionsOptions]] = js.native
    
    var hidePoweredBy: js.UndefOr[MiddlewareOption[scala.Nothing]] = js.native
    
    var hsts: js.UndefOr[MiddlewareOption[StrictTransportSecurityOptions]] = js.native
    
    var ieNoOpen: js.UndefOr[MiddlewareOption[scala.Nothing]] = js.native
    
    var noSniff: js.UndefOr[MiddlewareOption[scala.Nothing]] = js.native
    
    var permittedCrossDomainPolicies: js.UndefOr[MiddlewareOption[XPermittedCrossDomainPoliciesOptions]] = js.native
    
    var referrerPolicy: js.UndefOr[MiddlewareOption[ReferrerPolicyOptions]] = js.native
    
    var xssFilter: js.UndefOr[MiddlewareOption[scala.Nothing]] = js.native
  }
  object HelmetOptions {
    
    @scala.inline
    def apply(): HelmetOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HelmetOptions]
    }
    
    @scala.inline
    implicit class HelmetOptionsMutableBuilder[Self <: HelmetOptions] (val x: Self) extends AnyVal {
      
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
  
  type MiddlewareOption[T] = `false` | T
}
