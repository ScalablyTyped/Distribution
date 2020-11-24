package typings.maximMazurokGapiClientBigqueryconnection.gapi.client.bigqueryconnection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectionCredential extends js.Object {
  
  /** Credential for Cloud SQL database. */
  var cloudSql: js.UndefOr[CloudSqlCredential] = js.native
}
object ConnectionCredential {
  
  @scala.inline
  def apply(): ConnectionCredential = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionCredential]
  }
  
  @scala.inline
  implicit class ConnectionCredentialOps[Self <: ConnectionCredential] (val x: Self) extends AnyVal {
    
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
    def setCloudSql(value: CloudSqlCredential): Self = this.set("cloudSql", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloudSql: Self = this.set("cloudSql", js.undefined)
  }
}
