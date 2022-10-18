package typings.libp2pInterfacePeerStore.mod

import typings.libp2pInterfacePeerId.mod.PeerId
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PeerMetadataChangeData extends StObject {
  
  var metadata: Map[String, js.typedarray.Uint8Array]
  
  var oldMetadata: Map[String, js.typedarray.Uint8Array]
  
  var peerId: PeerId
}
object PeerMetadataChangeData {
  
  inline def apply(
    metadata: Map[String, js.typedarray.Uint8Array],
    oldMetadata: Map[String, js.typedarray.Uint8Array],
    peerId: PeerId
  ): PeerMetadataChangeData = {
    val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any], oldMetadata = oldMetadata.asInstanceOf[js.Any], peerId = peerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PeerMetadataChangeData]
  }
  
  extension [Self <: PeerMetadataChangeData](x: Self) {
    
    inline def setMetadata(value: Map[String, js.typedarray.Uint8Array]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setOldMetadata(value: Map[String, js.typedarray.Uint8Array]): Self = StObject.set(x, "oldMetadata", value.asInstanceOf[js.Any])
    
    inline def setPeerId(value: PeerId): Self = StObject.set(x, "peerId", value.asInstanceOf[js.Any])
  }
}
