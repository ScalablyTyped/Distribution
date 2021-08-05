package typings.googleapis.youtubereportingV1Mod.youtubereportingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for ReportingService.ListReports.
  */
trait SchemaListReportsResponse extends StObject {
  
  /**
    * A token to retrieve next page of results. Pass this value in the
    * ListReportsRequest.page_token field in the subsequent call to
    * `ListReports` method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * The list of report types.
    */
  var reports: js.UndefOr[js.Array[SchemaReport]] = js.undefined
}
object SchemaListReportsResponse {
  
  inline def apply(): SchemaListReportsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListReportsResponse]
  }
  
  extension [Self <: SchemaListReportsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setReports(value: js.Array[SchemaReport]): Self = StObject.set(x, "reports", value.asInstanceOf[js.Any])
    
    inline def setReportsUndefined: Self = StObject.set(x, "reports", js.undefined)
    
    inline def setReportsVarargs(value: SchemaReport*): Self = StObject.set(x, "reports", js.Array(value :_*))
  }
}
