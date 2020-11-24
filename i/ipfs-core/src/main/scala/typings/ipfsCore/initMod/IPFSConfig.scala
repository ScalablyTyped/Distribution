package typings.ipfsCore.initMod

import typings.ipfsCore.configMod.AddressConfig
import typings.ipfsCore.configMod.DatastoreConfig
import typings.ipfsCore.configMod.DiscoveryConfig
import typings.ipfsCore.configMod.IdentityConfig
import typings.ipfsCore.configMod.KeychainConfig
import typings.ipfsCore.configMod.PubsubConfig
import typings.ipfsCore.configMod.SwarmConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPFSConfig extends js.Object {
  
  var Addresses: AddressConfig = js.native
  
  var Bootstrap: js.UndefOr[js.Array[String]] = js.native
  
  var Datastore: js.UndefOr[DatastoreConfig] = js.native
  
  var Discovery: DiscoveryConfig = js.native
  
  var Identity: js.UndefOr[IdentityConfig] = js.native
  
  var Keychain: js.UndefOr[KeychainConfig] = js.native
  
  var Profiles: js.UndefOr[String] = js.native
  
  var Pubsub: js.UndefOr[PubsubConfig] = js.native
  
  var Swarm: js.UndefOr[SwarmConfig] = js.native
}
object IPFSConfig {
  
  @scala.inline
  def apply(Addresses: AddressConfig, Discovery: DiscoveryConfig): IPFSConfig = {
    val __obj = js.Dynamic.literal(Addresses = Addresses.asInstanceOf[js.Any], Discovery = Discovery.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPFSConfig]
  }
  
  @scala.inline
  implicit class IPFSConfigOps[Self <: IPFSConfig] (val x: Self) extends AnyVal {
    
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
    def setAddresses(value: AddressConfig): Self = this.set("Addresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiscovery(value: DiscoveryConfig): Self = this.set("Discovery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBootstrapVarargs(value: String*): Self = this.set("Bootstrap", js.Array(value :_*))
    
    @scala.inline
    def setBootstrap(value: js.Array[String]): Self = this.set("Bootstrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBootstrap: Self = this.set("Bootstrap", js.undefined)
    
    @scala.inline
    def setDatastore(value: DatastoreConfig): Self = this.set("Datastore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatastore: Self = this.set("Datastore", js.undefined)
    
    @scala.inline
    def setIdentity(value: IdentityConfig): Self = this.set("Identity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentity: Self = this.set("Identity", js.undefined)
    
    @scala.inline
    def setKeychain(value: KeychainConfig): Self = this.set("Keychain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeychain: Self = this.set("Keychain", js.undefined)
    
    @scala.inline
    def setProfiles(value: String): Self = this.set("Profiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProfiles: Self = this.set("Profiles", js.undefined)
    
    @scala.inline
    def setPubsub(value: PubsubConfig): Self = this.set("Pubsub", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePubsub: Self = this.set("Pubsub", js.undefined)
    
    @scala.inline
    def setSwarm(value: SwarmConfig): Self = this.set("Swarm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSwarm: Self = this.set("Swarm", js.undefined)
  }
}
