package typings.maximMazurokGapiClientAdexchangebuyer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilteringCount extends StObject {
  
  /** The number of times the creative was filtered for the status. The count is aggregated across all publishers on the exchange. */
  var filteringCount: js.UndefOr[String] = js.undefined
  
  /** The filtering status code as defined in  creative-status-codes.txt. */
  var filteringStatus: js.UndefOr[Double] = js.undefined
}
object FilteringCount {
  
  inline def apply(): FilteringCount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilteringCount]
  }
  
  extension [Self <: FilteringCount](x: Self) {
    
    inline def setFilteringCount(value: String): Self = StObject.set(x, "filteringCount", value.asInstanceOf[js.Any])
    
    inline def setFilteringCountUndefined: Self = StObject.set(x, "filteringCount", js.undefined)
    
    inline def setFilteringStatus(value: Double): Self = StObject.set(x, "filteringStatus", value.asInstanceOf[js.Any])
    
    inline def setFilteringStatusUndefined: Self = StObject.set(x, "filteringStatus", js.undefined)
  }
}
