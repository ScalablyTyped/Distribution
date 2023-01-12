package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreativeFieldValuesListResponse extends StObject {
  
  /** Creative field value collection. */
  var creativeFieldValues: js.UndefOr[js.Array[CreativeFieldValue]] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#creativeFieldValuesListResponse". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Pagination token to be used for the next list operation. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object CreativeFieldValuesListResponse {
  
  inline def apply(): CreativeFieldValuesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreativeFieldValuesListResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreativeFieldValuesListResponse] (val x: Self) extends AnyVal {
    
    inline def setCreativeFieldValues(value: js.Array[CreativeFieldValue]): Self = StObject.set(x, "creativeFieldValues", value.asInstanceOf[js.Any])
    
    inline def setCreativeFieldValuesUndefined: Self = StObject.set(x, "creativeFieldValues", js.undefined)
    
    inline def setCreativeFieldValuesVarargs(value: CreativeFieldValue*): Self = StObject.set(x, "creativeFieldValues", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
