package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReservationAffinity extends StObject {
  
  /**
    * Specifies the type of reservation from which this instance can consume resources: ANY_RESERVATION (default), SPECIFIC_RESERVATION, or NO_RESERVATION. See  Consuming reserved
    * instances for examples.
    */
  var consumeReservationType: js.UndefOr[String] = js.native
  
  /**
    * Corresponds to the label key of a reservation resource. To target a SPECIFIC_RESERVATION by name, specify googleapis.com/reservation-name as the key and specify the name of your
    * reservation as its value.
    */
  var key: js.UndefOr[String] = js.native
  
  /** Corresponds to the label values of a reservation resource. */
  var values: js.UndefOr[js.Array[String]] = js.native
}
object ReservationAffinity {
  
  @scala.inline
  def apply(): ReservationAffinity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReservationAffinity]
  }
  
  @scala.inline
  implicit class ReservationAffinityMutableBuilder[Self <: ReservationAffinity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConsumeReservationType(value: String): Self = StObject.set(x, "consumeReservationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsumeReservationTypeUndefined: Self = StObject.set(x, "consumeReservationType", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
