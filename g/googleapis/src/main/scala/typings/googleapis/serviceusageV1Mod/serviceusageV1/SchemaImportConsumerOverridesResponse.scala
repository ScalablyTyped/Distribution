package typings.googleapis.serviceusageV1Mod.serviceusageV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaImportConsumerOverridesResponse extends StObject {
  
  /**
    * The overrides that were created from the imported data.
    */
  var overrides: js.UndefOr[js.Array[SchemaQuotaOverride]] = js.undefined
}
object SchemaImportConsumerOverridesResponse {
  
  inline def apply(): SchemaImportConsumerOverridesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImportConsumerOverridesResponse]
  }
  
  extension [Self <: SchemaImportConsumerOverridesResponse](x: Self) {
    
    inline def setOverrides(value: js.Array[SchemaQuotaOverride]): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    
    inline def setOverridesVarargs(value: SchemaQuotaOverride*): Self = StObject.set(x, "overrides", js.Array(value*))
  }
}
