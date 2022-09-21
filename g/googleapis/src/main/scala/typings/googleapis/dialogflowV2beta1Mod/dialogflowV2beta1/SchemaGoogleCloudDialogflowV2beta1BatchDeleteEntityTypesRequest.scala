package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2beta1BatchDeleteEntityTypesRequest extends StObject {
  
  /**
    * Required. The names entity types to delete. All names must point to the same agent as `parent`.
    */
  var entityTypeNames: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2beta1BatchDeleteEntityTypesRequest {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2beta1BatchDeleteEntityTypesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1BatchDeleteEntityTypesRequest]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2beta1BatchDeleteEntityTypesRequest](x: Self) {
    
    inline def setEntityTypeNames(value: js.Array[String]): Self = StObject.set(x, "entityTypeNames", value.asInstanceOf[js.Any])
    
    inline def setEntityTypeNamesNull: Self = StObject.set(x, "entityTypeNames", null)
    
    inline def setEntityTypeNamesUndefined: Self = StObject.set(x, "entityTypeNames", js.undefined)
    
    inline def setEntityTypeNamesVarargs(value: String*): Self = StObject.set(x, "entityTypeNames", js.Array(value*))
  }
}
