package typings.i18next.mod

import typings.i18next.i18nextBooleans.`true`
import typings.i18next.i18nextStrings.languageDetector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LanguageDetectorAsyncModule
  extends StObject
     with Module {
  
  /** Set to true to enable async detection */
  var async: `true`
  
  def cacheUserLanguage(lng: String): Unit
  
  /** Must call callback passing detected language */
  def detect(callback: js.Function1[/* lng */ js.UndefOr[String | js.Array[String]], Unit]): Unit
  
  def init(services: Services, detectorOptions: js.Object, i18nextOptions: InitOptions): Unit
  
  @JSName("type")
  var type_LanguageDetectorAsyncModule: languageDetector
}
object LanguageDetectorAsyncModule {
  
  inline def apply(
    cacheUserLanguage: String => Unit,
    detect: js.Function1[/* lng */ js.UndefOr[String | js.Array[String]], Unit] => Unit,
    init: (Services, js.Object, InitOptions) => Unit
  ): LanguageDetectorAsyncModule = {
    val __obj = js.Dynamic.literal(async = true, cacheUserLanguage = js.Any.fromFunction1(cacheUserLanguage), detect = js.Any.fromFunction1(detect), init = js.Any.fromFunction3(init))
    __obj.updateDynamic("type")("languageDetector")
    __obj.asInstanceOf[LanguageDetectorAsyncModule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LanguageDetectorAsyncModule] (val x: Self) extends AnyVal {
    
    inline def setAsync(value: `true`): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    inline def setCacheUserLanguage(value: String => Unit): Self = StObject.set(x, "cacheUserLanguage", js.Any.fromFunction1(value))
    
    inline def setDetect(value: js.Function1[/* lng */ js.UndefOr[String | js.Array[String]], Unit] => Unit): Self = StObject.set(x, "detect", js.Any.fromFunction1(value))
    
    inline def setInit(value: (Services, js.Object, InitOptions) => Unit): Self = StObject.set(x, "init", js.Any.fromFunction3(value))
    
    inline def setType(value: languageDetector): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
