package typings.maximMazurokGapiClientDatamigration.gapi.client.datamigration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloudSqlConnectionProfile extends js.Object {
  
  /** Output only. The Cloud SQL instance ID that this connection profile is associated with. */
  var cloudSqlId: js.UndefOr[String] = js.native
  
  /** Output only. The Cloud SQL database instance's private IP. */
  var privateIp: js.UndefOr[String] = js.native
  
  /** Output only. The Cloud SQL database instance's public IP. */
  var publicIp: js.UndefOr[String] = js.native
  
  /** Immutable. Metadata used to create the destination Cloud SQL database. */
  var settings: js.UndefOr[CloudSqlSettings] = js.native
}
object CloudSqlConnectionProfile {
  
  @scala.inline
  def apply(): CloudSqlConnectionProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudSqlConnectionProfile]
  }
  
  @scala.inline
  implicit class CloudSqlConnectionProfileOps[Self <: CloudSqlConnectionProfile] (val x: Self) extends AnyVal {
    
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
    def setCloudSqlId(value: String): Self = this.set("cloudSqlId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloudSqlId: Self = this.set("cloudSqlId", js.undefined)
    
    @scala.inline
    def setPrivateIp(value: String): Self = this.set("privateIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivateIp: Self = this.set("privateIp", js.undefined)
    
    @scala.inline
    def setPublicIp(value: String): Self = this.set("publicIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublicIp: Self = this.set("publicIp", js.undefined)
    
    @scala.inline
    def setSettings(value: CloudSqlSettings): Self = this.set("settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSettings: Self = this.set("settings", js.undefined)
  }
}
