package typings.ipfsCore.idMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PeerId extends js.Object {
  
  /**
    * - A list of multiaddrs this node is listening on
    */
  var addresses: js.Array[typings.multiaddr.mod.^] = js.native
  
  /**
    * - The agent version
    */
  var agentVersion: String = js.native
  
  /**
    * - the Peer ID
    */
  var id: String = js.native
  
  /**
    * - The supported protocol version
    */
  var protocolVersion: String = js.native
  
  /**
    * - The supported protocols
    */
  var protocols: js.Array[String] = js.native
  
  /**
    * - the public key of the peer as a base64 encoded string
    */
  var publicKey: String = js.native
}
object PeerId {
  
  @scala.inline
  def apply(
    addresses: js.Array[typings.multiaddr.mod.^],
    agentVersion: String,
    id: String,
    protocolVersion: String,
    protocols: js.Array[String],
    publicKey: String
  ): PeerId = {
    val __obj = js.Dynamic.literal(addresses = addresses.asInstanceOf[js.Any], agentVersion = agentVersion.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], protocolVersion = protocolVersion.asInstanceOf[js.Any], protocols = protocols.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PeerId]
  }
  
  @scala.inline
  implicit class PeerIdOps[Self <: PeerId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddressesVarargs(value: typings.multiaddr.mod.^ *): Self = this.set("addresses", js.Array(value :_*))
    
    @scala.inline
    def setAddresses(value: js.Array[typings.multiaddr.mod.^]): Self = this.set("addresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgentVersion(value: String): Self = this.set("agentVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolVersion(value: String): Self = this.set("protocolVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolsVarargs(value: String*): Self = this.set("protocols", js.Array(value :_*))
    
    @scala.inline
    def setProtocols(value: js.Array[String]): Self = this.set("protocols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicKey(value: String): Self = this.set("publicKey", value.asInstanceOf[js.Any])
  }
}
