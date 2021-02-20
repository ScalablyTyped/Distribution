package typings.jju

import typings.jju.jjuStrings.Apostrophe
import typings.jju.jjuStrings.Quotationmark
import typings.jju.jjuStrings.`throw`
import typings.jju.jjuStrings.cjson
import typings.jju.jjuStrings.comment
import typings.jju.jjuStrings.ignore
import typings.jju.jjuStrings.json
import typings.jju.jjuStrings.json5
import typings.jju.jjuStrings.key
import typings.jju.jjuStrings.literal
import typings.jju.jjuStrings.newline
import typings.jju.jjuStrings.replace
import typings.jju.jjuStrings.separator
import typings.jju.jjuStrings.whitespace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jju", "analyze")
  @js.native
  def analyze(text: String): JsonStyle = js.native
  @JSImport("jju", "analyze")
  @js.native
  def analyze(text: String, options: ParseOptions): JsonStyle = js.native
  
  @JSImport("jju", "parse")
  @js.native
  def parse(text: String): js.Any = js.native
  @JSImport("jju", "parse")
  @js.native
  def parse(text: String, options: ParseOptions): js.Any = js.native
  @JSImport("jju", "parse")
  @js.native
  def parse(text: String, reviver: js.Function2[/* key */ js.Any, /* value */ js.Any, _]): js.Any = js.native
  
  @JSImport("jju", "stringify")
  @js.native
  def stringify(value: js.Any): String = js.native
  @JSImport("jju", "stringify")
  @js.native
  def stringify(value: js.Any, options: StringifyOptions): String = js.native
  @JSImport("jju", "stringify")
  @js.native
  def stringify(value: js.Any, replacer: js.UndefOr[scala.Nothing], space: String): String = js.native
  @JSImport("jju", "stringify")
  @js.native
  def stringify(value: js.Any, replacer: js.UndefOr[scala.Nothing], space: Double): String = js.native
  @JSImport("jju", "stringify")
  @js.native
  def stringify(value: js.Any, replacer: js.Array[Double | String]): String = js.native
  @JSImport("jju", "stringify")
  @js.native
  def stringify(value: js.Any, replacer: js.Array[Double | String], space: String): String = js.native
  @JSImport("jju", "stringify")
  @js.native
  def stringify(value: js.Any, replacer: js.Array[Double | String], space: Double): String = js.native
  @JSImport("jju", "stringify")
  @js.native
  def stringify(value: js.Any, replacer: js.Function2[/* key */ String, /* value */ js.Any, _]): String = js.native
  @JSImport("jju", "stringify")
  @js.native
  def stringify(value: js.Any, replacer: js.Function2[/* key */ String, /* value */ js.Any, _], space: String): String = js.native
  @JSImport("jju", "stringify")
  @js.native
  def stringify(value: js.Any, replacer: js.Function2[/* key */ String, /* value */ js.Any, _], space: Double): String = js.native
  @JSImport("jju", "stringify")
  @js.native
  def stringify(value: js.Any, replacer: Null, space: String): String = js.native
  @JSImport("jju", "stringify")
  @js.native
  def stringify(value: js.Any, replacer: Null, space: Double): String = js.native
  
  @JSImport("jju", "tokenize")
  @js.native
  def tokenize(text: String): js.Array[Token] = js.native
  @JSImport("jju", "tokenize")
  @js.native
  def tokenize(text: String, options: ParseOptions): js.Array[Token] = js.native
  
  @JSImport("jju", "update")
  @js.native
  def update(text: String, new_value: js.Any): String = js.native
  @JSImport("jju", "update")
  @js.native
  def update(text: String, new_value: js.Any, options: ParseOptions with StringifyOptions): String = js.native
  
  @js.native
  trait JsonStyle extends StObject {
    
    /** True if input has a comment token. */
    var has_comments: Boolean = js.native
    
    /** True if input has a newline token. */
    var has_newlines: Boolean = js.native
    
    /** True if input has at least one trailing comma. */
    var has_trailing_comma: Boolean = js.native
    
    /** True if input has a whitespace token. */
    var has_whitespace: Boolean = js.native
    
    /** Preferred indentation. */
    var indent: String = js.native
    
    /** Preferred newline. */
    var newline: String = js.native
    
    /** " or ' depending on which quote is preferred. */
    var quote: String = js.native
    
    /** True if unquoted keys were used at least once. */
    var quote_keys: Boolean = js.native
  }
  object JsonStyle {
    
    @scala.inline
    def apply(
      has_comments: Boolean,
      has_newlines: Boolean,
      has_trailing_comma: Boolean,
      has_whitespace: Boolean,
      indent: String,
      newline: String,
      quote: String,
      quote_keys: Boolean
    ): JsonStyle = {
      val __obj = js.Dynamic.literal(has_comments = has_comments.asInstanceOf[js.Any], has_newlines = has_newlines.asInstanceOf[js.Any], has_trailing_comma = has_trailing_comma.asInstanceOf[js.Any], has_whitespace = has_whitespace.asInstanceOf[js.Any], indent = indent.asInstanceOf[js.Any], newline = newline.asInstanceOf[js.Any], quote = quote.asInstanceOf[js.Any], quote_keys = quote_keys.asInstanceOf[js.Any])
      __obj.asInstanceOf[JsonStyle]
    }
    
    @scala.inline
    implicit class JsonStyleMutableBuilder[Self <: JsonStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHas_comments(value: Boolean): Self = StObject.set(x, "has_comments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHas_newlines(value: Boolean): Self = StObject.set(x, "has_newlines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHas_trailing_comma(value: Boolean): Self = StObject.set(x, "has_trailing_comma", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHas_whitespace(value: Boolean): Self = StObject.set(x, "has_whitespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndent(value: String): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewline(value: String): Self = StObject.set(x, "newline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuote(value: String): Self = StObject.set(x, "quote", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuote_keys(value: Boolean): Self = StObject.set(x, "quote_keys", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ParseOptions extends StObject {
    
    /**
      * Operation mode (default 'json5'). Set to 'json' if you want to throw on non-strict json files.
      */
    var mode: js.UndefOr[json5 | json | cjson] = js.native
    
    /**
      * Create object as `Object.create(null)` instead of `{}`.
      * - If reserved_keys != 'replace', default is false.
      * - If reserved_keys == 'replace', default is true.
      *
      * It is usually unsafe and not recommended to change this option to false in the last case.
      */
    var null_prototype: js.UndefOr[Boolean] = js.native
    
    /**
      * What to do with reserved keys (default 'ignore').
      * - "ignore" - ignore reserved keys
      * - "throw" - throw SyntaxError in case of reserved keys
      * - "replace" - replace reserved keys, this is the default JSON.parse behaviour, unsafe
      */
    var reserved_keys: js.UndefOr[ignore | `throw` | replace] = js.native
    
    /**
      * Reviver function (follows the JSON spec). This function is called for each member of the object.
      * If a member contains nested objects, the nested objects are transformed before the parent object is.
      */
    var reviver: js.UndefOr[js.Function2[/* key */ js.Any, /* value */ js.Any, _]] = js.native
  }
  object ParseOptions {
    
    @scala.inline
    def apply(): ParseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParseOptions]
    }
    
    @scala.inline
    implicit class ParseOptionsMutableBuilder[Self <: ParseOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMode(value: json5 | json | cjson): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setNull_prototype(value: Boolean): Self = StObject.set(x, "null_prototype", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNull_prototypeUndefined: Self = StObject.set(x, "null_prototype", js.undefined)
      
      @scala.inline
      def setReserved_keys(value: ignore | `throw` | replace): Self = StObject.set(x, "reserved_keys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReserved_keysUndefined: Self = StObject.set(x, "reserved_keys", js.undefined)
      
      @scala.inline
      def setReviver(value: (/* key */ js.Any, /* value */ js.Any) => _): Self = StObject.set(x, "reviver", js.Any.fromFunction2(value))
      
      @scala.inline
      def setReviverUndefined: Self = StObject.set(x, "reviver", js.undefined)
    }
  }
  
  @js.native
  trait StringifyOptions extends StObject {
    
    /**
      * Output ascii only (default false).
      * If this option is enabled, output will not have any characters except 0x20-0x7f.
      */
    var ascii: js.UndefOr[Boolean] = js.native
    
    /**
      * This option follows JSON specification.
      * @default '\t'
      */
    var indent: js.UndefOr[String | Double | Boolean] = js.native
    
    /**
      * Operation mode. Set it to 'json' if you want correct json in the output.
      * If it is 'json', following options are implied:
      * - options.quote = '"'
      * - options.no_trailing_comma = true
      * - options.quote_keys = true
      * - '\x' literals are not used
      */
    var mode: js.UndefOr[json | json5 | cjson] = js.native
    
    /**
      * Don't output trailing comma. If this option is set, arrays like `[1,2,3,]` will never be generated.
      * Otherwise they may be generated for pretty printing.
      * - If `mode` is JSON, default is true
      * - Otherwise, default is false
      */
    var no_trailing_comma: js.UndefOr[Boolean] = js.native
    
    /**
      * Enquoting char.
      * - If `mode` is 'json', default is "
      * - Otherwise, default is '
      */
    var quote: js.UndefOr[Quotationmark | Apostrophe] = js.native
    
    /**
      * Whether keys quoting in objects is required or not.
      * If you want `{"q": 1}` instead of `{q: 1}`, set it to true.
      * - If `mode` is 'json', default is true
      * - Otherwise, default is false
      */
    var quote_keys: js.UndefOr[Boolean] = js.native
    
    /**
      * Replacer function or array. This option follows JSON specification.
      * If a function, used to transform the results.
      * If an array, acts as a approved list for selecting the object properties that will be stringified.
      */
    var replacer: js.UndefOr[
        (js.Function2[/* key */ String, /* value */ js.Any, _]) | (js.Array[Double | String])
      ] = js.native
    
    /**
      * Sort all keys while stringifying.
      * By default sort order will depend on implementation--with v8 it's insertion order.
      * If set to true, all keys (but not arrays) will be sorted alphabetically.
      * You can provide your own sorting function as well.
      * @default false
      */
    var sort_keys: js.UndefOr[Boolean | (js.Function2[/* a */ js.Any, /* b */ js.Any, Double])] = js.native
  }
  object StringifyOptions {
    
    @scala.inline
    def apply(): StringifyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StringifyOptions]
    }
    
    @scala.inline
    implicit class StringifyOptionsMutableBuilder[Self <: StringifyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAscii(value: Boolean): Self = StObject.set(x, "ascii", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsciiUndefined: Self = StObject.set(x, "ascii", js.undefined)
      
      @scala.inline
      def setIndent(value: String | Double | Boolean): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
      
      @scala.inline
      def setMode(value: json | json5 | cjson): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setNo_trailing_comma(value: Boolean): Self = StObject.set(x, "no_trailing_comma", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNo_trailing_commaUndefined: Self = StObject.set(x, "no_trailing_comma", js.undefined)
      
      @scala.inline
      def setQuote(value: Quotationmark | Apostrophe): Self = StObject.set(x, "quote", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuoteUndefined: Self = StObject.set(x, "quote", js.undefined)
      
      @scala.inline
      def setQuote_keys(value: Boolean): Self = StObject.set(x, "quote_keys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuote_keysUndefined: Self = StObject.set(x, "quote_keys", js.undefined)
      
      @scala.inline
      def setReplacer(value: (js.Function2[/* key */ String, /* value */ js.Any, _]) | (js.Array[Double | String])): Self = StObject.set(x, "replacer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplacerFunction2(value: (/* key */ String, /* value */ js.Any) => _): Self = StObject.set(x, "replacer", js.Any.fromFunction2(value))
      
      @scala.inline
      def setReplacerUndefined: Self = StObject.set(x, "replacer", js.undefined)
      
      @scala.inline
      def setReplacerVarargs(value: (Double | String)*): Self = StObject.set(x, "replacer", js.Array(value :_*))
      
      @scala.inline
      def setSort_keys(value: Boolean | (js.Function2[/* a */ js.Any, /* b */ js.Any, Double])): Self = StObject.set(x, "sort_keys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSort_keysFunction2(value: (/* a */ js.Any, /* b */ js.Any) => Double): Self = StObject.set(x, "sort_keys", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSort_keysUndefined: Self = StObject.set(x, "sort_keys", js.undefined)
    }
  }
  
  @js.native
  trait Token extends StObject {
    
    /** Raw text of this token. If you join all raws, you will get the original document. */
    var raw: String = js.native
    
    /** Path to the current token in the syntax tree. */
    var stack: js.Array[String] = js.native
    
    /** Type of the token. */
    var `type`: whitespace | comment | key | literal | separator | newline = js.native
    
    /** Value of the token if token is a key or literal. */
    var value: js.UndefOr[js.Any] = js.native
  }
  object Token {
    
    @scala.inline
    def apply(
      raw: String,
      stack: js.Array[String],
      `type`: whitespace | comment | key | literal | separator | newline
    ): Token = {
      val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Token]
    }
    
    @scala.inline
    implicit class TokenMutableBuilder[Self <: Token] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStack(value: js.Array[String]): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackVarargs(value: String*): Self = StObject.set(x, "stack", js.Array(value :_*))
      
      @scala.inline
      def setType(value: whitespace | comment | key | literal | separator | newline): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
