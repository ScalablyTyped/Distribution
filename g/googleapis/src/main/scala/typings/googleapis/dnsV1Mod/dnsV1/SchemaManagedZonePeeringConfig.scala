package typings.googleapis.dnsV1Mod.dnsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaManagedZonePeeringConfig extends StObject {
  
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The network with which to peer.
    */
  var targetNetwork: js.UndefOr[SchemaManagedZonePeeringConfigTargetNetwork] = js.undefined
}
object SchemaManagedZonePeeringConfig {
  
  inline def apply(): SchemaManagedZonePeeringConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManagedZonePeeringConfig]
  }
  
  extension [Self <: SchemaManagedZonePeeringConfig](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setTargetNetwork(value: SchemaManagedZonePeeringConfigTargetNetwork): Self = StObject.set(x, "targetNetwork", value.asInstanceOf[js.Any])
    
    inline def setTargetNetworkUndefined: Self = StObject.set(x, "targetNetwork", js.undefined)
  }
}
