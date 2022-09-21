package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUpdateTableRowStyleRequest extends StObject {
  
  /**
    * The fields that should be updated. At least one field must be specified. The root `tableRowStyle` is implied and should not be specified. A single `"*"` can be used as short-hand for listing every field. For example to update the minimum row height, set `fields` to `"min_row_height"`.
    */
  var fields: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The list of zero-based row indices whose style should be updated. If no indices are specified, all rows will be updated.
    */
  var rowIndices: js.UndefOr[js.Array[Double] | Null] = js.undefined
  
  /**
    * The styles to be set on the rows.
    */
  var tableRowStyle: js.UndefOr[SchemaTableRowStyle] = js.undefined
  
  /**
    * The location where the table starts in the document.
    */
  var tableStartLocation: js.UndefOr[SchemaLocation] = js.undefined
}
object SchemaUpdateTableRowStyleRequest {
  
  inline def apply(): SchemaUpdateTableRowStyleRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateTableRowStyleRequest]
  }
  
  extension [Self <: SchemaUpdateTableRowStyleRequest](x: Self) {
    
    inline def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsNull: Self = StObject.set(x, "fields", null)
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setRowIndices(value: js.Array[Double]): Self = StObject.set(x, "rowIndices", value.asInstanceOf[js.Any])
    
    inline def setRowIndicesNull: Self = StObject.set(x, "rowIndices", null)
    
    inline def setRowIndicesUndefined: Self = StObject.set(x, "rowIndices", js.undefined)
    
    inline def setRowIndicesVarargs(value: Double*): Self = StObject.set(x, "rowIndices", js.Array(value*))
    
    inline def setTableRowStyle(value: SchemaTableRowStyle): Self = StObject.set(x, "tableRowStyle", value.asInstanceOf[js.Any])
    
    inline def setTableRowStyleUndefined: Self = StObject.set(x, "tableRowStyle", js.undefined)
    
    inline def setTableStartLocation(value: SchemaLocation): Self = StObject.set(x, "tableStartLocation", value.asInstanceOf[js.Any])
    
    inline def setTableStartLocationUndefined: Self = StObject.set(x, "tableStartLocation", js.undefined)
  }
}
