package typings.ipfsCore.anon

import typings.ipfsCore.configMod.AddressConfig
import typings.ipfsCore.configMod.DatastoreConfig
import typings.ipfsCore.configMod.DiscoveryConfig
import typings.ipfsCore.configMod.IdentityConfig
import typings.ipfsCore.configMod.PubsubConfig
import typings.ipfsCore.configMod.SwarmConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<ipfs-core.ipfs-core/dist/src/components/config.IPFSConfig> */
@js.native
trait PartialIPFSConfig extends js.Object {
  
  var Addresses: js.UndefOr[AddressConfig] = js.native
  
  var Bootstrap: js.UndefOr[js.Array[String]] = js.native
  
  var Datastore: js.UndefOr[DatastoreConfig] = js.native
  
  var Discovery: js.UndefOr[DiscoveryConfig] = js.native
  
  var Identity: js.UndefOr[IdentityConfig] = js.native
  
  var Keychain: js.UndefOr[typings.ipfsCore.configMod.KeychainConfig] = js.native
  
  var Profiles: js.UndefOr[String] = js.native
  
  var Pubsub: js.UndefOr[PubsubConfig] = js.native
  
  var Swarm: js.UndefOr[SwarmConfig] = js.native
}
object PartialIPFSConfig {
  
  @scala.inline
  def apply(): PartialIPFSConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIPFSConfig]
  }
  
  @scala.inline
  implicit class PartialIPFSConfigOps[Self <: PartialIPFSConfig] (val x: Self) extends AnyVal {
    
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
    def deleteAddresses: Self = this.set("Addresses", js.undefined)
    
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
    def setDiscovery(value: DiscoveryConfig): Self = this.set("Discovery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiscovery: Self = this.set("Discovery", js.undefined)
    
    @scala.inline
    def setIdentity(value: IdentityConfig): Self = this.set("Identity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentity: Self = this.set("Identity", js.undefined)
    
    @scala.inline
    def setKeychain(value: typings.ipfsCore.configMod.KeychainConfig): Self = this.set("Keychain", value.asInstanceOf[js.Any])
    
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
