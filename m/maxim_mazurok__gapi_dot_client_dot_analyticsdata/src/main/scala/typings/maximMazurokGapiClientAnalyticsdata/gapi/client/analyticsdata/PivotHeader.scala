package typings.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PivotHeader extends js.Object {
  
  /** The size is the same as the cardinality of the corresponding dimension combinations. */
  var pivotDimensionHeaders: js.UndefOr[js.Array[PivotDimensionHeader]] = js.native
  
  /**
    * The cardinality of the pivot as if offset = 0 and limit = -1. The total number of rows for this pivot's fields regardless of how the parameters offset and limit are specified in the
    * request.
    */
  var rowCount: js.UndefOr[Double] = js.native
}
object PivotHeader {
  
  @scala.inline
  def apply(): PivotHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotHeader]
  }
  
  @scala.inline
  implicit class PivotHeaderOps[Self <: PivotHeader] (val x: Self) extends AnyVal {
    
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
    def setPivotDimensionHeadersVarargs(value: PivotDimensionHeader*): Self = this.set("pivotDimensionHeaders", js.Array(value :_*))
    
    @scala.inline
    def setPivotDimensionHeaders(value: js.Array[PivotDimensionHeader]): Self = this.set("pivotDimensionHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePivotDimensionHeaders: Self = this.set("pivotDimensionHeaders", js.undefined)
    
    @scala.inline
    def setRowCount(value: Double): Self = this.set("rowCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowCount: Self = this.set("rowCount", js.undefined)
  }
}
