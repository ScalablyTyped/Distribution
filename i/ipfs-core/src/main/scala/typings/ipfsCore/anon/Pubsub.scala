package typings.ipfsCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pubsub extends js.Object {
  
  var Addresses: Delegates = js.native
  
  var Bootstrap: js.Array[String] = js.native
  
  var Discovery: MDNS = js.native
  
  var Pubsub: Router = js.native
  
  var Routing: Type = js.native
  
  var Swarm: ConnMgr = js.native
}
object Pubsub {
  
  @scala.inline
  def apply(
    Addresses: Delegates,
    Bootstrap: js.Array[String],
    Discovery: MDNS,
    Pubsub: Router,
    Routing: Type,
    Swarm: ConnMgr
  ): Pubsub = {
    val __obj = js.Dynamic.literal(Addresses = Addresses.asInstanceOf[js.Any], Bootstrap = Bootstrap.asInstanceOf[js.Any], Discovery = Discovery.asInstanceOf[js.Any], Pubsub = Pubsub.asInstanceOf[js.Any], Routing = Routing.asInstanceOf[js.Any], Swarm = Swarm.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pubsub]
  }
  
  @scala.inline
  implicit class PubsubOps[Self <: Pubsub] (val x: Self) extends AnyVal {
    
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
    def setAddresses(value: Delegates): Self = this.set("Addresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBootstrapVarargs(value: String*): Self = this.set("Bootstrap", js.Array(value :_*))
    
    @scala.inline
    def setBootstrap(value: js.Array[String]): Self = this.set("Bootstrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiscovery(value: MDNS): Self = this.set("Discovery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPubsub(value: Router): Self = this.set("Pubsub", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouting(value: Type): Self = this.set("Routing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwarm(value: ConnMgr): Self = this.set("Swarm", value.asInstanceOf[js.Any])
  }
}
