package typings.googleapis.retailV2betaMod.retailV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailLoggingServiceContext extends StObject {
  
  /**
    * An identifier of the service. For example, "retail.googleapis.com".
    */
  var service: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudRetailLoggingServiceContext {
  
  inline def apply(): SchemaGoogleCloudRetailLoggingServiceContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailLoggingServiceContext]
  }
  
  extension [Self <: SchemaGoogleCloudRetailLoggingServiceContext](x: Self) {
    
    inline def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setServiceNull: Self = StObject.set(x, "service", null)
    
    inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
  }
}
