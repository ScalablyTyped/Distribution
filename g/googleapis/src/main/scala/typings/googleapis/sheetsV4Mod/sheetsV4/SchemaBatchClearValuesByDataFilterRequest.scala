package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The request for clearing more than one range selected by a DataFilter in a
  * spreadsheet.
  */
@js.native
trait SchemaBatchClearValuesByDataFilterRequest extends StObject {
  
  /**
    * The DataFilters used to determine which ranges to clear.
    */
  var dataFilters: js.UndefOr[js.Array[SchemaDataFilter]] = js.native
}
object SchemaBatchClearValuesByDataFilterRequest {
  
  @scala.inline
  def apply(): SchemaBatchClearValuesByDataFilterRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchClearValuesByDataFilterRequest]
  }
  
  @scala.inline
  implicit class SchemaBatchClearValuesByDataFilterRequestMutableBuilder[Self <: SchemaBatchClearValuesByDataFilterRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataFilters(value: js.Array[SchemaDataFilter]): Self = StObject.set(x, "dataFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataFiltersUndefined: Self = StObject.set(x, "dataFilters", js.undefined)
    
    @scala.inline
    def setDataFiltersVarargs(value: SchemaDataFilter*): Self = StObject.set(x, "dataFilters", js.Array(value :_*))
  }
}
