package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatalabelingV1beta1Attempt extends StObject {
  
  var attemptTime: js.UndefOr[String] = js.undefined
  
  /** Details of errors that occurred. */
  var partialFailures: js.UndefOr[js.Array[GoogleRpcStatus]] = js.undefined
}
object GoogleCloudDatalabelingV1beta1Attempt {
  
  inline def apply(): GoogleCloudDatalabelingV1beta1Attempt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1Attempt]
  }
  
  extension [Self <: GoogleCloudDatalabelingV1beta1Attempt](x: Self) {
    
    inline def setAttemptTime(value: String): Self = StObject.set(x, "attemptTime", value.asInstanceOf[js.Any])
    
    inline def setAttemptTimeUndefined: Self = StObject.set(x, "attemptTime", js.undefined)
    
    inline def setPartialFailures(value: js.Array[GoogleRpcStatus]): Self = StObject.set(x, "partialFailures", value.asInstanceOf[js.Any])
    
    inline def setPartialFailuresUndefined: Self = StObject.set(x, "partialFailures", js.undefined)
    
    inline def setPartialFailuresVarargs(value: GoogleRpcStatus*): Self = StObject.set(x, "partialFailures", js.Array(value :_*))
  }
}
