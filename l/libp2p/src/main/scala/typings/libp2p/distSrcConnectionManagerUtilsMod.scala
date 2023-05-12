package typings.libp2p

import typings.anySignal.mod.ClearableSignal
import typings.multiformatsMultiaddr.mod.AbortOptions
import typings.multiformatsMultiaddr.mod.Multiaddr_
import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcConnectionManagerUtilsMod {
  
  @JSImport("libp2p/dist/src/connection-manager/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def combineSignals(signals: js.UndefOr[AbortSignal]*): ClearableSignal = ^.asInstanceOf[js.Dynamic].applyDynamic("combineSignals")(signals.asInstanceOf[Seq[js.Any]]*).asInstanceOf[ClearableSignal]
  
  inline def resolveMultiaddrs(ma: Multiaddr_, options: AbortOptions): js.Promise[js.Array[Multiaddr_]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveMultiaddrs")(ma.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Multiaddr_]]]
}
