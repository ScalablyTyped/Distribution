package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The request for retrieving a Spreadsheet.
  */
@js.native
trait SchemaGetSpreadsheetByDataFilterRequest extends StObject {
  
  /**
    * The DataFilters used to select which ranges to retrieve from the
    * spreadsheet.
    */
  var dataFilters: js.UndefOr[js.Array[SchemaDataFilter]] = js.native
  
  /**
    * True if grid data should be returned. This parameter is ignored if a
    * field mask was set in the request.
    */
  var includeGridData: js.UndefOr[Boolean] = js.native
}
object SchemaGetSpreadsheetByDataFilterRequest {
  
  @scala.inline
  def apply(): SchemaGetSpreadsheetByDataFilterRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetSpreadsheetByDataFilterRequest]
  }
  
  @scala.inline
  implicit class SchemaGetSpreadsheetByDataFilterRequestMutableBuilder[Self <: SchemaGetSpreadsheetByDataFilterRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataFilters(value: js.Array[SchemaDataFilter]): Self = StObject.set(x, "dataFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataFiltersUndefined: Self = StObject.set(x, "dataFilters", js.undefined)
    
    @scala.inline
    def setDataFiltersVarargs(value: SchemaDataFilter*): Self = StObject.set(x, "dataFilters", js.Array(value :_*))
    
    @scala.inline
    def setIncludeGridData(value: Boolean): Self = StObject.set(x, "includeGridData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeGridDataUndefined: Self = StObject.set(x, "includeGridData", js.undefined)
  }
}
