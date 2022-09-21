package typings.googleapis.servicecontrolV2Mod.servicecontrolV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaApi extends StObject {
  
  /**
    * The API operation name. For gRPC requests, it is the fully qualified API method name, such as "google.pubsub.v1.Publisher.Publish". For OpenAPI requests, it is the `operationId`, such as "getPet".
    */
  var operation: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The API protocol used for sending the request, such as "http", "https", "grpc", or "internal".
    */
  var protocol: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The API service name. It is a logical identifier for a networked API, such as "pubsub.googleapis.com". The naming syntax depends on the API management system being used for handling the request.
    */
  var service: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The API version associated with the API operation above, such as "v1" or "v1alpha1".
    */
  var version: js.UndefOr[String | Null] = js.undefined
}
object SchemaApi {
  
  inline def apply(): SchemaApi = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApi]
  }
  
  extension [Self <: SchemaApi](x: Self) {
    
    inline def setOperation(value: String): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    inline def setOperationNull: Self = StObject.set(x, "operation", null)
    
    inline def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
    
    inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolNull: Self = StObject.set(x, "protocol", null)
    
    inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    inline def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setServiceNull: Self = StObject.set(x, "service", null)
    
    inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionNull: Self = StObject.set(x, "version", null)
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
