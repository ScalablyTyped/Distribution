package typings.googleapis.v32Mod.dfareportingV32

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Language Targeting.
  */
trait SchemaLanguageTargeting extends StObject {
  
  /**
    * Languages that this ad targets. For each language only languageId is
    * required. The other fields are populated automatically when the ad is
    * inserted or updated.
    */
  var languages: js.UndefOr[js.Array[SchemaLanguage]] = js.undefined
}
object SchemaLanguageTargeting {
  
  inline def apply(): SchemaLanguageTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLanguageTargeting]
  }
  
  extension [Self <: SchemaLanguageTargeting](x: Self) {
    
    inline def setLanguages(value: js.Array[SchemaLanguage]): Self = StObject.set(x, "languages", value.asInstanceOf[js.Any])
    
    inline def setLanguagesUndefined: Self = StObject.set(x, "languages", js.undefined)
    
    inline def setLanguagesVarargs(value: SchemaLanguage*): Self = StObject.set(x, "languages", js.Array(value :_*))
  }
}
