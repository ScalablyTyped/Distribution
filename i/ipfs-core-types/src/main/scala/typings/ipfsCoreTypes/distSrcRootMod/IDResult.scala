package typings.ipfsCoreTypes.distSrcRootMod

import typings.libp2pInterfacePeerId.mod.PeerId
import typings.multiformatsMultiaddr.mod.Multiaddr_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDResult extends StObject {
  
  var addresses: js.Array[Multiaddr_]
  
  var agentVersion: String
  
  var id: PeerId
  
  var protocolVersion: String
  
  var protocols: js.Array[String]
  
  var publicKey: String
}
object IDResult {
  
  inline def apply(
    addresses: js.Array[Multiaddr_],
    agentVersion: String,
    id: PeerId,
    protocolVersion: String,
    protocols: js.Array[String],
    publicKey: String
  ): IDResult = {
    val __obj = js.Dynamic.literal(addresses = addresses.asInstanceOf[js.Any], agentVersion = agentVersion.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], protocolVersion = protocolVersion.asInstanceOf[js.Any], protocols = protocols.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDResult]
  }
  
  extension [Self <: IDResult](x: Self) {
    
    inline def setAddresses(value: js.Array[Multiaddr_]): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
    
    inline def setAddressesVarargs(value: Multiaddr_ *): Self = StObject.set(x, "addresses", js.Array(value*))
    
    inline def setAgentVersion(value: String): Self = StObject.set(x, "agentVersion", value.asInstanceOf[js.Any])
    
    inline def setId(value: PeerId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setProtocolVersion(value: String): Self = StObject.set(x, "protocolVersion", value.asInstanceOf[js.Any])
    
    inline def setProtocols(value: js.Array[String]): Self = StObject.set(x, "protocols", value.asInstanceOf[js.Any])
    
    inline def setProtocolsVarargs(value: String*): Self = StObject.set(x, "protocols", js.Array(value*))
    
    inline def setPublicKey(value: String): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
  }
}
