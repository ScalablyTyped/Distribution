package typings.massive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectionInfo extends StObject {
  
  var application_name: js.UndefOr[String] = js.undefined
  
  var database: js.UndefOr[String] = js.undefined
  
  var fallback_application_name: js.UndefOr[Boolean] = js.undefined
  
  var host: js.UndefOr[String] = js.undefined
  
  var password: js.UndefOr[String | Null] = js.undefined
  
  var port: js.UndefOr[Double] = js.undefined
  
  var ssl: js.UndefOr[Boolean] = js.undefined
  
  var user: js.UndefOr[String] = js.undefined
}
object ConnectionInfo {
  
  inline def apply(): ConnectionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionInfo]
  }
  
  extension [Self <: ConnectionInfo](x: Self) {
    
    inline def setApplication_name(value: String): Self = StObject.set(x, "application_name", value.asInstanceOf[js.Any])
    
    inline def setApplication_nameUndefined: Self = StObject.set(x, "application_name", js.undefined)
    
    inline def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
    
    inline def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
    
    inline def setFallback_application_name(value: Boolean): Self = StObject.set(x, "fallback_application_name", value.asInstanceOf[js.Any])
    
    inline def setFallback_application_nameUndefined: Self = StObject.set(x, "fallback_application_name", js.undefined)
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordNull: Self = StObject.set(x, "password", null)
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setSsl(value: Boolean): Self = StObject.set(x, "ssl", value.asInstanceOf[js.Any])
    
    inline def setSslUndefined: Self = StObject.set(x, "ssl", js.undefined)
    
    inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
