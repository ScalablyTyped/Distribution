package typings.googleapis.dnsV1Mod.dnsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDnsKeysListResponse extends StObject {
  
  /**
    * The requested resources.
    */
  var dnsKeys: js.UndefOr[js.Array[SchemaDnsKey]] = js.undefined
  
  var header: js.UndefOr[SchemaResponseHeader] = js.undefined
  
  /**
    * Type of resource.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The presence of this field indicates that there exist more results following your last page of results in pagination order. To fetch them, make another list request using this value as your pagination token. In this way you can retrieve the complete contents of even very large collections one page at a time. However, if the contents of the collection change between the first and last paginated list request, the set of all elements returned are an inconsistent view of the collection. There is no way to retrieve a "snapshot" of collections larger than the maximum page size.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaDnsKeysListResponse {
  
  inline def apply(): SchemaDnsKeysListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDnsKeysListResponse]
  }
  
  extension [Self <: SchemaDnsKeysListResponse](x: Self) {
    
    inline def setDnsKeys(value: js.Array[SchemaDnsKey]): Self = StObject.set(x, "dnsKeys", value.asInstanceOf[js.Any])
    
    inline def setDnsKeysUndefined: Self = StObject.set(x, "dnsKeys", js.undefined)
    
    inline def setDnsKeysVarargs(value: SchemaDnsKey*): Self = StObject.set(x, "dnsKeys", js.Array(value*))
    
    inline def setHeader(value: SchemaResponseHeader): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
