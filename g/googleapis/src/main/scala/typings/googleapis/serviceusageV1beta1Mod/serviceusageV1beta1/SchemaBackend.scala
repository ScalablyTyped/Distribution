package typings.googleapis.serviceusageV1beta1Mod.serviceusageV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * `Backend` defines the backend configuration for a service.
  */
trait SchemaBackend extends StObject {
  
  /**
    * A list of API backend rules that apply to individual API methods.
    * **NOTE:** All service configuration rules follow &quot;last one
    * wins&quot; order.
    */
  var rules: js.UndefOr[js.Array[SchemaBackendRule]] = js.undefined
}
object SchemaBackend {
  
  inline def apply(): SchemaBackend = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBackend]
  }
  
  extension [Self <: SchemaBackend](x: Self) {
    
    inline def setRules(value: js.Array[SchemaBackendRule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    inline def setRulesVarargs(value: SchemaBackendRule*): Self = StObject.set(x, "rules", js.Array(value :_*))
  }
}
