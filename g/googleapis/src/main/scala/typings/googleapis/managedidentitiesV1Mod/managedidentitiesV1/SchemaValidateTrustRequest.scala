package typings.googleapis.managedidentitiesV1Mod.managedidentitiesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaValidateTrustRequest extends StObject {
  
  /**
    * Required. The domain trust to validate trust state for.
    */
  var trust: js.UndefOr[SchemaTrust] = js.undefined
}
object SchemaValidateTrustRequest {
  
  inline def apply(): SchemaValidateTrustRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaValidateTrustRequest]
  }
  
  extension [Self <: SchemaValidateTrustRequest](x: Self) {
    
    inline def setTrust(value: SchemaTrust): Self = StObject.set(x, "trust", value.asInstanceOf[js.Any])
    
    inline def setTrustUndefined: Self = StObject.set(x, "trust", js.undefined)
  }
}
