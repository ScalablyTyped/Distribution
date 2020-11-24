package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1Attempt extends js.Object {
  
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
  implicit class GoogleCloudDatalabelingV1beta1AttemptOps[Self <: GoogleCloudDatalabelingV1beta1Attempt] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAttemptTime(value: String): Self = this.set("attemptTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttemptTime: Self = this.set("attemptTime", js.undefined)
    
    @scala.inline
    def setPartialFailuresVarargs(value: GoogleRpcStatus*): Self = this.set("partialFailures", js.Array(value :_*))
    
    @scala.inline
    def setPartialFailures(value: js.Array[GoogleRpcStatus]): Self = this.set("partialFailures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartialFailures: Self = this.set("partialFailures", js.undefined)
  }
}
