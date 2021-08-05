package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PageInfo extends StObject {
  
  /** Maximum number of results returned in one page. ! The number of results included in the API response. */
  var resultPerPage: js.UndefOr[Double] = js.undefined
  
  /** Index of the first result returned in the current page. */
  var startIndex: js.UndefOr[Double] = js.undefined
  
  /** Total number of results available on the backend ! The total number of results in the result set. */
  var totalResults: js.UndefOr[Double] = js.undefined
}
object PageInfo {
  
  inline def apply(): PageInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageInfo]
  }
  
  extension [Self <: PageInfo](x: Self) {
    
    inline def setResultPerPage(value: Double): Self = StObject.set(x, "resultPerPage", value.asInstanceOf[js.Any])
    
    inline def setResultPerPageUndefined: Self = StObject.set(x, "resultPerPage", js.undefined)
    
    inline def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
    
    inline def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
    
    inline def setTotalResults(value: Double): Self = StObject.set(x, "totalResults", value.asInstanceOf[js.Any])
    
    inline def setTotalResultsUndefined: Self = StObject.set(x, "totalResults", js.undefined)
  }
}
