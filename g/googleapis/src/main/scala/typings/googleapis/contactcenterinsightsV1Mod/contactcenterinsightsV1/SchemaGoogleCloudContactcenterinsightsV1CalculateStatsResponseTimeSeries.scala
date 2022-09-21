package typings.googleapis.contactcenterinsightsV1Mod.contactcenterinsightsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudContactcenterinsightsV1CalculateStatsResponseTimeSeries extends StObject {
  
  /**
    * The duration of each interval.
    */
  var intervalDuration: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An ordered list of intervals from earliest to latest, where each interval represents the number of conversations that transpired during the time window.
    */
  var points: js.UndefOr[
    js.Array[SchemaGoogleCloudContactcenterinsightsV1CalculateStatsResponseTimeSeriesInterval]
  ] = js.undefined
}
object SchemaGoogleCloudContactcenterinsightsV1CalculateStatsResponseTimeSeries {
  
  inline def apply(): SchemaGoogleCloudContactcenterinsightsV1CalculateStatsResponseTimeSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudContactcenterinsightsV1CalculateStatsResponseTimeSeries]
  }
  
  extension [Self <: SchemaGoogleCloudContactcenterinsightsV1CalculateStatsResponseTimeSeries](x: Self) {
    
    inline def setIntervalDuration(value: String): Self = StObject.set(x, "intervalDuration", value.asInstanceOf[js.Any])
    
    inline def setIntervalDurationNull: Self = StObject.set(x, "intervalDuration", null)
    
    inline def setIntervalDurationUndefined: Self = StObject.set(x, "intervalDuration", js.undefined)
    
    inline def setPoints(value: js.Array[SchemaGoogleCloudContactcenterinsightsV1CalculateStatsResponseTimeSeriesInterval]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    inline def setPointsUndefined: Self = StObject.set(x, "points", js.undefined)
    
    inline def setPointsVarargs(value: SchemaGoogleCloudContactcenterinsightsV1CalculateStatsResponseTimeSeriesInterval*): Self = StObject.set(x, "points", js.Array(value*))
  }
}
