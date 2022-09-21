package typings.googleapis.fitnessV1Mod.fitnessV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBucketByTime extends StObject {
  
  /**
    * Specifies that result buckets aggregate data by exactly durationMillis time frames. Time frames that contain no data will be included in the response with an empty dataset.
    */
  var durationMillis: js.UndefOr[String | Null] = js.undefined
  
  var period: js.UndefOr[SchemaBucketByTimePeriod] = js.undefined
}
object SchemaBucketByTime {
  
  inline def apply(): SchemaBucketByTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBucketByTime]
  }
  
  extension [Self <: SchemaBucketByTime](x: Self) {
    
    inline def setDurationMillis(value: String): Self = StObject.set(x, "durationMillis", value.asInstanceOf[js.Any])
    
    inline def setDurationMillisNull: Self = StObject.set(x, "durationMillis", null)
    
    inline def setDurationMillisUndefined: Self = StObject.set(x, "durationMillis", js.undefined)
    
    inline def setPeriod(value: SchemaBucketByTimePeriod): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
  }
}
