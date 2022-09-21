package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRealtimeTimeRange extends StObject {
  
  /**
    * The start timestamp of the real-time RTB metrics aggregation.
    */
  var startTimestamp: js.UndefOr[String | Null] = js.undefined
}
object SchemaRealtimeTimeRange {
  
  inline def apply(): SchemaRealtimeTimeRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRealtimeTimeRange]
  }
  
  extension [Self <: SchemaRealtimeTimeRange](x: Self) {
    
    inline def setStartTimestamp(value: String): Self = StObject.set(x, "startTimestamp", value.asInstanceOf[js.Any])
    
    inline def setStartTimestampNull: Self = StObject.set(x, "startTimestamp", null)
    
    inline def setStartTimestampUndefined: Self = StObject.set(x, "startTimestamp", js.undefined)
  }
}
