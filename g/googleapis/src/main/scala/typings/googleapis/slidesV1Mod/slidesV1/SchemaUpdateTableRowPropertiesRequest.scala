package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Updates the properties of a Table row.
  */
trait SchemaUpdateTableRowPropertiesRequest extends StObject {
  
  /**
    * The fields that should be updated.  At least one field must be specified.
    * The root `tableRowProperties` is implied and should not be specified. A
    * single `&quot;*&quot;` can be used as short-hand for listing every field.
    * For example to update the minimum row height, set `fields` to
    * `&quot;min_row_height&quot;`.  If &#39;&quot;min_row_height&quot;&#39; is
    * included in the field mask but the property is left unset, the minimum
    * row height will default to 0.
    */
  var fields: js.UndefOr[String] = js.undefined
  
  /**
    * The object ID of the table.
    */
  var objectId: js.UndefOr[String] = js.undefined
  
  /**
    * The list of zero-based indices specifying which rows to update. If no
    * indices are provided, all rows in the table will be updated.
    */
  var rowIndices: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * The table row properties to update.
    */
  var tableRowProperties: js.UndefOr[SchemaTableRowProperties] = js.undefined
}
object SchemaUpdateTableRowPropertiesRequest {
  
  @scala.inline
  def apply(): SchemaUpdateTableRowPropertiesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateTableRowPropertiesRequest]
  }
  
  @scala.inline
  implicit class SchemaUpdateTableRowPropertiesRequestMutableBuilder[Self <: SchemaUpdateTableRowPropertiesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
    
    @scala.inline
    def setRowIndices(value: js.Array[Double]): Self = StObject.set(x, "rowIndices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowIndicesUndefined: Self = StObject.set(x, "rowIndices", js.undefined)
    
    @scala.inline
    def setRowIndicesVarargs(value: Double*): Self = StObject.set(x, "rowIndices", js.Array(value :_*))
    
    @scala.inline
    def setTableRowProperties(value: SchemaTableRowProperties): Self = StObject.set(x, "tableRowProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableRowPropertiesUndefined: Self = StObject.set(x, "tableRowProperties", js.undefined)
  }
}
