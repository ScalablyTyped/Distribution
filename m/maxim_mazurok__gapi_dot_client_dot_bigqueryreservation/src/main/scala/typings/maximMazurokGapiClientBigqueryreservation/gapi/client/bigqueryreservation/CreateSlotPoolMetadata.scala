package typings.maximMazurokGapiClientBigqueryreservation.gapi.client.bigqueryreservation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSlotPoolMetadata extends StObject {
  
  /** Resource name of the slot pool that is being created. E.g., projects/myproject/locations/us-central1/reservations/foo/slotPools/123 */
  var slotPool: js.UndefOr[String] = js.undefined
}
object CreateSlotPoolMetadata {
  
  inline def apply(): CreateSlotPoolMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSlotPoolMetadata]
  }
  
  extension [Self <: CreateSlotPoolMetadata](x: Self) {
    
    inline def setSlotPool(value: String): Self = StObject.set(x, "slotPool", value.asInstanceOf[js.Any])
    
    inline def setSlotPoolUndefined: Self = StObject.set(x, "slotPool", js.undefined)
  }
}
