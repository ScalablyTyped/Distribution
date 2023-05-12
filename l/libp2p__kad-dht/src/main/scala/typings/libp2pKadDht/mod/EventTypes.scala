package typings.libp2pKadDht.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EventTypes extends StObject
@JSImport("@libp2p/kad-dht", "EventTypes")
@js.native
object EventTypes extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EventTypes & Double] = js.native
  
  @js.native
  sealed trait ADD_PEER
    extends StObject
       with EventTypes
  /* 6 */ val ADD_PEER: typings.libp2pKadDht.mod.EventTypes.ADD_PEER & Double = js.native
  
  @js.native
  sealed trait DIAL_PEER
    extends StObject
       with EventTypes
  /* 7 */ val DIAL_PEER: typings.libp2pKadDht.mod.EventTypes.DIAL_PEER & Double = js.native
  
  @js.native
  sealed trait FINAL_PEER
    extends StObject
       with EventTypes
  /* 2 */ val FINAL_PEER: typings.libp2pKadDht.mod.EventTypes.FINAL_PEER & Double = js.native
  
  @js.native
  sealed trait PEER_RESPONSE
    extends StObject
       with EventTypes
  /* 1 */ val PEER_RESPONSE: typings.libp2pKadDht.mod.EventTypes.PEER_RESPONSE & Double = js.native
  
  @js.native
  sealed trait PROVIDER
    extends StObject
       with EventTypes
  /* 4 */ val PROVIDER: typings.libp2pKadDht.mod.EventTypes.PROVIDER & Double = js.native
  
  @js.native
  sealed trait QUERY_ERROR
    extends StObject
       with EventTypes
  /* 3 */ val QUERY_ERROR: typings.libp2pKadDht.mod.EventTypes.QUERY_ERROR & Double = js.native
  
  @js.native
  sealed trait SEND_QUERY
    extends StObject
       with EventTypes
  /* 0 */ val SEND_QUERY: typings.libp2pKadDht.mod.EventTypes.SEND_QUERY & Double = js.native
  
  @js.native
  sealed trait VALUE
    extends StObject
       with EventTypes
  /* 5 */ val VALUE: typings.libp2pKadDht.mod.EventTypes.VALUE & Double = js.native
}
