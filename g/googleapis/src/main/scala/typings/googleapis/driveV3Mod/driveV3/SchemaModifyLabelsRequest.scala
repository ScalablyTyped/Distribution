package typings.googleapis.driveV3Mod.driveV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaModifyLabelsRequest extends StObject {
  
  /**
    * This is always drive#modifyLabelsRequest
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The list of modifications to apply to the labels on the file.
    */
  var labelModifications: js.UndefOr[js.Array[SchemaLabelModification]] = js.undefined
}
object SchemaModifyLabelsRequest {
  
  inline def apply(): SchemaModifyLabelsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaModifyLabelsRequest]
  }
  
  extension [Self <: SchemaModifyLabelsRequest](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLabelModifications(value: js.Array[SchemaLabelModification]): Self = StObject.set(x, "labelModifications", value.asInstanceOf[js.Any])
    
    inline def setLabelModificationsUndefined: Self = StObject.set(x, "labelModifications", js.undefined)
    
    inline def setLabelModificationsVarargs(value: SchemaLabelModification*): Self = StObject.set(x, "labelModifications", js.Array(value*))
  }
}
