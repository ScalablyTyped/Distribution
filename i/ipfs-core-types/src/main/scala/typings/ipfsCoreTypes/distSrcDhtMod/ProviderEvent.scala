package typings.ipfsCoreTypes.distSrcDhtMod

import typings.ipfsCoreTypes.ipfsCoreTypesStrings.PROVIDER
import typings.libp2pInterfacePeerInfo.mod.PeerInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProviderEvent
  extends StObject
     with QueryEvent {
  
  var name: PROVIDER
  
  var providers: js.Array[PeerInfo]
  
  var `type`: typings.ipfsCoreTypes.distSrcDhtMod.EventTypes.PROVIDER
}
object ProviderEvent {
  
  inline def apply(providers: js.Array[PeerInfo], `type`: typings.ipfsCoreTypes.distSrcDhtMod.EventTypes.PROVIDER): ProviderEvent = {
    val __obj = js.Dynamic.literal(name = "PROVIDER", providers = providers.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProviderEvent]
  }
  
  extension [Self <: ProviderEvent](x: Self) {
    
    inline def setName(value: PROVIDER): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProviders(value: js.Array[PeerInfo]): Self = StObject.set(x, "providers", value.asInstanceOf[js.Any])
    
    inline def setProvidersVarargs(value: PeerInfo*): Self = StObject.set(x, "providers", js.Array(value*))
    
    inline def setType(value: typings.ipfsCoreTypes.distSrcDhtMod.EventTypes.PROVIDER): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
