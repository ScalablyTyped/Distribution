package typings.highlightJs.anon

import typings.highlightJs.EmitterConstructor
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<highlight.js.HLJSOptions> */
@js.native
trait PartialHLJSOptions extends js.Object {
  
  var __emitter: js.UndefOr[EmitterConstructor] = js.native
  
  var classPrefix: js.UndefOr[String] = js.native
  
  var languageDetectRe: js.UndefOr[RegExp] = js.native
  
  var languages: js.UndefOr[js.Array[String]] = js.native
  
  var noHighlightRe: js.UndefOr[RegExp] = js.native
  
  var tabReplace: js.UndefOr[String] = js.native
  
  var useBR: js.UndefOr[Boolean] = js.native
}
object PartialHLJSOptions {
  
  @scala.inline
  def apply(): PartialHLJSOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialHLJSOptions]
  }
  
  @scala.inline
  implicit class PartialHLJSOptionsOps[Self <: PartialHLJSOptions] (val x: Self) extends AnyVal {
    
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
    def delete__emitter: Self = this.set("__emitter", js.undefined)
    
    @scala.inline
    def setClassPrefix(value: String): Self = this.set("classPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassPrefix: Self = this.set("classPrefix", js.undefined)
    
    @scala.inline
    def setLanguageDetectRe(value: RegExp): Self = this.set("languageDetectRe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguageDetectRe: Self = this.set("languageDetectRe", js.undefined)
    
    @scala.inline
    def setLanguagesVarargs(value: String*): Self = this.set("languages", js.Array(value :_*))
    
    @scala.inline
    def setLanguages(value: js.Array[String]): Self = this.set("languages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguages: Self = this.set("languages", js.undefined)
    
    @scala.inline
    def setNoHighlightRe(value: RegExp): Self = this.set("noHighlightRe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoHighlightRe: Self = this.set("noHighlightRe", js.undefined)
    
    @scala.inline
    def setTabReplace(value: String): Self = this.set("tabReplace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabReplace: Self = this.set("tabReplace", js.undefined)
    
    @scala.inline
    def setUseBR(value: Boolean): Self = this.set("useBR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseBR: Self = this.set("useBR", js.undefined)
  }
}
