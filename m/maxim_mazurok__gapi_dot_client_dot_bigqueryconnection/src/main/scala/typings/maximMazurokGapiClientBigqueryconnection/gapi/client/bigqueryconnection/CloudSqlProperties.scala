package typings.maximMazurokGapiClientBigqueryconnection.gapi.client.bigqueryconnection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloudSqlProperties extends js.Object {
  
  /** Input only. Cloud SQL credential. */
  var credential: js.UndefOr[CloudSqlCredential] = js.native
  
  /** Database name. */
  var database: js.UndefOr[String] = js.native
  
  /** Cloud SQL instance ID in the form `project:location:instance`. */
  var instanceId: js.UndefOr[String] = js.native
  
  /** Type of the Cloud SQL database. */
  var `type`: js.UndefOr[String] = js.native
}
object CloudSqlProperties {
  
  @scala.inline
  def apply(): CloudSqlProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudSqlProperties]
  }
  
  @scala.inline
  implicit class CloudSqlPropertiesOps[Self <: CloudSqlProperties] (val x: Self) extends AnyVal {
    
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
    def setCredential(value: CloudSqlCredential): Self = this.set("credential", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCredential: Self = this.set("credential", js.undefined)
    
    @scala.inline
    def setDatabase(value: String): Self = this.set("database", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatabase: Self = this.set("database", js.undefined)
    
    @scala.inline
    def setInstanceId(value: String): Self = this.set("instanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceId: Self = this.set("instanceId", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
