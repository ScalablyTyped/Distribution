package typings.googleapis.v2betaMod.deploymentmanagerV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Basic Auth used as a credential.
  */
trait SchemaBasicAuth extends StObject {
  
  var password: js.UndefOr[String] = js.undefined
  
  var user: js.UndefOr[String] = js.undefined
}
object SchemaBasicAuth {
  
  @scala.inline
  def apply(): SchemaBasicAuth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBasicAuth]
  }
  
  @scala.inline
  implicit class SchemaBasicAuthMutableBuilder[Self <: SchemaBasicAuth] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    @scala.inline
    def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
