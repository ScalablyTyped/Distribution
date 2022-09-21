package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFreeListingsProgramStatus extends StObject {
  
  /**
    * State of the program. `ENABLED` if there are offers for at least one region.
    */
  var globalState: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Status of the program in each region. Regions with the same status and review eligibility are grouped together in `regionCodes`.
    */
  var regionStatuses: js.UndefOr[js.Array[SchemaFreeListingsProgramStatusRegionStatus]] = js.undefined
}
object SchemaFreeListingsProgramStatus {
  
  inline def apply(): SchemaFreeListingsProgramStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFreeListingsProgramStatus]
  }
  
  extension [Self <: SchemaFreeListingsProgramStatus](x: Self) {
    
    inline def setGlobalState(value: String): Self = StObject.set(x, "globalState", value.asInstanceOf[js.Any])
    
    inline def setGlobalStateNull: Self = StObject.set(x, "globalState", null)
    
    inline def setGlobalStateUndefined: Self = StObject.set(x, "globalState", js.undefined)
    
    inline def setRegionStatuses(value: js.Array[SchemaFreeListingsProgramStatusRegionStatus]): Self = StObject.set(x, "regionStatuses", value.asInstanceOf[js.Any])
    
    inline def setRegionStatusesUndefined: Self = StObject.set(x, "regionStatuses", js.undefined)
    
    inline def setRegionStatusesVarargs(value: SchemaFreeListingsProgramStatusRegionStatus*): Self = StObject.set(x, "regionStatuses", js.Array(value*))
  }
}
