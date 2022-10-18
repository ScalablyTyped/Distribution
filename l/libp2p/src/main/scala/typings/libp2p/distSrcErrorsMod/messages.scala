package typings.libp2p.distSrcErrorsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait messages extends StObject
@JSImport("libp2p/dist/src/errors", "messages")
@js.native
object messages extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[messages & String] = js.native
  
  @js.native
  sealed trait CONN_ENCRYPTION_REQUIRED
    extends StObject
       with messages
  /* "At least one connection encryption module is required" */ val CONN_ENCRYPTION_REQUIRED: typings.libp2p.distSrcErrorsMod.messages.CONN_ENCRYPTION_REQUIRED & String = js.native
  
  @js.native
  sealed trait DHT_DISABLED
    extends StObject
       with messages
  /* "DHT is not available" */ val DHT_DISABLED: typings.libp2p.distSrcErrorsMod.messages.DHT_DISABLED & String = js.native
  
  @js.native
  sealed trait ERR_PROTECTOR_REQUIRED
    extends StObject
       with messages
  /* "Private network is enforced, but no protector was provided" */ val ERR_PROTECTOR_REQUIRED: typings.libp2p.distSrcErrorsMod.messages.ERR_PROTECTOR_REQUIRED & String = js.native
  
  @js.native
  sealed trait ERR_TRANSPORTS_REQUIRED
    extends StObject
       with messages
  /* "At least one transport module is required" */ val ERR_TRANSPORTS_REQUIRED: typings.libp2p.distSrcErrorsMod.messages.ERR_TRANSPORTS_REQUIRED & String = js.native
  
  @js.native
  sealed trait NOT_FOUND
    extends StObject
       with messages
  /* "Not found" */ val NOT_FOUND: typings.libp2p.distSrcErrorsMod.messages.NOT_FOUND & String = js.native
  
  @js.native
  sealed trait NOT_STARTED_YET
    extends StObject
       with messages
  /* "The libp2p node is not started yet" */ val NOT_STARTED_YET: typings.libp2p.distSrcErrorsMod.messages.NOT_STARTED_YET & String = js.native
  
  @js.native
  sealed trait PUBSUB_DISABLED
    extends StObject
       with messages
  /* "PubSub is not available" */ val PUBSUB_DISABLED: typings.libp2p.distSrcErrorsMod.messages.PUBSUB_DISABLED & String = js.native
}
