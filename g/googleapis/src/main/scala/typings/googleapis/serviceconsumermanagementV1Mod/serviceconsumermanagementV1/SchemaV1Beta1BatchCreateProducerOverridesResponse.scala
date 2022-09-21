package typings.googleapis.serviceconsumermanagementV1Mod.serviceconsumermanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaV1Beta1BatchCreateProducerOverridesResponse extends StObject {
  
  /**
    * The overrides that were created.
    */
  var overrides: js.UndefOr[js.Array[SchemaV1Beta1QuotaOverride]] = js.undefined
}
object SchemaV1Beta1BatchCreateProducerOverridesResponse {
  
  inline def apply(): SchemaV1Beta1BatchCreateProducerOverridesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaV1Beta1BatchCreateProducerOverridesResponse]
  }
  
  extension [Self <: SchemaV1Beta1BatchCreateProducerOverridesResponse](x: Self) {
    
    inline def setOverrides(value: js.Array[SchemaV1Beta1QuotaOverride]): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    
    inline def setOverridesVarargs(value: SchemaV1Beta1QuotaOverride*): Self = StObject.set(x, "overrides", js.Array(value*))
  }
}
