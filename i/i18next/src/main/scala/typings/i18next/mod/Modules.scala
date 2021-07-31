package typings.i18next.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Modules extends StObject {
  
  var backend: js.UndefOr[BackendModule[js.Object]] = js.undefined
  
  var external: js.Array[ThirdPartyModule]
  
  var i18nFormat: js.UndefOr[I18nFormatModule] = js.undefined
  
  var languageDetector: js.UndefOr[LanguageDetectorModule | LanguageDetectorAsyncModule] = js.undefined
  
  var logger: js.UndefOr[LoggerModule] = js.undefined
}
object Modules {
  
  @scala.inline
  def apply(external: js.Array[ThirdPartyModule]): Modules = {
    val __obj = js.Dynamic.literal(external = external.asInstanceOf[js.Any])
    __obj.asInstanceOf[Modules]
  }
  
  @scala.inline
  implicit class ModulesMutableBuilder[Self <: Modules] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackend(value: BackendModule[js.Object]): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackendUndefined: Self = StObject.set(x, "backend", js.undefined)
    
    @scala.inline
    def setExternal(value: js.Array[ThirdPartyModule]): Self = StObject.set(x, "external", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalVarargs(value: ThirdPartyModule*): Self = StObject.set(x, "external", js.Array(value :_*))
    
    @scala.inline
    def setI18nFormat(value: I18nFormatModule): Self = StObject.set(x, "i18nFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setI18nFormatUndefined: Self = StObject.set(x, "i18nFormat", js.undefined)
    
    @scala.inline
    def setLanguageDetector(value: LanguageDetectorModule | LanguageDetectorAsyncModule): Self = StObject.set(x, "languageDetector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageDetectorUndefined: Self = StObject.set(x, "languageDetector", js.undefined)
    
    @scala.inline
    def setLogger(value: LoggerModule): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
  }
}
