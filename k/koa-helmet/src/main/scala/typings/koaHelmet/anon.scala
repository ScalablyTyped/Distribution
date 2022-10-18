package typings.koaHelmet

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
import typings.helmet.mod.Helmet
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Typeofhelmet extends StObject {
    
    def default(): js.Function3[
        /* req */ IncomingMessage, 
        /* res */ ServerResponse[IncomingMessage], 
        /* next */ js.Function1[/* err */ js.UndefOr[Any], Unit], 
        Unit
      ] = js.native
    def default(options: ReadonlyHelmetOptions): js.Function3[
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
    val contentSecurityPolicy_Original: ContentSecurityPolicy = js.native
    
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
    
    @JSName("default")
    val default_Original: Helmet = js.native
    
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
    
    def hidePoweredBy(): js.Function3[
        /* _req */ IncomingMessage, 
        /* res */ ServerResponse[IncomingMessage], 
        /* next */ js.Function0[Unit], 
        Unit
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
    
    def ieNoOpen(): js.Function3[
        /* _req */ IncomingMessage, 
        /* res */ ServerResponse[IncomingMessage], 
        /* next */ js.Function0[Unit], 
        Unit
      ] = js.native
    
    def noSniff(): js.Function3[
        /* _req */ IncomingMessage, 
        /* res */ ServerResponse[IncomingMessage], 
        /* next */ js.Function0[Unit], 
        Unit
      ] = js.native
    
    def originAgentCluster(): js.Function3[
        /* _req */ IncomingMessage, 
        /* res */ ServerResponse[IncomingMessage], 
        /* next */ js.Function0[Unit], 
        Unit
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
    
    def xssFilter(): js.Function3[
        /* _req */ IncomingMessage, 
        /* res */ ServerResponse[IncomingMessage], 
        /* next */ js.Function0[Unit], 
        Unit
      ] = js.native
  }
}
