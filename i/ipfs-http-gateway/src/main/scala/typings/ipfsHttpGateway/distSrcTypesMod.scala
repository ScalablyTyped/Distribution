package typings.ipfsHttpGateway

import typings.hapiHapi.libTypesServerOptionsMod.ServerOptions
import typings.hapiHapi.mod.Server_
import typings.ipfsCoreTypes.mod.IPFS
import typings.multiformatsMultiaddr.mod.Multiaddr_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTypesMod {
  
  @JSImport("ipfs-http-gateway/dist/src/types", "Server")
  @js.native
  /**
    * Creates a new server object
    * @param options server configuration object.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-serveroptions)
    */
  open class Server[A] () extends Server_[A] {
    def this(options: ServerOptions) = this()
  }
  
  /* augmented module */
  object hapiHapiAugmentingMod {
    
    trait ServerApplicationState extends StObject {
      
      var ipfs: IPFS[js.Object]
    }
    object ServerApplicationState {
      
      inline def apply(ipfs: IPFS[js.Object]): ServerApplicationState = {
        val __obj = js.Dynamic.literal(ipfs = ipfs.asInstanceOf[js.Any])
        __obj.asInstanceOf[ServerApplicationState]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ServerApplicationState] (val x: Self) extends AnyVal {
        
        inline def setIpfs(value: IPFS[js.Object]): Self = StObject.set(x, "ipfs", value.asInstanceOf[js.Any])
      }
    }
    
    trait ServerInfo extends StObject {
      
      var ma: Multiaddr_
    }
    object ServerInfo {
      
      inline def apply(ma: Multiaddr_): ServerInfo = {
        val __obj = js.Dynamic.literal(ma = ma.asInstanceOf[js.Any])
        __obj.asInstanceOf[ServerInfo]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ServerInfo] (val x: Self) extends AnyVal {
        
        inline def setMa(value: Multiaddr_): Self = StObject.set(x, "ma", value.asInstanceOf[js.Any])
      }
    }
  }
}
