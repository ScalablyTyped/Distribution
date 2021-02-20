package typings.maximMazurokGapiClientAnalyticsreporting.gapi.client.analyticsreporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PivotHeader extends StObject {
  
  /** A single pivot section header. */
  var pivotHeaderEntries: js.UndefOr[js.Array[PivotHeaderEntry]] = js.native
  
  /** The total number of groups for this pivot. */
  var totalPivotGroupsCount: js.UndefOr[Double] = js.native
}
object PivotHeader {
  
  @scala.inline
  def apply(): PivotHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotHeader]
  }
  
  @scala.inline
  implicit class PivotHeaderMutableBuilder[Self <: PivotHeader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPivotHeaderEntries(value: js.Array[PivotHeaderEntry]): Self = StObject.set(x, "pivotHeaderEntries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPivotHeaderEntriesUndefined: Self = StObject.set(x, "pivotHeaderEntries", js.undefined)
    
    @scala.inline
    def setPivotHeaderEntriesVarargs(value: PivotHeaderEntry*): Self = StObject.set(x, "pivotHeaderEntries", js.Array(value :_*))
    
    @scala.inline
    def setTotalPivotGroupsCount(value: Double): Self = StObject.set(x, "totalPivotGroupsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalPivotGroupsCountUndefined: Self = StObject.set(x, "totalPivotGroupsCount", js.undefined)
  }
}
