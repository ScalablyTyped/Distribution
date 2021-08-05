package typings.maximMazurokGapiClientAnalyticsreporting.gapi.client.analyticsreporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PivotHeader extends StObject {
  
  /** A single pivot section header. */
  var pivotHeaderEntries: js.UndefOr[js.Array[PivotHeaderEntry]] = js.undefined
  
  /** The total number of groups for this pivot. */
  var totalPivotGroupsCount: js.UndefOr[Double] = js.undefined
}
object PivotHeader {
  
  inline def apply(): PivotHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotHeader]
  }
  
  extension [Self <: PivotHeader](x: Self) {
    
    inline def setPivotHeaderEntries(value: js.Array[PivotHeaderEntry]): Self = StObject.set(x, "pivotHeaderEntries", value.asInstanceOf[js.Any])
    
    inline def setPivotHeaderEntriesUndefined: Self = StObject.set(x, "pivotHeaderEntries", js.undefined)
    
    inline def setPivotHeaderEntriesVarargs(value: PivotHeaderEntry*): Self = StObject.set(x, "pivotHeaderEntries", js.Array(value :_*))
    
    inline def setTotalPivotGroupsCount(value: Double): Self = StObject.set(x, "totalPivotGroupsCount", value.asInstanceOf[js.Any])
    
    inline def setTotalPivotGroupsCountUndefined: Self = StObject.set(x, "totalPivotGroupsCount", js.undefined)
  }
}
