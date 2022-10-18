package typings.libp2pDelegatedPeerRouting

import typings.libp2pInterfacePeerId.mod.PeerId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Id extends StObject {
    
    var id: PeerId
    
    var multiaddrs: js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_ipfs-http-client.multiaddr */ Any
      ]
    
    var protocols: js.Array[scala.Nothing]
  }
  object Id {
    
    inline def apply(
      id: PeerId,
      multiaddrs: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_ipfs-http-client.multiaddr */ Any
        ],
      protocols: js.Array[scala.Nothing]
    ): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], multiaddrs = multiaddrs.asInstanceOf[js.Any], protocols = protocols.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    extension [Self <: Id](x: Self) {
      
      inline def setId(value: PeerId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setMultiaddrs(
        value: js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_ipfs-http-client.multiaddr */ Any
            ]
      ): Self = StObject.set(x, "multiaddrs", value.asInstanceOf[js.Any])
      
      inline def setMultiaddrsVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_ipfs-http-client.multiaddr */ Any)*
      ): Self = StObject.set(x, "multiaddrs", js.Array(value*))
      
      inline def setProtocols(value: js.Array[scala.Nothing]): Self = StObject.set(x, "protocols", value.asInstanceOf[js.Any])
      
      inline def setProtocolsVarargs(value: scala.Nothing*): Self = StObject.set(x, "protocols", js.Array(value*))
    }
  }
}
