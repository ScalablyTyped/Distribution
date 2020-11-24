package typings.maximMazurokGapiClientDatamigration.gapi.client.datamigration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MySqlConnectionProfile extends js.Object {
  
  /** If the source is a Cloud SQL database, use this field to provide the Cloud SQL instance ID of the source. */
  var cloudSqlId: js.UndefOr[String] = js.native
  
  /** Required. The IP or hostname of the source MySQL database. */
  var host: js.UndefOr[String] = js.native
  
  /**
    * Required. Input only. The password for the user that Database Migration Service will be using to connect to the database. This field is not returned on request, and the value is
    * encrypted when stored in Database Migration Service.
    */
  var password: js.UndefOr[String] = js.native
  
  /** Output only. Indicates If this connection profile password is stored. */
  var passwordSet: js.UndefOr[Boolean] = js.native
  
  /** Required. The network port of the source MySQL database. */
  var port: js.UndefOr[Double] = js.native
  
  /** SSL configuration for the destination to connect to the source database. */
  var ssl: js.UndefOr[SslConfig] = js.native
  
  /** Required. The username that Database Migration Service will use to connect to the database. The value is encrypted when stored in Database Migration Service. */
  var username: js.UndefOr[String] = js.native
}
object MySqlConnectionProfile {
  
  @scala.inline
  def apply(): MySqlConnectionProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MySqlConnectionProfile]
  }
  
  @scala.inline
  implicit class MySqlConnectionProfileOps[Self <: MySqlConnectionProfile] (val x: Self) extends AnyVal {
    
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
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    
    @scala.inline
    def setPasswordSet(value: Boolean): Self = this.set("passwordSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePasswordSet: Self = this.set("passwordSet", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    
    @scala.inline
    def setSsl(value: SslConfig): Self = this.set("ssl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSsl: Self = this.set("ssl", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
  }
}
