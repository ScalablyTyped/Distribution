package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBulkListInsertionOrderAssignedTargetingOptionsResponse extends StObject {
  
  /**
    * The list of assigned targeting options. This list will be absent if empty.
    */
  var assignedTargetingOptions: js.UndefOr[js.Array[SchemaAssignedTargetingOption]] = js.undefined
  
  /**
    * A token identifying the next page of results. This value should be specified as the pageToken in a subsequent BulkListInsertionOrderAssignedTargetingOptionsRequest to fetch the next page of results. This token will be absent if there are no more assigned_targeting_options to return.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaBulkListInsertionOrderAssignedTargetingOptionsResponse {
  
  inline def apply(): SchemaBulkListInsertionOrderAssignedTargetingOptionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBulkListInsertionOrderAssignedTargetingOptionsResponse]
  }
  
  extension [Self <: SchemaBulkListInsertionOrderAssignedTargetingOptionsResponse](x: Self) {
    
    inline def setAssignedTargetingOptions(value: js.Array[SchemaAssignedTargetingOption]): Self = StObject.set(x, "assignedTargetingOptions", value.asInstanceOf[js.Any])
    
    inline def setAssignedTargetingOptionsUndefined: Self = StObject.set(x, "assignedTargetingOptions", js.undefined)
    
    inline def setAssignedTargetingOptionsVarargs(value: SchemaAssignedTargetingOption*): Self = StObject.set(x, "assignedTargetingOptions", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
