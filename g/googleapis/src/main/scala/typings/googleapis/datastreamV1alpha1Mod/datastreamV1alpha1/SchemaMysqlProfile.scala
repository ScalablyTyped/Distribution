package typings.googleapis.datastreamV1alpha1Mod.datastreamV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMysqlProfile extends StObject {
  
  /**
    * Required. Hostname for the MySQL connection.
    */
  var hostname: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Input only. Password for the MySQL connection.
    */
  var password: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Port for the MySQL connection, default value is 3306.
    */
  var port: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * SSL configuration for the MySQL connection.
    */
  var sslConfig: js.UndefOr[SchemaMysqlSslConfig] = js.undefined
  
  /**
    * Required. Username for the MySQL connection.
    */
  var username: js.UndefOr[String | Null] = js.undefined
}
object SchemaMysqlProfile {
  
  inline def apply(): SchemaMysqlProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMysqlProfile]
  }
  
  extension [Self <: SchemaMysqlProfile](x: Self) {
    
    inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
    
    inline def setHostnameNull: Self = StObject.set(x, "hostname", null)
    
    inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordNull: Self = StObject.set(x, "password", null)
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortNull: Self = StObject.set(x, "port", null)
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setSslConfig(value: SchemaMysqlSslConfig): Self = StObject.set(x, "sslConfig", value.asInstanceOf[js.Any])
    
    inline def setSslConfigUndefined: Self = StObject.set(x, "sslConfig", js.undefined)
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameNull: Self = StObject.set(x, "username", null)
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
