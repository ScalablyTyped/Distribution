package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2EntityTypeBatch extends StObject {
  
  /**
    * A collection of entity types.
    */
  var entityTypes: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2EntityType]] = js.undefined
}
object SchemaGoogleCloudDialogflowV2EntityTypeBatch {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2EntityTypeBatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2EntityTypeBatch]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2EntityTypeBatch](x: Self) {
    
    inline def setEntityTypes(value: js.Array[SchemaGoogleCloudDialogflowV2EntityType]): Self = StObject.set(x, "entityTypes", value.asInstanceOf[js.Any])
    
    inline def setEntityTypesUndefined: Self = StObject.set(x, "entityTypes", js.undefined)
    
    inline def setEntityTypesVarargs(value: SchemaGoogleCloudDialogflowV2EntityType*): Self = StObject.set(x, "entityTypes", js.Array(value*))
  }
}
