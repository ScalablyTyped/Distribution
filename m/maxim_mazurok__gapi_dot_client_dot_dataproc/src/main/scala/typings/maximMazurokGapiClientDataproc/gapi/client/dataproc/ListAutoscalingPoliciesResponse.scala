package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAutoscalingPoliciesResponse extends StObject {
  
  /** Output only. This token is included in the response if there are more results to fetch. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** Output only. Autoscaling policies list. */
  var policies: js.UndefOr[js.Array[AutoscalingPolicy]] = js.undefined
}
object ListAutoscalingPoliciesResponse {
  
  inline def apply(): ListAutoscalingPoliciesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAutoscalingPoliciesResponse]
  }
  
  extension [Self <: ListAutoscalingPoliciesResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setPolicies(value: js.Array[AutoscalingPolicy]): Self = StObject.set(x, "policies", value.asInstanceOf[js.Any])
    
    inline def setPoliciesUndefined: Self = StObject.set(x, "policies", js.undefined)
    
    inline def setPoliciesVarargs(value: AutoscalingPolicy*): Self = StObject.set(x, "policies", js.Array(value*))
  }
}
