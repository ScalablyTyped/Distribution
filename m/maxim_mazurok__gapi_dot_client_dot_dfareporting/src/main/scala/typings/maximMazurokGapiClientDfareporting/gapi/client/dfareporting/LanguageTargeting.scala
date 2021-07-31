package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LanguageTargeting extends StObject {
  
  /** Languages that this ad targets. For each language only languageId is required. The other fields are populated automatically when the ad is inserted or updated. */
  var languages: js.UndefOr[js.Array[Language]] = js.undefined
}
object LanguageTargeting {
  
  @scala.inline
  def apply(): LanguageTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LanguageTargeting]
  }
  
  @scala.inline
  implicit class LanguageTargetingMutableBuilder[Self <: LanguageTargeting] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLanguages(value: js.Array[Language]): Self = StObject.set(x, "languages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguagesUndefined: Self = StObject.set(x, "languages", js.undefined)
    
    @scala.inline
    def setLanguagesVarargs(value: Language*): Self = StObject.set(x, "languages", js.Array(value :_*))
  }
}
