package typings.googleapis.fitnessV1Mod.fitnessV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBucketByActivity extends StObject {
  
  /**
    * The default activity stream will be used if a specific
    * activityDataSourceId is not specified.
    */
  var activityDataSourceId: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies that only activity segments of duration longer than
    * minDurationMillis are considered and used as a container for aggregated
    * data.
    */
  var minDurationMillis: js.UndefOr[String] = js.undefined
}
object SchemaBucketByActivity {
  
  inline def apply(): SchemaBucketByActivity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBucketByActivity]
  }
  
  extension [Self <: SchemaBucketByActivity](x: Self) {
    
    inline def setActivityDataSourceId(value: String): Self = StObject.set(x, "activityDataSourceId", value.asInstanceOf[js.Any])
    
    inline def setActivityDataSourceIdUndefined: Self = StObject.set(x, "activityDataSourceId", js.undefined)
    
    inline def setMinDurationMillis(value: String): Self = StObject.set(x, "minDurationMillis", value.asInstanceOf[js.Any])
    
    inline def setMinDurationMillisUndefined: Self = StObject.set(x, "minDurationMillis", js.undefined)
  }
}
