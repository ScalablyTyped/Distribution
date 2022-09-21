package typings.i18next.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Modules extends StObject {
  
  var backend: js.UndefOr[BackendModule[js.Object]] = js.undefined
  
  var external: js.Array[ThirdPartyModule]
  
  var formatter: js.UndefOr[FormatterModule] = js.undefined
  
  var i18nFormat: js.UndefOr[I18nFormatModule] = js.undefined
  
  var languageDetector: js.UndefOr[LanguageDetectorModule | LanguageDetectorAsyncModule] = js.undefined
  
  var logger: js.UndefOr[LoggerModule] = js.undefined
}
object Modules {
  
  inline def apply(external: js.Array[ThirdPartyModule]): Modules = {
    val __obj = js.Dynamic.literal(external = external.asInstanceOf[js.Any])
    __obj.asInstanceOf[Modules]
  }
  
  extension [Self <: Modules](x: Self) {
    
    inline def setBackend(value: BackendModule[js.Object]): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setBackendUndefined: Self = StObject.set(x, "backend", js.undefined)
    
    inline def setExternal(value: js.Array[ThirdPartyModule]): Self = StObject.set(x, "external", value.asInstanceOf[js.Any])
    
    inline def setExternalVarargs(value: ThirdPartyModule*): Self = StObject.set(x, "external", js.Array(value*))
    
    inline def setFormatter(value: FormatterModule): Self = StObject.set(x, "formatter", value.asInstanceOf[js.Any])
    
    inline def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
    
    inline def setI18nFormat(value: I18nFormatModule): Self = StObject.set(x, "i18nFormat", value.asInstanceOf[js.Any])
    
    inline def setI18nFormatUndefined: Self = StObject.set(x, "i18nFormat", js.undefined)
    
    inline def setLanguageDetector(value: LanguageDetectorModule | LanguageDetectorAsyncModule): Self = StObject.set(x, "languageDetector", value.asInstanceOf[js.Any])
    
    inline def setLanguageDetectorUndefined: Self = StObject.set(x, "languageDetector", js.undefined)
    
    inline def setLogger(value: LoggerModule): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
  }
}
