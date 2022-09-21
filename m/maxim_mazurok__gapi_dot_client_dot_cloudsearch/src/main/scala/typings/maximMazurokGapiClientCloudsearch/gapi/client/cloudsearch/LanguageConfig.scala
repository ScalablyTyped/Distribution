package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LanguageConfig extends StObject {
  
  /** The spoken language(s) in BCP47 language code. */
  var spokenLanguages: js.UndefOr[js.Array[String]] = js.undefined
}
object LanguageConfig {
  
  inline def apply(): LanguageConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LanguageConfig]
  }
  
  extension [Self <: LanguageConfig](x: Self) {
    
    inline def setSpokenLanguages(value: js.Array[String]): Self = StObject.set(x, "spokenLanguages", value.asInstanceOf[js.Any])
    
    inline def setSpokenLanguagesUndefined: Self = StObject.set(x, "spokenLanguages", js.undefined)
    
    inline def setSpokenLanguagesVarargs(value: String*): Self = StObject.set(x, "spokenLanguages", js.Array(value*))
  }
}
