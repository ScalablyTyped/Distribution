package typings.googleapis.serviceusageV1Mod.serviceusageV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaImportAdminQuotaPoliciesResponse extends StObject {
  
  /**
    * The policies that were created from the imported data.
    */
  var policies: js.UndefOr[js.Array[SchemaAdminQuotaPolicy]] = js.undefined
}
object SchemaImportAdminQuotaPoliciesResponse {
  
  inline def apply(): SchemaImportAdminQuotaPoliciesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImportAdminQuotaPoliciesResponse]
  }
  
  extension [Self <: SchemaImportAdminQuotaPoliciesResponse](x: Self) {
    
    inline def setPolicies(value: js.Array[SchemaAdminQuotaPolicy]): Self = StObject.set(x, "policies", value.asInstanceOf[js.Any])
    
    inline def setPoliciesUndefined: Self = StObject.set(x, "policies", js.undefined)
    
    inline def setPoliciesVarargs(value: SchemaAdminQuotaPolicy*): Self = StObject.set(x, "policies", js.Array(value*))
  }
}
