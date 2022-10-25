package typings.libp2pKadDht

import typings.interfaceDatastore.mod.Datastore
import typings.libp2pInterfaceDht.mod.Validators
import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pKadDht.distSrcMessageMod.Message
import typings.libp2pKadDht.distSrcRpcMod.DHTMessageHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcRpcHandlersPutValueMod {
  
  @JSImport("@libp2p/kad-dht/dist/src/rpc/handlers/put-value", "PutValueHandler")
  @js.native
  open class PutValueHandler protected ()
    extends StObject
       with DHTMessageHandler {
    def this(components: PutValueHandlerComponents, init: PutValueHandlerInit) = this()
    
    /* private */ val components: Any = js.native
    
    /* CompleteClass */
    override def handle(peerId: PeerId, msg: Message): js.Promise[js.UndefOr[Message]] = js.native
    
    /* private */ val log: Any = js.native
    
    /* private */ val validators: Any = js.native
  }
  
  trait PutValueHandlerComponents extends StObject {
    
    var datastore: Datastore
  }
  object PutValueHandlerComponents {
    
    inline def apply(datastore: Datastore): PutValueHandlerComponents = {
      val __obj = js.Dynamic.literal(datastore = datastore.asInstanceOf[js.Any])
      __obj.asInstanceOf[PutValueHandlerComponents]
    }
    
    extension [Self <: PutValueHandlerComponents](x: Self) {
      
      inline def setDatastore(value: Datastore): Self = StObject.set(x, "datastore", value.asInstanceOf[js.Any])
    }
  }
  
  trait PutValueHandlerInit extends StObject {
    
    var validators: Validators
  }
  object PutValueHandlerInit {
    
    inline def apply(validators: Validators): PutValueHandlerInit = {
      val __obj = js.Dynamic.literal(validators = validators.asInstanceOf[js.Any])
      __obj.asInstanceOf[PutValueHandlerInit]
    }
    
    extension [Self <: PutValueHandlerInit](x: Self) {
      
      inline def setValidators(value: Validators): Self = StObject.set(x, "validators", value.asInstanceOf[js.Any])
    }
  }
}
