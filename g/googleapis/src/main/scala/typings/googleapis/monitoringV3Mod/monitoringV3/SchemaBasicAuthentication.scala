package typings.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A type of authentication to perform against the specified resource or URL
  * that uses username and password. Currently, only Basic authentication is
  * supported in Uptime Monitoring.
  */
trait SchemaBasicAuthentication extends StObject {
  
  /**
    * The password to authenticate.
    */
  var password: js.UndefOr[String] = js.undefined
  
  /**
    * The username to authenticate.
    */
  var username: js.UndefOr[String] = js.undefined
}
object SchemaBasicAuthentication {
  
  @scala.inline
  def apply(): SchemaBasicAuthentication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBasicAuthentication]
  }
  
  @scala.inline
  implicit class SchemaBasicAuthenticationMutableBuilder[Self <: SchemaBasicAuthentication] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
