package typings.maximMazurokGapiClientAdsense.gapi.client.adsense

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSavedReportsResponse extends StObject {
  
  /** Continuation token used to page through reports. To retrieve the next page of the results, set the next request's "page_token" value to this. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** The reports returned in this list response. */
  var savedReports: js.UndefOr[js.Array[SavedReport]] = js.undefined
}
object ListSavedReportsResponse {
  
  inline def apply(): ListSavedReportsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSavedReportsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListSavedReportsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setSavedReports(value: js.Array[SavedReport]): Self = StObject.set(x, "savedReports", value.asInstanceOf[js.Any])
    
    inline def setSavedReportsUndefined: Self = StObject.set(x, "savedReports", js.undefined)
    
    inline def setSavedReportsVarargs(value: SavedReport*): Self = StObject.set(x, "savedReports", js.Array(value*))
  }
}
