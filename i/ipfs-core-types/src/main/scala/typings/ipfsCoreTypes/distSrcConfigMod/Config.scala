package typings.ipfsCoreTypes.distSrcConfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Config extends StObject {
  
  var API: js.UndefOr[APIConfig] = js.undefined
  
  var Addresses: js.UndefOr[AddressConfig] = js.undefined
  
  var Bootstrap: js.UndefOr[js.Array[String]] = js.undefined
  
  var Datastore: js.UndefOr[DatastoreConfig] = js.undefined
  
  var Discovery: js.UndefOr[DiscoveryConfig] = js.undefined
  
  var Identity: js.UndefOr[IdentityConfig] = js.undefined
  
  var Keychain: js.UndefOr[KeychainConfig] = js.undefined
  
  var Profiles: js.UndefOr[String] = js.undefined
  
  var Pubsub: js.UndefOr[PubsubConfig] = js.undefined
  
  var Routing: js.UndefOr[RoutingConfig] = js.undefined
  
  var Swarm: js.UndefOr[SwarmConfig] = js.undefined
}
object Config {
  
  inline def apply(): Config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config]
  }
  
  extension [Self <: Config](x: Self) {
    
    inline def setAPI(value: APIConfig): Self = StObject.set(x, "API", value.asInstanceOf[js.Any])
    
    inline def setAPIUndefined: Self = StObject.set(x, "API", js.undefined)
    
    inline def setAddresses(value: AddressConfig): Self = StObject.set(x, "Addresses", value.asInstanceOf[js.Any])
    
    inline def setAddressesUndefined: Self = StObject.set(x, "Addresses", js.undefined)
    
    inline def setBootstrap(value: js.Array[String]): Self = StObject.set(x, "Bootstrap", value.asInstanceOf[js.Any])
    
    inline def setBootstrapUndefined: Self = StObject.set(x, "Bootstrap", js.undefined)
    
    inline def setBootstrapVarargs(value: String*): Self = StObject.set(x, "Bootstrap", js.Array(value*))
    
    inline def setDatastore(value: DatastoreConfig): Self = StObject.set(x, "Datastore", value.asInstanceOf[js.Any])
    
    inline def setDatastoreUndefined: Self = StObject.set(x, "Datastore", js.undefined)
    
    inline def setDiscovery(value: DiscoveryConfig): Self = StObject.set(x, "Discovery", value.asInstanceOf[js.Any])
    
    inline def setDiscoveryUndefined: Self = StObject.set(x, "Discovery", js.undefined)
    
    inline def setIdentity(value: IdentityConfig): Self = StObject.set(x, "Identity", value.asInstanceOf[js.Any])
    
    inline def setIdentityUndefined: Self = StObject.set(x, "Identity", js.undefined)
    
    inline def setKeychain(value: KeychainConfig): Self = StObject.set(x, "Keychain", value.asInstanceOf[js.Any])
    
    inline def setKeychainUndefined: Self = StObject.set(x, "Keychain", js.undefined)
    
    inline def setProfiles(value: String): Self = StObject.set(x, "Profiles", value.asInstanceOf[js.Any])
    
    inline def setProfilesUndefined: Self = StObject.set(x, "Profiles", js.undefined)
    
    inline def setPubsub(value: PubsubConfig): Self = StObject.set(x, "Pubsub", value.asInstanceOf[js.Any])
    
    inline def setPubsubUndefined: Self = StObject.set(x, "Pubsub", js.undefined)
    
    inline def setRouting(value: RoutingConfig): Self = StObject.set(x, "Routing", value.asInstanceOf[js.Any])
    
    inline def setRoutingUndefined: Self = StObject.set(x, "Routing", js.undefined)
    
    inline def setSwarm(value: SwarmConfig): Self = StObject.set(x, "Swarm", value.asInstanceOf[js.Any])
    
    inline def setSwarmUndefined: Self = StObject.set(x, "Swarm", js.undefined)
  }
}
