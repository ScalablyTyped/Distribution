package typings.googleapis.servicemanagementV1Mod.servicemanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for ListServiceRollouts method.
  */
@js.native
trait SchemaListServiceRolloutsResponse extends StObject {
  
  /**
    * The token of the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /**
    * The list of rollout resources.
    */
  var rollouts: js.UndefOr[js.Array[SchemaRollout]] = js.native
}
object SchemaListServiceRolloutsResponse {
  
  @scala.inline
  def apply(): SchemaListServiceRolloutsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListServiceRolloutsResponse]
  }
  
  @scala.inline
  implicit class SchemaListServiceRolloutsResponseMutableBuilder[Self <: SchemaListServiceRolloutsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setRollouts(value: js.Array[SchemaRollout]): Self = StObject.set(x, "rollouts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRolloutsUndefined: Self = StObject.set(x, "rollouts", js.undefined)
    
    @scala.inline
    def setRolloutsVarargs(value: SchemaRollout*): Self = StObject.set(x, "rollouts", js.Array(value :_*))
  }
}
