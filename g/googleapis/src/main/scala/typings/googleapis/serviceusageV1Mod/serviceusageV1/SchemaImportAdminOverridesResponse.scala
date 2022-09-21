package typings.googleapis.serviceusageV1Mod.serviceusageV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaImportAdminOverridesResponse extends StObject {
  
  /**
    * The overrides that were created from the imported data.
    */
  var overrides: js.UndefOr[js.Array[SchemaQuotaOverride]] = js.undefined
}
object SchemaImportAdminOverridesResponse {
  
  inline def apply(): SchemaImportAdminOverridesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImportAdminOverridesResponse]
  }
  
  extension [Self <: SchemaImportAdminOverridesResponse](x: Self) {
    
    inline def setOverrides(value: js.Array[SchemaQuotaOverride]): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    
    inline def setOverridesVarargs(value: SchemaQuotaOverride*): Self = StObject.set(x, "overrides", js.Array(value*))
  }
}
