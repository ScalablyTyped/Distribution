package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HttpFaultAbort extends StObject {
  
  /**
    * The HTTP status code used to abort the request. The value must be between 200 and 599 inclusive. For gRPC protocol, the gRPC status code is mapped to HTTP status code according to
    * this mapping table. HTTP status 200 is mapped to gRPC status UNKNOWN. Injecting an OK status is currently not supported by Traffic Director.
    */
  var httpStatus: js.UndefOr[Double] = js.undefined
  
  /** The percentage of traffic (connections/operations/requests) which will be aborted as part of fault injection. The value must be between 0.0 and 100.0 inclusive. */
  var percentage: js.UndefOr[Double] = js.undefined
}
object HttpFaultAbort {
  
  inline def apply(): HttpFaultAbort = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpFaultAbort]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HttpFaultAbort] (val x: Self) extends AnyVal {
    
    inline def setHttpStatus(value: Double): Self = StObject.set(x, "httpStatus", value.asInstanceOf[js.Any])
    
    inline def setHttpStatusUndefined: Self = StObject.set(x, "httpStatus", js.undefined)
    
    inline def setPercentage(value: Double): Self = StObject.set(x, "percentage", value.asInstanceOf[js.Any])
    
    inline def setPercentageUndefined: Self = StObject.set(x, "percentage", js.undefined)
  }
}
