package typings.googleapis.privatecaV1Mod.privatecaV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReconciliationOperationMetadata extends StObject {
  
  /**
    * DEPRECATED. Use exclusive_action instead.
    */
  var deleteResource: js.UndefOr[Boolean | Null] = js.undefined
  
  var exclusiveAction: js.UndefOr[String | Null] = js.undefined
}
object SchemaReconciliationOperationMetadata {
  
  inline def apply(): SchemaReconciliationOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReconciliationOperationMetadata]
  }
  
  extension [Self <: SchemaReconciliationOperationMetadata](x: Self) {
    
    inline def setDeleteResource(value: Boolean): Self = StObject.set(x, "deleteResource", value.asInstanceOf[js.Any])
    
    inline def setDeleteResourceNull: Self = StObject.set(x, "deleteResource", null)
    
    inline def setDeleteResourceUndefined: Self = StObject.set(x, "deleteResource", js.undefined)
    
    inline def setExclusiveAction(value: String): Self = StObject.set(x, "exclusiveAction", value.asInstanceOf[js.Any])
    
    inline def setExclusiveActionNull: Self = StObject.set(x, "exclusiveAction", null)
    
    inline def setExclusiveActionUndefined: Self = StObject.set(x, "exclusiveAction", js.undefined)
  }
}
