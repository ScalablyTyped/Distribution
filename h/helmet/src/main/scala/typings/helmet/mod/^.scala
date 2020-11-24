package typings.helmet.mod

import typings.helmet.anon.ReadonlyExpectCtOptions
import typings.helmet.anon.ReadonlyHelmetOptions
import typings.helmet.anon.ReadonlyReferrerPolicyOpt
import typings.helmet.anon.ReadonlyStrictTransportSe
import typings.helmet.anon.ReadonlyXDnsPrefetchContr
import typings.helmet.anon.ReadonlyXFrameOptionsOpti
import typings.helmet.anon.ReadonlyXPermittedCrossDo
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("helmet/dist", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(): js.Function3[
    /* req */ IncomingMessage, 
    /* res */ ServerResponse, 
    /* next */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], 
    Unit
  ] = js.native
  def apply(options: ReadonlyHelmetOptions): js.Function3[
    /* req */ IncomingMessage, 
    /* res */ ServerResponse, 
    /* next */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], 
    Unit
  ] = js.native
  
  var dnsPrefetchControl: js.Function1[
    /* options */ js.UndefOr[ReadonlyXDnsPrefetchContr], 
    js.Function3[
      /* _req */ IncomingMessage, 
      /* res */ ServerResponse, 
      /* next */ js.Function0[Unit], 
      Unit
    ]
  ] = js.native
  
  var expectCt: js.Function1[
    /* options */ js.UndefOr[ReadonlyExpectCtOptions], 
    js.Function3[
      /* _req */ IncomingMessage, 
      /* res */ ServerResponse, 
      /* next */ js.Function0[Unit], 
      Unit
    ]
  ] = js.native
  
  var featurePolicy: js.Function0[scala.Nothing] = js.native
  
  var frameguard: js.Function1[
    /* options */ js.UndefOr[ReadonlyXFrameOptionsOpti], 
    js.Function3[
      /* _req */ IncomingMessage, 
      /* res */ ServerResponse, 
      /* next */ js.Function0[Unit], 
      Unit
    ]
  ] = js.native
  
  var hidePoweredBy: js.Function0[
    js.Function3[
      /* _req */ IncomingMessage, 
      /* res */ ServerResponse, 
      /* next */ js.Function0[Unit], 
      Unit
    ]
  ] = js.native
  
  var hpkp: js.Function0[scala.Nothing] = js.native
  
  var hsts: js.Function1[
    /* options */ js.UndefOr[ReadonlyStrictTransportSe], 
    js.Function3[
      /* _req */ IncomingMessage, 
      /* res */ ServerResponse, 
      /* next */ js.Function0[Unit], 
      Unit
    ]
  ] = js.native
  
  var ieNoOpen: js.Function0[
    js.Function3[
      /* _req */ IncomingMessage, 
      /* res */ ServerResponse, 
      /* next */ js.Function0[Unit], 
      Unit
    ]
  ] = js.native
  
  var noCache: js.Function0[scala.Nothing] = js.native
  
  var noSniff: js.Function0[
    js.Function3[
      /* _req */ IncomingMessage, 
      /* res */ ServerResponse, 
      /* next */ js.Function0[Unit], 
      Unit
    ]
  ] = js.native
  
  var permittedCrossDomainPolicies: js.Function1[
    /* options */ js.UndefOr[ReadonlyXPermittedCrossDo], 
    js.Function3[
      /* _req */ IncomingMessage, 
      /* res */ ServerResponse, 
      /* next */ js.Function0[Unit], 
      Unit
    ]
  ] = js.native
  
  var referrerPolicy: js.Function1[
    /* options */ js.UndefOr[ReadonlyReferrerPolicyOpt], 
    js.Function3[
      /* _req */ IncomingMessage, 
      /* res */ ServerResponse, 
      /* next */ js.Function0[Unit], 
      Unit
    ]
  ] = js.native
  
  var xssFilter: js.Function0[
    js.Function3[
      /* _req */ IncomingMessage, 
      /* res */ ServerResponse, 
      /* next */ js.Function0[Unit], 
      Unit
    ]
  ] = js.native
}
