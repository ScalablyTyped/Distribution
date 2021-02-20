package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAutoscalingPoliciesResponse extends StObject {
  
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
  implicit class ListAutoscalingPoliciesResponseMutableBuilder[Self <: ListAutoscalingPoliciesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setPolicies(value: js.Array[AutoscalingPolicy]): Self = StObject.set(x, "policies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoliciesUndefined: Self = StObject.set(x, "policies", js.undefined)
    
    @scala.inline
    def setPoliciesVarargs(value: AutoscalingPolicy*): Self = StObject.set(x, "policies", js.Array(value :_*))
  }
}
