package typings.googleapis.driveV2Mod.driveV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLabelModification extends StObject {
  
  /**
    * The list of modifications to this label's fields.
    */
  var fieldModifications: js.UndefOr[js.Array[SchemaLabelFieldModification]] = js.undefined
  
  /**
    * This is always drive#labelModification.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ID of the label to modify.
    */
  var labelId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If true, the label will be removed from the file.
    */
  var removeLabel: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaLabelModification {
  
  inline def apply(): SchemaLabelModification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLabelModification]
  }
  
  extension [Self <: SchemaLabelModification](x: Self) {
    
    inline def setFieldModifications(value: js.Array[SchemaLabelFieldModification]): Self = StObject.set(x, "fieldModifications", value.asInstanceOf[js.Any])
    
    inline def setFieldModificationsUndefined: Self = StObject.set(x, "fieldModifications", js.undefined)
    
    inline def setFieldModificationsVarargs(value: SchemaLabelFieldModification*): Self = StObject.set(x, "fieldModifications", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLabelId(value: String): Self = StObject.set(x, "labelId", value.asInstanceOf[js.Any])
    
    inline def setLabelIdNull: Self = StObject.set(x, "labelId", null)
    
    inline def setLabelIdUndefined: Self = StObject.set(x, "labelId", js.undefined)
    
    inline def setRemoveLabel(value: Boolean): Self = StObject.set(x, "removeLabel", value.asInstanceOf[js.Any])
    
    inline def setRemoveLabelNull: Self = StObject.set(x, "removeLabel", null)
    
    inline def setRemoveLabelUndefined: Self = StObject.set(x, "removeLabel", js.undefined)
  }
}
