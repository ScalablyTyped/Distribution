package typings.googleapis.v32Mod.dfareportingV32

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Language List Response
  */
trait SchemaLanguagesListResponse extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#languagesListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Language collection.
    */
  var languages: js.UndefOr[js.Array[SchemaLanguage]] = js.undefined
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
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLanguages(value: js.Array[SchemaLanguage]): Self = StObject.set(x, "languages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguagesUndefined: Self = StObject.set(x, "languages", js.undefined)
    
    @scala.inline
    def setLanguagesVarargs(value: SchemaLanguage*): Self = StObject.set(x, "languages", js.Array(value :_*))
  }
}
