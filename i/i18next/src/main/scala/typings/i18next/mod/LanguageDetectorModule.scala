package typings.i18next.mod

import typings.i18next.i18nextStrings.languageDetector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LanguageDetectorModule extends Module {
  
  def cacheUserLanguage(lng: String): Unit = js.native
  
  /** Must return detected language */
  def detect(): js.UndefOr[String] = js.native
  
  def init(services: Services, detectorOptions: js.Object, i18nextOptions: InitOptions): Unit = js.native
  
  @JSName("type")
  var type_LanguageDetectorModule: languageDetector = js.native
}
object LanguageDetectorModule {
  
  @scala.inline
  def apply(
    cacheUserLanguage: String => Unit,
    detect: () => js.UndefOr[String],
    init: (Services, js.Object, InitOptions) => Unit,
    `type`: languageDetector
  ): LanguageDetectorModule = {
    val __obj = js.Dynamic.literal(cacheUserLanguage = js.Any.fromFunction1(cacheUserLanguage), detect = js.Any.fromFunction0(detect), init = js.Any.fromFunction3(init))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LanguageDetectorModule]
  }
  
  @scala.inline
  implicit class LanguageDetectorModuleMutableBuilder[Self <: LanguageDetectorModule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCacheUserLanguage(value: String => Unit): Self = StObject.set(x, "cacheUserLanguage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDetect(value: () => js.UndefOr[String]): Self = StObject.set(x, "detect", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInit(value: (Services, js.Object, InitOptions) => Unit): Self = StObject.set(x, "init", js.Any.fromFunction3(value))
    
    @scala.inline
    def setType(value: languageDetector): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
