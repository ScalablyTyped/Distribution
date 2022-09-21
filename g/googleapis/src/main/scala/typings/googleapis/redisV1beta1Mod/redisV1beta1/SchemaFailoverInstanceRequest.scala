package typings.googleapis.redisV1beta1Mod.redisV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFailoverInstanceRequest extends StObject {
  
  /**
    * Optional. Available data protection modes that the user can choose. If it's unspecified, data protection mode will be LIMITED_DATA_LOSS by default.
    */
  var dataProtectionMode: js.UndefOr[String | Null] = js.undefined
}
object SchemaFailoverInstanceRequest {
  
  inline def apply(): SchemaFailoverInstanceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFailoverInstanceRequest]
  }
  
  extension [Self <: SchemaFailoverInstanceRequest](x: Self) {
    
    inline def setDataProtectionMode(value: String): Self = StObject.set(x, "dataProtectionMode", value.asInstanceOf[js.Any])
    
    inline def setDataProtectionModeNull: Self = StObject.set(x, "dataProtectionMode", null)
    
    inline def setDataProtectionModeUndefined: Self = StObject.set(x, "dataProtectionMode", js.undefined)
  }
}
