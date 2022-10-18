package typings.libp2pFloodsub

import typings.libp2pFloodsub.distSrcCacheMod.SimpleTimeCache
import typings.libp2pInterfacePubsub.mod.PubSubEvents
import typings.libp2pInterfacePubsub.mod.PubSubInit
import typings.libp2pInterfacePubsub.mod.PubSubRPCMessage
import typings.libp2pPubsub.mod.PubSubBaseProtocol
import typings.uint8arraylist.mod.Uint8ArrayList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@libp2p/floodsub", "FloodSub")
  @js.native
  open class FloodSub () extends PubSubBaseProtocol[PubSubEvents] {
    def this(init: FloodSubInit) = this()
    
    def decodeMessage(bytes: js.typedarray.Uint8Array): PubSubRPCMessage = js.native
    def decodeMessage(bytes: Uint8ArrayList): PubSubRPCMessage = js.native
    
    var seenCache: SimpleTimeCache[Boolean] = js.native
  }
  
  @JSImport("@libp2p/floodsub", "multicodec")
  @js.native
  val multicodec: /* "/floodsub/1.0.0" */ String = js.native
  
  trait FloodSubInit
    extends StObject
       with PubSubInit {
    
    var seenTTL: js.UndefOr[Double] = js.undefined
  }
  object FloodSubInit {
    
    inline def apply(): FloodSubInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FloodSubInit]
    }
    
    extension [Self <: FloodSubInit](x: Self) {
      
      inline def setSeenTTL(value: Double): Self = StObject.set(x, "seenTTL", value.asInstanceOf[js.Any])
      
      inline def setSeenTTLUndefined: Self = StObject.set(x, "seenTTL", js.undefined)
    }
  }
}
