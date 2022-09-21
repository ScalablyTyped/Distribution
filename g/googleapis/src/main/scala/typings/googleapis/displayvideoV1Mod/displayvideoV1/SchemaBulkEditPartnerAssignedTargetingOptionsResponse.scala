package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBulkEditPartnerAssignedTargetingOptionsResponse extends StObject {
  
  /**
    * The list of assigned targeting options that have been successfully created. This list will be absent if empty.
    */
  var createdAssignedTargetingOptions: js.UndefOr[js.Array[SchemaAssignedTargetingOption]] = js.undefined
}
object SchemaBulkEditPartnerAssignedTargetingOptionsResponse {
  
  inline def apply(): SchemaBulkEditPartnerAssignedTargetingOptionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBulkEditPartnerAssignedTargetingOptionsResponse]
  }
  
  extension [Self <: SchemaBulkEditPartnerAssignedTargetingOptionsResponse](x: Self) {
    
    inline def setCreatedAssignedTargetingOptions(value: js.Array[SchemaAssignedTargetingOption]): Self = StObject.set(x, "createdAssignedTargetingOptions", value.asInstanceOf[js.Any])
    
    inline def setCreatedAssignedTargetingOptionsUndefined: Self = StObject.set(x, "createdAssignedTargetingOptions", js.undefined)
    
    inline def setCreatedAssignedTargetingOptionsVarargs(value: SchemaAssignedTargetingOption*): Self = StObject.set(x, "createdAssignedTargetingOptions", js.Array(value*))
  }
}
