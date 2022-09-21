package typings.googleapis.notebooksV1Mod.notebooksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUpdateShieldedInstanceConfigRequest extends StObject {
  
  /**
    * ShieldedInstance configuration to be updated.
    */
  var shieldedInstanceConfig: js.UndefOr[SchemaShieldedInstanceConfig] = js.undefined
}
object SchemaUpdateShieldedInstanceConfigRequest {
  
  inline def apply(): SchemaUpdateShieldedInstanceConfigRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateShieldedInstanceConfigRequest]
  }
  
  extension [Self <: SchemaUpdateShieldedInstanceConfigRequest](x: Self) {
    
    inline def setShieldedInstanceConfig(value: SchemaShieldedInstanceConfig): Self = StObject.set(x, "shieldedInstanceConfig", value.asInstanceOf[js.Any])
    
    inline def setShieldedInstanceConfigUndefined: Self = StObject.set(x, "shieldedInstanceConfig", js.undefined)
  }
}
