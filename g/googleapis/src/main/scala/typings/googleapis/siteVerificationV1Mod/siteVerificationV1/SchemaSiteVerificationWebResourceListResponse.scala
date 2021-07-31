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
  
  @scala.inline
  def apply(): SchemaSiteVerificationWebResourceListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSiteVerificationWebResourceListResponse]
  }
  
  @scala.inline
  implicit class SchemaSiteVerificationWebResourceListResponseMutableBuilder[Self <: SchemaSiteVerificationWebResourceListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[SchemaSiteVerificationWebResourceResource]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: SchemaSiteVerificationWebResourceResource*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
