package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1Attempt extends StObject {
  
  var attemptTime: js.UndefOr[String] = js.native
  
  /** Details of errors that occurred. */
  var partialFailures: js.UndefOr[js.Array[GoogleRpcStatus]] = js.native
}
object GoogleCloudDatalabelingV1beta1Attempt {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1Attempt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1Attempt]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1AttemptMutableBuilder[Self <: GoogleCloudDatalabelingV1beta1Attempt] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttemptTime(value: String): Self = StObject.set(x, "attemptTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttemptTimeUndefined: Self = StObject.set(x, "attemptTime", js.undefined)
    
    @scala.inline
    def setPartialFailures(value: js.Array[GoogleRpcStatus]): Self = StObject.set(x, "partialFailures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartialFailuresUndefined: Self = StObject.set(x, "partialFailures", js.undefined)
    
    @scala.inline
    def setPartialFailuresVarargs(value: GoogleRpcStatus*): Self = StObject.set(x, "partialFailures", js.Array(value :_*))
  }
}
