package typings.googleapis.policysimulatorV1Mod.policysimulatorV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudPolicysimulatorV1ReplayResultsSummary extends StObject {
  
  /**
    * The number of replayed log entries with a difference between baseline and simulated policies.
    */
  var differenceCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The number of log entries that could not be replayed.
    */
  var errorCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The total number of log entries replayed.
    */
  var logCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The date of the newest log entry replayed.
    */
  var newestDate: js.UndefOr[SchemaGoogleTypeDate] = js.undefined
  
  /**
    * The date of the oldest log entry replayed.
    */
  var oldestDate: js.UndefOr[SchemaGoogleTypeDate] = js.undefined
  
  /**
    * The number of replayed log entries with no difference between baseline and simulated policies.
    */
  var unchangedCount: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGoogleCloudPolicysimulatorV1ReplayResultsSummary {
  
  inline def apply(): SchemaGoogleCloudPolicysimulatorV1ReplayResultsSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudPolicysimulatorV1ReplayResultsSummary]
  }
  
  extension [Self <: SchemaGoogleCloudPolicysimulatorV1ReplayResultsSummary](x: Self) {
    
    inline def setDifferenceCount(value: Double): Self = StObject.set(x, "differenceCount", value.asInstanceOf[js.Any])
    
    inline def setDifferenceCountNull: Self = StObject.set(x, "differenceCount", null)
    
    inline def setDifferenceCountUndefined: Self = StObject.set(x, "differenceCount", js.undefined)
    
    inline def setErrorCount(value: Double): Self = StObject.set(x, "errorCount", value.asInstanceOf[js.Any])
    
    inline def setErrorCountNull: Self = StObject.set(x, "errorCount", null)
    
    inline def setErrorCountUndefined: Self = StObject.set(x, "errorCount", js.undefined)
    
    inline def setLogCount(value: Double): Self = StObject.set(x, "logCount", value.asInstanceOf[js.Any])
    
    inline def setLogCountNull: Self = StObject.set(x, "logCount", null)
    
    inline def setLogCountUndefined: Self = StObject.set(x, "logCount", js.undefined)
    
    inline def setNewestDate(value: SchemaGoogleTypeDate): Self = StObject.set(x, "newestDate", value.asInstanceOf[js.Any])
    
    inline def setNewestDateUndefined: Self = StObject.set(x, "newestDate", js.undefined)
    
    inline def setOldestDate(value: SchemaGoogleTypeDate): Self = StObject.set(x, "oldestDate", value.asInstanceOf[js.Any])
    
    inline def setOldestDateUndefined: Self = StObject.set(x, "oldestDate", js.undefined)
    
    inline def setUnchangedCount(value: Double): Self = StObject.set(x, "unchangedCount", value.asInstanceOf[js.Any])
    
    inline def setUnchangedCountNull: Self = StObject.set(x, "unchangedCount", null)
    
    inline def setUnchangedCountUndefined: Self = StObject.set(x, "unchangedCount", js.undefined)
  }
}
