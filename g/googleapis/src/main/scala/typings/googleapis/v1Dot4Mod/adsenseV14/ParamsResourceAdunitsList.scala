package typings.googleapis.v1Dot4Mod.adsenseV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAdunitsList
  extends StObject
     with StandardParameters {
  
  /**
    * Ad client for which to list ad units.
    */
  var adClientId: js.UndefOr[String] = js.undefined
  
  /**
    * Whether to include inactive ad units. Default: true.
    */
  var includeInactive: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The maximum number of ad units to include in the response, used for paging.
    */
  var maxResults: js.UndefOr[Double] = js.undefined
  
  /**
    * A continuation token, used to page through ad units. To retrieve the next page, set this parameter to the value of "nextPageToken" from the previous response.
    */
  var pageToken: js.UndefOr[String] = js.undefined
}
object ParamsResourceAdunitsList {
  
  inline def apply(): ParamsResourceAdunitsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAdunitsList]
  }
  
  extension [Self <: ParamsResourceAdunitsList](x: Self) {
    
    inline def setAdClientId(value: String): Self = StObject.set(x, "adClientId", value.asInstanceOf[js.Any])
    
    inline def setAdClientIdUndefined: Self = StObject.set(x, "adClientId", js.undefined)
    
    inline def setIncludeInactive(value: Boolean): Self = StObject.set(x, "includeInactive", value.asInstanceOf[js.Any])
    
    inline def setIncludeInactiveUndefined: Self = StObject.set(x, "includeInactive", js.undefined)
    
    inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
  }
}
