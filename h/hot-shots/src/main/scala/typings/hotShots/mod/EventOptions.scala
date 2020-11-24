package typings.hotShots.mod

import typings.hotShots.hotShotsStrings.error
import typings.hotShots.hotShotsStrings.info
import typings.hotShots.hotShotsStrings.low
import typings.hotShots.hotShotsStrings.normal
import typings.hotShots.hotShotsStrings.success
import typings.hotShots.hotShotsStrings.warning
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventOptions extends js.Object {
  
  var aggregation_key: js.UndefOr[String] = js.native
  
  var alert_type: js.UndefOr[info | warning | success | error] = js.native
  
  var date_happened: js.UndefOr[Date] = js.native
  
  var hostname: js.UndefOr[String] = js.native
  
  var priority: js.UndefOr[low | normal] = js.native
  
  var source_type_name: js.UndefOr[String] = js.native
}
object EventOptions {
  
  @scala.inline
  def apply(): EventOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventOptions]
  }
  
  @scala.inline
  implicit class EventOptionsOps[Self <: EventOptions] (val x: Self) extends AnyVal {
    
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
    def setAggregation_key(value: String): Self = this.set("aggregation_key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAggregation_key: Self = this.set("aggregation_key", js.undefined)
    
    @scala.inline
    def setAlert_type(value: info | warning | success | error): Self = this.set("alert_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlert_type: Self = this.set("alert_type", js.undefined)
    
    @scala.inline
    def setDate_happened(value: Date): Self = this.set("date_happened", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDate_happened: Self = this.set("date_happened", js.undefined)
    
    @scala.inline
    def setHostname(value: String): Self = this.set("hostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostname: Self = this.set("hostname", js.undefined)
    
    @scala.inline
    def setPriority(value: low | normal): Self = this.set("priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
    
    @scala.inline
    def setSource_type_name(value: String): Self = this.set("source_type_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource_type_name: Self = this.set("source_type_name", js.undefined)
  }
}
