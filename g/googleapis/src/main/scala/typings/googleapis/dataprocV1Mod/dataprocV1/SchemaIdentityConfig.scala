package typings.googleapis.dataprocV1Mod.dataprocV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaIdentityConfig extends StObject {
  
  /**
    * Required. Map of user to service account.
    */
  var userServiceAccountMapping: js.UndefOr[StringDictionary[String] | Null] = js.undefined
}
object SchemaIdentityConfig {
  
  inline def apply(): SchemaIdentityConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIdentityConfig]
  }
  
  extension [Self <: SchemaIdentityConfig](x: Self) {
    
    inline def setUserServiceAccountMapping(value: StringDictionary[String]): Self = StObject.set(x, "userServiceAccountMapping", value.asInstanceOf[js.Any])
    
    inline def setUserServiceAccountMappingNull: Self = StObject.set(x, "userServiceAccountMapping", null)
    
    inline def setUserServiceAccountMappingUndefined: Self = StObject.set(x, "userServiceAccountMapping", js.undefined)
  }
}
