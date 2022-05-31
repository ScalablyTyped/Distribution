package typings.jsBeautify

import typings.jsBeautify.mod.CSSBeautifyOptions
import typings.jsBeautify.mod.HTMLBeautifyOptions
import typings.jsBeautify.mod.JSBeautifyOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object jsBeautify {
    
    inline def apply(js_source_text: String): String = ^.asInstanceOf[js.Dynamic].apply(js_source_text.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def apply(js_source_text: String, options: JSBeautifyOptions): String = (^.asInstanceOf[js.Dynamic].apply(js_source_text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @JSGlobal("js_beautify")
    @js.native
    val ^ : js.Any = js.native
    
    inline def css(js_source_text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("css")(js_source_text.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def css(js_source_text: String, options: CSSBeautifyOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("css")(js_source_text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def cssBeautify(js_source_text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("css_beautify")(js_source_text.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def cssBeautify(js_source_text: String, options: CSSBeautifyOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("css_beautify")(js_source_text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def html(js_source_text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("html")(js_source_text.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def html(js_source_text: String, options: HTMLBeautifyOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("html")(js_source_text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def htmlBeautify(js_source_text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("html_beautify")(js_source_text.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def htmlBeautify(js_source_text: String, options: HTMLBeautifyOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("html_beautify")(js_source_text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def jsBeautify(js_source_text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("js_beautify")(js_source_text.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def jsBeautify(js_source_text: String, options: JSBeautifyOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("js_beautify")(js_source_text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def js_(js_source_text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("js")(js_source_text.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def js_(js_source_text: String, options: JSBeautifyOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("js")(js_source_text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  }
}
