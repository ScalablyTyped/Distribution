package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The response when updating a range of values by a data filter in a
  * spreadsheet.
  */
trait SchemaUpdateValuesByDataFilterResponse extends StObject {
  
  /**
    * The data filter that selected the range that was updated.
    */
  var dataFilter: js.UndefOr[SchemaDataFilter] = js.undefined
  
  /**
    * The number of cells updated.
    */
  var updatedCells: js.UndefOr[Double] = js.undefined
  
  /**
    * The number of columns where at least one cell in the column was updated.
    */
  var updatedColumns: js.UndefOr[Double] = js.undefined
  
  /**
    * The values of the cells in the range matched by the dataFilter after all
    * updates were applied. This is only included if the request&#39;s
    * `includeValuesInResponse` field was `true`.
    */
  var updatedData: js.UndefOr[SchemaValueRange] = js.undefined
  
  /**
    * The range (in A1 notation) that updates were applied to.
    */
  var updatedRange: js.UndefOr[String] = js.undefined
  
  /**
    * The number of rows where at least one cell in the row was updated.
    */
  var updatedRows: js.UndefOr[Double] = js.undefined
}
object SchemaUpdateValuesByDataFilterResponse {
  
  inline def apply(): SchemaUpdateValuesByDataFilterResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateValuesByDataFilterResponse]
  }
  
  extension [Self <: SchemaUpdateValuesByDataFilterResponse](x: Self) {
    
    inline def setDataFilter(value: SchemaDataFilter): Self = StObject.set(x, "dataFilter", value.asInstanceOf[js.Any])
    
    inline def setDataFilterUndefined: Self = StObject.set(x, "dataFilter", js.undefined)
    
    inline def setUpdatedCells(value: Double): Self = StObject.set(x, "updatedCells", value.asInstanceOf[js.Any])
    
    inline def setUpdatedCellsUndefined: Self = StObject.set(x, "updatedCells", js.undefined)
    
    inline def setUpdatedColumns(value: Double): Self = StObject.set(x, "updatedColumns", value.asInstanceOf[js.Any])
    
    inline def setUpdatedColumnsUndefined: Self = StObject.set(x, "updatedColumns", js.undefined)
    
    inline def setUpdatedData(value: SchemaValueRange): Self = StObject.set(x, "updatedData", value.asInstanceOf[js.Any])
    
    inline def setUpdatedDataUndefined: Self = StObject.set(x, "updatedData", js.undefined)
    
    inline def setUpdatedRange(value: String): Self = StObject.set(x, "updatedRange", value.asInstanceOf[js.Any])
    
    inline def setUpdatedRangeUndefined: Self = StObject.set(x, "updatedRange", js.undefined)
    
    inline def setUpdatedRows(value: Double): Self = StObject.set(x, "updatedRows", value.asInstanceOf[js.Any])
    
    inline def setUpdatedRowsUndefined: Self = StObject.set(x, "updatedRows", js.undefined)
  }
}
