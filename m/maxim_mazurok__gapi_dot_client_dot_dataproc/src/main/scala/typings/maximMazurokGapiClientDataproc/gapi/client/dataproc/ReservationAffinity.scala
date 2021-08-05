package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReservationAffinity extends StObject {
  
  /** Optional. Type of reservation to consume */
  var consumeReservationType: js.UndefOr[String] = js.undefined
  
  /** Optional. Corresponds to the label key of reservation resource. */
  var key: js.UndefOr[String] = js.undefined
  
  /** Optional. Corresponds to the label values of reservation resource. */
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
