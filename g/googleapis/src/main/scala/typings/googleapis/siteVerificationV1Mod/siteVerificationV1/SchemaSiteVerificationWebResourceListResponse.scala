package typings.googleapis.siteVerificationV1Mod.siteVerificationV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSiteVerificationWebResourceListResponse extends StObject {
  
  /**
    * The list of sites that are owned by the authenticated user.
    */
  var items: js.UndefOr[js.Array[SchemaSiteVerificationWebResourceResource]] = js.undefined
}
object SchemaSiteVerificationWebResourceListResponse {
  
  inline def apply(): SchemaSiteVerificationWebResourceListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSiteVerificationWebResourceListResponse]
  }
  
  extension [Self <: SchemaSiteVerificationWebResourceListResponse](x: Self) {
    
    inline def setItems(value: js.Array[SchemaSiteVerificationWebResourceResource]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: SchemaSiteVerificationWebResourceResource*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
