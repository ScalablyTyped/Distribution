package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The request for retrieving a Spreadsheet.
  */
trait SchemaGetSpreadsheetByDataFilterRequest extends StObject {
  
  /**
    * The DataFilters used to select which ranges to retrieve from the
    * spreadsheet.
    */
  var dataFilters: js.UndefOr[js.Array[SchemaDataFilter]] = js.undefined
  
  /**
    * True if grid data should be returned. This parameter is ignored if a
    * field mask was set in the request.
    */
  var includeGridData: js.UndefOr[Boolean] = js.undefined
}
object SchemaGetSpreadsheetByDataFilterRequest {
  
  inline def apply(): SchemaGetSpreadsheetByDataFilterRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetSpreadsheetByDataFilterRequest]
  }
  
  extension [Self <: SchemaGetSpreadsheetByDataFilterRequest](x: Self) {
    
    inline def setDataFilters(value: js.Array[SchemaDataFilter]): Self = StObject.set(x, "dataFilters", value.asInstanceOf[js.Any])
    
    inline def setDataFiltersUndefined: Self = StObject.set(x, "dataFilters", js.undefined)
    
    inline def setDataFiltersVarargs(value: SchemaDataFilter*): Self = StObject.set(x, "dataFilters", js.Array(value :_*))
    
    inline def setIncludeGridData(value: Boolean): Self = StObject.set(x, "includeGridData", value.asInstanceOf[js.Any])
    
    inline def setIncludeGridDataUndefined: Self = StObject.set(x, "includeGridData", js.undefined)
  }
}
