package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationReportingSettings extends js.Object {
  
  /** Whether removed apps are included in application reports. */
  var includeRemovedApps: js.UndefOr[Boolean] = js.native
}
object ApplicationReportingSettings {
  
  @scala.inline
  def apply(): ApplicationReportingSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationReportingSettings]
  }
  
  @scala.inline
  implicit class ApplicationReportingSettingsOps[Self <: ApplicationReportingSettings] (val x: Self) extends AnyVal {
    
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
    def setIncludeRemovedApps(value: Boolean): Self = this.set("includeRemovedApps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeRemovedApps: Self = this.set("includeRemovedApps", js.undefined)
  }
}
