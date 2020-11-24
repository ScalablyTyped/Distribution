package typings.maximMazurokGapiClientDatamigration.gapi.client.datamigration

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectionProfile extends js.Object {
  
  /** A CloudSQL database connection profile. */
  var cloudsql: js.UndefOr[CloudSqlConnectionProfile] = js.native
  
  /** Output only. The timestamp when the resource was created. A timestamp in RFC3339 UTC "Zulu" format, accurate to nanoseconds. Example: "2014-10-02T15:01:23.045123456Z". */
  var createTime: js.UndefOr[String] = js.native
  
  /** The connection profile display name. */
  var displayName: js.UndefOr[String] = js.native
  
  /** Output only. The error details in case of state FAILED. */
  var error: js.UndefOr[Status] = js.native
  
  /**
    * The resource labels for connection profile to use to annotate any related underlying resources such as Compute Engine VMs. An object containing a list of "key": "value" pairs.
    * Example: `{ "name": "wrench", "mass": "1.3kg", "count": "3" }`.
    */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientDatamigration.maximMazurokGapiClientDatamigrationStrings.ConnectionProfile with TopLevel[js.Any]
  ] = js.native
  
  /** A MySQL database connection profile. */
  var mysql: js.UndefOr[MySqlConnectionProfile] = js.native
  
  /** The name of this connection profile resource in the form of projects/{project}/locations/{location}/instances/{instance}. */
  var name: js.UndefOr[String] = js.native
  
  /** The database provider. */
  var provider: js.UndefOr[String] = js.native
  
  /** The current connection profile state (e.g. DRAFT, READY, or FAILED). */
  var state: js.UndefOr[String] = js.native
  
  /** Output only. The timestamp when the resource was last updated. A timestamp in RFC3339 UTC "Zulu" format, accurate to nanoseconds. Example: "2014-10-02T15:01:23.045123456Z". */
  var updateTime: js.UndefOr[String] = js.native
}
object ConnectionProfile {
  
  @scala.inline
  def apply(): ConnectionProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionProfile]
  }
  
  @scala.inline
  implicit class ConnectionProfileOps[Self <: ConnectionProfile] (val x: Self) extends AnyVal {
    
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
    def setCloudsql(value: CloudSqlConnectionProfile): Self = this.set("cloudsql", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloudsql: Self = this.set("cloudsql", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setError(value: Status): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientDatamigration.maximMazurokGapiClientDatamigrationStrings.ConnectionProfile with TopLevel[js.Any]
    ): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setMysql(value: MySqlConnectionProfile): Self = this.set("mysql", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMysql: Self = this.set("mysql", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setProvider(value: String): Self = this.set("provider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProvider: Self = this.set("provider", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = this.set("updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateTime: Self = this.set("updateTime", js.undefined)
  }
}
