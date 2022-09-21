package typings.googleapis.serviceconsumermanagementV1Mod.serviceconsumermanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTenancyUnit extends StObject {
  
  /**
    * Output only. @OutputOnly Cloud resource name of the consumer of this service. For example 'projects/123456'.
    */
  var consumer: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. @OutputOnly The time this tenancy unit was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Globally unique identifier of this tenancy unit "services/{service\}/{collection id\}/{resource id\}/tenancyUnits/{unit\}"
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Google Cloud API name of the managed service owning this tenancy unit. For example 'serviceconsumermanagement.googleapis.com'.
    */
  var service: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Resources constituting the tenancy unit. There can be at most 512 tenant resources in a tenancy unit.
    */
  var tenantResources: js.UndefOr[js.Array[SchemaTenantResource]] = js.undefined
}
object SchemaTenancyUnit {
  
  inline def apply(): SchemaTenancyUnit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTenancyUnit]
  }
  
  extension [Self <: SchemaTenancyUnit](x: Self) {
    
    inline def setConsumer(value: String): Self = StObject.set(x, "consumer", value.asInstanceOf[js.Any])
    
    inline def setConsumerNull: Self = StObject.set(x, "consumer", null)
    
    inline def setConsumerUndefined: Self = StObject.set(x, "consumer", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setServiceNull: Self = StObject.set(x, "service", null)
    
    inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
    
    inline def setTenantResources(value: js.Array[SchemaTenantResource]): Self = StObject.set(x, "tenantResources", value.asInstanceOf[js.Any])
    
    inline def setTenantResourcesUndefined: Self = StObject.set(x, "tenantResources", js.undefined)
    
    inline def setTenantResourcesVarargs(value: SchemaTenantResource*): Self = StObject.set(x, "tenantResources", js.Array(value*))
  }
}
