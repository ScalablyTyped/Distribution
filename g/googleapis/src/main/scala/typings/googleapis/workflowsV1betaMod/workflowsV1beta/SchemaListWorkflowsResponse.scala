package typings.googleapis.workflowsV1betaMod.workflowsV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListWorkflowsResponse extends StObject {
  
  /**
    * A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Unreachable resources.
    */
  var unreachable: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The workflows which match the request.
    */
  var workflows: js.UndefOr[js.Array[SchemaWorkflow]] = js.undefined
}
object SchemaListWorkflowsResponse {
  
  inline def apply(): SchemaListWorkflowsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListWorkflowsResponse]
  }
  
  extension [Self <: SchemaListWorkflowsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setUnreachable(value: js.Array[String]): Self = StObject.set(x, "unreachable", value.asInstanceOf[js.Any])
    
    inline def setUnreachableNull: Self = StObject.set(x, "unreachable", null)
    
    inline def setUnreachableUndefined: Self = StObject.set(x, "unreachable", js.undefined)
    
    inline def setUnreachableVarargs(value: String*): Self = StObject.set(x, "unreachable", js.Array(value*))
    
    inline def setWorkflows(value: js.Array[SchemaWorkflow]): Self = StObject.set(x, "workflows", value.asInstanceOf[js.Any])
    
    inline def setWorkflowsUndefined: Self = StObject.set(x, "workflows", js.undefined)
    
    inline def setWorkflowsVarargs(value: SchemaWorkflow*): Self = StObject.set(x, "workflows", js.Array(value*))
  }
}
