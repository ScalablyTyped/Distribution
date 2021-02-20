package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LanguagesListResponse extends StObject {
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#languagesListResponse". */
  var kind: js.UndefOr[String] = js.native
  
  /** Language collection. */
  var languages: js.UndefOr[js.Array[Language]] = js.native
}
object LanguagesListResponse {
  
  @scala.inline
  def apply(): LanguagesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LanguagesListResponse]
  }
  
  @scala.inline
  implicit class LanguagesListResponseMutableBuilder[Self <: LanguagesListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLanguages(value: js.Array[Language]): Self = StObject.set(x, "languages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguagesUndefined: Self = StObject.set(x, "languages", js.undefined)
    
    @scala.inline
    def setLanguagesVarargs(value: Language*): Self = StObject.set(x, "languages", js.Array(value :_*))
  }
}
