package typings.googleapis.redisV1beta1Mod.redisV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUpgradeInstanceRequest extends StObject {
  
  /**
    * Required. Specifies the target version of Redis software to upgrade to.
    */
  var redisVersion: js.UndefOr[String | Null] = js.undefined
}
object SchemaUpgradeInstanceRequest {
  
  inline def apply(): SchemaUpgradeInstanceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpgradeInstanceRequest]
  }
  
  extension [Self <: SchemaUpgradeInstanceRequest](x: Self) {
    
    inline def setRedisVersion(value: String): Self = StObject.set(x, "redisVersion", value.asInstanceOf[js.Any])
    
    inline def setRedisVersionNull: Self = StObject.set(x, "redisVersion", null)
    
    inline def setRedisVersionUndefined: Self = StObject.set(x, "redisVersion", js.undefined)
  }
}
