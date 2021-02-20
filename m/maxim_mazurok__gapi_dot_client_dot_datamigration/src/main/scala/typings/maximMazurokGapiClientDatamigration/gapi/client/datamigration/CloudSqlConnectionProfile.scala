package typings.maximMazurokGapiClientDatamigration.gapi.client.datamigration

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloudSqlConnectionProfile extends StObject {
  
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
  implicit class CloudSqlConnectionProfileMutableBuilder[Self <: CloudSqlConnectionProfile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloudSqlId(value: String): Self = StObject.set(x, "cloudSqlId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudSqlIdUndefined: Self = StObject.set(x, "cloudSqlId", js.undefined)
    
    @scala.inline
    def setPrivateIp(value: String): Self = StObject.set(x, "privateIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateIpUndefined: Self = StObject.set(x, "privateIp", js.undefined)
    
    @scala.inline
    def setPublicIp(value: String): Self = StObject.set(x, "publicIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicIpUndefined: Self = StObject.set(x, "publicIp", js.undefined)
    
    @scala.inline
    def setSettings(value: CloudSqlSettings): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
  }
}
