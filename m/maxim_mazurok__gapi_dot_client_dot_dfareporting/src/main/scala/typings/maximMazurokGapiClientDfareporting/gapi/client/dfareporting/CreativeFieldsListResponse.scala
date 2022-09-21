package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreativeFieldsListResponse extends StObject {
  
  /** Creative field collection. */
  var creativeFields: js.UndefOr[js.Array[CreativeField]] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#creativeFieldsListResponse". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Pagination token to be used for the next list operation. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object CreativeFieldsListResponse {
  
  inline def apply(): CreativeFieldsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreativeFieldsListResponse]
  }
  
  extension [Self <: CreativeFieldsListResponse](x: Self) {
    
    inline def setCreativeFields(value: js.Array[CreativeField]): Self = StObject.set(x, "creativeFields", value.asInstanceOf[js.Any])
    
    inline def setCreativeFieldsUndefined: Self = StObject.set(x, "creativeFields", js.undefined)
    
    inline def setCreativeFieldsVarargs(value: CreativeField*): Self = StObject.set(x, "creativeFields", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
