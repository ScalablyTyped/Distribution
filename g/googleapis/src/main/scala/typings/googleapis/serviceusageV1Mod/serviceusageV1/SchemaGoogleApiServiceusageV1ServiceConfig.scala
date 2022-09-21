package typings.googleapis.serviceusageV1Mod.serviceusageV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleApiServiceusageV1ServiceConfig extends StObject {
  
  /**
    * A list of API interfaces exported by this service. Contains only the names, versions, and method names of the interfaces.
    */
  var apis: js.UndefOr[js.Array[SchemaApi]] = js.undefined
  
  /**
    * Auth configuration. Contains only the OAuth rules.
    */
  var authentication: js.UndefOr[SchemaAuthentication] = js.undefined
  
  /**
    * Additional API documentation. Contains only the summary and the documentation URL.
    */
  var documentation: js.UndefOr[SchemaDocumentation] = js.undefined
  
  /**
    * Configuration for network endpoints. Contains only the names and aliases of the endpoints.
    */
  var endpoints: js.UndefOr[js.Array[SchemaEndpoint]] = js.undefined
  
  /**
    * Defines the monitored resources used by this service. This is required by the Service.monitoring and Service.logging configurations.
    */
  var monitoredResources: js.UndefOr[js.Array[SchemaMonitoredResourceDescriptor]] = js.undefined
  
  /**
    * Monitoring configuration. This should not include the 'producer_destinations' field.
    */
  var monitoring: js.UndefOr[SchemaMonitoring] = js.undefined
  
  /**
    * The DNS address at which this service is available. An example DNS address would be: `calendar.googleapis.com`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Quota configuration.
    */
  var quota: js.UndefOr[SchemaQuota] = js.undefined
  
  /**
    * The product title for this service.
    */
  var title: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Configuration controlling usage of this service.
    */
  var usage: js.UndefOr[SchemaUsage] = js.undefined
}
object SchemaGoogleApiServiceusageV1ServiceConfig {
  
  inline def apply(): SchemaGoogleApiServiceusageV1ServiceConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleApiServiceusageV1ServiceConfig]
  }
  
  extension [Self <: SchemaGoogleApiServiceusageV1ServiceConfig](x: Self) {
    
    inline def setApis(value: js.Array[SchemaApi]): Self = StObject.set(x, "apis", value.asInstanceOf[js.Any])
    
    inline def setApisUndefined: Self = StObject.set(x, "apis", js.undefined)
    
    inline def setApisVarargs(value: SchemaApi*): Self = StObject.set(x, "apis", js.Array(value*))
    
    inline def setAuthentication(value: SchemaAuthentication): Self = StObject.set(x, "authentication", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationUndefined: Self = StObject.set(x, "authentication", js.undefined)
    
    inline def setDocumentation(value: SchemaDocumentation): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
    
    inline def setDocumentationUndefined: Self = StObject.set(x, "documentation", js.undefined)
    
    inline def setEndpoints(value: js.Array[SchemaEndpoint]): Self = StObject.set(x, "endpoints", value.asInstanceOf[js.Any])
    
    inline def setEndpointsUndefined: Self = StObject.set(x, "endpoints", js.undefined)
    
    inline def setEndpointsVarargs(value: SchemaEndpoint*): Self = StObject.set(x, "endpoints", js.Array(value*))
    
    inline def setMonitoredResources(value: js.Array[SchemaMonitoredResourceDescriptor]): Self = StObject.set(x, "monitoredResources", value.asInstanceOf[js.Any])
    
    inline def setMonitoredResourcesUndefined: Self = StObject.set(x, "monitoredResources", js.undefined)
    
    inline def setMonitoredResourcesVarargs(value: SchemaMonitoredResourceDescriptor*): Self = StObject.set(x, "monitoredResources", js.Array(value*))
    
    inline def setMonitoring(value: SchemaMonitoring): Self = StObject.set(x, "monitoring", value.asInstanceOf[js.Any])
    
    inline def setMonitoringUndefined: Self = StObject.set(x, "monitoring", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setQuota(value: SchemaQuota): Self = StObject.set(x, "quota", value.asInstanceOf[js.Any])
    
    inline def setQuotaUndefined: Self = StObject.set(x, "quota", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setUsage(value: SchemaUsage): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
    
    inline def setUsageUndefined: Self = StObject.set(x, "usage", js.undefined)
  }
}
