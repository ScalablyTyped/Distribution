package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RealtimeTimeRange extends StObject {
  
  /** The start timestamp of the real-time RTB metrics aggregation. */
  var startTimestamp: js.UndefOr[String] = js.undefined
}
object RealtimeTimeRange {
  
  inline def apply(): RealtimeTimeRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RealtimeTimeRange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RealtimeTimeRange] (val x: Self) extends AnyVal {
    
    inline def setStartTimestamp(value: String): Self = StObject.set(x, "startTimestamp", value.asInstanceOf[js.Any])
    
    inline def setStartTimestampUndefined: Self = StObject.set(x, "startTimestamp", js.undefined)
  }
}
