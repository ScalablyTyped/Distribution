package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Paging details for lists of resources, including total number of items
  * available and number of resources returned in a single page.
  */
trait SchemaPageInfo extends StObject {
  
  /**
    * The number of results included in the API response.
    */
  var resultsPerPage: js.UndefOr[Double] = js.undefined
  
  /**
    * The total number of results in the result set.
    */
  var totalResults: js.UndefOr[Double] = js.undefined
}
object SchemaPageInfo {
  
  inline def apply(): SchemaPageInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPageInfo]
  }
  
  extension [Self <: SchemaPageInfo](x: Self) {
    
    inline def setResultsPerPage(value: Double): Self = StObject.set(x, "resultsPerPage", value.asInstanceOf[js.Any])
    
    inline def setResultsPerPageUndefined: Self = StObject.set(x, "resultsPerPage", js.undefined)
    
    inline def setTotalResults(value: Double): Self = StObject.set(x, "totalResults", value.asInstanceOf[js.Any])
    
    inline def setTotalResultsUndefined: Self = StObject.set(x, "totalResults", js.undefined)
  }
}
