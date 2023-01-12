package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubmitJobRequest extends StObject {
  
  /** Required. The job resource. */
  var job: js.UndefOr[Job] = js.undefined
  
  /**
    * Optional. A unique id used to identify the request. If the server receives two SubmitJobRequest
    * (https://cloud.google.com/dataproc/docs/reference/rpc/google.cloud.dataproc.v1#google.cloud.dataproc.v1.SubmitJobRequest)s with the same id, then the second request will be ignored
    * and the first Job created and stored in the backend is returned.It is recommended to always set this value to a UUID
    * (https://en.wikipedia.org/wiki/Universally_unique_identifier).The id must contain only letters (a-z, A-Z), numbers (0-9), underscores (_), and hyphens (-). The maximum length is 40
    * characters.
    */
  var requestId: js.UndefOr[String] = js.undefined
}
object SubmitJobRequest {
  
  inline def apply(): SubmitJobRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubmitJobRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubmitJobRequest] (val x: Self) extends AnyVal {
    
    inline def setJob(value: Job): Self = StObject.set(x, "job", value.asInstanceOf[js.Any])
    
    inline def setJobUndefined: Self = StObject.set(x, "job", js.undefined)
    
    inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
  }
}
