package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Updates all cells in the range to the values in the given Cell object. Only
  * the fields listed in the fields field are updated; others are unchanged. If
  * writing a cell with a formula, the formula&#39;s ranges will automatically
  * increment for each field in the range. For example, if writing a cell with
  * formula `=A1` into range B2:C4, B2 would be `=A1`, B3 would be `=A2`, B4
  * would be `=A3`, C2 would be `=B1`, C3 would be `=B2`, C4 would be `=B3`. To
  * keep the formula&#39;s ranges static, use the `$` indicator. For example,
  * use the formula `=$A$1` to prevent both the row and the column from
  * incrementing.
  */
trait SchemaRepeatCellRequest extends StObject {
  
  /**
    * The data to write.
    */
  var cell: js.UndefOr[SchemaCellData] = js.undefined
  
  /**
    * The fields that should be updated.  At least one field must be specified.
    * The root `cell` is implied and should not be specified. A single
    * `&quot;*&quot;` can be used as short-hand for listing every field.
    */
  var fields: js.UndefOr[String] = js.undefined
  
  /**
    * The range to repeat the cell in.
    */
  var range: js.UndefOr[SchemaGridRange] = js.undefined
}
object SchemaRepeatCellRequest {
  
  @scala.inline
  def apply(): SchemaRepeatCellRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRepeatCellRequest]
  }
  
  @scala.inline
  implicit class SchemaRepeatCellRequestMutableBuilder[Self <: SchemaRepeatCellRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCell(value: SchemaCellData): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellUndefined: Self = StObject.set(x, "cell", js.undefined)
    
    @scala.inline
    def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setRange(value: SchemaGridRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
  }
}
