package typings.googleapis.managedidentitiesV1Mod.managedidentitiesV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPeering extends StObject {
  
  /**
    * Required. The full names of the Google Compute Engine [networks](/compute/docs/networks-and-firewalls#networks) to which the instance is connected. Caller needs to make sure that CIDR subnets do not overlap between networks, else peering creation will fail.
    */
  var authorizedNetwork: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The time the instance was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Full domain resource path for the Managed AD Domain involved in peering. The resource path should be in the form: `projects/{project_id\}/locations/global/domains/{domain_name\}`
    */
  var domainResource: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Resource labels to represent user-provided metadata.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Output only. Unique name of the peering in this scope including projects and location using the form: `projects/{project_id\}/locations/global/peerings/{peering_id\}`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The current state of this Peering.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Additional information about the current status of this peering, if available.
    */
  var statusMessage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Last update time.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaPeering {
  
  inline def apply(): SchemaPeering = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPeering]
  }
  
  extension [Self <: SchemaPeering](x: Self) {
    
    inline def setAuthorizedNetwork(value: String): Self = StObject.set(x, "authorizedNetwork", value.asInstanceOf[js.Any])
    
    inline def setAuthorizedNetworkNull: Self = StObject.set(x, "authorizedNetwork", null)
    
    inline def setAuthorizedNetworkUndefined: Self = StObject.set(x, "authorizedNetwork", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDomainResource(value: String): Self = StObject.set(x, "domainResource", value.asInstanceOf[js.Any])
    
    inline def setDomainResourceNull: Self = StObject.set(x, "domainResource", null)
    
    inline def setDomainResourceUndefined: Self = StObject.set(x, "domainResource", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageNull: Self = StObject.set(x, "statusMessage", null)
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
