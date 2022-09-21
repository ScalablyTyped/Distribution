package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShoppingAdsProgramStatus extends StObject {
  
  /** State of the program. `ENABLED` if there are offers for at least one region. */
  var globalState: js.UndefOr[String] = js.undefined
  
  /** Status of the program in each region. Regions with the same status and review eligibility are grouped together in `regionCodes`. */
  var regionStatuses: js.UndefOr[js.Array[ShoppingAdsProgramStatusRegionStatus]] = js.undefined
}
object ShoppingAdsProgramStatus {
  
  inline def apply(): ShoppingAdsProgramStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShoppingAdsProgramStatus]
  }
  
  extension [Self <: ShoppingAdsProgramStatus](x: Self) {
    
    inline def setGlobalState(value: String): Self = StObject.set(x, "globalState", value.asInstanceOf[js.Any])
    
    inline def setGlobalStateUndefined: Self = StObject.set(x, "globalState", js.undefined)
    
    inline def setRegionStatuses(value: js.Array[ShoppingAdsProgramStatusRegionStatus]): Self = StObject.set(x, "regionStatuses", value.asInstanceOf[js.Any])
    
    inline def setRegionStatusesUndefined: Self = StObject.set(x, "regionStatuses", js.undefined)
    
    inline def setRegionStatusesVarargs(value: ShoppingAdsProgramStatusRegionStatus*): Self = StObject.set(x, "regionStatuses", js.Array(value*))
  }
}
