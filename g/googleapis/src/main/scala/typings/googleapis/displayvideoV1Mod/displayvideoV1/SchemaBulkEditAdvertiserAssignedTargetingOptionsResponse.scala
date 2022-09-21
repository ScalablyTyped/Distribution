package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBulkEditAdvertiserAssignedTargetingOptionsResponse extends StObject {
  
  /**
    * The list of assigned targeting options that have been successfully created. This list will be absent if empty.
    */
  var createdAssignedTargetingOptions: js.UndefOr[js.Array[SchemaAssignedTargetingOption]] = js.undefined
}
object SchemaBulkEditAdvertiserAssignedTargetingOptionsResponse {
  
  inline def apply(): SchemaBulkEditAdvertiserAssignedTargetingOptionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBulkEditAdvertiserAssignedTargetingOptionsResponse]
  }
  
  extension [Self <: SchemaBulkEditAdvertiserAssignedTargetingOptionsResponse](x: Self) {
    
    inline def setCreatedAssignedTargetingOptions(value: js.Array[SchemaAssignedTargetingOption]): Self = StObject.set(x, "createdAssignedTargetingOptions", value.asInstanceOf[js.Any])
    
    inline def setCreatedAssignedTargetingOptionsUndefined: Self = StObject.set(x, "createdAssignedTargetingOptions", js.undefined)
    
    inline def setCreatedAssignedTargetingOptionsVarargs(value: SchemaAssignedTargetingOption*): Self = StObject.set(x, "createdAssignedTargetingOptions", js.Array(value*))
  }
}
