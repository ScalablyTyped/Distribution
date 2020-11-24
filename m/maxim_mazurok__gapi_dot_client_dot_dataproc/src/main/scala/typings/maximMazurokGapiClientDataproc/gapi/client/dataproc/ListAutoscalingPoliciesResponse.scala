package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAutoscalingPoliciesResponse extends js.Object {
  
  /** Output only. This token is included in the response if there are more results to fetch. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** Output only. Autoscaling policies list. */
  var policies: js.UndefOr[js.Array[AutoscalingPolicy]] = js.native
}
object ListAutoscalingPoliciesResponse {
  
  @scala.inline
  def apply(): ListAutoscalingPoliciesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAutoscalingPoliciesResponse]
  }
  
  @scala.inline
  implicit class ListAutoscalingPoliciesResponseOps[Self <: ListAutoscalingPoliciesResponse] (val x: Self) extends AnyVal {
    
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
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    
    @scala.inline
    def setPoliciesVarargs(value: AutoscalingPolicy*): Self = this.set("policies", js.Array(value :_*))
    
    @scala.inline
    def setPolicies(value: js.Array[AutoscalingPolicy]): Self = this.set("policies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicies: Self = this.set("policies", js.undefined)
  }
}
