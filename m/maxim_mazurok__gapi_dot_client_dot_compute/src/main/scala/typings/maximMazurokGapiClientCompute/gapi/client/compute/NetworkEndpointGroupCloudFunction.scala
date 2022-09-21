package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkEndpointGroupCloudFunction extends StObject {
  
  /** A user-defined name of the Cloud Function. The function name is case-sensitive and must be 1-63 characters long. Example value: "func1". */
  var function: js.UndefOr[String] = js.undefined
  
  /**
    * A template to parse function field from a request URL. URL mask allows for routing to multiple Cloud Functions without having to create multiple Network Endpoint Groups and backend
    * services. For example, request URLs " mydomain.com/function1" and "mydomain.com/function2" can be backed by the same Serverless NEG with URL mask "/". The URL mask will parse them
    * to { function = "function1" } and { function = "function2" } respectively.
    */
  var urlMask: js.UndefOr[String] = js.undefined
}
object NetworkEndpointGroupCloudFunction {
  
  inline def apply(): NetworkEndpointGroupCloudFunction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkEndpointGroupCloudFunction]
  }
  
  extension [Self <: NetworkEndpointGroupCloudFunction](x: Self) {
    
    inline def setFunction(value: String): Self = StObject.set(x, "function", value.asInstanceOf[js.Any])
    
    inline def setFunctionUndefined: Self = StObject.set(x, "function", js.undefined)
    
    inline def setUrlMask(value: String): Self = StObject.set(x, "urlMask", value.asInstanceOf[js.Any])
    
    inline def setUrlMaskUndefined: Self = StObject.set(x, "urlMask", js.undefined)
  }
}
