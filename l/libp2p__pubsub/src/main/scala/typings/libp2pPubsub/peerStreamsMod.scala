package typings.libp2pPubsub

import typings.libp2pPubsub.distSrcPeerStreamsMod.PeerStreamsInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object peerStreamsMod {
  
  @JSImport("@libp2p/pubsub/peer-streams", "PeerStreams")
  @js.native
  open class PeerStreams protected ()
    extends typings.libp2pPubsub.distSrcPeerStreamsMod.PeerStreams {
    def this(init: PeerStreamsInit) = this()
  }
}
