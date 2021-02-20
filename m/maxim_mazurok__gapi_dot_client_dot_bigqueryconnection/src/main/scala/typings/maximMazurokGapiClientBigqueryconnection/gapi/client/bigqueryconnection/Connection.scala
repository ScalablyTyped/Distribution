package typings.maximMazurokGapiClientBigqueryconnection.gapi.client.bigqueryconnection

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Connection extends StObject {
  
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
  implicit class ConnectionMutableBuilder[Self <: Connection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloudSql(value: CloudSqlProperties): Self = StObject.set(x, "cloudSql", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudSqlUndefined: Self = StObject.set(x, "cloudSql", js.undefined)
    
    @scala.inline
    def setCreationTime(value: String): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
    
    @scala.inline
    def setHasCredential(value: Boolean): Self = StObject.set(x, "hasCredential", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasCredentialUndefined: Self = StObject.set(x, "hasCredential", js.undefined)
    
    @scala.inline
    def setLastModifiedTime(value: String): Self = StObject.set(x, "lastModifiedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedTimeUndefined: Self = StObject.set(x, "lastModifiedTime", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
