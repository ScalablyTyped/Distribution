package typings.googleapis.pubsubliteV1Mod.pubsubliteV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReservationConfig extends StObject {
  
  /**
    * The Reservation to use for this topic's throughput capacity. Structured like: projects/{project_number\}/locations/{location\}/reservations/{reservation_id\}
    */
  var throughputReservation: js.UndefOr[String | Null] = js.undefined
}
object SchemaReservationConfig {
  
  inline def apply(): SchemaReservationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReservationConfig]
  }
  
  extension [Self <: SchemaReservationConfig](x: Self) {
    
    inline def setThroughputReservation(value: String): Self = StObject.set(x, "throughputReservation", value.asInstanceOf[js.Any])
    
    inline def setThroughputReservationNull: Self = StObject.set(x, "throughputReservation", null)
    
    inline def setThroughputReservationUndefined: Self = StObject.set(x, "throughputReservation", js.undefined)
  }
}
