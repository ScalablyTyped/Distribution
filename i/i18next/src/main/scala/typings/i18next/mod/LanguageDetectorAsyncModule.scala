package typings.i18next.mod

import typings.i18next.i18nextBooleans.`true`
import typings.i18next.i18nextStrings.languageDetector
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
  implicit class LanguageDetectorAsyncModuleOps[Self <: LanguageDetectorAsyncModule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAsync(value: `true`): Self = this.set("async", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheUserLanguage(value: String => Unit): Self = this.set("cacheUserLanguage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDetect(value: js.Function1[/* lng */ String, Unit] => Unit): Self = this.set("detect", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInit(value: (Services, js.Object, InitOptions) => Unit): Self = this.set("init", js.Any.fromFunction3(value))
    
    @scala.inline
    def setType(value: languageDetector): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
