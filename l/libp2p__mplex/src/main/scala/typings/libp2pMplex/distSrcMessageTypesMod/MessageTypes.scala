package typings.libp2pMplex.distSrcMessageTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MessageTypes extends StObject
@JSImport("@libp2p/mplex/dist/src/message-types", "MessageTypes")
@js.native
object MessageTypes extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MessageTypes & Double] = js.native
  
  @js.native
  sealed trait CLOSE_INITIATOR
    extends StObject
       with MessageTypes
  /* 4 */ val CLOSE_INITIATOR: typings.libp2pMplex.distSrcMessageTypesMod.MessageTypes.CLOSE_INITIATOR & Double = js.native
  
  @js.native
  sealed trait CLOSE_RECEIVER
    extends StObject
       with MessageTypes
  /* 3 */ val CLOSE_RECEIVER: typings.libp2pMplex.distSrcMessageTypesMod.MessageTypes.CLOSE_RECEIVER & Double = js.native
  
  @js.native
  sealed trait MESSAGE_INITIATOR
    extends StObject
       with MessageTypes
  /* 2 */ val MESSAGE_INITIATOR: typings.libp2pMplex.distSrcMessageTypesMod.MessageTypes.MESSAGE_INITIATOR & Double = js.native
  
  @js.native
  sealed trait MESSAGE_RECEIVER
    extends StObject
       with MessageTypes
  /* 1 */ val MESSAGE_RECEIVER: typings.libp2pMplex.distSrcMessageTypesMod.MessageTypes.MESSAGE_RECEIVER & Double = js.native
  
  @js.native
  sealed trait NEW_STREAM
    extends StObject
       with MessageTypes
  /* 0 */ val NEW_STREAM: typings.libp2pMplex.distSrcMessageTypesMod.MessageTypes.NEW_STREAM & Double = js.native
  
  @js.native
  sealed trait RESET_INITIATOR
    extends StObject
       with MessageTypes
  /* 6 */ val RESET_INITIATOR: typings.libp2pMplex.distSrcMessageTypesMod.MessageTypes.RESET_INITIATOR & Double = js.native
  
  @js.native
  sealed trait RESET_RECEIVER
    extends StObject
       with MessageTypes
  /* 5 */ val RESET_RECEIVER: typings.libp2pMplex.distSrcMessageTypesMod.MessageTypes.RESET_RECEIVER & Double = js.native
}
