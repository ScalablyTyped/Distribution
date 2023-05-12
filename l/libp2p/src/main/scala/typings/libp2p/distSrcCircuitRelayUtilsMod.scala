package typings.libp2p

import typings.libp2p.distSrcCircuitRelayPbMod.Limit
import typings.libp2pInterfaceConnection.mod.Stream
import typings.multiformats.cidMod.CID
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCircuitRelayUtilsMod {
  
  @JSImport("libp2p/dist/src/circuit-relay/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createLimitedRelay(source: Stream, destination: Stream, abortSignal: AbortSignal): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createLimitedRelay")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], abortSignal.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def createLimitedRelay(source: Stream, destination: Stream, abortSignal: AbortSignal, limit: Limit): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createLimitedRelay")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], abortSignal.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getExpirationMilliseconds(expireTimeSeconds: js.BigInt): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getExpirationMilliseconds")(expireTimeSeconds.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def namespaceToCid(namespace: String): js.Promise[CID[Any, Double, Double, Version]] = ^.asInstanceOf[js.Dynamic].applyDynamic("namespaceToCid")(namespace.asInstanceOf[js.Any]).asInstanceOf[js.Promise[CID[Any, Double, Double, Version]]]
}
