package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManagedConfigurationsSettings extends js.Object {
  
  /** The last updated time of the managed configuration settings in milliseconds since 1970-01-01T00:00:00Z. */
  var lastUpdatedTimestampMillis: js.UndefOr[String] = js.native
  
  /** The ID of the managed configurations settings. */
  var mcmId: js.UndefOr[String] = js.native
  
  /** The name of the managed configurations settings. */
  var name: js.UndefOr[String] = js.native
}
object ManagedConfigurationsSettings {
  
  @scala.inline
  def apply(): ManagedConfigurationsSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedConfigurationsSettings]
  }
  
  @scala.inline
  implicit class ManagedConfigurationsSettingsOps[Self <: ManagedConfigurationsSettings] (val x: Self) extends AnyVal {
    
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
    def setLastUpdatedTimestampMillis(value: String): Self = this.set("lastUpdatedTimestampMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdatedTimestampMillis: Self = this.set("lastUpdatedTimestampMillis", js.undefined)
    
    @scala.inline
    def setMcmId(value: String): Self = this.set("mcmId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMcmId: Self = this.set("mcmId", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
