package typings.helmet

import typings.helmet.anon.ReadonlyContentSecurityPo
import typings.helmet.anon.ReadonlyCrossOriginEmbedd
import typings.helmet.anon.ReadonlyCrossOriginOpener
import typings.helmet.anon.ReadonlyCrossOriginResour
import typings.helmet.anon.ReadonlyExpectCtOptions
import typings.helmet.anon.ReadonlyHelmetOptions
import typings.helmet.anon.ReadonlyReferrerPolicyOpt
import typings.helmet.anon.ReadonlyStrictTransportSe
import typings.helmet.anon.ReadonlyXDnsPrefetchContr
import typings.helmet.anon.ReadonlyXFrameOptionsOpti
import typings.helmet.anon.ReadonlyXPermittedCrossDo
import typings.helmet.distTypesMiddlewaresContentSecurityPolicyMod.ContentSecurityPolicy
import typings.helmet.distTypesMiddlewaresContentSecurityPolicyMod.ContentSecurityPolicyOptions
import typings.helmet.distTypesMiddlewaresCrossOriginOpenerPolicyMod.CrossOriginOpenerPolicyOptions
import typings.helmet.distTypesMiddlewaresCrossOriginResourcePolicyMod.CrossOriginResourcePolicyOptions
import typings.helmet.distTypesMiddlewaresExpectCtMod.ExpectCtOptions
import typings.helmet.distTypesMiddlewaresReferrerPolicyMod.ReferrerPolicyOptions
import typings.helmet.distTypesMiddlewaresStrictTransportSecurityMod.StrictTransportSecurityOptions
import typings.helmet.distTypesMiddlewaresXDnsPrefetchControlMod.XDnsPrefetchControlOptions
import typings.helmet.distTypesMiddlewaresXFrameOptionsMod.XFrameOptionsOptions
import typings.helmet.distTypesMiddlewaresXPermittedCrossDomainPoliciesMod.XPermittedCrossDomainPoliciesOptions
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("helmet", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("helmet", JSImport.Default)
  @js.native
  val default: Helmet = js.native
  
  @JSImport("helmet", "contentSecurityPolicy")
  @js.native
  val contentSecurityPolicy: ContentSecurityPolicy = js.native
  
  inline def crossOriginEmbedderPolicy(): js.Function3[
    /* _req */ IncomingMessage, 
    /* res */ ServerResponse[IncomingMessage], 
    /* next */ js.Function0[Unit], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("crossOriginEmbedderPolicy")().asInstanceOf[js.Function3[
    /* _req */ IncomingMessage, 
    /* res */ ServerResponse[IncomingMessage], 
    /* next */ js.Function0[Unit], 
    Unit
  ]]
  inline def crossOriginEmbedderPolicy(options: ReadonlyCrossOriginEmbedd): js.Function3[
    /* _req */ IncomingMessage, 
    /* res */ ServerResponse[IncomingMessage], 
    /* next */ js.Function0[Unit], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("crossOriginEmbedderPolicy")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* _req */ IncomingMessage, 
    /* res */ ServerResponse[IncomingMessage], 
    /* next */ js.Function0[Unit], 
    Unit
  ]]
  
  inline def crossOriginOpenerPolicy(): js.Function3[
    /* _req */ IncomingMessage, 
    /* res */ ServerResponse[IncomingMessage], 
    /* next */ js.Function0[Unit], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("crossOriginOpenerPolicy")().asInstanceOf[js.Function3[
    /* _req */ IncomingMessage, 
    /* res */ ServerResponse[IncomingMessage], 
    /* next */ js.Function0[Unit], 
    Unit
  ]]
  inline def crossOriginOpenerPolicy(options: ReadonlyCrossOriginOpener): js.Function3[
    /* _req */ IncomingMessage, 
    /* res */ ServerResponse[IncomingMessage], 
    /* next */ js.Function0[Unit], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("crossOriginOpenerPolicy")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* _req */ IncomingMessage, 
    /* res */ ServerResponse[IncomingMessage], 
    /* next */ js.Function0[Unit], 
    Unit
  ]]
  
  inline def crossOriginResourcePolicy(): js.Function3[
    /* _req */ IncomingMessage, 
    /* res */ ServerResponse[IncomingMessage], 
    /* next */ js.Function0[Unit], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("crossOriginResourcePolicy")().asInstanceOf[js.Function3[
    /* _req */ IncomingMessage, 
    /* res */ ServerResponse[IncomingMessage], 
    /* next */ js.Function0[Unit], 
    Unit
  ]]
  inline def crossOriginResourcePolicy(options: ReadonlyCrossOriginResour): js.Function3[
    /* _req */ IncomingMessage, 
    /* res */ ServerResponse[IncomingMessage], 
    /* next */ js.Function0[Unit], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("crossOriginResourcePolicy")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* _req */ IncomingMessage, 
    /* res */ ServerResponse[IncomingMessage], 
    /* next */ js.Function0[Unit], 
    Unit
  ]]
  
  inline def dnsPrefetchControl(): js.Function3[
    /* _req */ IncomingMessage, 
    /* res */ ServerResponse[IncomingMessage], 
    /* next */ js.Function0[Unit], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("dnsPrefetchControl")().asInstanceOf[js.Function3[
    /* _req */ IncomingMessage, 
    /* res */ ServerResponse[IncomingMessage], 
    /* next */ js.Function0[Unit], 
    Unit
  ]]
  inline def dnsPrefetchControl(options: ReadonlyXDnsPrefetchContr): js.Function3[
    /* _req */ IncomingMessage, 
    /* res */ ServerResponse[IncomingMessage], 
    /* next */ js.Function0[Unit], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("dnsPrefetchControl")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* _req */ IncomingMessage, 
    /* res */ ServerResponse[IncomingMessage], 
    /* next */ js.Function0[Unit], 
    Unit
  ]]
  
  inline def expectCt(): js.Function3[
    /* _req */ IncomingMessage, 
    /* res */ ServerResponse[IncomingMessage], 
    /* next */ js.Function0[Unit], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("expectCt")().asInstanceOf[js.Function3[
    /* _req */ IncomingMessage, 
    /* res */ ServerResponse[IncomingMessage], 
    /* next */ js.Function0[Unit], 
    Unit
  ]]
  inline def expectCt(options: ReadonlyExpectCtOptions): js.Function3[
    /* _req */ IncomingMessage, 
    /* res */ ServerResponse[IncomingMessage], 
    /* next */ js.Function0[Unit], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("expectCt")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* _req */ IncomingMessage, 
    /* res */ ServerResponse[IncomingMessage], 
    /* next */ js.Function0[Unit], 
    Unit
  ]]
  
  inline def frameguard(): js.Function3[
    /* _req */ IncomingMessage, 
    /* res */ ServerResponse[IncomingMessage], 
    /* next */ js.Function0[Unit], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("frameguard")().asInstanceOf[js.Function3[
    /* _req */ IncomingMessage, 
    /* res */ ServerResponse[IncomingMessage], 
    /* next */ js.Function0[Unit], 
    Unit
  ]]
  inline def frameguard(options: ReadonlyXFrameOptionsOpti): js.Function3[
    /* _req */ IncomingMessage, 
    /* res */ ServerResponse[IncomingMessage], 
    /* next */ js.Function0[Unit], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("frameguard")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* _req */ IncomingMessage, 
    /* res */ ServerResponse[IncomingMessage], 
    /* next */ js.Function0[Unit], 
    Unit
  ]]
  
  inline def hidePoweredBy(): js.Function3[
    /* _req */ IncomingMessage, 
    /* res */ ServerResponse[IncomingMessage], 
    /* next */ js.Function0[Unit], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("hidePoweredBy")().asInstanceOf[js.Function3[
    /* _req */ IncomingMessage, 
    /* res */ ServerResponse[IncomingMessage], 
    /* next */ js.Function0[Unit], 
    Unit
  ]]
  
  inline def hsts(): js.Function3[
    /* _req */ IncomingMessage, 
    /* res */ ServerResponse[IncomingMessage], 
    /* next */ js.Function0[Unit], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("hsts")().asInstanceOf[js.Function3[
    /* _req */ IncomingMessage, 
    /* res */ ServerResponse[IncomingMessage], 
    /* next */ js.Function0[Unit], 
    Unit
  ]]
  inline def hsts(options: ReadonlyStrictTransportSe): js.Function3[
    /* _req */ IncomingMessage, 
    /* res */ ServerResponse[IncomingMessage], 
    /* next */ js.Function0[Unit], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("hsts")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* _req */ IncomingMessage, 
    /* res */ ServerResponse[IncomingMessage], 
    /* next */ js.Function0[Unit], 
    Unit
  ]]
  
  inline def ieNoOpen(): js.Function3[
    /* _req */ IncomingMessage, 
    /* res */ ServerResponse[IncomingMessage], 
    /* next */ js.Function0[Unit], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("ieNoOpen")().asInstanceOf[js.Function3[
    /* _req */ IncomingMessage, 
    /* res */ ServerResponse[IncomingMessage], 
    /* next */ js.Function0[Unit], 
    Unit
  ]]
  
  inline def noSniff(): js.Function3[
    /* _req */ IncomingMessage, 
    /* res */ ServerResponse[IncomingMessage], 
    /* next */ js.Function0[Unit], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("noSniff")().asInstanceOf[js.Function3[
    /* _req */ IncomingMessage, 
    /* res */ ServerResponse[IncomingMessage], 
    /* next */ js.Function0[Unit], 
    Unit
  ]]
  
  inline def originAgentCluster(): js.Function3[
    /* _req */ IncomingMessage, 
    /* res */ ServerResponse[IncomingMessage], 
    /* next */ js.Function0[Unit], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("originAgentCluster")().asInstanceOf[js.Function3[
    /* _req */ IncomingMessage, 
    /* res */ ServerResponse[IncomingMessage], 
    /* next */ js.Function0[Unit], 
    Unit
  ]]
  
  inline def permittedCrossDomainPolicies(): js.Function3[
    /* _req */ IncomingMessage, 
    /* res */ ServerResponse[IncomingMessage], 
    /* next */ js.Function0[Unit], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("permittedCrossDomainPolicies")().asInstanceOf[js.Function3[
    /* _req */ IncomingMessage, 
    /* res */ ServerResponse[IncomingMessage], 
    /* next */ js.Function0[Unit], 
    Unit
  ]]
  inline def permittedCrossDomainPolicies(options: ReadonlyXPermittedCrossDo): js.Function3[
    /* _req */ IncomingMessage, 
    /* res */ ServerResponse[IncomingMessage], 
    /* next */ js.Function0[Unit], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("permittedCrossDomainPolicies")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* _req */ IncomingMessage, 
    /* res */ ServerResponse[IncomingMessage], 
    /* next */ js.Function0[Unit], 
    Unit
  ]]
  
  inline def referrerPolicy(): js.Function3[
    /* _req */ IncomingMessage, 
    /* res */ ServerResponse[IncomingMessage], 
    /* next */ js.Function0[Unit], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("referrerPolicy")().asInstanceOf[js.Function3[
    /* _req */ IncomingMessage, 
    /* res */ ServerResponse[IncomingMessage], 
    /* next */ js.Function0[Unit], 
    Unit
  ]]
  inline def referrerPolicy(options: ReadonlyReferrerPolicyOpt): js.Function3[
    /* _req */ IncomingMessage, 
    /* res */ ServerResponse[IncomingMessage], 
    /* next */ js.Function0[Unit], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("referrerPolicy")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* _req */ IncomingMessage, 
    /* res */ ServerResponse[IncomingMessage], 
    /* next */ js.Function0[Unit], 
    Unit
  ]]
  
  inline def xssFilter(): js.Function3[
    /* _req */ IncomingMessage, 
    /* res */ ServerResponse[IncomingMessage], 
    /* next */ js.Function0[Unit], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("xssFilter")().asInstanceOf[js.Function3[
    /* _req */ IncomingMessage, 
    /* res */ ServerResponse[IncomingMessage], 
    /* next */ js.Function0[Unit], 
    Unit
  ]]
  
  @js.native
  trait Helmet extends StObject {
    
    def apply(): js.Function3[
        /* req */ IncomingMessage, 
        /* res */ ServerResponse[IncomingMessage], 
        /* next */ js.Function1[/* err */ js.UndefOr[Any], Unit], 
        Unit
      ] = js.native
    def apply(options: ReadonlyHelmetOptions): js.Function3[
        /* req */ IncomingMessage, 
        /* res */ ServerResponse[IncomingMessage], 
        /* next */ js.Function1[/* err */ js.UndefOr[Any], Unit], 
        Unit
      ] = js.native
    
    def contentSecurityPolicy(): js.Function3[
        /* req */ IncomingMessage, 
        /* res */ ServerResponse[IncomingMessage], 
        /* next */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
        Unit
      ] = js.native
    def contentSecurityPolicy(options: ReadonlyContentSecurityPo): js.Function3[
        /* req */ IncomingMessage, 
        /* res */ ServerResponse[IncomingMessage], 
        /* next */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
        Unit
      ] = js.native
    @JSName("contentSecurityPolicy")
    var contentSecurityPolicy_Original: ContentSecurityPolicy = js.native
    
    def crossOriginEmbedderPolicy(): js.Function3[
        /* _req */ IncomingMessage, 
        /* res */ ServerResponse[IncomingMessage], 
        /* next */ js.Function0[Unit], 
        Unit
      ] = js.native
    def crossOriginEmbedderPolicy(options: ReadonlyCrossOriginEmbedd): js.Function3[
        /* _req */ IncomingMessage, 
        /* res */ ServerResponse[IncomingMessage], 
        /* next */ js.Function0[Unit], 
        Unit
      ] = js.native
    @JSName("crossOriginEmbedderPolicy")
    var crossOriginEmbedderPolicy_Original: js.Function1[
        /* options */ js.UndefOr[ReadonlyCrossOriginEmbedd], 
        js.Function3[
          /* _req */ IncomingMessage, 
          /* res */ ServerResponse[IncomingMessage], 
          /* next */ js.Function0[Unit], 
          Unit
        ]
      ] = js.native
    
    def crossOriginOpenerPolicy(): js.Function3[
        /* _req */ IncomingMessage, 
        /* res */ ServerResponse[IncomingMessage], 
        /* next */ js.Function0[Unit], 
        Unit
      ] = js.native
    def crossOriginOpenerPolicy(options: ReadonlyCrossOriginOpener): js.Function3[
        /* _req */ IncomingMessage, 
        /* res */ ServerResponse[IncomingMessage], 
        /* next */ js.Function0[Unit], 
        Unit
      ] = js.native
    @JSName("crossOriginOpenerPolicy")
    var crossOriginOpenerPolicy_Original: js.Function1[
        /* options */ js.UndefOr[ReadonlyCrossOriginOpener], 
        js.Function3[
          /* _req */ IncomingMessage, 
          /* res */ ServerResponse[IncomingMessage], 
          /* next */ js.Function0[Unit], 
          Unit
        ]
      ] = js.native
    
    def crossOriginResourcePolicy(): js.Function3[
        /* _req */ IncomingMessage, 
        /* res */ ServerResponse[IncomingMessage], 
        /* next */ js.Function0[Unit], 
        Unit
      ] = js.native
    def crossOriginResourcePolicy(options: ReadonlyCrossOriginResour): js.Function3[
        /* _req */ IncomingMessage, 
        /* res */ ServerResponse[IncomingMessage], 
        /* next */ js.Function0[Unit], 
        Unit
      ] = js.native
    @JSName("crossOriginResourcePolicy")
    var crossOriginResourcePolicy_Original: js.Function1[
        /* options */ js.UndefOr[ReadonlyCrossOriginResour], 
        js.Function3[
          /* _req */ IncomingMessage, 
          /* res */ ServerResponse[IncomingMessage], 
          /* next */ js.Function0[Unit], 
          Unit
        ]
      ] = js.native
    
    def dnsPrefetchControl(): js.Function3[
        /* _req */ IncomingMessage, 
        /* res */ ServerResponse[IncomingMessage], 
        /* next */ js.Function0[Unit], 
        Unit
      ] = js.native
    def dnsPrefetchControl(options: ReadonlyXDnsPrefetchContr): js.Function3[
        /* _req */ IncomingMessage, 
        /* res */ ServerResponse[IncomingMessage], 
        /* next */ js.Function0[Unit], 
        Unit
      ] = js.native
    @JSName("dnsPrefetchControl")
    var dnsPrefetchControl_Original: js.Function1[
        /* options */ js.UndefOr[ReadonlyXDnsPrefetchContr], 
        js.Function3[
          /* _req */ IncomingMessage, 
          /* res */ ServerResponse[IncomingMessage], 
          /* next */ js.Function0[Unit], 
          Unit
        ]
      ] = js.native
    
    def expectCt(): js.Function3[
        /* _req */ IncomingMessage, 
        /* res */ ServerResponse[IncomingMessage], 
        /* next */ js.Function0[Unit], 
        Unit
      ] = js.native
    def expectCt(options: ReadonlyExpectCtOptions): js.Function3[
        /* _req */ IncomingMessage, 
        /* res */ ServerResponse[IncomingMessage], 
        /* next */ js.Function0[Unit], 
        Unit
      ] = js.native
    @JSName("expectCt")
    var expectCt_Original: js.Function1[
        /* options */ js.UndefOr[ReadonlyExpectCtOptions], 
        js.Function3[
          /* _req */ IncomingMessage, 
          /* res */ ServerResponse[IncomingMessage], 
          /* next */ js.Function0[Unit], 
          Unit
        ]
      ] = js.native
    
    def frameguard(): js.Function3[
        /* _req */ IncomingMessage, 
        /* res */ ServerResponse[IncomingMessage], 
        /* next */ js.Function0[Unit], 
        Unit
      ] = js.native
    def frameguard(options: ReadonlyXFrameOptionsOpti): js.Function3[
        /* _req */ IncomingMessage, 
        /* res */ ServerResponse[IncomingMessage], 
        /* next */ js.Function0[Unit], 
        Unit
      ] = js.native
    @JSName("frameguard")
    var frameguard_Original: js.Function1[
        /* options */ js.UndefOr[ReadonlyXFrameOptionsOpti], 
        js.Function3[
          /* _req */ IncomingMessage, 
          /* res */ ServerResponse[IncomingMessage], 
          /* next */ js.Function0[Unit], 
          Unit
        ]
      ] = js.native
    
    def hidePoweredBy(): js.Function3[
        /* _req */ IncomingMessage, 
        /* res */ ServerResponse[IncomingMessage], 
        /* next */ js.Function0[Unit], 
        Unit
      ] = js.native
    @JSName("hidePoweredBy")
    var hidePoweredBy_Original: js.Function0[
        js.Function3[
          /* _req */ IncomingMessage, 
          /* res */ ServerResponse[IncomingMessage], 
          /* next */ js.Function0[Unit], 
          Unit
        ]
      ] = js.native
    
    def hsts(): js.Function3[
        /* _req */ IncomingMessage, 
        /* res */ ServerResponse[IncomingMessage], 
        /* next */ js.Function0[Unit], 
        Unit
      ] = js.native
    def hsts(options: ReadonlyStrictTransportSe): js.Function3[
        /* _req */ IncomingMessage, 
        /* res */ ServerResponse[IncomingMessage], 
        /* next */ js.Function0[Unit], 
        Unit
      ] = js.native
    @JSName("hsts")
    var hsts_Original: js.Function1[
        /* options */ js.UndefOr[ReadonlyStrictTransportSe], 
        js.Function3[
          /* _req */ IncomingMessage, 
          /* res */ ServerResponse[IncomingMessage], 
          /* next */ js.Function0[Unit], 
          Unit
        ]
      ] = js.native
    
    def ieNoOpen(): js.Function3[
        /* _req */ IncomingMessage, 
        /* res */ ServerResponse[IncomingMessage], 
        /* next */ js.Function0[Unit], 
        Unit
      ] = js.native
    @JSName("ieNoOpen")
    var ieNoOpen_Original: js.Function0[
        js.Function3[
          /* _req */ IncomingMessage, 
          /* res */ ServerResponse[IncomingMessage], 
          /* next */ js.Function0[Unit], 
          Unit
        ]
      ] = js.native
    
    def noSniff(): js.Function3[
        /* _req */ IncomingMessage, 
        /* res */ ServerResponse[IncomingMessage], 
        /* next */ js.Function0[Unit], 
        Unit
      ] = js.native
    @JSName("noSniff")
    var noSniff_Original: js.Function0[
        js.Function3[
          /* _req */ IncomingMessage, 
          /* res */ ServerResponse[IncomingMessage], 
          /* next */ js.Function0[Unit], 
          Unit
        ]
      ] = js.native
    
    def originAgentCluster(): js.Function3[
        /* _req */ IncomingMessage, 
        /* res */ ServerResponse[IncomingMessage], 
        /* next */ js.Function0[Unit], 
        Unit
      ] = js.native
    @JSName("originAgentCluster")
    var originAgentCluster_Original: js.Function0[
        js.Function3[
          /* _req */ IncomingMessage, 
          /* res */ ServerResponse[IncomingMessage], 
          /* next */ js.Function0[Unit], 
          Unit
        ]
      ] = js.native
    
    def permittedCrossDomainPolicies(): js.Function3[
        /* _req */ IncomingMessage, 
        /* res */ ServerResponse[IncomingMessage], 
        /* next */ js.Function0[Unit], 
        Unit
      ] = js.native
    def permittedCrossDomainPolicies(options: ReadonlyXPermittedCrossDo): js.Function3[
        /* _req */ IncomingMessage, 
        /* res */ ServerResponse[IncomingMessage], 
        /* next */ js.Function0[Unit], 
        Unit
      ] = js.native
    @JSName("permittedCrossDomainPolicies")
    var permittedCrossDomainPolicies_Original: js.Function1[
        /* options */ js.UndefOr[ReadonlyXPermittedCrossDo], 
        js.Function3[
          /* _req */ IncomingMessage, 
          /* res */ ServerResponse[IncomingMessage], 
          /* next */ js.Function0[Unit], 
          Unit
        ]
      ] = js.native
    
    def referrerPolicy(): js.Function3[
        /* _req */ IncomingMessage, 
        /* res */ ServerResponse[IncomingMessage], 
        /* next */ js.Function0[Unit], 
        Unit
      ] = js.native
    def referrerPolicy(options: ReadonlyReferrerPolicyOpt): js.Function3[
        /* _req */ IncomingMessage, 
        /* res */ ServerResponse[IncomingMessage], 
        /* next */ js.Function0[Unit], 
        Unit
      ] = js.native
    @JSName("referrerPolicy")
    var referrerPolicy_Original: js.Function1[
        /* options */ js.UndefOr[ReadonlyReferrerPolicyOpt], 
        js.Function3[
          /* _req */ IncomingMessage, 
          /* res */ ServerResponse[IncomingMessage], 
          /* next */ js.Function0[Unit], 
          Unit
        ]
      ] = js.native
    
    def xssFilter(): js.Function3[
        /* _req */ IncomingMessage, 
        /* res */ ServerResponse[IncomingMessage], 
        /* next */ js.Function0[Unit], 
        Unit
      ] = js.native
    @JSName("xssFilter")
    var xssFilter_Original: js.Function0[
        js.Function3[
          /* _req */ IncomingMessage, 
          /* res */ ServerResponse[IncomingMessage], 
          /* next */ js.Function0[Unit], 
          Unit
        ]
      ] = js.native
  }
  
  trait HelmetOptions extends StObject {
    
    var contentSecurityPolicy: js.UndefOr[ContentSecurityPolicyOptions | Boolean] = js.undefined
    
    var crossOriginEmbedderPolicy: js.UndefOr[Boolean] = js.undefined
    
    var crossOriginOpenerPolicy: js.UndefOr[CrossOriginOpenerPolicyOptions | Boolean] = js.undefined
    
    var crossOriginResourcePolicy: js.UndefOr[CrossOriginResourcePolicyOptions | Boolean] = js.undefined
    
    var dnsPrefetchControl: js.UndefOr[XDnsPrefetchControlOptions | Boolean] = js.undefined
    
    var expectCt: js.UndefOr[ExpectCtOptions | Boolean] = js.undefined
    
    var frameguard: js.UndefOr[XFrameOptionsOptions | Boolean] = js.undefined
    
    var hidePoweredBy: js.UndefOr[Boolean] = js.undefined
    
    var hsts: js.UndefOr[StrictTransportSecurityOptions | Boolean] = js.undefined
    
    var ieNoOpen: js.UndefOr[Boolean] = js.undefined
    
    var noSniff: js.UndefOr[Boolean] = js.undefined
    
    var originAgentCluster: js.UndefOr[Boolean] = js.undefined
    
    var permittedCrossDomainPolicies: js.UndefOr[XPermittedCrossDomainPoliciesOptions | Boolean] = js.undefined
    
    var referrerPolicy: js.UndefOr[ReferrerPolicyOptions | Boolean] = js.undefined
    
    var xssFilter: js.UndefOr[Boolean] = js.undefined
  }
  object HelmetOptions {
    
    inline def apply(): HelmetOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HelmetOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HelmetOptions] (val x: Self) extends AnyVal {
      
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
}
