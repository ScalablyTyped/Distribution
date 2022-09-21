package typings.googleapis.serviceusageV1beta1Mod.serviceusageV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListAdminOverridesResponse extends StObject {
  
  /**
    * Token identifying which result to start with; returned by a previous list call.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Admin overrides on this limit.
    */
  var overrides: js.UndefOr[js.Array[SchemaQuotaOverride]] = js.undefined
}
object SchemaListAdminOverridesResponse {
  
  inline def apply(): SchemaListAdminOverridesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListAdminOverridesResponse]
  }
  
  extension [Self <: SchemaListAdminOverridesResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setOverrides(value: js.Array[SchemaQuotaOverride]): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    
    inline def setOverridesVarargs(value: SchemaQuotaOverride*): Self = StObject.set(x, "overrides", js.Array(value*))
  }
}
