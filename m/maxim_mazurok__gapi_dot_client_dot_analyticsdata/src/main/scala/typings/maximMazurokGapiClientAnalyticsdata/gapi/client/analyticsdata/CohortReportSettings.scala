package typings.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CohortReportSettings extends js.Object {
  
  /** If true, accumulates the result from first visit day to the end day. Not supported in `RunReportRequest`. */
  var accumulate: js.UndefOr[Boolean] = js.native
}
object CohortReportSettings {
  
  @scala.inline
  def apply(): CohortReportSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CohortReportSettings]
  }
  
  @scala.inline
  implicit class CohortReportSettingsOps[Self <: CohortReportSettings] (val x: Self) extends AnyVal {
    
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
    def setAccumulate(value: Boolean): Self = this.set("accumulate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccumulate: Self = this.set("accumulate", js.undefined)
  }
}
