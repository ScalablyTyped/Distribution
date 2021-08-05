package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LanguagesListResponse extends StObject {
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#languagesListResponse". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Language collection. */
  var languages: js.UndefOr[js.Array[Language]] = js.undefined
}
object LanguagesListResponse {
  
  inline def apply(): LanguagesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LanguagesListResponse]
  }
  
  extension [Self <: LanguagesListResponse](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLanguages(value: js.Array[Language]): Self = StObject.set(x, "languages", value.asInstanceOf[js.Any])
    
    inline def setLanguagesUndefined: Self = StObject.set(x, "languages", js.undefined)
    
    inline def setLanguagesVarargs(value: Language*): Self = StObject.set(x, "languages", js.Array(value :_*))
  }
}
