package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The request for clearing more than one range selected by a DataFilter in a
  * spreadsheet.
  */
trait SchemaBatchClearValuesByDataFilterRequest extends StObject {
  
  /**
    * The DataFilters used to determine which ranges to clear.
    */
  var dataFilters: js.UndefOr[js.Array[SchemaDataFilter]] = js.undefined
}
object SchemaBatchClearValuesByDataFilterRequest {
  
  inline def apply(): SchemaBatchClearValuesByDataFilterRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchClearValuesByDataFilterRequest]
  }
  
  extension [Self <: SchemaBatchClearValuesByDataFilterRequest](x: Self) {
    
    inline def setDataFilters(value: js.Array[SchemaDataFilter]): Self = StObject.set(x, "dataFilters", value.asInstanceOf[js.Any])
    
    inline def setDataFiltersUndefined: Self = StObject.set(x, "dataFilters", js.undefined)
    
    inline def setDataFiltersVarargs(value: SchemaDataFilter*): Self = StObject.set(x, "dataFilters", js.Array(value :_*))
  }
}
