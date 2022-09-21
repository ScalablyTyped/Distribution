package typings.googleapis.contactcenterinsightsV1Mod.contactcenterinsightsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudContactcenterinsightsV1CalculateStatsResponseTimeSeriesInterval extends StObject {
  
  /**
    * The number of conversations created in this interval.
    */
  var conversationCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The start time of this interval.
    */
  var startTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudContactcenterinsightsV1CalculateStatsResponseTimeSeriesInterval {
  
  inline def apply(): SchemaGoogleCloudContactcenterinsightsV1CalculateStatsResponseTimeSeriesInterval = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudContactcenterinsightsV1CalculateStatsResponseTimeSeriesInterval]
  }
  
  extension [Self <: SchemaGoogleCloudContactcenterinsightsV1CalculateStatsResponseTimeSeriesInterval](x: Self) {
    
    inline def setConversationCount(value: Double): Self = StObject.set(x, "conversationCount", value.asInstanceOf[js.Any])
    
    inline def setConversationCountNull: Self = StObject.set(x, "conversationCount", null)
    
    inline def setConversationCountUndefined: Self = StObject.set(x, "conversationCount", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
