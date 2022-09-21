package typings.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListAutoscalingPoliciesResponse extends StObject {
  
  /**
    * Output only. This token is included in the response if there are more results to fetch.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Autoscaling policies list.
    */
  var policies: js.UndefOr[js.Array[SchemaAutoscalingPolicy]] = js.undefined
}
object SchemaListAutoscalingPoliciesResponse {
  
  inline def apply(): SchemaListAutoscalingPoliciesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListAutoscalingPoliciesResponse]
  }
  
  extension [Self <: SchemaListAutoscalingPoliciesResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setPolicies(value: js.Array[SchemaAutoscalingPolicy]): Self = StObject.set(x, "policies", value.asInstanceOf[js.Any])
    
    inline def setPoliciesUndefined: Self = StObject.set(x, "policies", js.undefined)
    
    inline def setPoliciesVarargs(value: SchemaAutoscalingPolicy*): Self = StObject.set(x, "policies", js.Array(value*))
  }
}
