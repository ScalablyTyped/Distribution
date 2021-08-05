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
  
  inline def apply(): SchemaListReportTypesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListReportTypesResponse]
  }
  
  extension [Self <: SchemaListReportTypesResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setReportTypes(value: js.Array[SchemaReportType]): Self = StObject.set(x, "reportTypes", value.asInstanceOf[js.Any])
    
    inline def setReportTypesUndefined: Self = StObject.set(x, "reportTypes", js.undefined)
    
    inline def setReportTypesVarargs(value: SchemaReportType*): Self = StObject.set(x, "reportTypes", js.Array(value :_*))
  }
}
