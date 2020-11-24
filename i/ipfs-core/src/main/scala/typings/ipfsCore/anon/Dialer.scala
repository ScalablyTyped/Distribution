package typings.ipfsCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dialer extends js.Object {
  
  var config: PeerDiscovery = js.native
  
  var dialer: DialTimeout = js.native
  
  var metrics: Enabled = js.native
  
  var modules: ConnEncryption = js.native
  
  var peerStore: Persistence = js.native
}
object Dialer {
  
  @scala.inline
  def apply(
    config: PeerDiscovery,
    dialer: DialTimeout,
    metrics: Enabled,
    modules: ConnEncryption,
    peerStore: Persistence
  ): Dialer = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], dialer = dialer.asInstanceOf[js.Any], metrics = metrics.asInstanceOf[js.Any], modules = modules.asInstanceOf[js.Any], peerStore = peerStore.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dialer]
  }
  
  @scala.inline
  implicit class DialerOps[Self <: Dialer] (val x: Self) extends AnyVal {
    
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
    def setConfig(value: PeerDiscovery): Self = this.set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDialer(value: DialTimeout): Self = this.set("dialer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetrics(value: Enabled): Self = this.set("metrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModules(value: ConnEncryption): Self = this.set("modules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeerStore(value: Persistence): Self = this.set("peerStore", value.asInstanceOf[js.Any])
  }
}
