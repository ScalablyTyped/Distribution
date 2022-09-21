package typings.googleapis.retailV2alphaMod.retailV2alpha

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailLoggingErrorLog extends StObject {
  
  /**
    * A description of the context in which the error occurred.
    */
  var context: js.UndefOr[SchemaGoogleCloudRetailLoggingErrorContext] = js.undefined
  
  /**
    * The error payload that is populated on LRO import APIs.
    */
  var importPayload: js.UndefOr[SchemaGoogleCloudRetailLoggingImportErrorContext] = js.undefined
  
  /**
    * A message describing the error.
    */
  var message: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The API request payload, represented as a protocol buffer. Most API request types are supported. For example: "type.googleapis.com/google.cloud.retail.v2.ProductService.CreateProductRequest" "type.googleapis.com/google.cloud.retail.v2.UserEventService.WriteUserEventRequest"
    */
  var requestPayload: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
  
  /**
    * The API response payload, represented as a protocol buffer. This is used to log some "soft errors", where the response is valid but we consider there are some quality issues like unjoined events. The following API responses are supported and no PII is included: "google.cloud.retail.v2.PredictionService.Predict" "google.cloud.retail.v2.UserEventService.WriteUserEvent" "google.cloud.retail.v2.UserEventService.CollectUserEvent"
    */
  var responsePayload: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
  
  /**
    * The service context in which this error has occurred.
    */
  var serviceContext: js.UndefOr[SchemaGoogleCloudRetailLoggingServiceContext] = js.undefined
  
  /**
    * The RPC status associated with the error log.
    */
  var status: js.UndefOr[SchemaGoogleRpcStatus] = js.undefined
}
object SchemaGoogleCloudRetailLoggingErrorLog {
  
  inline def apply(): SchemaGoogleCloudRetailLoggingErrorLog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailLoggingErrorLog]
  }
  
  extension [Self <: SchemaGoogleCloudRetailLoggingErrorLog](x: Self) {
    
    inline def setContext(value: SchemaGoogleCloudRetailLoggingErrorContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setImportPayload(value: SchemaGoogleCloudRetailLoggingImportErrorContext): Self = StObject.set(x, "importPayload", value.asInstanceOf[js.Any])
    
    inline def setImportPayloadUndefined: Self = StObject.set(x, "importPayload", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageNull: Self = StObject.set(x, "message", null)
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setRequestPayload(value: StringDictionary[Any]): Self = StObject.set(x, "requestPayload", value.asInstanceOf[js.Any])
    
    inline def setRequestPayloadNull: Self = StObject.set(x, "requestPayload", null)
    
    inline def setRequestPayloadUndefined: Self = StObject.set(x, "requestPayload", js.undefined)
    
    inline def setResponsePayload(value: StringDictionary[Any]): Self = StObject.set(x, "responsePayload", value.asInstanceOf[js.Any])
    
    inline def setResponsePayloadNull: Self = StObject.set(x, "responsePayload", null)
    
    inline def setResponsePayloadUndefined: Self = StObject.set(x, "responsePayload", js.undefined)
    
    inline def setServiceContext(value: SchemaGoogleCloudRetailLoggingServiceContext): Self = StObject.set(x, "serviceContext", value.asInstanceOf[js.Any])
    
    inline def setServiceContextUndefined: Self = StObject.set(x, "serviceContext", js.undefined)
    
    inline def setStatus(value: SchemaGoogleRpcStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
