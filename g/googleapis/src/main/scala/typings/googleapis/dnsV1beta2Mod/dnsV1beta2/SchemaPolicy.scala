package typings.googleapis.dnsV1beta2Mod.dnsV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPolicy extends StObject {
  
  var alternativeNameServerConfig: js.UndefOr[SchemaPolicyAlternativeNameServerConfig] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var enableInboundForwarding: js.UndefOr[Boolean] = js.undefined
  
  var enableLogging: js.UndefOr[Boolean] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dns#policy&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var networks: js.UndefOr[js.Array[SchemaPolicyNetwork]] = js.undefined
}
object SchemaPolicy {
  
  inline def apply(): SchemaPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPolicy]
  }
  
  extension [Self <: SchemaPolicy](x: Self) {
    
    inline def setAlternativeNameServerConfig(value: SchemaPolicyAlternativeNameServerConfig): Self = StObject.set(x, "alternativeNameServerConfig", value.asInstanceOf[js.Any])
    
    inline def setAlternativeNameServerConfigUndefined: Self = StObject.set(x, "alternativeNameServerConfig", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEnableInboundForwarding(value: Boolean): Self = StObject.set(x, "enableInboundForwarding", value.asInstanceOf[js.Any])
    
    inline def setEnableInboundForwardingUndefined: Self = StObject.set(x, "enableInboundForwarding", js.undefined)
    
    inline def setEnableLogging(value: Boolean): Self = StObject.set(x, "enableLogging", value.asInstanceOf[js.Any])
    
    inline def setEnableLoggingUndefined: Self = StObject.set(x, "enableLogging", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNetworks(value: js.Array[SchemaPolicyNetwork]): Self = StObject.set(x, "networks", value.asInstanceOf[js.Any])
    
    inline def setNetworksUndefined: Self = StObject.set(x, "networks", js.undefined)
    
    inline def setNetworksVarargs(value: SchemaPolicyNetwork*): Self = StObject.set(x, "networks", js.Array(value :_*))
  }
}
