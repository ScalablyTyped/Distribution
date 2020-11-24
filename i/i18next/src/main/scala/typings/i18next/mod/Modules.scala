package typings.i18next.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Modules extends js.Object {
  
  var backend: js.UndefOr[BackendModule[js.Object]] = js.native
  
  var external: js.Array[ThirdPartyModule] = js.native
  
  var i18nFormat: js.UndefOr[I18nFormatModule] = js.native
  
  var languageDetector: js.UndefOr[LanguageDetectorModule | LanguageDetectorAsyncModule] = js.native
  
  var logger: js.UndefOr[LoggerModule] = js.native
}
object Modules {
  
  @scala.inline
  def apply(external: js.Array[ThirdPartyModule]): Modules = {
    val __obj = js.Dynamic.literal(external = external.asInstanceOf[js.Any])
    __obj.asInstanceOf[Modules]
  }
  
  @scala.inline
  implicit class ModulesOps[Self <: Modules] (val x: Self) extends AnyVal {
    
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
    def setExternalVarargs(value: ThirdPartyModule*): Self = this.set("external", js.Array(value :_*))
    
    @scala.inline
    def setExternal(value: js.Array[ThirdPartyModule]): Self = this.set("external", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackend(value: BackendModule[js.Object]): Self = this.set("backend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackend: Self = this.set("backend", js.undefined)
    
    @scala.inline
    def setI18nFormat(value: I18nFormatModule): Self = this.set("i18nFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteI18nFormat: Self = this.set("i18nFormat", js.undefined)
    
    @scala.inline
    def setLanguageDetector(value: LanguageDetectorModule | LanguageDetectorAsyncModule): Self = this.set("languageDetector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguageDetector: Self = this.set("languageDetector", js.undefined)
    
    @scala.inline
    def setLogger(value: LoggerModule): Self = this.set("logger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogger: Self = this.set("logger", js.undefined)
  }
}
