package typings.googleapis.v1alpha2Mod.bigqueryreservationV1alpha2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCreateSlotPoolMetadata extends StObject {
  
  /**
    * Resource name of the slot pool that is being created. E.g., projects/myproject/locations/us-central1/reservations/foo/slotPools/123
    */
  var slotPool: js.UndefOr[String | Null] = js.undefined
}
object SchemaCreateSlotPoolMetadata {
  
  inline def apply(): SchemaCreateSlotPoolMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateSlotPoolMetadata]
  }
  
  extension [Self <: SchemaCreateSlotPoolMetadata](x: Self) {
    
    inline def setSlotPool(value: String): Self = StObject.set(x, "slotPool", value.asInstanceOf[js.Any])
    
    inline def setSlotPoolNull: Self = StObject.set(x, "slotPool", null)
    
    inline def setSlotPoolUndefined: Self = StObject.set(x, "slotPool", js.undefined)
  }
}
