package typings.googleapis.v41Mod.adsensehostV41

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceUrlchannelsList
  extends StObject
     with StandardParameters {
  
  /**
    * Ad client for which to list URL channels.
    */
  var adClientId: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of URL channels to include in the response, used for paging.
    */
  var maxResults: js.UndefOr[Double] = js.undefined
  
  /**
    * A continuation token, used to page through URL channels. To retrieve the next page, set this parameter to the value of "nextPageToken" from the previous response.
    */
  var pageToken: js.UndefOr[String] = js.undefined
}
object ParamsResourceUrlchannelsList {
  
  inline def apply(): ParamsResourceUrlchannelsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceUrlchannelsList]
  }
  
  extension [Self <: ParamsResourceUrlchannelsList](x: Self) {
    
    inline def setAdClientId(value: String): Self = StObject.set(x, "adClientId", value.asInstanceOf[js.Any])
    
    inline def setAdClientIdUndefined: Self = StObject.set(x, "adClientId", js.undefined)
    
    inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
  }
}
