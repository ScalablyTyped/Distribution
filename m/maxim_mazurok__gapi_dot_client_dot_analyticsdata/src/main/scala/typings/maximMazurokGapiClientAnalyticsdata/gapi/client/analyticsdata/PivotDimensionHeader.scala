package typings.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PivotDimensionHeader extends js.Object {
  
  /** Values of multiple dimensions in a pivot. */
  var dimensionValues: js.UndefOr[js.Array[DimensionValue]] = js.native
}
object PivotDimensionHeader {
  
  @scala.inline
  def apply(): PivotDimensionHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotDimensionHeader]
  }
  
  @scala.inline
  implicit class PivotDimensionHeaderOps[Self <: PivotDimensionHeader] (val x: Self) extends AnyVal {
    
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
    def setDimensionValuesVarargs(value: DimensionValue*): Self = this.set("dimensionValues", js.Array(value :_*))
    
    @scala.inline
    def setDimensionValues(value: js.Array[DimensionValue]): Self = this.set("dimensionValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimensionValues: Self = this.set("dimensionValues", js.undefined)
  }
}
