package typings.ipfsCore.anon

import typings.libp2pNoise.libp2pNoiseMod.Noise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnEncryption extends js.Object {
  
  var connEncryption: js.Array[Noise] = js.native
  
  var dht: js.Any = js.native
  
  var peerDiscovery: js.Array[scala.Nothing] = js.native
  
  var pubsub: TypeofimportedLibp2pGos = js.native
  
  var streamMuxer: js.Array[_] = js.native
  
  var transport: js.Array[_] = js.native
}
object ConnEncryption {
  
  @scala.inline
  def apply(
    connEncryption: js.Array[Noise],
    dht: js.Any,
    peerDiscovery: js.Array[scala.Nothing],
    pubsub: TypeofimportedLibp2pGos,
    streamMuxer: js.Array[_],
    transport: js.Array[_]
  ): ConnEncryption = {
    val __obj = js.Dynamic.literal(connEncryption = connEncryption.asInstanceOf[js.Any], dht = dht.asInstanceOf[js.Any], peerDiscovery = peerDiscovery.asInstanceOf[js.Any], pubsub = pubsub.asInstanceOf[js.Any], streamMuxer = streamMuxer.asInstanceOf[js.Any], transport = transport.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnEncryption]
  }
  
  @scala.inline
  implicit class ConnEncryptionOps[Self <: ConnEncryption] (val x: Self) extends AnyVal {
    
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
    def setConnEncryptionVarargs(value: Noise*): Self = this.set("connEncryption", js.Array(value :_*))
    
    @scala.inline
    def setConnEncryption(value: js.Array[Noise]): Self = this.set("connEncryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDht(value: js.Any): Self = this.set("dht", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeerDiscoveryVarargs(value: scala.Nothing*): Self = this.set("peerDiscovery", js.Array(value :_*))
    
    @scala.inline
    def setPeerDiscovery(value: js.Array[scala.Nothing]): Self = this.set("peerDiscovery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPubsub(value: TypeofimportedLibp2pGos): Self = this.set("pubsub", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamMuxerVarargs(value: js.Any*): Self = this.set("streamMuxer", js.Array(value :_*))
    
    @scala.inline
    def setStreamMuxer(value: js.Array[_]): Self = this.set("streamMuxer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransportVarargs(value: js.Any*): Self = this.set("transport", js.Array(value :_*))
    
    @scala.inline
    def setTransport(value: js.Array[_]): Self = this.set("transport", value.asInstanceOf[js.Any])
  }
}
