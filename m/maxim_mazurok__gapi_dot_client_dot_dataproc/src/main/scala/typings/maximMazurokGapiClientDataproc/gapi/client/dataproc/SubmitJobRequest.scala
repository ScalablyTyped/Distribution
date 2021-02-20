package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubmitJobRequest extends StObject {
  
  /** Required. The job resource. */
  var job: js.UndefOr[Job] = js.native
  
  /**
    * Optional. A unique id used to identify the request. If the server receives two SubmitJobRequest requests with the same id, then the second request will be ignored and the first Job
    * created and stored in the backend is returned.It is recommended to always set this value to a UUID (https://en.wikipedia.org/wiki/Universally_unique_identifier).The id must contain
    * only letters (a-z, A-Z), numbers (0-9), underscores (_), and hyphens (-). The maximum length is 40 characters.
    */
  var requestId: js.UndefOr[String] = js.native
}
object SubmitJobRequest {
  
  @scala.inline
  def apply(): SubmitJobRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubmitJobRequest]
  }
  
  @scala.inline
  implicit class SubmitJobRequestMutableBuilder[Self <: SubmitJobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJob(value: Job): Self = StObject.set(x, "job", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobUndefined: Self = StObject.set(x, "job", js.undefined)
    
    @scala.inline
    def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
  }
}
