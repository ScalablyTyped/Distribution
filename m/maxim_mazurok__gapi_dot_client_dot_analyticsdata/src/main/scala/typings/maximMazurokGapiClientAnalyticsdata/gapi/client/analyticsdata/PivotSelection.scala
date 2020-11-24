package typings.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PivotSelection extends js.Object {
  
  /** Must be a dimension name from the request. */
  var dimensionName: js.UndefOr[String] = js.native
  
  /** Order by only when the named dimension is this value. */
  var dimensionValue: js.UndefOr[String] = js.native
}
object PivotSelection {
  
  @scala.inline
  def apply(): PivotSelection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotSelection]
  }
  
  @scala.inline
  implicit class PivotSelectionOps[Self <: PivotSelection] (val x: Self) extends AnyVal {
    
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
    def setDimensionName(value: String): Self = this.set("dimensionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimensionName: Self = this.set("dimensionName", js.undefined)
    
    @scala.inline
    def setDimensionValue(value: String): Self = this.set("dimensionValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimensionValue: Self = this.set("dimensionValue", js.undefined)
  }
}
