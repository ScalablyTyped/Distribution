package typings.googleapis.v1Dot4Mod.adsenseV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsSavedadstylesList
  extends StObject
     with StandardParameters {
  
  /**
    * Account for which to list saved ad styles.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of saved ad styles to include in the response, used for paging.
    */
  var maxResults: js.UndefOr[Double] = js.undefined
  
  /**
    * A continuation token, used to page through saved ad styles. To retrieve the next page, set this parameter to the value of "nextPageToken" from the previous response.
    */
  var pageToken: js.UndefOr[String] = js.undefined
}
object ParamsResourceAccountsSavedadstylesList {
  
  inline def apply(): ParamsResourceAccountsSavedadstylesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsSavedadstylesList]
  }
  
  extension [Self <: ParamsResourceAccountsSavedadstylesList](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
  }
}
