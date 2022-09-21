package typings.maximMazurokGapiClientDatafusion.gapi.client.datafusion

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DnsPeering extends StObject {
  
  /** Optional. Optional description of the dns zone. */
  var description: js.UndefOr[String] = js.undefined
  
  /** Required. The dns name suffix of the zone. */
  var domain: js.UndefOr[String] = js.undefined
  
  /** Required. The resource name of the dns peering zone. Format: projects/{project}/locations/{location}/instances/{instance}/dnsPeerings/{dns_peering} */
  var name: js.UndefOr[String] = js.undefined
  
  /** Optional. Optional target network to which dns peering should happen. */
  var targetNetwork: js.UndefOr[String] = js.undefined
  
  /** Optional. Optional target project to which dns peering should happen. */
  var targetProject: js.UndefOr[String] = js.undefined
}
object DnsPeering {
  
  inline def apply(): DnsPeering = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DnsPeering]
  }
  
  extension [Self <: DnsPeering](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTargetNetwork(value: String): Self = StObject.set(x, "targetNetwork", value.asInstanceOf[js.Any])
    
    inline def setTargetNetworkUndefined: Self = StObject.set(x, "targetNetwork", js.undefined)
    
    inline def setTargetProject(value: String): Self = StObject.set(x, "targetProject", value.asInstanceOf[js.Any])
    
    inline def setTargetProjectUndefined: Self = StObject.set(x, "targetProject", js.undefined)
  }
}
