package typings.googleapis.v4Mod.analyticsreportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPivotHeader extends StObject {
  
  /**
    * A single pivot section header.
    */
  var pivotHeaderEntries: js.UndefOr[js.Array[SchemaPivotHeaderEntry]] = js.undefined
  
  /**
    * The total number of groups for this pivot.
    */
  var totalPivotGroupsCount: js.UndefOr[Double | Null] = js.undefined
}
object SchemaPivotHeader {
  
  inline def apply(): SchemaPivotHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPivotHeader]
  }
  
  extension [Self <: SchemaPivotHeader](x: Self) {
    
    inline def setPivotHeaderEntries(value: js.Array[SchemaPivotHeaderEntry]): Self = StObject.set(x, "pivotHeaderEntries", value.asInstanceOf[js.Any])
    
    inline def setPivotHeaderEntriesUndefined: Self = StObject.set(x, "pivotHeaderEntries", js.undefined)
    
    inline def setPivotHeaderEntriesVarargs(value: SchemaPivotHeaderEntry*): Self = StObject.set(x, "pivotHeaderEntries", js.Array(value*))
    
    inline def setTotalPivotGroupsCount(value: Double): Self = StObject.set(x, "totalPivotGroupsCount", value.asInstanceOf[js.Any])
    
    inline def setTotalPivotGroupsCountNull: Self = StObject.set(x, "totalPivotGroupsCount", null)
    
    inline def setTotalPivotGroupsCountUndefined: Self = StObject.set(x, "totalPivotGroupsCount", js.undefined)
  }
}
