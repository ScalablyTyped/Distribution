package typings.libp2p

import typings.libp2p.distSrcPingMod.PingServiceComponents
import typings.libp2p.distSrcPingMod.PingServiceInit
import typings.libp2p.distSrcPingMod.PingService_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object pingMod {
  
  @JSImport("libp2p/ping", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def pingService(): js.Function1[/* components */ PingServiceComponents, PingService_] = ^.asInstanceOf[js.Dynamic].applyDynamic("pingService")().asInstanceOf[js.Function1[/* components */ PingServiceComponents, PingService_]]
  inline def pingService(init: PingServiceInit): js.Function1[/* components */ PingServiceComponents, PingService_] = ^.asInstanceOf[js.Dynamic].applyDynamic("pingService")(init.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* components */ PingServiceComponents, PingService_]]
}
