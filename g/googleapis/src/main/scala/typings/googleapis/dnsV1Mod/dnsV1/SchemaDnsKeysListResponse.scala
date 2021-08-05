package typings.googleapis.dnsV1Mod.dnsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDnsKeysListResponse extends StObject {
  
  var dnsKeys: js.UndefOr[js.Array[SchemaDnsKey]] = js.undefined
  
  var header: js.UndefOr[SchemaResponseHeader] = js.undefined
  
  /**
    * Type of resource.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaDnsKeysListResponse {
  
  inline def apply(): SchemaDnsKeysListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDnsKeysListResponse]
  }
  
  extension [Self <: SchemaDnsKeysListResponse](x: Self) {
    
    inline def setDnsKeys(value: js.Array[SchemaDnsKey]): Self = StObject.set(x, "dnsKeys", value.asInstanceOf[js.Any])
    
    inline def setDnsKeysUndefined: Self = StObject.set(x, "dnsKeys", js.undefined)
    
    inline def setDnsKeysVarargs(value: SchemaDnsKey*): Self = StObject.set(x, "dnsKeys", js.Array(value :_*))
    
    inline def setHeader(value: SchemaResponseHeader): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
