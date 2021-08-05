package typings.i18next.mod

import typings.i18next.i18nextStrings.languageDetector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LanguageDetectorModule
  extends StObject
     with Module {
  
  def cacheUserLanguage(lng: String): Unit
  
  /** Must return detected language */
  def detect(): js.UndefOr[String]
  
  def init(services: Services, detectorOptions: js.Object, i18nextOptions: InitOptions): Unit
  
  @JSName("type")
  var type_LanguageDetectorModule: languageDetector
}
object LanguageDetectorModule {
  
  inline def apply(
    cacheUserLanguage: String => Unit,
    detect: () => js.UndefOr[String],
    init: (Services, js.Object, InitOptions) => Unit
  ): LanguageDetectorModule = {
    val __obj = js.Dynamic.literal(cacheUserLanguage = js.Any.fromFunction1(cacheUserLanguage), detect = js.Any.fromFunction0(detect), init = js.Any.fromFunction3(init))
    __obj.updateDynamic("type")("languageDetector")
    __obj.asInstanceOf[LanguageDetectorModule]
  }
  
  extension [Self <: LanguageDetectorModule](x: Self) {
    
    inline def setCacheUserLanguage(value: String => Unit): Self = StObject.set(x, "cacheUserLanguage", js.Any.fromFunction1(value))
    
    inline def setDetect(value: () => js.UndefOr[String]): Self = StObject.set(x, "detect", js.Any.fromFunction0(value))
    
    inline def setInit(value: (Services, js.Object, InitOptions) => Unit): Self = StObject.set(x, "init", js.Any.fromFunction3(value))
    
    inline def setType(value: languageDetector): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
