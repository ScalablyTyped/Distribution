package typings.googleapis.serviceconsumermanagementV1beta1Mod.serviceconsumermanagementV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaV1Beta1OverrideInlineSource extends StObject {
  
  /**
    * The overrides to create. Each override must have a value for 'metric' and 'unit', to specify which metric and which limit the override should be applied to. The 'name' field of the override does not need to be set; it is ignored.
    */
  var overrides: js.UndefOr[js.Array[SchemaV1Beta1QuotaOverride]] = js.undefined
}
object SchemaV1Beta1OverrideInlineSource {
  
  inline def apply(): SchemaV1Beta1OverrideInlineSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaV1Beta1OverrideInlineSource]
  }
  
  extension [Self <: SchemaV1Beta1OverrideInlineSource](x: Self) {
    
    inline def setOverrides(value: js.Array[SchemaV1Beta1QuotaOverride]): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    
    inline def setOverridesVarargs(value: SchemaV1Beta1QuotaOverride*): Self = StObject.set(x, "overrides", js.Array(value*))
  }
}
