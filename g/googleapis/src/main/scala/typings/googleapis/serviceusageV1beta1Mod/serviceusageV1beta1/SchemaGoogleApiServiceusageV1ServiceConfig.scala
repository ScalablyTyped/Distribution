package typings.googleapis.serviceusageV1beta1Mod.serviceusageV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The configuration of the service.
  */
trait SchemaGoogleApiServiceusageV1ServiceConfig extends StObject {
  
  /**
    * A list of API interfaces exported by this service. Contains only the
    * names, versions, and method names of the interfaces.
    */
  var apis: js.UndefOr[js.Array[SchemaApi]] = js.undefined
  
  /**
    * Auth configuration. Contains only the OAuth rules.
    */
  var authentication: js.UndefOr[SchemaAuthentication] = js.undefined
  
  /**
    * Additional API documentation. Contains only the summary and the
    * documentation URL.
    */
  var documentation: js.UndefOr[SchemaDocumentation] = js.undefined
  
  /**
    * Configuration for network endpoints. Contains only the names and aliases
    * of the endpoints.
    */
  var endpoints: js.UndefOr[js.Array[SchemaEndpoint]] = js.undefined
  
  /**
    * The DNS address at which this service is available.  An example DNS
    * address would be: `calendar.googleapis.com`.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Quota configuration.
    */
  var quota: js.UndefOr[SchemaQuota] = js.undefined
  
  /**
    * The product title for this service.
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * Configuration controlling usage of this service.
    */
  var usage: js.UndefOr[SchemaUsage] = js.undefined
}
object SchemaGoogleApiServiceusageV1ServiceConfig {
  
  @scala.inline
  def apply(): SchemaGoogleApiServiceusageV1ServiceConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleApiServiceusageV1ServiceConfig]
  }
  
  @scala.inline
  implicit class SchemaGoogleApiServiceusageV1ServiceConfigMutableBuilder[Self <: SchemaGoogleApiServiceusageV1ServiceConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApis(value: js.Array[SchemaApi]): Self = StObject.set(x, "apis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApisUndefined: Self = StObject.set(x, "apis", js.undefined)
    
    @scala.inline
    def setApisVarargs(value: SchemaApi*): Self = StObject.set(x, "apis", js.Array(value :_*))
    
    @scala.inline
    def setAuthentication(value: SchemaAuthentication): Self = StObject.set(x, "authentication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthenticationUndefined: Self = StObject.set(x, "authentication", js.undefined)
    
    @scala.inline
    def setDocumentation(value: SchemaDocumentation): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentationUndefined: Self = StObject.set(x, "documentation", js.undefined)
    
    @scala.inline
    def setEndpoints(value: js.Array[SchemaEndpoint]): Self = StObject.set(x, "endpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointsUndefined: Self = StObject.set(x, "endpoints", js.undefined)
    
    @scala.inline
    def setEndpointsVarargs(value: SchemaEndpoint*): Self = StObject.set(x, "endpoints", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setQuota(value: SchemaQuota): Self = StObject.set(x, "quota", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuotaUndefined: Self = StObject.set(x, "quota", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setUsage(value: SchemaUsage): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsageUndefined: Self = StObject.set(x, "usage", js.undefined)
  }
}
