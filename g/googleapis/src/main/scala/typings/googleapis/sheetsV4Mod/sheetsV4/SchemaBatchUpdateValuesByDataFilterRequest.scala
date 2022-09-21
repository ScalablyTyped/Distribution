package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBatchUpdateValuesByDataFilterRequest extends StObject {
  
  /**
    * The new values to apply to the spreadsheet. If more than one range is matched by the specified DataFilter the specified values are applied to all of those ranges.
    */
  var data: js.UndefOr[js.Array[SchemaDataFilterValueRange]] = js.undefined
  
  /**
    * Determines if the update response should include the values of the cells that were updated. By default, responses do not include the updated values. The `updatedData` field within each of the BatchUpdateValuesResponse.responses contains the updated values. If the range to write was larger than the range actually written, the response includes all values in the requested range (excluding trailing empty rows and columns).
    */
  var includeValuesInResponse: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Determines how dates, times, and durations in the response should be rendered. This is ignored if response_value_render_option is FORMATTED_VALUE. The default dateTime render option is SERIAL_NUMBER.
    */
  var responseDateTimeRenderOption: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Determines how values in the response should be rendered. The default render option is FORMATTED_VALUE.
    */
  var responseValueRenderOption: js.UndefOr[String | Null] = js.undefined
  
  /**
    * How the input data should be interpreted.
    */
  var valueInputOption: js.UndefOr[String | Null] = js.undefined
}
object SchemaBatchUpdateValuesByDataFilterRequest {
  
  inline def apply(): SchemaBatchUpdateValuesByDataFilterRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchUpdateValuesByDataFilterRequest]
  }
  
  extension [Self <: SchemaBatchUpdateValuesByDataFilterRequest](x: Self) {
    
    inline def setData(value: js.Array[SchemaDataFilterValueRange]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataVarargs(value: SchemaDataFilterValueRange*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setIncludeValuesInResponse(value: Boolean): Self = StObject.set(x, "includeValuesInResponse", value.asInstanceOf[js.Any])
    
    inline def setIncludeValuesInResponseNull: Self = StObject.set(x, "includeValuesInResponse", null)
    
    inline def setIncludeValuesInResponseUndefined: Self = StObject.set(x, "includeValuesInResponse", js.undefined)
    
    inline def setResponseDateTimeRenderOption(value: String): Self = StObject.set(x, "responseDateTimeRenderOption", value.asInstanceOf[js.Any])
    
    inline def setResponseDateTimeRenderOptionNull: Self = StObject.set(x, "responseDateTimeRenderOption", null)
    
    inline def setResponseDateTimeRenderOptionUndefined: Self = StObject.set(x, "responseDateTimeRenderOption", js.undefined)
    
    inline def setResponseValueRenderOption(value: String): Self = StObject.set(x, "responseValueRenderOption", value.asInstanceOf[js.Any])
    
    inline def setResponseValueRenderOptionNull: Self = StObject.set(x, "responseValueRenderOption", null)
    
    inline def setResponseValueRenderOptionUndefined: Self = StObject.set(x, "responseValueRenderOption", js.undefined)
    
    inline def setValueInputOption(value: String): Self = StObject.set(x, "valueInputOption", value.asInstanceOf[js.Any])
    
    inline def setValueInputOptionNull: Self = StObject.set(x, "valueInputOption", null)
    
    inline def setValueInputOptionUndefined: Self = StObject.set(x, "valueInputOption", js.undefined)
  }
}
