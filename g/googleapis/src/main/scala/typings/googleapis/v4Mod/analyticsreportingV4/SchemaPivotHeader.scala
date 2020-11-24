package typings.googleapis.v4Mod.analyticsreportingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The headers for each of the pivot sections defined in the request.
  */
@js.native
trait SchemaPivotHeader extends js.Object {
  
  /**
    * A single pivot section header.
    */
  var pivotHeaderEntries: js.UndefOr[js.Array[SchemaPivotHeaderEntry]] = js.native
  
  /**
    * The total number of groups for this pivot.
    */
  var totalPivotGroupsCount: js.UndefOr[Double] = js.native
}
object SchemaPivotHeader {
  
  @scala.inline
  def apply(): SchemaPivotHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPivotHeader]
  }
  
  @scala.inline
  implicit class SchemaPivotHeaderOps[Self <: SchemaPivotHeader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPivotHeaderEntriesVarargs(value: SchemaPivotHeaderEntry*): Self = this.set("pivotHeaderEntries", js.Array(value :_*))
    
    @scala.inline
    def setPivotHeaderEntries(value: js.Array[SchemaPivotHeaderEntry]): Self = this.set("pivotHeaderEntries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePivotHeaderEntries: Self = this.set("pivotHeaderEntries", js.undefined)
    
    @scala.inline
    def setTotalPivotGroupsCount(value: Double): Self = this.set("totalPivotGroupsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalPivotGroupsCount: Self = this.set("totalPivotGroupsCount", js.undefined)
  }
}
