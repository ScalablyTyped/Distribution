package typings.highlightJs

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HLJSOptions extends StObject {
  
  var __emitter: EmitterConstructor
  
  var classPrefix: String
  
  var languageDetectRe: RegExp
  
  var languages: js.UndefOr[js.Array[String]] = js.undefined
  
  var noHighlightRe: RegExp
  
  var tabReplace: js.UndefOr[String] = js.undefined
  
  var useBR: Boolean
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
  implicit class HLJSOptionsMutableBuilder[Self <: HLJSOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassPrefix(value: String): Self = StObject.set(x, "classPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageDetectRe(value: RegExp): Self = StObject.set(x, "languageDetectRe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguages(value: js.Array[String]): Self = StObject.set(x, "languages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguagesUndefined: Self = StObject.set(x, "languages", js.undefined)
    
    @scala.inline
    def setLanguagesVarargs(value: String*): Self = StObject.set(x, "languages", js.Array(value :_*))
    
    @scala.inline
    def setNoHighlightRe(value: RegExp): Self = StObject.set(x, "noHighlightRe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabReplace(value: String): Self = StObject.set(x, "tabReplace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabReplaceUndefined: Self = StObject.set(x, "tabReplace", js.undefined)
    
    @scala.inline
    def setUseBR(value: Boolean): Self = StObject.set(x, "useBR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set__emitter(value: EmitterConstructor): Self = StObject.set(x, "__emitter", value.asInstanceOf[js.Any])
  }
}
