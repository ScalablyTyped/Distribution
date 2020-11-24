package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RealtimeTimeRange extends js.Object {
  
  /** The start timestamp of the real-time RTB metrics aggregation. */
  var startTimestamp: js.UndefOr[String] = js.native
}
object RealtimeTimeRange {
  
  @scala.inline
  def apply(): RealtimeTimeRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RealtimeTimeRange]
  }
  
  @scala.inline
  implicit class RealtimeTimeRangeOps[Self <: RealtimeTimeRange] (val x: Self) extends AnyVal {
    
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
    def setStartTimestamp(value: String): Self = this.set("startTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTimestamp: Self = this.set("startTimestamp", js.undefined)
  }
}
