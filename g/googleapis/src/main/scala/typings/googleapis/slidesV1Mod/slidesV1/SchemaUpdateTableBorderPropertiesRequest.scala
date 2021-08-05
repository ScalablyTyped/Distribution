package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Updates the properties of the table borders in a Table.
  */
trait SchemaUpdateTableBorderPropertiesRequest extends StObject {
  
  /**
    * The border position in the table range the updates should apply to. If a
    * border position is not specified, the updates will apply to all borders
    * in the table range.
    */
  var borderPosition: js.UndefOr[String] = js.undefined
  
  /**
    * The fields that should be updated.  At least one field must be specified.
    * The root `tableBorderProperties` is implied and should not be specified.
    * A single `&quot;*&quot;` can be used as short-hand for listing every
    * field.  For example to update the table border solid fill color, set
    * `fields` to `&quot;tableBorderFill.solidFill.color&quot;`.  To reset a
    * property to its default value, include its field name in the field mask
    * but leave the field itself unset.
    */
  var fields: js.UndefOr[String] = js.undefined
  
  /**
    * The object ID of the table.
    */
  var objectId: js.UndefOr[String] = js.undefined
  
  /**
    * The table border properties to update.
    */
  var tableBorderProperties: js.UndefOr[SchemaTableBorderProperties] = js.undefined
  
  /**
    * The table range representing the subset of the table to which the updates
    * are applied. If a table range is not specified, the updates will apply to
    * the entire table.
    */
  var tableRange: js.UndefOr[SchemaTableRange] = js.undefined
}
object SchemaUpdateTableBorderPropertiesRequest {
  
  inline def apply(): SchemaUpdateTableBorderPropertiesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateTableBorderPropertiesRequest]
  }
  
  extension [Self <: SchemaUpdateTableBorderPropertiesRequest](x: Self) {
    
    inline def setBorderPosition(value: String): Self = StObject.set(x, "borderPosition", value.asInstanceOf[js.Any])
    
    inline def setBorderPositionUndefined: Self = StObject.set(x, "borderPosition", js.undefined)
    
    inline def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
    
    inline def setTableBorderProperties(value: SchemaTableBorderProperties): Self = StObject.set(x, "tableBorderProperties", value.asInstanceOf[js.Any])
    
    inline def setTableBorderPropertiesUndefined: Self = StObject.set(x, "tableBorderProperties", js.undefined)
    
    inline def setTableRange(value: SchemaTableRange): Self = StObject.set(x, "tableRange", value.asInstanceOf[js.Any])
    
    inline def setTableRangeUndefined: Self = StObject.set(x, "tableRange", js.undefined)
  }
}
