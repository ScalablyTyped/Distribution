package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPageInfo extends StObject {
  
  /**
    * The number of results included in the API response.
    */
  var resultsPerPage: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The total number of results in the result set.
    */
  var totalResults: js.UndefOr[Double | Null] = js.undefined
}
object SchemaPageInfo {
  
  inline def apply(): SchemaPageInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPageInfo]
  }
  
  extension [Self <: SchemaPageInfo](x: Self) {
    
    inline def setResultsPerPage(value: Double): Self = StObject.set(x, "resultsPerPage", value.asInstanceOf[js.Any])
    
    inline def setResultsPerPageNull: Self = StObject.set(x, "resultsPerPage", null)
    
    inline def setResultsPerPageUndefined: Self = StObject.set(x, "resultsPerPage", js.undefined)
    
    inline def setTotalResults(value: Double): Self = StObject.set(x, "totalResults", value.asInstanceOf[js.Any])
    
    inline def setTotalResultsNull: Self = StObject.set(x, "totalResults", null)
    
    inline def setTotalResultsUndefined: Self = StObject.set(x, "totalResults", js.undefined)
  }
}
