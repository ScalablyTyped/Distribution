package typings.googleapis.youtubereportingV1Mod.youtubereportingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for ReportingService.ListReportTypes.
  */
trait SchemaListReportTypesResponse extends StObject {
  
  /**
    * A token to retrieve next page of results. Pass this value in the
    * ListReportTypesRequest.page_token field in the subsequent call to
    * `ListReportTypes` method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * The list of report types.
    */
  var reportTypes: js.UndefOr[js.Array[SchemaReportType]] = js.undefined
}
object SchemaListReportTypesResponse {
  
  @scala.inline
  def apply(): SchemaListReportTypesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListReportTypesResponse]
  }
  
  @scala.inline
  implicit class SchemaListReportTypesResponseMutableBuilder[Self <: SchemaListReportTypesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setReportTypes(value: js.Array[SchemaReportType]): Self = StObject.set(x, "reportTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportTypesUndefined: Self = StObject.set(x, "reportTypes", js.undefined)
    
    @scala.inline
    def setReportTypesVarargs(value: SchemaReportType*): Self = StObject.set(x, "reportTypes", js.Array(value :_*))
  }
}
