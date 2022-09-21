package typings.maximMazurokGapiClientDatamigration.gapi.client.datamigration

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostgreSqlConnectionProfile extends StObject {
  
  /** If the source is a Cloud SQL database, use this field to provide the Cloud SQL instance ID of the source. */
  var cloudSqlId: js.UndefOr[String] = js.undefined
  
  /** Required. The IP or hostname of the source PostgreSQL database. */
  var host: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Input only. The password for the user that Database Migration Service will be using to connect to the database. This field is not returned on request, and the value is
    * encrypted when stored in Database Migration Service.
    */
  var password: js.UndefOr[String] = js.undefined
  
  /** Output only. Indicates If this connection profile password is stored. */
  var passwordSet: js.UndefOr[Boolean] = js.undefined
  
  /** Required. The network port of the source PostgreSQL database. */
  var port: js.UndefOr[Double] = js.undefined
  
  /** SSL configuration for the destination to connect to the source database. */
  var ssl: js.UndefOr[SslConfig] = js.undefined
  
  /** Required. The username that Database Migration Service will use to connect to the database. The value is encrypted when stored in Database Migration Service. */
  var username: js.UndefOr[String] = js.undefined
}
object PostgreSqlConnectionProfile {
  
  inline def apply(): PostgreSqlConnectionProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PostgreSqlConnectionProfile]
  }
  
  extension [Self <: PostgreSqlConnectionProfile](x: Self) {
    
    inline def setCloudSqlId(value: String): Self = StObject.set(x, "cloudSqlId", value.asInstanceOf[js.Any])
    
    inline def setCloudSqlIdUndefined: Self = StObject.set(x, "cloudSqlId", js.undefined)
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordSet(value: Boolean): Self = StObject.set(x, "passwordSet", value.asInstanceOf[js.Any])
    
    inline def setPasswordSetUndefined: Self = StObject.set(x, "passwordSet", js.undefined)
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setSsl(value: SslConfig): Self = StObject.set(x, "ssl", value.asInstanceOf[js.Any])
    
    inline def setSslUndefined: Self = StObject.set(x, "ssl", js.undefined)
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
