package typings.googleapis.managedidentitiesV1alpha1Mod.managedidentitiesV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaResetAdminPasswordResponse extends StObject {
  
  /**
    * A random password. See admin for more information.
    */
  var password: js.UndefOr[String | Null] = js.undefined
}
object SchemaResetAdminPasswordResponse {
  
  inline def apply(): SchemaResetAdminPasswordResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResetAdminPasswordResponse]
  }
  
  extension [Self <: SchemaResetAdminPasswordResponse](x: Self) {
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordNull: Self = StObject.set(x, "password", null)
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
  }
}
