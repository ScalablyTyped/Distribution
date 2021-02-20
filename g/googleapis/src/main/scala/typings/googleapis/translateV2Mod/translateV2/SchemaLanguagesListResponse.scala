package typings.googleapis.translateV2Mod.translateV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaLanguagesListResponse extends StObject {
  
  /**
    * List of source/target languages supported by the translation API. If
    * target parameter is unspecified, the list is sorted by the ASCII code
    * point order of the language code. If target parameter is specified, the
    * list is sorted by the collation order of the language name in the target
    * language.
    */
  var languages: js.UndefOr[js.Array[SchemaLanguagesResource]] = js.native
}
object SchemaLanguagesListResponse {
  
  @scala.inline
  def apply(): SchemaLanguagesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLanguagesListResponse]
  }
  
  @scala.inline
  implicit class SchemaLanguagesListResponseMutableBuilder[Self <: SchemaLanguagesListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLanguages(value: js.Array[SchemaLanguagesResource]): Self = StObject.set(x, "languages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguagesUndefined: Self = StObject.set(x, "languages", js.undefined)
    
    @scala.inline
    def setLanguagesVarargs(value: SchemaLanguagesResource*): Self = StObject.set(x, "languages", js.Array(value :_*))
  }
}
