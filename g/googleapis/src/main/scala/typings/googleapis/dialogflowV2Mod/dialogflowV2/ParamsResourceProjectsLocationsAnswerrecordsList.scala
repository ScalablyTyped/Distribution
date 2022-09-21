package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsAnswerrecordsList
  extends StObject
     with StandardParameters {
  
  /**
    * Optional. Filters to restrict results to specific answer records. Marked deprecated as it hasn't been, and isn't currently, supported. For more information about filtering, see [API Filtering](https://aip.dev/160).
    */
  var filter: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The maximum number of records to return in a single page. The server may return fewer records than this. If unspecified, we use 10. The maximum is 100.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Optional. The ListAnswerRecordsResponse.next_page_token value returned from a previous list request used to continue listing on the next page.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The project to list all answer records for in reverse chronological order. Format: `projects//locations/`.
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsAnswerrecordsList {
  
  inline def apply(): ParamsResourceProjectsLocationsAnswerrecordsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsAnswerrecordsList]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsAnswerrecordsList](x: Self) {
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
