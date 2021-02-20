package typings.i18next.mod

import typings.i18next.i18nextBooleans.`true`
import typings.i18next.i18nextStrings.languageDetector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LanguageDetectorAsyncModule extends Module {
  
  /** Set to true to enable async detection */
  var async: `true` = js.native
  
  def cacheUserLanguage(lng: String): Unit = js.native
  
  /** Must call callback passing detected language */
  def detect(callback: js.Function1[/* lng */ String, Unit]): Unit = js.native
  
  def init(services: Services, detectorOptions: js.Object, i18nextOptions: InitOptions): Unit = js.native
  
  @JSName("type")
  var type_LanguageDetectorAsyncModule: languageDetector = js.native
}
object LanguageDetectorAsyncModule {
  
  @scala.inline
  def apply(
    async: `true`,
    cacheUserLanguage: String => Unit,
    detect: js.Function1[/* lng */ String, Unit] => Unit,
    init: (Services, js.Object, InitOptions) => Unit,
    `type`: languageDetector
  ): LanguageDetectorAsyncModule = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], cacheUserLanguage = js.Any.fromFunction1(cacheUserLanguage), detect = js.Any.fromFunction1(detect), init = js.Any.fromFunction3(init))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LanguageDetectorAsyncModule]
  }
  
  @scala.inline
  implicit class LanguageDetectorAsyncModuleMutableBuilder[Self <: LanguageDetectorAsyncModule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAsync(value: `true`): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheUserLanguage(value: String => Unit): Self = StObject.set(x, "cacheUserLanguage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDetect(value: js.Function1[/* lng */ String, Unit] => Unit): Self = StObject.set(x, "detect", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInit(value: (Services, js.Object, InitOptions) => Unit): Self = StObject.set(x, "init", js.Any.fromFunction3(value))
    
    @scala.inline
    def setType(value: languageDetector): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
