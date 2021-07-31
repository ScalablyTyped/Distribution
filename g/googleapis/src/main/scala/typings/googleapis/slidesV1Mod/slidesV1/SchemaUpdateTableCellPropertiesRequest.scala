package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Update the properties of a TableCell.
  */
trait SchemaUpdateTableCellPropertiesRequest extends StObject {
  
  /**
    * The fields that should be updated.  At least one field must be specified.
    * The root `tableCellProperties` is implied and should not be specified. A
    * single `&quot;*&quot;` can be used as short-hand for listing every field.
    * For example to update the table cell background solid fill color, set
    * `fields` to `&quot;tableCellBackgroundFill.solidFill.color&quot;`.  To
    * reset a property to its default value, include its field name in the
    * field mask but leave the field itself unset.
    */
  var fields: js.UndefOr[String] = js.undefined
  
  /**
    * The object ID of the table.
    */
  var objectId: js.UndefOr[String] = js.undefined
  
  /**
    * The table cell properties to update.
    */
  var tableCellProperties: js.UndefOr[SchemaTableCellProperties] = js.undefined
  
  /**
    * The table range representing the subset of the table to which the updates
    * are applied. If a table range is not specified, the updates will apply to
    * the entire table.
    */
  var tableRange: js.UndefOr[SchemaTableRange] = js.undefined
}
object SchemaUpdateTableCellPropertiesRequest {
  
  @scala.inline
  def apply(): SchemaUpdateTableCellPropertiesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateTableCellPropertiesRequest]
  }
  
  @scala.inline
  implicit class SchemaUpdateTableCellPropertiesRequestMutableBuilder[Self <: SchemaUpdateTableCellPropertiesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
    
    @scala.inline
    def setTableCellProperties(value: SchemaTableCellProperties): Self = StObject.set(x, "tableCellProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableCellPropertiesUndefined: Self = StObject.set(x, "tableCellProperties", js.undefined)
    
    @scala.inline
    def setTableRange(value: SchemaTableRange): Self = StObject.set(x, "tableRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableRangeUndefined: Self = StObject.set(x, "tableRange", js.undefined)
  }
}
