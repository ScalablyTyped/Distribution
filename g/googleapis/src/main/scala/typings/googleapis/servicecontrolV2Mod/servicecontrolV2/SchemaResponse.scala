package typings.googleapis.servicecontrolV2Mod.servicecontrolV2

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaResponse extends StObject {
  
  /**
    * The amount of time it takes the backend service to fully respond to a request. Measured from when the destination service starts to send the request to the backend until when the destination service receives the complete response from the backend.
    */
  var backendLatency: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The HTTP response status code, such as `200` and `404`.
    */
  var code: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The HTTP response headers. If multiple headers share the same key, they must be merged according to HTTP spec. All header keys must be lowercased, because HTTP header keys are case-insensitive.
    */
  var headers: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * The HTTP response size in bytes. If unknown, it must be -1.
    */
  var size: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The timestamp when the `destination` service sends the last byte of the response.
    */
  var time: js.UndefOr[String | Null] = js.undefined
}
object SchemaResponse {
  
  inline def apply(): SchemaResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResponse]
  }
  
  extension [Self <: SchemaResponse](x: Self) {
    
    inline def setBackendLatency(value: String): Self = StObject.set(x, "backendLatency", value.asInstanceOf[js.Any])
    
    inline def setBackendLatencyNull: Self = StObject.set(x, "backendLatency", null)
    
    inline def setBackendLatencyUndefined: Self = StObject.set(x, "backendLatency", js.undefined)
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeNull: Self = StObject.set(x, "code", null)
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersNull: Self = StObject.set(x, "headers", null)
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeNull: Self = StObject.set(x, "size", null)
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeNull: Self = StObject.set(x, "time", null)
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
  }
}
