package typings.googleapis.dnsV1Mod.dnsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaResourceRecordSetsListResponse extends StObject {
  
  var header: js.UndefOr[SchemaResponseHeader] = js.undefined
  
  /**
    * Type of resource.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  var rrsets: js.UndefOr[js.Array[SchemaResourceRecordSet]] = js.undefined
}
object SchemaResourceRecordSetsListResponse {
  
  inline def apply(): SchemaResourceRecordSetsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResourceRecordSetsListResponse]
  }
  
  extension [Self <: SchemaResourceRecordSetsListResponse](x: Self) {
    
    inline def setHeader(value: SchemaResponseHeader): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setRrsets(value: js.Array[SchemaResourceRecordSet]): Self = StObject.set(x, "rrsets", value.asInstanceOf[js.Any])
    
    inline def setRrsetsUndefined: Self = StObject.set(x, "rrsets", js.undefined)
    
    inline def setRrsetsVarargs(value: SchemaResourceRecordSet*): Self = StObject.set(x, "rrsets", js.Array(value :_*))
  }
}
