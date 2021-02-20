package typings.googleapis.dnsV1beta2Mod.dnsV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaPoliciesListResponse extends StObject {
  
  var header: js.UndefOr[SchemaResponseHeader] = js.native
  
  /**
    * Type of resource.
    */
  var kind: js.UndefOr[String] = js.native
  
  var nextPageToken: js.UndefOr[String] = js.native
  
  var policies: js.UndefOr[js.Array[SchemaPolicy]] = js.native
}
object SchemaPoliciesListResponse {
  
  @scala.inline
  def apply(): SchemaPoliciesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPoliciesListResponse]
  }
  
  @scala.inline
  implicit class SchemaPoliciesListResponseMutableBuilder[Self <: SchemaPoliciesListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeader(value: SchemaResponseHeader): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setPolicies(value: js.Array[SchemaPolicy]): Self = StObject.set(x, "policies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoliciesUndefined: Self = StObject.set(x, "policies", js.undefined)
    
    @scala.inline
    def setPoliciesVarargs(value: SchemaPolicy*): Self = StObject.set(x, "policies", js.Array(value :_*))
  }
}
