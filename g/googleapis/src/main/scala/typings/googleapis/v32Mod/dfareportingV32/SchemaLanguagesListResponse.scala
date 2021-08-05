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
  
  inline def apply(): SchemaLanguagesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLanguagesListResponse]
  }
  
  extension [Self <: SchemaLanguagesListResponse](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLanguages(value: js.Array[SchemaLanguage]): Self = StObject.set(x, "languages", value.asInstanceOf[js.Any])
    
    inline def setLanguagesUndefined: Self = StObject.set(x, "languages", js.undefined)
    
    inline def setLanguagesVarargs(value: SchemaLanguage*): Self = StObject.set(x, "languages", js.Array(value :_*))
  }
}
