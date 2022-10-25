package typings.libp2pDelegatedContentRouting.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EventTypes extends StObject
@JSImport("@libp2p/delegated-content-routing", "EventTypes")
@js.native
object EventTypes extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EventTypes & Double] = js.native
  
  @js.native
  sealed trait ADDING_PEER
    extends StObject
       with EventTypes
  /* 6 */ val ADDING_PEER: typings.libp2pDelegatedContentRouting.mod.EventTypes.ADDING_PEER & Double = js.native
  
  @js.native
  sealed trait DIALING_PEER
    extends StObject
       with EventTypes
  /* 7 */ val DIALING_PEER: typings.libp2pDelegatedContentRouting.mod.EventTypes.DIALING_PEER & Double = js.native
  
  @js.native
  sealed trait FINAL_PEER
    extends StObject
       with EventTypes
  /* 2 */ val FINAL_PEER: typings.libp2pDelegatedContentRouting.mod.EventTypes.FINAL_PEER & Double = js.native
  
  @js.native
  sealed trait PEER_RESPONSE
    extends StObject
       with EventTypes
  /* 1 */ val PEER_RESPONSE: typings.libp2pDelegatedContentRouting.mod.EventTypes.PEER_RESPONSE & Double = js.native
  
  @js.native
  sealed trait PROVIDER
    extends StObject
       with EventTypes
  /* 4 */ val PROVIDER: typings.libp2pDelegatedContentRouting.mod.EventTypes.PROVIDER & Double = js.native
  
  @js.native
  sealed trait QUERY_ERROR
    extends StObject
       with EventTypes
  /* 3 */ val QUERY_ERROR: typings.libp2pDelegatedContentRouting.mod.EventTypes.QUERY_ERROR & Double = js.native
  
  @js.native
  sealed trait SENDING_QUERY
    extends StObject
       with EventTypes
  /* 0 */ val SENDING_QUERY: typings.libp2pDelegatedContentRouting.mod.EventTypes.SENDING_QUERY & Double = js.native
  
  @js.native
  sealed trait VALUE
    extends StObject
       with EventTypes
  /* 5 */ val VALUE: typings.libp2pDelegatedContentRouting.mod.EventTypes.VALUE & Double = js.native
}
