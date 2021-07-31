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
  
  @scala.inline
  def apply(): SchemaLanguageTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLanguageTargeting]
  }
  
  @scala.inline
  implicit class SchemaLanguageTargetingMutableBuilder[Self <: SchemaLanguageTargeting] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLanguages(value: js.Array[SchemaLanguage]): Self = StObject.set(x, "languages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguagesUndefined: Self = StObject.set(x, "languages", js.undefined)
    
    @scala.inline
    def setLanguagesVarargs(value: SchemaLanguage*): Self = StObject.set(x, "languages", js.Array(value :_*))
  }
}
