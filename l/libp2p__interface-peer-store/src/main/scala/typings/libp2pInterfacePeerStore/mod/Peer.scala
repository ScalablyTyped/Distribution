package typings.libp2pInterfacePeerStore.mod

import typings.libp2pInterfacePeerId.mod.PeerId
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Peer extends StObject {
  
  /**
    * Peer's addresses containing its multiaddrs and metadata
    */
  var addresses: js.Array[Address]
  
  /**
    * Peer's peer-id instance
    */
  var id: PeerId
  
  /**
    * Peer's metadata map
    */
  var metadata: Map[String, js.typedarray.Uint8Array]
  
  /**
    * The last peer record envelope received
    */
  var peerRecordEnvelope: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
  
  /**
    * Peer's supported protocols
    */
  var protocols: js.Array[String]
  
  /**
    * May be set if the key that this Peer has is an RSA key
    */
  var pubKey: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
}
object Peer {
  
  inline def apply(
    addresses: js.Array[Address],
    id: PeerId,
    metadata: Map[String, js.typedarray.Uint8Array],
    protocols: js.Array[String]
  ): Peer = {
    val __obj = js.Dynamic.literal(addresses = addresses.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], protocols = protocols.asInstanceOf[js.Any])
    __obj.asInstanceOf[Peer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Peer] (val x: Self) extends AnyVal {
    
    inline def setAddresses(value: js.Array[Address]): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
    
    inline def setAddressesVarargs(value: Address*): Self = StObject.set(x, "addresses", js.Array(value*))
    
    inline def setId(value: PeerId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: Map[String, js.typedarray.Uint8Array]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setPeerRecordEnvelope(value: js.typedarray.Uint8Array): Self = StObject.set(x, "peerRecordEnvelope", value.asInstanceOf[js.Any])
    
    inline def setPeerRecordEnvelopeUndefined: Self = StObject.set(x, "peerRecordEnvelope", js.undefined)
    
    inline def setProtocols(value: js.Array[String]): Self = StObject.set(x, "protocols", value.asInstanceOf[js.Any])
    
    inline def setProtocolsVarargs(value: String*): Self = StObject.set(x, "protocols", js.Array(value*))
    
    inline def setPubKey(value: js.typedarray.Uint8Array): Self = StObject.set(x, "pubKey", value.asInstanceOf[js.Any])
    
    inline def setPubKeyUndefined: Self = StObject.set(x, "pubKey", js.undefined)
  }
}
