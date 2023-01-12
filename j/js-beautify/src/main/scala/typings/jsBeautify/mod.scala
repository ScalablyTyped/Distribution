package typings.jsBeautify

import typings.jsBeautify.jsBeautifyStrings.`after-newline`
import typings.jsBeautify.jsBeautifyStrings.`aligned-multiple`
import typings.jsBeautify.jsBeautifyStrings.`before-newline`
import typings.jsBeautify.jsBeautifyStrings.`end-expand`
import typings.jsBeautify.jsBeautifyStrings.`force-aligned`
import typings.jsBeautify.jsBeautifyStrings.`force-expand-multiline`
import typings.jsBeautify.jsBeautifyStrings.`preserve-aligned`
import typings.jsBeautify.jsBeautifyStrings.`preserve-inline`
import typings.jsBeautify.jsBeautifyStrings.`preserve-newline`
import typings.jsBeautify.jsBeautifyStrings.auto
import typings.jsBeautify.jsBeautifyStrings.collapse
import typings.jsBeautify.jsBeautifyStrings.expand
import typings.jsBeautify.jsBeautifyStrings.force
import typings.jsBeautify.jsBeautifyStrings.keep
import typings.jsBeautify.jsBeautifyStrings.none
import typings.jsBeautify.jsBeautifyStrings.normal
import typings.jsBeautify.jsBeautifyStrings.preserve
import typings.jsBeautify.jsBeautifyStrings.separate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(js_source_text: String): String = ^.asInstanceOf[js.Dynamic].apply(js_source_text.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(js_source_text: String, options: JSBeautifyOptions): String = (^.asInstanceOf[js.Dynamic].apply(js_source_text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("js-beautify", JSImport.Namespace)
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
  
  trait CSSBeautifyOptions
    extends StObject
       with CoreBeautifyOptions {
    
    var newline_between_rules: js.UndefOr[Boolean] = js.undefined
    
    var selector_separator_newline: js.UndefOr[Boolean] = js.undefined
    
    var space_around_combinator: js.UndefOr[Boolean] = js.undefined
    
    var space_around_selector_separator: js.UndefOr[Boolean] = js.undefined
  }
  object CSSBeautifyOptions {
    
    inline def apply(): CSSBeautifyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CSSBeautifyOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CSSBeautifyOptions] (val x: Self) extends AnyVal {
      
      inline def setNewline_between_rules(value: Boolean): Self = StObject.set(x, "newline_between_rules", value.asInstanceOf[js.Any])
      
      inline def setNewline_between_rulesUndefined: Self = StObject.set(x, "newline_between_rules", js.undefined)
      
      inline def setSelector_separator_newline(value: Boolean): Self = StObject.set(x, "selector_separator_newline", value.asInstanceOf[js.Any])
      
      inline def setSelector_separator_newlineUndefined: Self = StObject.set(x, "selector_separator_newline", js.undefined)
      
      inline def setSpace_around_combinator(value: Boolean): Self = StObject.set(x, "space_around_combinator", value.asInstanceOf[js.Any])
      
      inline def setSpace_around_combinatorUndefined: Self = StObject.set(x, "space_around_combinator", js.undefined)
      
      inline def setSpace_around_selector_separator(value: Boolean): Self = StObject.set(x, "space_around_selector_separator", value.asInstanceOf[js.Any])
      
      inline def setSpace_around_selector_separatorUndefined: Self = StObject.set(x, "space_around_selector_separator", js.undefined)
    }
  }
  
  trait CoreBeautifyOptions extends StObject {
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var end_with_newline: js.UndefOr[Boolean] = js.undefined
    
    var eol: js.UndefOr[String] = js.undefined
    
    var indent_char: js.UndefOr[String] = js.undefined
    
    var indent_empty_lines: js.UndefOr[Boolean] = js.undefined
    
    var indent_level: js.UndefOr[Double] = js.undefined
    
    var indent_size: js.UndefOr[Double] = js.undefined
    
    var indent_with_tabs: js.UndefOr[Boolean] = js.undefined
    
    var max_preserve_newlines: js.UndefOr[Double] = js.undefined
    
    var preserve_newlines: js.UndefOr[Boolean] = js.undefined
    
    var templating: js.UndefOr[js.Array[String]] = js.undefined
    
    var wrap_line_length: js.UndefOr[Double] = js.undefined
  }
  object CoreBeautifyOptions {
    
    inline def apply(): CoreBeautifyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CoreBeautifyOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CoreBeautifyOptions] (val x: Self) extends AnyVal {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setEnd_with_newline(value: Boolean): Self = StObject.set(x, "end_with_newline", value.asInstanceOf[js.Any])
      
      inline def setEnd_with_newlineUndefined: Self = StObject.set(x, "end_with_newline", js.undefined)
      
      inline def setEol(value: String): Self = StObject.set(x, "eol", value.asInstanceOf[js.Any])
      
      inline def setEolUndefined: Self = StObject.set(x, "eol", js.undefined)
      
      inline def setIndent_char(value: String): Self = StObject.set(x, "indent_char", value.asInstanceOf[js.Any])
      
      inline def setIndent_charUndefined: Self = StObject.set(x, "indent_char", js.undefined)
      
      inline def setIndent_empty_lines(value: Boolean): Self = StObject.set(x, "indent_empty_lines", value.asInstanceOf[js.Any])
      
      inline def setIndent_empty_linesUndefined: Self = StObject.set(x, "indent_empty_lines", js.undefined)
      
      inline def setIndent_level(value: Double): Self = StObject.set(x, "indent_level", value.asInstanceOf[js.Any])
      
      inline def setIndent_levelUndefined: Self = StObject.set(x, "indent_level", js.undefined)
      
      inline def setIndent_size(value: Double): Self = StObject.set(x, "indent_size", value.asInstanceOf[js.Any])
      
      inline def setIndent_sizeUndefined: Self = StObject.set(x, "indent_size", js.undefined)
      
      inline def setIndent_with_tabs(value: Boolean): Self = StObject.set(x, "indent_with_tabs", value.asInstanceOf[js.Any])
      
      inline def setIndent_with_tabsUndefined: Self = StObject.set(x, "indent_with_tabs", js.undefined)
      
      inline def setMax_preserve_newlines(value: Double): Self = StObject.set(x, "max_preserve_newlines", value.asInstanceOf[js.Any])
      
      inline def setMax_preserve_newlinesUndefined: Self = StObject.set(x, "max_preserve_newlines", js.undefined)
      
      inline def setPreserve_newlines(value: Boolean): Self = StObject.set(x, "preserve_newlines", value.asInstanceOf[js.Any])
      
      inline def setPreserve_newlinesUndefined: Self = StObject.set(x, "preserve_newlines", js.undefined)
      
      inline def setTemplating(value: js.Array[String]): Self = StObject.set(x, "templating", value.asInstanceOf[js.Any])
      
      inline def setTemplatingUndefined: Self = StObject.set(x, "templating", js.undefined)
      
      inline def setTemplatingVarargs(value: String*): Self = StObject.set(x, "templating", js.Array(value*))
      
      inline def setWrap_line_length(value: Double): Self = StObject.set(x, "wrap_line_length", value.asInstanceOf[js.Any])
      
      inline def setWrap_line_lengthUndefined: Self = StObject.set(x, "wrap_line_length", js.undefined)
    }
  }
  
  trait HTMLBeautifyOptions
    extends StObject
       with CoreBeautifyOptions {
    
    var content_unformatted: js.UndefOr[js.Array[String]] = js.undefined
    
    var extra_liners: js.UndefOr[js.Array[String]] = js.undefined
    
    var indent_body_inner_html: js.UndefOr[Boolean] = js.undefined
    
    var indent_handlebars: js.UndefOr[Boolean] = js.undefined
    
    var indent_head_inner_html: js.UndefOr[Boolean] = js.undefined
    
    var indent_inner_html: js.UndefOr[Boolean] = js.undefined
    
    var indent_scripts: js.UndefOr[normal | keep | separate] = js.undefined
    
    var `inline`: js.UndefOr[js.Array[String]] = js.undefined
    
    var unformatted: js.UndefOr[js.Array[String]] = js.undefined
    
    var unformatted_content_delimiter: js.UndefOr[String] = js.undefined
    
    var void_elements: js.UndefOr[js.Array[String]] = js.undefined
    
    var wrap_attributes: js.UndefOr[
        auto | force | `force-aligned` | `force-expand-multiline` | `aligned-multiple` | preserve | `preserve-aligned`
      ] = js.undefined
    
    var wrap_attributes_indent_size: js.UndefOr[Double] = js.undefined
  }
  object HTMLBeautifyOptions {
    
    inline def apply(): HTMLBeautifyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HTMLBeautifyOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HTMLBeautifyOptions] (val x: Self) extends AnyVal {
      
      inline def setContent_unformatted(value: js.Array[String]): Self = StObject.set(x, "content_unformatted", value.asInstanceOf[js.Any])
      
      inline def setContent_unformattedUndefined: Self = StObject.set(x, "content_unformatted", js.undefined)
      
      inline def setContent_unformattedVarargs(value: String*): Self = StObject.set(x, "content_unformatted", js.Array(value*))
      
      inline def setExtra_liners(value: js.Array[String]): Self = StObject.set(x, "extra_liners", value.asInstanceOf[js.Any])
      
      inline def setExtra_linersUndefined: Self = StObject.set(x, "extra_liners", js.undefined)
      
      inline def setExtra_linersVarargs(value: String*): Self = StObject.set(x, "extra_liners", js.Array(value*))
      
      inline def setIndent_body_inner_html(value: Boolean): Self = StObject.set(x, "indent_body_inner_html", value.asInstanceOf[js.Any])
      
      inline def setIndent_body_inner_htmlUndefined: Self = StObject.set(x, "indent_body_inner_html", js.undefined)
      
      inline def setIndent_handlebars(value: Boolean): Self = StObject.set(x, "indent_handlebars", value.asInstanceOf[js.Any])
      
      inline def setIndent_handlebarsUndefined: Self = StObject.set(x, "indent_handlebars", js.undefined)
      
      inline def setIndent_head_inner_html(value: Boolean): Self = StObject.set(x, "indent_head_inner_html", value.asInstanceOf[js.Any])
      
      inline def setIndent_head_inner_htmlUndefined: Self = StObject.set(x, "indent_head_inner_html", js.undefined)
      
      inline def setIndent_inner_html(value: Boolean): Self = StObject.set(x, "indent_inner_html", value.asInstanceOf[js.Any])
      
      inline def setIndent_inner_htmlUndefined: Self = StObject.set(x, "indent_inner_html", js.undefined)
      
      inline def setIndent_scripts(value: normal | keep | separate): Self = StObject.set(x, "indent_scripts", value.asInstanceOf[js.Any])
      
      inline def setIndent_scriptsUndefined: Self = StObject.set(x, "indent_scripts", js.undefined)
      
      inline def setInline(value: js.Array[String]): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      inline def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      inline def setInlineVarargs(value: String*): Self = StObject.set(x, "inline", js.Array(value*))
      
      inline def setUnformatted(value: js.Array[String]): Self = StObject.set(x, "unformatted", value.asInstanceOf[js.Any])
      
      inline def setUnformattedUndefined: Self = StObject.set(x, "unformatted", js.undefined)
      
      inline def setUnformattedVarargs(value: String*): Self = StObject.set(x, "unformatted", js.Array(value*))
      
      inline def setUnformatted_content_delimiter(value: String): Self = StObject.set(x, "unformatted_content_delimiter", value.asInstanceOf[js.Any])
      
      inline def setUnformatted_content_delimiterUndefined: Self = StObject.set(x, "unformatted_content_delimiter", js.undefined)
      
      inline def setVoid_elements(value: js.Array[String]): Self = StObject.set(x, "void_elements", value.asInstanceOf[js.Any])
      
      inline def setVoid_elementsUndefined: Self = StObject.set(x, "void_elements", js.undefined)
      
      inline def setVoid_elementsVarargs(value: String*): Self = StObject.set(x, "void_elements", js.Array(value*))
      
      inline def setWrap_attributes(
        value: auto | force | `force-aligned` | `force-expand-multiline` | `aligned-multiple` | preserve | `preserve-aligned`
      ): Self = StObject.set(x, "wrap_attributes", value.asInstanceOf[js.Any])
      
      inline def setWrap_attributesUndefined: Self = StObject.set(x, "wrap_attributes", js.undefined)
      
      inline def setWrap_attributes_indent_size(value: Double): Self = StObject.set(x, "wrap_attributes_indent_size", value.asInstanceOf[js.Any])
      
      inline def setWrap_attributes_indent_sizeUndefined: Self = StObject.set(x, "wrap_attributes_indent_size", js.undefined)
    }
  }
  
  trait JSBeautifyOptions
    extends StObject
       with CoreBeautifyOptions {
    
    var brace_style: js.UndefOr[collapse | expand | `end-expand` | none | `preserve-inline`] = js.undefined
    
    var break_chained_methods: js.UndefOr[Boolean] = js.undefined
    
    var comma_first: js.UndefOr[Boolean] = js.undefined
    
    var e4x: js.UndefOr[Boolean] = js.undefined
    
    var jslint_happy: js.UndefOr[Boolean] = js.undefined
    
    var keep_array_indentation: js.UndefOr[Boolean] = js.undefined
    
    var operator_position: js.UndefOr[`before-newline` | `after-newline` | `preserve-newline`] = js.undefined
    
    var space_after_anon_function: js.UndefOr[Boolean] = js.undefined
    
    var space_after_named_function: js.UndefOr[Boolean] = js.undefined
    
    var space_before_conditional: js.UndefOr[Boolean] = js.undefined
    
    var space_in_empty_paren: js.UndefOr[Boolean] = js.undefined
    
    var space_in_paren: js.UndefOr[Boolean] = js.undefined
    
    var test_output_raw: js.UndefOr[Boolean] = js.undefined
    
    var unescape_strings: js.UndefOr[Boolean] = js.undefined
    
    var unindent_chained_methods: js.UndefOr[Boolean] = js.undefined
  }
  object JSBeautifyOptions {
    
    inline def apply(): JSBeautifyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JSBeautifyOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JSBeautifyOptions] (val x: Self) extends AnyVal {
      
      inline def setBrace_style(value: collapse | expand | `end-expand` | none | `preserve-inline`): Self = StObject.set(x, "brace_style", value.asInstanceOf[js.Any])
      
      inline def setBrace_styleUndefined: Self = StObject.set(x, "brace_style", js.undefined)
      
      inline def setBreak_chained_methods(value: Boolean): Self = StObject.set(x, "break_chained_methods", value.asInstanceOf[js.Any])
      
      inline def setBreak_chained_methodsUndefined: Self = StObject.set(x, "break_chained_methods", js.undefined)
      
      inline def setComma_first(value: Boolean): Self = StObject.set(x, "comma_first", value.asInstanceOf[js.Any])
      
      inline def setComma_firstUndefined: Self = StObject.set(x, "comma_first", js.undefined)
      
      inline def setE4x(value: Boolean): Self = StObject.set(x, "e4x", value.asInstanceOf[js.Any])
      
      inline def setE4xUndefined: Self = StObject.set(x, "e4x", js.undefined)
      
      inline def setJslint_happy(value: Boolean): Self = StObject.set(x, "jslint_happy", value.asInstanceOf[js.Any])
      
      inline def setJslint_happyUndefined: Self = StObject.set(x, "jslint_happy", js.undefined)
      
      inline def setKeep_array_indentation(value: Boolean): Self = StObject.set(x, "keep_array_indentation", value.asInstanceOf[js.Any])
      
      inline def setKeep_array_indentationUndefined: Self = StObject.set(x, "keep_array_indentation", js.undefined)
      
      inline def setOperator_position(value: `before-newline` | `after-newline` | `preserve-newline`): Self = StObject.set(x, "operator_position", value.asInstanceOf[js.Any])
      
      inline def setOperator_positionUndefined: Self = StObject.set(x, "operator_position", js.undefined)
      
      inline def setSpace_after_anon_function(value: Boolean): Self = StObject.set(x, "space_after_anon_function", value.asInstanceOf[js.Any])
      
      inline def setSpace_after_anon_functionUndefined: Self = StObject.set(x, "space_after_anon_function", js.undefined)
      
      inline def setSpace_after_named_function(value: Boolean): Self = StObject.set(x, "space_after_named_function", value.asInstanceOf[js.Any])
      
      inline def setSpace_after_named_functionUndefined: Self = StObject.set(x, "space_after_named_function", js.undefined)
      
      inline def setSpace_before_conditional(value: Boolean): Self = StObject.set(x, "space_before_conditional", value.asInstanceOf[js.Any])
      
      inline def setSpace_before_conditionalUndefined: Self = StObject.set(x, "space_before_conditional", js.undefined)
      
      inline def setSpace_in_empty_paren(value: Boolean): Self = StObject.set(x, "space_in_empty_paren", value.asInstanceOf[js.Any])
      
      inline def setSpace_in_empty_parenUndefined: Self = StObject.set(x, "space_in_empty_paren", js.undefined)
      
      inline def setSpace_in_paren(value: Boolean): Self = StObject.set(x, "space_in_paren", value.asInstanceOf[js.Any])
      
      inline def setSpace_in_parenUndefined: Self = StObject.set(x, "space_in_paren", js.undefined)
      
      inline def setTest_output_raw(value: Boolean): Self = StObject.set(x, "test_output_raw", value.asInstanceOf[js.Any])
      
      inline def setTest_output_rawUndefined: Self = StObject.set(x, "test_output_raw", js.undefined)
      
      inline def setUnescape_strings(value: Boolean): Self = StObject.set(x, "unescape_strings", value.asInstanceOf[js.Any])
      
      inline def setUnescape_stringsUndefined: Self = StObject.set(x, "unescape_strings", js.undefined)
      
      inline def setUnindent_chained_methods(value: Boolean): Self = StObject.set(x, "unindent_chained_methods", value.asInstanceOf[js.Any])
      
      inline def setUnindent_chained_methodsUndefined: Self = StObject.set(x, "unindent_chained_methods", js.undefined)
    }
  }
}
