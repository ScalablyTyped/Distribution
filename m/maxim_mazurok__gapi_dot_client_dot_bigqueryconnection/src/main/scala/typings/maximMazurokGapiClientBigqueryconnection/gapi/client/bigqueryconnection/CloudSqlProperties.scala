package typings.maximMazurokGapiClientBigqueryconnection.gapi.client.bigqueryconnection

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloudSqlProperties extends StObject {
  
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
  implicit class CloudSqlPropertiesMutableBuilder[Self <: CloudSqlProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCredential(value: CloudSqlCredential): Self = StObject.set(x, "credential", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCredentialUndefined: Self = StObject.set(x, "credential", js.undefined)
    
    @scala.inline
    def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
    
    @scala.inline
    def setInstanceId(value: String): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceIdUndefined: Self = StObject.set(x, "instanceId", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
