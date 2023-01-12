package typings.highlightJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HLJSOptions extends StObject {
  
  var __emitter: EmitterConstructor
  
  var classPrefix: String
  
  var cssSelector: String
  
  var ignoreUnescapedHTML: js.UndefOr[Boolean] = js.undefined
  
  var languageDetectRe: js.RegExp
  
  var languages: js.UndefOr[js.Array[String]] = js.undefined
  
  var noHighlightRe: js.RegExp
  
  var throwUnescapedHTML: js.UndefOr[Boolean] = js.undefined
}
object HLJSOptions {
  
  inline def apply(
    __emitter: EmitterConstructor,
    classPrefix: String,
    cssSelector: String,
    languageDetectRe: js.RegExp,
    noHighlightRe: js.RegExp
  ): HLJSOptions = {
    val __obj = js.Dynamic.literal(__emitter = __emitter.asInstanceOf[js.Any], classPrefix = classPrefix.asInstanceOf[js.Any], cssSelector = cssSelector.asInstanceOf[js.Any], languageDetectRe = languageDetectRe.asInstanceOf[js.Any], noHighlightRe = noHighlightRe.asInstanceOf[js.Any])
    __obj.asInstanceOf[HLJSOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HLJSOptions] (val x: Self) extends AnyVal {
    
    inline def setClassPrefix(value: String): Self = StObject.set(x, "classPrefix", value.asInstanceOf[js.Any])
    
    inline def setCssSelector(value: String): Self = StObject.set(x, "cssSelector", value.asInstanceOf[js.Any])
    
    inline def setIgnoreUnescapedHTML(value: Boolean): Self = StObject.set(x, "ignoreUnescapedHTML", value.asInstanceOf[js.Any])
    
    inline def setIgnoreUnescapedHTMLUndefined: Self = StObject.set(x, "ignoreUnescapedHTML", js.undefined)
    
    inline def setLanguageDetectRe(value: js.RegExp): Self = StObject.set(x, "languageDetectRe", value.asInstanceOf[js.Any])
    
    inline def setLanguages(value: js.Array[String]): Self = StObject.set(x, "languages", value.asInstanceOf[js.Any])
    
    inline def setLanguagesUndefined: Self = StObject.set(x, "languages", js.undefined)
    
    inline def setLanguagesVarargs(value: String*): Self = StObject.set(x, "languages", js.Array(value*))
    
    inline def setNoHighlightRe(value: js.RegExp): Self = StObject.set(x, "noHighlightRe", value.asInstanceOf[js.Any])
    
    inline def setThrowUnescapedHTML(value: Boolean): Self = StObject.set(x, "throwUnescapedHTML", value.asInstanceOf[js.Any])
    
    inline def setThrowUnescapedHTMLUndefined: Self = StObject.set(x, "throwUnescapedHTML", js.undefined)
    
    inline def set__emitter(value: EmitterConstructor): Self = StObject.set(x, "__emitter", value.asInstanceOf[js.Any])
  }
}
