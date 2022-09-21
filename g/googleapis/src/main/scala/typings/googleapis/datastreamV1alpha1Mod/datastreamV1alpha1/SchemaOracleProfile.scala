package typings.googleapis.datastreamV1alpha1Mod.datastreamV1alpha1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOracleProfile extends StObject {
  
  /**
    * Connection string attributes
    */
  var connectionAttributes: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Required. Database for the Oracle connection.
    */
  var databaseService: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Hostname for the Oracle connection.
    */
  var hostname: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Password for the Oracle connection.
    */
  var password: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Port for the Oracle connection, default value is 1521.
    */
  var port: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Required. Username for the Oracle connection.
    */
  var username: js.UndefOr[String | Null] = js.undefined
}
object SchemaOracleProfile {
  
  inline def apply(): SchemaOracleProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOracleProfile]
  }
  
  extension [Self <: SchemaOracleProfile](x: Self) {
    
    inline def setConnectionAttributes(value: StringDictionary[String]): Self = StObject.set(x, "connectionAttributes", value.asInstanceOf[js.Any])
    
    inline def setConnectionAttributesNull: Self = StObject.set(x, "connectionAttributes", null)
    
    inline def setConnectionAttributesUndefined: Self = StObject.set(x, "connectionAttributes", js.undefined)
    
    inline def setDatabaseService(value: String): Self = StObject.set(x, "databaseService", value.asInstanceOf[js.Any])
    
    inline def setDatabaseServiceNull: Self = StObject.set(x, "databaseService", null)
    
    inline def setDatabaseServiceUndefined: Self = StObject.set(x, "databaseService", js.undefined)
    
    inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
    
    inline def setHostnameNull: Self = StObject.set(x, "hostname", null)
    
    inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordNull: Self = StObject.set(x, "password", null)
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortNull: Self = StObject.set(x, "port", null)
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameNull: Self = StObject.set(x, "username", null)
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
