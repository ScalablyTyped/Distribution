package typings.googleapis.v4Mod.analyticsreportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The headers for each of the pivot sections defined in the request.
  */
trait SchemaPivotHeader extends StObject {
  
  /**
    * A single pivot section header.
    */
  var pivotHeaderEntries: js.UndefOr[js.Array[SchemaPivotHeaderEntry]] = js.undefined
  
  /**
    * The total number of groups for this pivot.
    */
  var totalPivotGroupsCount: js.UndefOr[Double] = js.undefined
}
object SchemaPivotHeader {
  
  @scala.inline
  def apply(): SchemaPivotHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPivotHeader]
  }
  
  @scala.inline
  implicit class SchemaPivotHeaderMutableBuilder[Self <: SchemaPivotHeader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPivotHeaderEntries(value: js.Array[SchemaPivotHeaderEntry]): Self = StObject.set(x, "pivotHeaderEntries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPivotHeaderEntriesUndefined: Self = StObject.set(x, "pivotHeaderEntries", js.undefined)
    
    @scala.inline
    def setPivotHeaderEntriesVarargs(value: SchemaPivotHeaderEntry*): Self = StObject.set(x, "pivotHeaderEntries", js.Array(value :_*))
    
    @scala.inline
    def setTotalPivotGroupsCount(value: Double): Self = StObject.set(x, "totalPivotGroupsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalPivotGroupsCountUndefined: Self = StObject.set(x, "totalPivotGroupsCount", js.undefined)
  }
}
