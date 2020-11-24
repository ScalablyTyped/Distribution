package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Flight extends js.Object {
  
  var endDate: js.UndefOr[String] = js.native
  
  /** Rate or cost of this flight. */
  var rateOrCost: js.UndefOr[String] = js.native
  
  var startDate: js.UndefOr[String] = js.native
  
  /** Units of this flight. */
  var units: js.UndefOr[String] = js.native
}
object Flight {
  
  @scala.inline
  def apply(): Flight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Flight]
  }
  
  @scala.inline
  implicit class FlightOps[Self <: Flight] (val x: Self) extends AnyVal {
    
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
    def setEndDate(value: String): Self = this.set("endDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndDate: Self = this.set("endDate", js.undefined)
    
    @scala.inline
    def setRateOrCost(value: String): Self = this.set("rateOrCost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRateOrCost: Self = this.set("rateOrCost", js.undefined)
    
    @scala.inline
    def setStartDate(value: String): Self = this.set("startDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartDate: Self = this.set("startDate", js.undefined)
    
    @scala.inline
    def setUnits(value: String): Self = this.set("units", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnits: Self = this.set("units", js.undefined)
  }
}
