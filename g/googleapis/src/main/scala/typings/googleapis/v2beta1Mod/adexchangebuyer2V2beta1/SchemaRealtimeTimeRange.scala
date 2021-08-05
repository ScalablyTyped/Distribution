package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An open-ended realtime time range specified by the start timestamp. For
  * filter sets that specify a realtime time range RTB metrics continue to be
  * aggregated throughout the lifetime of the filter set.
  */
trait SchemaRealtimeTimeRange extends StObject {
  
  /**
    * The start timestamp of the real-time RTB metrics aggregation.
    */
  var startTimestamp: js.UndefOr[String] = js.undefined
}
object SchemaRealtimeTimeRange {
  
  inline def apply(): SchemaRealtimeTimeRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRealtimeTimeRange]
  }
  
  extension [Self <: SchemaRealtimeTimeRange](x: Self) {
    
    inline def setStartTimestamp(value: String): Self = StObject.set(x, "startTimestamp", value.asInstanceOf[js.Any])
    
    inline def setStartTimestampUndefined: Self = StObject.set(x, "startTimestamp", js.undefined)
  }
}
