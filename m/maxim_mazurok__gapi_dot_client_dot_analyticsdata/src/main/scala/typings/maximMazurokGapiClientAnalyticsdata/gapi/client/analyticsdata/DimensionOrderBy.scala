package typings.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DimensionOrderBy extends js.Object {
  
  /** A dimension name in the request to order by. */
  var dimensionName: js.UndefOr[String] = js.native
  
  /** Controls the rule for dimension value ordering. */
  var orderType: js.UndefOr[String] = js.native
}
object DimensionOrderBy {
  
  @scala.inline
  def apply(): DimensionOrderBy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DimensionOrderBy]
  }
  
  @scala.inline
  implicit class DimensionOrderByOps[Self <: DimensionOrderBy] (val x: Self) extends AnyVal {
    
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
    def setOrderType(value: String): Self = this.set("orderType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrderType: Self = this.set("orderType", js.undefined)
  }
}
