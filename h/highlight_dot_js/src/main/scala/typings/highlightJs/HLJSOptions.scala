package typings.highlightJs

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HLJSOptions extends js.Object {
  
  var __emitter: EmitterConstructor = js.native
  
  var classPrefix: String = js.native
  
  var languageDetectRe: RegExp = js.native
  
  var languages: js.UndefOr[js.Array[String]] = js.native
  
  var noHighlightRe: RegExp = js.native
  
  var tabReplace: js.UndefOr[String] = js.native
  
  var useBR: Boolean = js.native
}
object HLJSOptions {
  
  @scala.inline
  def apply(
    __emitter: EmitterConstructor,
    classPrefix: String,
    languageDetectRe: RegExp,
    noHighlightRe: RegExp,
    useBR: Boolean
  ): HLJSOptions = {
    val __obj = js.Dynamic.literal(__emitter = __emitter.asInstanceOf[js.Any], classPrefix = classPrefix.asInstanceOf[js.Any], languageDetectRe = languageDetectRe.asInstanceOf[js.Any], noHighlightRe = noHighlightRe.asInstanceOf[js.Any], useBR = useBR.asInstanceOf[js.Any])
    __obj.asInstanceOf[HLJSOptions]
  }
  
  @scala.inline
  implicit class HLJSOptionsOps[Self <: HLJSOptions] (val x: Self) extends AnyVal {
    
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
    def set__emitter(value: EmitterConstructor): Self = this.set("__emitter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassPrefix(value: String): Self = this.set("classPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageDetectRe(value: RegExp): Self = this.set("languageDetectRe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoHighlightRe(value: RegExp): Self = this.set("noHighlightRe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseBR(value: Boolean): Self = this.set("useBR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguagesVarargs(value: String*): Self = this.set("languages", js.Array(value :_*))
    
    @scala.inline
    def setLanguages(value: js.Array[String]): Self = this.set("languages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguages: Self = this.set("languages", js.undefined)
    
    @scala.inline
    def setTabReplace(value: String): Self = this.set("tabReplace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabReplace: Self = this.set("tabReplace", js.undefined)
  }
}
