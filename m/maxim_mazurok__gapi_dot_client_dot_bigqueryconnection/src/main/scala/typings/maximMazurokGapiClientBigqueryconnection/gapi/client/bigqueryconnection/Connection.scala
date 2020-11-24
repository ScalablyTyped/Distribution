package typings.maximMazurokGapiClientBigqueryconnection.gapi.client.bigqueryconnection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Connection extends js.Object {
  
  /** Cloud SQL properties. */
  var cloudSql: js.UndefOr[CloudSqlProperties] = js.native
  
  /** Output only. The creation timestamp of the connection. */
  var creationTime: js.UndefOr[String] = js.native
  
  /** User provided description. */
  var description: js.UndefOr[String] = js.native
  
  /** User provided display name for the connection. */
  var friendlyName: js.UndefOr[String] = js.native
  
  /** Output only. True, if credential is configured for this connection. */
  var hasCredential: js.UndefOr[Boolean] = js.native
  
  /** Output only. The last update timestamp of the connection. */
  var lastModifiedTime: js.UndefOr[String] = js.native
  
  /** The resource name of the connection in the form of: `projects/{project_id}/locations/{location_id}/connections/{connection_id}` */
  var name: js.UndefOr[String] = js.native
}
object Connection {
  
  @scala.inline
  def apply(): Connection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Connection]
  }
  
  @scala.inline
  implicit class ConnectionOps[Self <: Connection] (val x: Self) extends AnyVal {
    
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
    def setCloudSql(value: CloudSqlProperties): Self = this.set("cloudSql", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloudSql: Self = this.set("cloudSql", js.undefined)
    
    @scala.inline
    def setCreationTime(value: String): Self = this.set("creationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTime: Self = this.set("creationTime", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setFriendlyName(value: String): Self = this.set("friendlyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFriendlyName: Self = this.set("friendlyName", js.undefined)
    
    @scala.inline
    def setHasCredential(value: Boolean): Self = this.set("hasCredential", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasCredential: Self = this.set("hasCredential", js.undefined)
    
    @scala.inline
    def setLastModifiedTime(value: String): Self = this.set("lastModifiedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifiedTime: Self = this.set("lastModifiedTime", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
