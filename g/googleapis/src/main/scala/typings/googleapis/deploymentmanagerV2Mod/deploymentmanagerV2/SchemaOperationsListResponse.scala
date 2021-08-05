package typings.googleapis.deploymentmanagerV2Mod.deploymentmanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A response containing a partial list of operations and a page token used to
  * build the next request if the request has been truncated.
  */
trait SchemaOperationsListResponse extends StObject {
  
  /**
    * Output only. A token used to continue a truncated list request.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. Operations contained in this list response.
    */
  var operations: js.UndefOr[js.Array[SchemaOperation]] = js.undefined
}
object SchemaOperationsListResponse {
  
  inline def apply(): SchemaOperationsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOperationsListResponse]
  }
  
  extension [Self <: SchemaOperationsListResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setOperations(value: js.Array[SchemaOperation]): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
    
    inline def setOperationsUndefined: Self = StObject.set(x, "operations", js.undefined)
    
    inline def setOperationsVarargs(value: SchemaOperation*): Self = StObject.set(x, "operations", js.Array(value :_*))
  }
}
