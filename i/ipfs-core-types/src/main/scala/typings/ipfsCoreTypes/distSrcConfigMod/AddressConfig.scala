package typings.ipfsCoreTypes.distSrcConfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddressConfig extends StObject {
  
  var API: js.UndefOr[String] = js.undefined
  
  var Announce: js.UndefOr[js.Array[String]] = js.undefined
  
  var Delegates: js.UndefOr[js.Array[String]] = js.undefined
  
  var Gateway: js.UndefOr[String] = js.undefined
  
  var NoAnnounce: js.UndefOr[js.Array[String]] = js.undefined
  
  var RPC: js.UndefOr[String] = js.undefined
  
  var Swarm: js.UndefOr[js.Array[String]] = js.undefined
}
object AddressConfig {
  
  inline def apply(): AddressConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddressConfig]
  }
  
  extension [Self <: AddressConfig](x: Self) {
    
    inline def setAPI(value: String): Self = StObject.set(x, "API", value.asInstanceOf[js.Any])
    
    inline def setAPIUndefined: Self = StObject.set(x, "API", js.undefined)
    
    inline def setAnnounce(value: js.Array[String]): Self = StObject.set(x, "Announce", value.asInstanceOf[js.Any])
    
    inline def setAnnounceUndefined: Self = StObject.set(x, "Announce", js.undefined)
    
    inline def setAnnounceVarargs(value: String*): Self = StObject.set(x, "Announce", js.Array(value*))
    
    inline def setDelegates(value: js.Array[String]): Self = StObject.set(x, "Delegates", value.asInstanceOf[js.Any])
    
    inline def setDelegatesUndefined: Self = StObject.set(x, "Delegates", js.undefined)
    
    inline def setDelegatesVarargs(value: String*): Self = StObject.set(x, "Delegates", js.Array(value*))
    
    inline def setGateway(value: String): Self = StObject.set(x, "Gateway", value.asInstanceOf[js.Any])
    
    inline def setGatewayUndefined: Self = StObject.set(x, "Gateway", js.undefined)
    
    inline def setNoAnnounce(value: js.Array[String]): Self = StObject.set(x, "NoAnnounce", value.asInstanceOf[js.Any])
    
    inline def setNoAnnounceUndefined: Self = StObject.set(x, "NoAnnounce", js.undefined)
    
    inline def setNoAnnounceVarargs(value: String*): Self = StObject.set(x, "NoAnnounce", js.Array(value*))
    
    inline def setRPC(value: String): Self = StObject.set(x, "RPC", value.asInstanceOf[js.Any])
    
    inline def setRPCUndefined: Self = StObject.set(x, "RPC", js.undefined)
    
    inline def setSwarm(value: js.Array[String]): Self = StObject.set(x, "Swarm", value.asInstanceOf[js.Any])
    
    inline def setSwarmUndefined: Self = StObject.set(x, "Swarm", js.undefined)
    
    inline def setSwarmVarargs(value: String*): Self = StObject.set(x, "Swarm", js.Array(value*))
  }
}
