package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManagedConfigurationsSettingsListResponse extends js.Object {
  
  /** A managed configurations settings for an app that may be assigned to a group of users in an enterprise. */
  var managedConfigurationsSettings: js.UndefOr[js.Array[ManagedConfigurationsSettings]] = js.native
}
object ManagedConfigurationsSettingsListResponse {
  
  @scala.inline
  def apply(): ManagedConfigurationsSettingsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedConfigurationsSettingsListResponse]
  }
  
  @scala.inline
  implicit class ManagedConfigurationsSettingsListResponseOps[Self <: ManagedConfigurationsSettingsListResponse] (val x: Self) extends AnyVal {
    
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
    def setManagedConfigurationsSettingsVarargs(value: ManagedConfigurationsSettings*): Self = this.set("managedConfigurationsSettings", js.Array(value :_*))
    
    @scala.inline
    def setManagedConfigurationsSettings(value: js.Array[ManagedConfigurationsSettings]): Self = this.set("managedConfigurationsSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManagedConfigurationsSettings: Self = this.set("managedConfigurationsSettings", js.undefined)
  }
}
