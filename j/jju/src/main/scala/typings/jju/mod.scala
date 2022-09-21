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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jju", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def analyze(text: String): JsonStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("analyze")(text.asInstanceOf[js.Any]).asInstanceOf[JsonStyle]
  inline def analyze(text: String, options: ParseOptions): JsonStyle = (^.asInstanceOf[js.Dynamic].applyDynamic("analyze")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[JsonStyle]
  
  inline def parse(text: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def parse(text: String, options: ParseOptions): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def parse(text: String, reviver: js.Function2[/* key */ Any, /* value */ Any, Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any], reviver.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def stringify(value: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def stringify(value: Any, options: StringifyOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(value: Any, replacer: js.Array[Double | String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(value: Any, replacer: js.Array[Double | String], space: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(value: Any, replacer: js.Array[Double | String], space: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(value: Any, replacer: js.Function2[/* key */ String, /* value */ Any, Any]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(value: Any, replacer: js.Function2[/* key */ String, /* value */ Any, Any], space: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(value: Any, replacer: js.Function2[/* key */ String, /* value */ Any, Any], space: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(value: Any, replacer: Null, space: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(value: Any, replacer: Null, space: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(value: Any, replacer: Unit, space: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(value: Any, replacer: Unit, space: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def tokenize(text: String): js.Array[Token] = ^.asInstanceOf[js.Dynamic].applyDynamic("tokenize")(text.asInstanceOf[js.Any]).asInstanceOf[js.Array[Token]]
  inline def tokenize(text: String, options: ParseOptions): js.Array[Token] = (^.asInstanceOf[js.Dynamic].applyDynamic("tokenize")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Token]]
  
  inline def update(text: String, new_value: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(text.asInstanceOf[js.Any], new_value.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def update(text: String, new_value: Any, options: ParseOptions & StringifyOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(text.asInstanceOf[js.Any], new_value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait JsonStyle extends StObject {
    
    /** True if input has a comment token. */
    var has_comments: Boolean
    
    /** True if input has a newline token. */
    var has_newlines: Boolean
    
    /** True if input has at least one trailing comma. */
    var has_trailing_comma: Boolean
    
    /** True if input has a whitespace token. */
    var has_whitespace: Boolean
    
    /** Preferred indentation. */
    var indent: String
    
    /** Preferred newline. */
    var newline: String
    
    /** " or ' depending on which quote is preferred. */
    var quote: String
    
    /** True if unquoted keys were used at least once. */
    var quote_keys: Boolean
  }
  object JsonStyle {
    
    inline def apply(
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
    
    extension [Self <: JsonStyle](x: Self) {
      
      inline def setHas_comments(value: Boolean): Self = StObject.set(x, "has_comments", value.asInstanceOf[js.Any])
      
      inline def setHas_newlines(value: Boolean): Self = StObject.set(x, "has_newlines", value.asInstanceOf[js.Any])
      
      inline def setHas_trailing_comma(value: Boolean): Self = StObject.set(x, "has_trailing_comma", value.asInstanceOf[js.Any])
      
      inline def setHas_whitespace(value: Boolean): Self = StObject.set(x, "has_whitespace", value.asInstanceOf[js.Any])
      
      inline def setIndent(value: String): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      inline def setNewline(value: String): Self = StObject.set(x, "newline", value.asInstanceOf[js.Any])
      
      inline def setQuote(value: String): Self = StObject.set(x, "quote", value.asInstanceOf[js.Any])
      
      inline def setQuote_keys(value: Boolean): Self = StObject.set(x, "quote_keys", value.asInstanceOf[js.Any])
    }
  }
  
  trait ParseOptions extends StObject {
    
    /**
      * Operation mode (default 'json5'). Set to 'json' if you want to throw on non-strict json files.
      */
    var mode: js.UndefOr[json5 | json | cjson] = js.undefined
    
    /**
      * Create object as `Object.create(null)` instead of `{}`.
      * - If reserved_keys != 'replace', default is false.
      * - If reserved_keys == 'replace', default is true.
      *
      * It is usually unsafe and not recommended to change this option to false in the last case.
      */
    var null_prototype: js.UndefOr[Boolean] = js.undefined
    
    /**
      * What to do with reserved keys (default 'ignore').
      * - "ignore" - ignore reserved keys
      * - "throw" - throw SyntaxError in case of reserved keys
      * - "replace" - replace reserved keys, this is the default JSON.parse behaviour, unsafe
      */
    var reserved_keys: js.UndefOr[ignore | `throw` | replace] = js.undefined
    
    /**
      * Reviver function (follows the JSON spec). This function is called for each member of the object.
      * If a member contains nested objects, the nested objects are transformed before the parent object is.
      */
    var reviver: js.UndefOr[js.Function2[/* key */ Any, /* value */ Any, Any]] = js.undefined
  }
  object ParseOptions {
    
    inline def apply(): ParseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParseOptions]
    }
    
    extension [Self <: ParseOptions](x: Self) {
      
      inline def setMode(value: json5 | json | cjson): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setNull_prototype(value: Boolean): Self = StObject.set(x, "null_prototype", value.asInstanceOf[js.Any])
      
      inline def setNull_prototypeUndefined: Self = StObject.set(x, "null_prototype", js.undefined)
      
      inline def setReserved_keys(value: ignore | `throw` | replace): Self = StObject.set(x, "reserved_keys", value.asInstanceOf[js.Any])
      
      inline def setReserved_keysUndefined: Self = StObject.set(x, "reserved_keys", js.undefined)
      
      inline def setReviver(value: (/* key */ Any, /* value */ Any) => Any): Self = StObject.set(x, "reviver", js.Any.fromFunction2(value))
      
      inline def setReviverUndefined: Self = StObject.set(x, "reviver", js.undefined)
    }
  }
  
  trait StringifyOptions extends StObject {
    
    /**
      * Output ascii only (default false).
      * If this option is enabled, output will not have any characters except 0x20-0x7f.
      */
    var ascii: js.UndefOr[Boolean] = js.undefined
    
    /**
      * This option follows JSON specification.
      * @default '\t'
      */
    var indent: js.UndefOr[String | Double | Boolean] = js.undefined
    
    /**
      * Operation mode. Set it to 'json' if you want correct json in the output.
      * If it is 'json', following options are implied:
      * - options.quote = '"'
      * - options.no_trailing_comma = true
      * - options.quote_keys = true
      * - '\x' literals are not used
      */
    var mode: js.UndefOr[json | json5 | cjson] = js.undefined
    
    /**
      * Don't output trailing comma. If this option is set, arrays like `[1,2,3,]` will never be generated.
      * Otherwise they may be generated for pretty printing.
      * - If `mode` is JSON, default is true
      * - Otherwise, default is false
      */
    var no_trailing_comma: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enquoting char.
      * - If `mode` is 'json', default is "
      * - Otherwise, default is '
      */
    var quote: js.UndefOr[Quotationmark | Apostrophe] = js.undefined
    
    /**
      * Whether keys quoting in objects is required or not.
      * If you want `{"q": 1}` instead of `{q: 1}`, set it to true.
      * - If `mode` is 'json', default is true
      * - Otherwise, default is false
      */
    var quote_keys: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Replacer function or array. This option follows JSON specification.
      * If a function, used to transform the results.
      * If an array, acts as a approved list for selecting the object properties that will be stringified.
      */
    var replacer: js.UndefOr[
        (js.Function2[/* key */ String, /* value */ Any, Any]) | (js.Array[Double | String])
      ] = js.undefined
    
    /**
      * Sort all keys while stringifying.
      * By default sort order will depend on implementation--with v8 it's insertion order.
      * If set to true, all keys (but not arrays) will be sorted alphabetically.
      * You can provide your own sorting function as well.
      * @default false
      */
    var sort_keys: js.UndefOr[Boolean | (js.Function2[/* a */ Any, /* b */ Any, Double])] = js.undefined
  }
  object StringifyOptions {
    
    inline def apply(): StringifyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StringifyOptions]
    }
    
    extension [Self <: StringifyOptions](x: Self) {
      
      inline def setAscii(value: Boolean): Self = StObject.set(x, "ascii", value.asInstanceOf[js.Any])
      
      inline def setAsciiUndefined: Self = StObject.set(x, "ascii", js.undefined)
      
      inline def setIndent(value: String | Double | Boolean): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      inline def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
      
      inline def setMode(value: json | json5 | cjson): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setNo_trailing_comma(value: Boolean): Self = StObject.set(x, "no_trailing_comma", value.asInstanceOf[js.Any])
      
      inline def setNo_trailing_commaUndefined: Self = StObject.set(x, "no_trailing_comma", js.undefined)
      
      inline def setQuote(value: Quotationmark | Apostrophe): Self = StObject.set(x, "quote", value.asInstanceOf[js.Any])
      
      inline def setQuoteUndefined: Self = StObject.set(x, "quote", js.undefined)
      
      inline def setQuote_keys(value: Boolean): Self = StObject.set(x, "quote_keys", value.asInstanceOf[js.Any])
      
      inline def setQuote_keysUndefined: Self = StObject.set(x, "quote_keys", js.undefined)
      
      inline def setReplacer(value: (js.Function2[/* key */ String, /* value */ Any, Any]) | (js.Array[Double | String])): Self = StObject.set(x, "replacer", value.asInstanceOf[js.Any])
      
      inline def setReplacerFunction2(value: (/* key */ String, /* value */ Any) => Any): Self = StObject.set(x, "replacer", js.Any.fromFunction2(value))
      
      inline def setReplacerUndefined: Self = StObject.set(x, "replacer", js.undefined)
      
      inline def setReplacerVarargs(value: (Double | String)*): Self = StObject.set(x, "replacer", js.Array(value*))
      
      inline def setSort_keys(value: Boolean | (js.Function2[/* a */ Any, /* b */ Any, Double])): Self = StObject.set(x, "sort_keys", value.asInstanceOf[js.Any])
      
      inline def setSort_keysFunction2(value: (/* a */ Any, /* b */ Any) => Double): Self = StObject.set(x, "sort_keys", js.Any.fromFunction2(value))
      
      inline def setSort_keysUndefined: Self = StObject.set(x, "sort_keys", js.undefined)
    }
  }
  
  trait Token extends StObject {
    
    /** Raw text of this token. If you join all raws, you will get the original document. */
    var raw: String
    
    /** Path to the current token in the syntax tree. */
    var stack: js.Array[String]
    
    /** Type of the token. */
    var `type`: whitespace | comment | key | literal | separator | newline
    
    /** Value of the token if token is a key or literal. */
    var value: js.UndefOr[Any] = js.undefined
  }
  object Token {
    
    inline def apply(
      raw: String,
      stack: js.Array[String],
      `type`: whitespace | comment | key | literal | separator | newline
    ): Token = {
      val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Token]
    }
    
    extension [Self <: Token](x: Self) {
      
      inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def setStack(value: js.Array[String]): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      inline def setStackVarargs(value: String*): Self = StObject.set(x, "stack", js.Array(value*))
      
      inline def setType(value: whitespace | comment | key | literal | separator | newline): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
