package typings.massive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectionInfo extends StObject {
  
  var application_name: js.UndefOr[String] = js.native
  
  var database: js.UndefOr[String] = js.native
  
  var fallback_application_name: js.UndefOr[Boolean] = js.native
  
  var host: js.UndefOr[String] = js.native
  
  var password: js.UndefOr[String | Null] = js.native
  
  var port: js.UndefOr[Double] = js.native
  
  var ssl: js.UndefOr[Boolean] = js.native
  
  var user: js.UndefOr[String] = js.native
}
object ConnectionInfo {
  
  @scala.inline
  def apply(): ConnectionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionInfo]
  }
  
  @scala.inline
  implicit class ConnectionInfoMutableBuilder[Self <: ConnectionInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication_name(value: String): Self = StObject.set(x, "application_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplication_nameUndefined: Self = StObject.set(x, "application_name", js.undefined)
    
    @scala.inline
    def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
    
    @scala.inline
    def setFallback_application_name(value: Boolean): Self = StObject.set(x, "fallback_application_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFallback_application_nameUndefined: Self = StObject.set(x, "fallback_application_name", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordNull: Self = StObject.set(x, "password", null)
    
    @scala.inline
    def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    @scala.inline
    def setSsl(value: Boolean): Self = StObject.set(x, "ssl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSslUndefined: Self = StObject.set(x, "ssl", js.undefined)
    
    @scala.inline
    def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
