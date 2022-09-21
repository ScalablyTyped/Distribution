package typings.googleapis.deploymentmanagerV2betaMod.deploymentmanagerV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBasicAuth extends StObject {
  
  var password: js.UndefOr[String | Null] = js.undefined
  
  var user: js.UndefOr[String | Null] = js.undefined
}
object SchemaBasicAuth {
  
  inline def apply(): SchemaBasicAuth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBasicAuth]
  }
  
  extension [Self <: SchemaBasicAuth](x: Self) {
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordNull: Self = StObject.set(x, "password", null)
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserNull: Self = StObject.set(x, "user", null)
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
