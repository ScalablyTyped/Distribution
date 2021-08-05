package typings.googleapis.servicemanagementV1Mod.servicemanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for ListServiceRollouts method.
  */
trait SchemaListServiceRolloutsResponse extends StObject {
  
  /**
    * The token of the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * The list of rollout resources.
    */
  var rollouts: js.UndefOr[js.Array[SchemaRollout]] = js.undefined
}
object SchemaListServiceRolloutsResponse {
  
  inline def apply(): SchemaListServiceRolloutsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListServiceRolloutsResponse]
  }
  
  extension [Self <: SchemaListServiceRolloutsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setRollouts(value: js.Array[SchemaRollout]): Self = StObject.set(x, "rollouts", value.asInstanceOf[js.Any])
    
    inline def setRolloutsUndefined: Self = StObject.set(x, "rollouts", js.undefined)
    
    inline def setRolloutsVarargs(value: SchemaRollout*): Self = StObject.set(x, "rollouts", js.Array(value :_*))
  }
}
