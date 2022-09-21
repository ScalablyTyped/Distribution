package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBulkEditAdvertiserAssignedTargetingOptionsRequest extends StObject {
  
  /**
    * The assigned targeting options to create in batch, specified as a list of `CreateAssignedTargetingOptionsRequest`. Supported targeting types: * `TARGETING_TYPE_CHANNEL` * `TARGETING_TYPE_DIGITAL_CONTENT_LABEL_EXCLUSION` * `TARGETING_TYPE_OMID` * `TARGETING_TYPE_SENSITIVE_CATEGORY_EXCLUSION`
    */
  var createRequests: js.UndefOr[js.Array[SchemaCreateAssignedTargetingOptionsRequest]] = js.undefined
  
  /**
    * The assigned targeting options to delete in batch, specified as a list of `DeleteAssignedTargetingOptionsRequest`. Supported targeting types: * `TARGETING_TYPE_CHANNEL` * `TARGETING_TYPE_DIGITAL_CONTENT_LABEL_EXCLUSION` * `TARGETING_TYPE_OMID` * `TARGETING_TYPE_SENSITIVE_CATEGORY_EXCLUSION`
    */
  var deleteRequests: js.UndefOr[js.Array[SchemaDeleteAssignedTargetingOptionsRequest]] = js.undefined
}
object SchemaBulkEditAdvertiserAssignedTargetingOptionsRequest {
  
  inline def apply(): SchemaBulkEditAdvertiserAssignedTargetingOptionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBulkEditAdvertiserAssignedTargetingOptionsRequest]
  }
  
  extension [Self <: SchemaBulkEditAdvertiserAssignedTargetingOptionsRequest](x: Self) {
    
    inline def setCreateRequests(value: js.Array[SchemaCreateAssignedTargetingOptionsRequest]): Self = StObject.set(x, "createRequests", value.asInstanceOf[js.Any])
    
    inline def setCreateRequestsUndefined: Self = StObject.set(x, "createRequests", js.undefined)
    
    inline def setCreateRequestsVarargs(value: SchemaCreateAssignedTargetingOptionsRequest*): Self = StObject.set(x, "createRequests", js.Array(value*))
    
    inline def setDeleteRequests(value: js.Array[SchemaDeleteAssignedTargetingOptionsRequest]): Self = StObject.set(x, "deleteRequests", value.asInstanceOf[js.Any])
    
    inline def setDeleteRequestsUndefined: Self = StObject.set(x, "deleteRequests", js.undefined)
    
    inline def setDeleteRequestsVarargs(value: SchemaDeleteAssignedTargetingOptionsRequest*): Self = StObject.set(x, "deleteRequests", js.Array(value*))
  }
}
