package typings.googleapis.dnsV1beta2Mod.dnsV1beta2

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaManagedZone extends StObject {
  
  var creationTime: js.UndefOr[String] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var dnsName: js.UndefOr[String] = js.undefined
  
  var dnssecConfig: js.UndefOr[SchemaManagedZoneDnsSecConfig] = js.undefined
  
  var forwardingConfig: js.UndefOr[SchemaManagedZoneForwardingConfig] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dns#managedZone&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  var labels: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var nameServerSet: js.UndefOr[String] = js.undefined
  
  var nameServers: js.UndefOr[js.Array[String]] = js.undefined
  
  var peeringConfig: js.UndefOr[SchemaManagedZonePeeringConfig] = js.undefined
  
  var privateVisibilityConfig: js.UndefOr[SchemaManagedZonePrivateVisibilityConfig] = js.undefined
  
  var visibility: js.UndefOr[String] = js.undefined
}
object SchemaManagedZone {
  
  inline def apply(): SchemaManagedZone = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManagedZone]
  }
  
  extension [Self <: SchemaManagedZone](x: Self) {
    
    inline def setCreationTime(value: String): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDnsName(value: String): Self = StObject.set(x, "dnsName", value.asInstanceOf[js.Any])
    
    inline def setDnsNameUndefined: Self = StObject.set(x, "dnsName", js.undefined)
    
    inline def setDnssecConfig(value: SchemaManagedZoneDnsSecConfig): Self = StObject.set(x, "dnssecConfig", value.asInstanceOf[js.Any])
    
    inline def setDnssecConfigUndefined: Self = StObject.set(x, "dnssecConfig", js.undefined)
    
    inline def setForwardingConfig(value: SchemaManagedZoneForwardingConfig): Self = StObject.set(x, "forwardingConfig", value.asInstanceOf[js.Any])
    
    inline def setForwardingConfigUndefined: Self = StObject.set(x, "forwardingConfig", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameServerSet(value: String): Self = StObject.set(x, "nameServerSet", value.asInstanceOf[js.Any])
    
    inline def setNameServerSetUndefined: Self = StObject.set(x, "nameServerSet", js.undefined)
    
    inline def setNameServers(value: js.Array[String]): Self = StObject.set(x, "nameServers", value.asInstanceOf[js.Any])
    
    inline def setNameServersUndefined: Self = StObject.set(x, "nameServers", js.undefined)
    
    inline def setNameServersVarargs(value: String*): Self = StObject.set(x, "nameServers", js.Array(value :_*))
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPeeringConfig(value: SchemaManagedZonePeeringConfig): Self = StObject.set(x, "peeringConfig", value.asInstanceOf[js.Any])
    
    inline def setPeeringConfigUndefined: Self = StObject.set(x, "peeringConfig", js.undefined)
    
    inline def setPrivateVisibilityConfig(value: SchemaManagedZonePrivateVisibilityConfig): Self = StObject.set(x, "privateVisibilityConfig", value.asInstanceOf[js.Any])
    
    inline def setPrivateVisibilityConfigUndefined: Self = StObject.set(x, "privateVisibilityConfig", js.undefined)
    
    inline def setVisibility(value: String): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    inline def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
  }
}
