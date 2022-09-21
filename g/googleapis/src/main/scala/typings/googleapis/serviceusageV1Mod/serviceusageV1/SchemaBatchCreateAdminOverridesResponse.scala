package typings.googleapis.serviceusageV1Mod.serviceusageV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBatchCreateAdminOverridesResponse extends StObject {
  
  /**
    * The overrides that were created.
    */
  var overrides: js.UndefOr[js.Array[SchemaQuotaOverride]] = js.undefined
}
object SchemaBatchCreateAdminOverridesResponse {
  
  inline def apply(): SchemaBatchCreateAdminOverridesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchCreateAdminOverridesResponse]
  }
  
  extension [Self <: SchemaBatchCreateAdminOverridesResponse](x: Self) {
    
    inline def setOverrides(value: js.Array[SchemaQuotaOverride]): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    
    inline def setOverridesVarargs(value: SchemaQuotaOverride*): Self = StObject.set(x, "overrides", js.Array(value*))
  }
}
