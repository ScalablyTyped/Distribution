package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreativesListResponse extends StObject {
  
  /** Creative collection. */
  var creatives: js.UndefOr[js.Array[Creative]] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#creativesListResponse". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Pagination token to be used for the next list operation. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object CreativesListResponse {
  
  inline def apply(): CreativesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreativesListResponse]
  }
  
  extension [Self <: CreativesListResponse](x: Self) {
    
    inline def setCreatives(value: js.Array[Creative]): Self = StObject.set(x, "creatives", value.asInstanceOf[js.Any])
    
    inline def setCreativesUndefined: Self = StObject.set(x, "creatives", js.undefined)
    
    inline def setCreativesVarargs(value: Creative*): Self = StObject.set(x, "creatives", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
