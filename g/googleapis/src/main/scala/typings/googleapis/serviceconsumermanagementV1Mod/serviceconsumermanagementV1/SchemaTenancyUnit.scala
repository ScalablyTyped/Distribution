package typings.googleapis.serviceconsumermanagementV1Mod.serviceconsumermanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Representation of a tenancy unit.
  */
trait SchemaTenancyUnit extends StObject {
  
  /**
    * @OutputOnly Cloud resource name of the consumer of this service. For
    * example &#39;projects/123456&#39;.
    */
  var consumer: js.UndefOr[String] = js.undefined
  
  /**
    * @OutputOnly The time this tenancy unit was created.
    */
  var createTime: js.UndefOr[String] = js.undefined
  
  /**
    * Globally unique identifier of this tenancy unit
    * &quot;services/{service}/{collection id}/{resource
    * id}/tenancyUnits/{unit}&quot;
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. Google Cloud API name of the managed service owning this
    * tenancy unit. For example
    * &#39;serviceconsumermanagement.googleapis.com&#39;.
    */
  var service: js.UndefOr[String] = js.undefined
  
  /**
    * Resources constituting the tenancy unit. There can be at most 512 tenant
    * resources in a tenancy unit.
    */
  var tenantResources: js.UndefOr[js.Array[SchemaTenantResource]] = js.undefined
}
object SchemaTenancyUnit {
  
  @scala.inline
  def apply(): SchemaTenancyUnit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTenancyUnit]
  }
  
  @scala.inline
  implicit class SchemaTenancyUnitMutableBuilder[Self <: SchemaTenancyUnit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConsumer(value: String): Self = StObject.set(x, "consumer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsumerUndefined: Self = StObject.set(x, "consumer", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
    
    @scala.inline
    def setTenantResources(value: js.Array[SchemaTenantResource]): Self = StObject.set(x, "tenantResources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTenantResourcesUndefined: Self = StObject.set(x, "tenantResources", js.undefined)
    
    @scala.inline
    def setTenantResourcesVarargs(value: SchemaTenantResource*): Self = StObject.set(x, "tenantResources", js.Array(value :_*))
  }
}
