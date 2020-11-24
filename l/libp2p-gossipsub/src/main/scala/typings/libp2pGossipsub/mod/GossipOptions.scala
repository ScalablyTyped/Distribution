package typings.libp2pGossipsub.mod

import typings.libp2pGossipsub.peerScoreParamsMod.PeerScoreParams
import typings.libp2pGossipsub.peerScoreThresholdsMod.PeerScoreThresholds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GossipOptions extends GossipInputOptions {
  
  @JSName("scoreParams")
  var scoreParams_GossipOptions: PeerScoreParams = js.native
  
  @JSName("scoreThresholds")
  var scoreThresholds_GossipOptions: PeerScoreThresholds = js.native
}
