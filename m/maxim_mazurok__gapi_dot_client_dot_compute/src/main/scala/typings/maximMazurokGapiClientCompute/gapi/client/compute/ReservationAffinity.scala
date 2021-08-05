package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReservationAffinity extends StObject {
  
  /**
    * Specifies the type of reservation from which this instance can consume resources: ANY_RESERVATION (default), SPECIFIC_RESERVATION, or NO_RESERVATION. See  Consuming reserved
    * instances for examples.
    */
  var consumeReservationType: js.UndefOr[String] = js.undefined
  
  /**
    * Corresponds to the label key of a reservation resource. To target a SPECIFIC_RESERVATION by name, specify googleapis.com/reservation-name as the key and specify the name of your
    * reservation as its value.
    */
  var key: js.UndefOr[String] = js.undefined
  
  /** Corresponds to the label values of a reservation resource. */
  var values: js.UndefOr[js.Array[String]] = js.undefined
}
object ReservationAffinity {
  
  inline def apply(): ReservationAffinity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReservationAffinity]
  }
  
  extension [Self <: ReservationAffinity](x: Self) {
    
    inline def setConsumeReservationType(value: String): Self = StObject.set(x, "consumeReservationType", value.asInstanceOf[js.Any])
    
    inline def setConsumeReservationTypeUndefined: Self = StObject.set(x, "consumeReservationType", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
