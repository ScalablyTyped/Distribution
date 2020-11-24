package typings.maximMazurokGapiClientAdexchangebuyer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilteringCount extends js.Object {
  
  /** The number of times the creative was filtered for the status. The count is aggregated across all publishers on the exchange. */
  var filteringCount: js.UndefOr[String] = js.native
  
  /** The filtering status code as defined in  creative-status-codes.txt. */
  var filteringStatus: js.UndefOr[Double] = js.native
}
object FilteringCount {
  
  @scala.inline
  def apply(): FilteringCount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilteringCount]
  }
  
  @scala.inline
  implicit class FilteringCountOps[Self <: FilteringCount] (val x: Self) extends AnyVal {
    
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
    def setFilteringCount(value: String): Self = this.set("filteringCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilteringCount: Self = this.set("filteringCount", js.undefined)
    
    @scala.inline
    def setFilteringStatus(value: Double): Self = this.set("filteringStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilteringStatus: Self = this.set("filteringStatus", js.undefined)
  }
}
