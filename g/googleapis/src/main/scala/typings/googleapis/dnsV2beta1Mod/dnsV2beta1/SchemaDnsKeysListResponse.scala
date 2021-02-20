package typings.googleapis.dnsV2beta1Mod.dnsV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaDnsKeysListResponse extends StObject {
  
  var dnsKeys: js.UndefOr[js.Array[SchemaDnsKey]] = js.native
  
  var header: js.UndefOr[SchemaResponseHeader] = js.native
  
  /**
    * Type of resource.
    */
  var kind: js.UndefOr[String] = js.native
  
  var nextPageToken: js.UndefOr[String] = js.native
}
object SchemaDnsKeysListResponse {
  
  @scala.inline
  def apply(): SchemaDnsKeysListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDnsKeysListResponse]
  }
  
  @scala.inline
  implicit class SchemaDnsKeysListResponseMutableBuilder[Self <: SchemaDnsKeysListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDnsKeys(value: js.Array[SchemaDnsKey]): Self = StObject.set(x, "dnsKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDnsKeysUndefined: Self = StObject.set(x, "dnsKeys", js.undefined)
    
    @scala.inline
    def setDnsKeysVarargs(value: SchemaDnsKey*): Self = StObject.set(x, "dnsKeys", js.Array(value :_*))
    
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
  }
}
