package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The request for updating any aspect of a spreadsheet.
  */
trait SchemaBatchUpdateSpreadsheetRequest extends StObject {
  
  /**
    * Determines if the update response should include the spreadsheet
    * resource.
    */
  var includeSpreadsheetInResponse: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A list of updates to apply to the spreadsheet. Requests will be applied
    * in the order they are specified. If any request is not valid, no requests
    * will be applied.
    */
  var requests: js.UndefOr[js.Array[SchemaRequest]] = js.undefined
  
  /**
    * True if grid data should be returned. Meaningful only if if
    * include_spreadsheet_in_response is &#39;true&#39;. This parameter is
    * ignored if a field mask was set in the request.
    */
  var responseIncludeGridData: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Limits the ranges included in the response spreadsheet. Meaningful only
    * if include_spreadsheet_response is &#39;true&#39;.
    */
  var responseRanges: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaBatchUpdateSpreadsheetRequest {
  
  @scala.inline
  def apply(): SchemaBatchUpdateSpreadsheetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchUpdateSpreadsheetRequest]
  }
  
  @scala.inline
  implicit class SchemaBatchUpdateSpreadsheetRequestMutableBuilder[Self <: SchemaBatchUpdateSpreadsheetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIncludeSpreadsheetInResponse(value: Boolean): Self = StObject.set(x, "includeSpreadsheetInResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeSpreadsheetInResponseUndefined: Self = StObject.set(x, "includeSpreadsheetInResponse", js.undefined)
    
    @scala.inline
    def setRequests(value: js.Array[SchemaRequest]): Self = StObject.set(x, "requests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestsUndefined: Self = StObject.set(x, "requests", js.undefined)
    
    @scala.inline
    def setRequestsVarargs(value: SchemaRequest*): Self = StObject.set(x, "requests", js.Array(value :_*))
    
    @scala.inline
    def setResponseIncludeGridData(value: Boolean): Self = StObject.set(x, "responseIncludeGridData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseIncludeGridDataUndefined: Self = StObject.set(x, "responseIncludeGridData", js.undefined)
    
    @scala.inline
    def setResponseRanges(value: js.Array[String]): Self = StObject.set(x, "responseRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseRangesUndefined: Self = StObject.set(x, "responseRanges", js.undefined)
    
    @scala.inline
    def setResponseRangesVarargs(value: String*): Self = StObject.set(x, "responseRanges", js.Array(value :_*))
  }
}
