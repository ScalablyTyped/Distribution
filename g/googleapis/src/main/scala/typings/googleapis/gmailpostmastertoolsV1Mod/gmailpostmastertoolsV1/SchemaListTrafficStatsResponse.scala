package typings.googleapis.gmailpostmastertoolsV1Mod.gmailpostmastertoolsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListTrafficStatsResponse extends StObject {
  
  /**
    * Token to retrieve the next page of results, or empty if there are no more results in the list.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The list of TrafficStats.
    */
  var trafficStats: js.UndefOr[js.Array[SchemaTrafficStats]] = js.undefined
}
object SchemaListTrafficStatsResponse {
  
  inline def apply(): SchemaListTrafficStatsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListTrafficStatsResponse]
  }
  
  extension [Self <: SchemaListTrafficStatsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTrafficStats(value: js.Array[SchemaTrafficStats]): Self = StObject.set(x, "trafficStats", value.asInstanceOf[js.Any])
    
    inline def setTrafficStatsUndefined: Self = StObject.set(x, "trafficStats", js.undefined)
    
    inline def setTrafficStatsVarargs(value: SchemaTrafficStats*): Self = StObject.set(x, "trafficStats", js.Array(value*))
  }
}
