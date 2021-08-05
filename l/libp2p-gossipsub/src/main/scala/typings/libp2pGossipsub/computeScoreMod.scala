package typings.libp2pGossipsub

import typings.libp2pGossipsub.peerScoreParamsMod.PeerScoreParams
import typings.libp2pGossipsub.peerStatsMod.PeerStats
import typings.std.Map
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object computeScoreMod {
  
  @JSImport("libp2p-gossipsub/src/score/compute-score", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def computeScore(peer: String, pstats: PeerStats, params: PeerScoreParams, peerIPs: Map[String, Set[String]]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("computeScore")(peer.asInstanceOf[js.Any], pstats.asInstanceOf[js.Any], params.asInstanceOf[js.Any], peerIPs.asInstanceOf[js.Any])).asInstanceOf[Double]
}
