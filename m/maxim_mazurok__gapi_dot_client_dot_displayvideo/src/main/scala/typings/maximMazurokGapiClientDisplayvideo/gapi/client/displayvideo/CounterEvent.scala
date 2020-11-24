package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CounterEvent extends js.Object {
  
  /** Required. The name of the counter event. */
  var name: js.UndefOr[String] = js.native
  
  /** Required. The name used to identify this counter event in reports. */
  var reportingName: js.UndefOr[String] = js.native
}
object CounterEvent {
  
  @scala.inline
  def apply(): CounterEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CounterEvent]
  }
  
  @scala.inline
  implicit class CounterEventOps[Self <: CounterEvent] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setReportingName(value: String): Self = this.set("reportingName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReportingName: Self = this.set("reportingName", js.undefined)
  }
}
