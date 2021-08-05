package typings.maximMazurokGapiClientAppengine.gapi.client.appengine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DomainMapping extends StObject {
  
  /** Relative name of the domain serving the application. Example: example.com. */
  var id: js.UndefOr[String] = js.undefined
  
  /** Full path to the DomainMapping resource in the API. Example: apps/myapp/domainMapping/example.com.@OutputOnly */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The resource records required to configure this domain mapping. These records must be added to the domain's DNS configuration in order to serve the application via this domain
    * mapping.@OutputOnly
    */
  var resourceRecords: js.UndefOr[js.Array[ResourceRecord]] = js.undefined
  
  /** SSL configuration for this domain. If unconfigured, this domain will not serve with SSL. */
  var sslSettings: js.UndefOr[SslSettings] = js.undefined
}
object DomainMapping {
  
  inline def apply(): DomainMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainMapping]
  }
  
  extension [Self <: DomainMapping](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setResourceRecords(value: js.Array[ResourceRecord]): Self = StObject.set(x, "resourceRecords", value.asInstanceOf[js.Any])
    
    inline def setResourceRecordsUndefined: Self = StObject.set(x, "resourceRecords", js.undefined)
    
    inline def setResourceRecordsVarargs(value: ResourceRecord*): Self = StObject.set(x, "resourceRecords", js.Array(value :_*))
    
    inline def setSslSettings(value: SslSettings): Self = StObject.set(x, "sslSettings", value.asInstanceOf[js.Any])
    
    inline def setSslSettingsUndefined: Self = StObject.set(x, "sslSettings", js.undefined)
  }
}
