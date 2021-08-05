package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Updates the properties of a Table column.
  */
trait SchemaUpdateTableColumnPropertiesRequest extends StObject {
  
  /**
    * The list of zero-based indices specifying which columns to update. If no
    * indices are provided, all columns in the table will be updated.
    */
  var columnIndices: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * The fields that should be updated.  At least one field must be specified.
    * The root `tableColumnProperties` is implied and should not be specified.
    * A single `&quot;*&quot;` can be used as short-hand for listing every
    * field.  For example to update the column width, set `fields` to
    * `&quot;column_width&quot;`.  If &#39;&quot;column_width&quot;&#39; is
    * included in the field mask but the property is left unset, the column
    * width will default to 406,400 EMU (32 points).
    */
  var fields: js.UndefOr[String] = js.undefined
  
  /**
    * The object ID of the table.
    */
  var objectId: js.UndefOr[String] = js.undefined
  
  /**
    * The table column properties to update.  If the value of
    * `table_column_properties#column_width` in the request is less than
    * 406,400 EMU (32 points), a 400 bad request error is returned.
    */
  var tableColumnProperties: js.UndefOr[SchemaTableColumnProperties] = js.undefined
}
object SchemaUpdateTableColumnPropertiesRequest {
  
  inline def apply(): SchemaUpdateTableColumnPropertiesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateTableColumnPropertiesRequest]
  }
  
  extension [Self <: SchemaUpdateTableColumnPropertiesRequest](x: Self) {
    
    inline def setColumnIndices(value: js.Array[Double]): Self = StObject.set(x, "columnIndices", value.asInstanceOf[js.Any])
    
    inline def setColumnIndicesUndefined: Self = StObject.set(x, "columnIndices", js.undefined)
    
    inline def setColumnIndicesVarargs(value: Double*): Self = StObject.set(x, "columnIndices", js.Array(value :_*))
    
    inline def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
    
    inline def setTableColumnProperties(value: SchemaTableColumnProperties): Self = StObject.set(x, "tableColumnProperties", value.asInstanceOf[js.Any])
    
    inline def setTableColumnPropertiesUndefined: Self = StObject.set(x, "tableColumnProperties", js.undefined)
  }
}
