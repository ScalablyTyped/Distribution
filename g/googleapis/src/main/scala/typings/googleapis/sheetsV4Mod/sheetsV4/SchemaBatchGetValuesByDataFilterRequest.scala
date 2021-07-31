package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The request for retrieving a range of values in a spreadsheet selected by a
  * set of DataFilters.
  */
trait SchemaBatchGetValuesByDataFilterRequest extends StObject {
  
  /**
    * The data filters used to match the ranges of values to retrieve.  Ranges
    * that match any of the specified data filters will be included in the
    * response.
    */
  var dataFilters: js.UndefOr[js.Array[SchemaDataFilter]] = js.undefined
  
  /**
    * How dates, times, and durations should be represented in the output. This
    * is ignored if value_render_option is FORMATTED_VALUE. The default
    * dateTime render option is [DateTimeRenderOption.SERIAL_NUMBER].
    */
  var dateTimeRenderOption: js.UndefOr[String] = js.undefined
  
  /**
    * The major dimension that results should use.  For example, if the
    * spreadsheet data is: `A1=1,B1=2,A2=3,B2=4`, then a request that selects
    * that range and sets `majorDimension=ROWS` will return `[[1,2],[3,4]]`,
    * whereas a request that sets `majorDimension=COLUMNS` will return
    * `[[1,3],[2,4]]`.
    */
  var majorDimension: js.UndefOr[String] = js.undefined
  
  /**
    * How values should be represented in the output. The default render option
    * is ValueRenderOption.FORMATTED_VALUE.
    */
  var valueRenderOption: js.UndefOr[String] = js.undefined
}
object SchemaBatchGetValuesByDataFilterRequest {
  
  @scala.inline
  def apply(): SchemaBatchGetValuesByDataFilterRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchGetValuesByDataFilterRequest]
  }
  
  @scala.inline
  implicit class SchemaBatchGetValuesByDataFilterRequestMutableBuilder[Self <: SchemaBatchGetValuesByDataFilterRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataFilters(value: js.Array[SchemaDataFilter]): Self = StObject.set(x, "dataFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataFiltersUndefined: Self = StObject.set(x, "dataFilters", js.undefined)
    
    @scala.inline
    def setDataFiltersVarargs(value: SchemaDataFilter*): Self = StObject.set(x, "dataFilters", js.Array(value :_*))
    
    @scala.inline
    def setDateTimeRenderOption(value: String): Self = StObject.set(x, "dateTimeRenderOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateTimeRenderOptionUndefined: Self = StObject.set(x, "dateTimeRenderOption", js.undefined)
    
    @scala.inline
    def setMajorDimension(value: String): Self = StObject.set(x, "majorDimension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMajorDimensionUndefined: Self = StObject.set(x, "majorDimension", js.undefined)
    
    @scala.inline
    def setValueRenderOption(value: String): Self = StObject.set(x, "valueRenderOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueRenderOptionUndefined: Self = StObject.set(x, "valueRenderOption", js.undefined)
  }
}
