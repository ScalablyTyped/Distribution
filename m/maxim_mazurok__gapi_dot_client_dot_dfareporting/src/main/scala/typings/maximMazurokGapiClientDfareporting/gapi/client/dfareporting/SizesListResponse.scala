package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SizesListResponse extends StObject {
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#sizesListResponse". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Size collection. */
  var sizes: js.UndefOr[js.Array[Size]] = js.undefined
}
object SizesListResponse {
  
  inline def apply(): SizesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SizesListResponse]
  }
  
  extension [Self <: SizesListResponse](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setSizes(value: js.Array[Size]): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
    
    inline def setSizesUndefined: Self = StObject.set(x, "sizes", js.undefined)
    
    inline def setSizesVarargs(value: Size*): Self = StObject.set(x, "sizes", js.Array(value*))
  }
}
