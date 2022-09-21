package typings.jsesc

import typings.jsesc.jsescStrings.backtick
import typings.jsesc.jsescStrings.binary
import typings.jsesc.jsescStrings.decimal
import typings.jsesc.jsescStrings.double
import typings.jsesc.jsescStrings.hexadecimal
import typings.jsesc.jsescStrings.octal
import typings.jsesc.jsescStrings.single
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * This function takes a value and returns an escaped version of the value where any characters
    * that are not printable ASCII symbols are escaped using the shortest possible (but valid)
    * escape sequences for use in JavaScript strings. The first supported value type is strings.
    * Instead of a string, the value can also be an array, an object, a map, a set, or a buffer.
    * In such cases, jsesc returns a stringified version of the value where any characters that
    * are not printable ASCII symbols are escaped in the same way.
    *
    * @example
    * import jsesc = require('jsesc');
    *
    * jsesc('Ich ♥ Bücher');
    * // → 'Ich \\\u2665 B\\xFCcher'
    *
    * jsesc('foo 𝌆 bar');
    * // → 'foo \\\uD834\\\uDF06 bar'
    *
    * // Escaping an array
    * jsesc([
    *   'Ich ♥ Bücher', 'foo 𝌆 bar'
    * ]);
    * // → '[\'Ich \\\u2665 B\\xFCcher\',\'foo \\\uD834\\\uDF06 bar\']'
    *
    * // Escaping an object
    * jsesc({
    *   'Ich ♥ Bücher': 'foo 𝌆 bar'
    * });
    * // → '{\'Ich \\\u2665 B\\xFCcher\':\'foo \\\uD834\\\uDF06 bar\'}'
    */
  inline def apply(argument: Any): String = ^.asInstanceOf[js.Dynamic].apply(argument.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(argument: Any, opts: Opts): String = (^.asInstanceOf[js.Dynamic].apply(argument.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("jsesc", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * A string representing the semantic version number.
    */
  @JSImport("jsesc", "version")
  @js.native
  val version: String = js.native
  
  trait Opts extends StObject {
    
    /**
      * When enabled, the output for arrays and objects is as compact as possible; it’s not formatted nicely.
      *
      * @default true (enabled)
      *
      * @example
      * import jsesc = require('jsesc');
      *
      * jsesc({ 'Ich ♥ Bücher': 'foo 𝌆 bar' }, {
      *   compact: true // this is the default
      * });
      * // → '{\'Ich \\u2665 B\xFCcher\':\'foo \\uD834\\uDF06 bar\'}'
      *
      * jsesc({ 'Ich ♥ Bücher': 'foo 𝌆 bar' }, {
      *   compact: false
      * });
      * // → '{\n\t\'Ich \\u2665 B\xFCcher\': \'foo \\uD834\\uDF06 bar\'\n}'
      *
      * jsesc([ 'Ich ♥ Bücher', 'foo 𝌆 bar' ], {
      *   compact: false
      * });
      * // → '[\n\t\'Ich \\u2665 B\xFCcher\',\n\t\'foo \\uD834\\uDF06 bar\'\n]'
      */
    var compact: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When enabled, any astral Unicode symbols in the input are escaped using
      * [ECMAScript 6 Unicode code point escape sequences](https://mathiasbynens.be/notes/javascript-escapes#unicode-code-point)
      * instead of using separate escape sequences for each surrogate half. If backwards compatibility with ES5
      * environments is a concern, don’t enable this setting. If the `json` setting is enabled, the value for the
      * `es6` setting is ignored (as if it was `false`).
      *
      * @default false (disabled)
      *
      * @example
      * import jsesc = require('jsesc');
      *
      * // By default, the `es6` option is disabled:
      * jsesc('foo 𝌆 bar 💩 baz');
      * // → 'foo \\\uD834\\\uDF06 bar \\\uD83D\\\uDCA9 baz'
      *
      * // To explicitly disable it:
      * jsesc('foo 𝌆 bar 💩 baz', {
      *   es6: false
      * });
      * // → 'foo \\\uD834\\\uDF06 bar \\\uD83D\\\uDCA9 baz'
      *
      * // To enable it:
      * jsesc('foo 𝌆 bar 💩 baz', {
      *   es6: true
      * });
      * // → 'foo \\\u{1D306} bar \\\u{1F4A9} baz'
      */
    var es6: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When enabled, all the symbols in the output are escaped — even printable ASCII symbols.
      * This setting also affects the output for string literals within arrays and objects.
      *
      * @default false (disabled)
      *
      * @example
      * import jsesc = require('jsesc');
      *
      * jsesc('lolwat"foo\'bar', {
      *   escapeEverything: true
      * });
      * // → '\\x6C\\x6F\\x6C\\x77\\x61\\x74\\"\\x66\\x6F\\x6F\\\'\\x62\\x61\\x72'
      * // → "\\x6C\\x6F\\x6C\\x77\\x61\\x74\\\"\\x66\\x6F\\x6F\\'\\x62\\x61\\x72"
      */
    var escapeEverything: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When the `compact` setting is disabled (`false`), the value of the `indent` option is used to format the
      * output for arrays and objects. This setting has no effect on the output for strings.
      *
      * @default '\t'
      *
      * @example
      * import jsesc = require('jsesc');
      *
      * jsesc({ 'Ich ♥ Bücher': 'foo 𝌆 bar' }, {
      *   compact: false,
      *   indent: '\t' // this is the default
      * });
      * // → '{\n\t\'Ich \\u2665 B\xFCcher\': \'foo \\uD834\\uDF06 bar\'\n}'
      *
      * jsesc({ 'Ich ♥ Bücher': 'foo 𝌆 bar' }, {
      *   compact: false,
      *   indent: '  '
      * });
      * // → '{\n  \'Ich \\u2665 B\xFCcher\': \'foo \\uD834\\uDF06 bar\'\n}'
      *
      * jsesc([ 'Ich ♥ Bücher', 'foo 𝌆 bar' ], {
      *   compact: false,
      *   indent: '  '
      * });
      * // → '[\n  \'Ich \\u2665 B\xFCcher\',\n\  t\'foo \\uD834\\uDF06 bar\'\n]'
      */
    var indent: js.UndefOr[String] = js.undefined
    
    /**
      * It represents the current indentation level, i.e. the number of times the value of the `indent` option is
      * repeated.
      *
      * @default 0
      *
      * @example
      * import jsesc = require('jsesc');
      *
      * jsesc(['a', 'b', 'c'], {
      *   compact: false,
      *   indentLevel: 1
      * });
      * // → '[\n\t\t\'a\',\n\t\t\'b\',\n\t\t\'c\'\n\t]'
      *
      * jsesc(['a', 'b', 'c'], {
      *   compact: false,
      *   indentLevel: 2
      * });
      * // → '[\n\t\t\t\'a\',\n\t\t\t\'b\',\n\t\t\t\'c\'\n\t\t]'
      */
    var indentLevel: js.UndefOr[Double] = js.undefined
    
    /**
      * When enabled, occurrences of [`</script` and `</style`](https://mathiasbynens.be/notes/etago) in the output
      * are escaped as `<\/script` and `<\/style`, and [`<!--`](https://mathiasbynens.be/notes/etago#comment-8) is
      * escaped as `\x3C!--` (or `\\u003C!--` when the `json` option is enabled). This setting is useful when jsesc’s
      * output ends up as part of a `<script>` or `<style>` element in an HTML document.
      *
      * @default false (disabled)
      *
      * @example
      * import jsesc = require('jsesc');
      *
      * jsesc('foo</script>bar', {
      *   isScriptContext: true
      * });
      * // → 'foo<\\/script>bar'
      */
    var isScriptContext: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When enabled, the output is valid JSON.
      * [Hexadecimal character escape sequences](https://mathiasbynens.be/notes/javascript-escapes#hexadecimal) and
      * [the `\v` or `\0` escape sequences](https://mathiasbynens.be/notes/javascript-escapes#single) are not used.
      * Setting `json: true` implies `quotes: 'double', wrap: true, es6: false`, although these values can still be
      * overridden if needed — but in such cases, the output won’t be valid JSON anymore.
      *
      * **Note:** Using this option on objects or arrays that contain non-string values relies on `JSON.stringify()`.
      * For legacy environments like IE ≤ 7, use [a `JSON` polyfill](http://bestiejs.github.io/json3/).
      *
      * @default false (disabled)
      *
      * @example
      * import jsesc = require('jsesc');
      *
      * jsesc('foo\x00bar\xFF\\uFFFDbaz', {
      *   json: true
      * });
      * // → '"foo\\\u0000bar\\\u00FF\\\uFFFDbaz"'
      *
      * jsesc({ 'foo\x00bar\xFF\\uFFFDbaz': 'foo\x00bar\xFF\\uFFFDbaz' }, {
      *   json: true
      * });
      * // → '{"foo\\\u0000bar\\\u00FF\\\uFFFDbaz":"foo\\\u0000bar\\\u00FF\\\uFFFDbaz"}'
      *
      * jsesc([ 'foo\x00bar\xFF\\uFFFDbaz', 'foo\x00bar\xFF\\uFFFDbaz' ], {
      *   json: true
      * });
      * // → '["foo\\\u0000bar\\\u00FF\\\uFFFDbaz","foo\\\u0000bar\\\u00FF\\\uFFFDbaz"]'
      *
      * // Values that are acceptable in JSON but aren’t strings, arrays, or object
      * // literals can’t be escaped, so they’ll just be preserved:
      * jsesc([ 'foo\x00bar', [1, '©', { 'foo': true, 'qux': null }], 42 ], {
      *   json: true
      * });
      * // → '["foo\\\u0000bar",[1,"\\\u00A9",{"foo":true,"qux":null}],42]'
      * // Values that aren’t allowed in JSON are run through `JSON.stringify()`:
      * jsesc([ undefined, -Infinity ], {
      *   json: true
      * });
      * // → '[null,null]'
      */
    var json: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When enabled, any alphabetical hexadecimal digits in escape sequences as well as any hexadecimal integer
      * literals (see the `numbers` option) in the output are in lowercase.
      *
      * @default false (disabled)
      *
      * @example
      * import jsesc = require('jsesc');
      *
      * jsesc('Ich ♥ Bücher', {
      *   lowercaseHex: true
      * });
      * // → 'Ich \\\u2665 B\\xfccher'
      * //                    ^^
      *
      * jsesc(42, {
      *   numbers: 'hexadecimal',
      *   lowercaseHex: true
      * });
      * // → '0x2a'
      * //      ^^
      */
    var lowercaseHex: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When enabled, only a limited set of symbols in the output are escaped:
      *
      * - U+0000 `\0`
      * - U+0008 `\b`
      * - U+0009 `\t`
      * - U+000A `\n`
      * - U+000C `\f`
      * - U+000D `\r`
      * - U+005C `\\`
      * - U+2028 `\\u2028`
      * - U+2029 `\\u2029`
      * - whatever symbol is being used for wrapping string literals (based on the `quotes` option)
      * - [lone surrogates](https://esdiscuss.org/topic/code-points-vs-unicode-scalar-values#content-14)
      *
      * Note: with this option enabled, jsesc output is no longer guaranteed to be ASCII-safe.
      *
      * @default false (disabled)
      *
      * @example
      * import jsesc = require('jsesc');
      *
      * jsesc('foo\\u2029bar\nbaz©qux𝌆flops', {
      *   minimal: false
      * });
      * // → 'foo\\\u2029bar\\nbaz©qux𝌆flops'
      */
    var minimal: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The value `'decimal'` for the `numbers` option means that any numeric values are represented using decimal
      * integer literals. Other valid options are `binary`, `octal`, and `hexadecimal`, which result in binary
      * integer literals, octal integer literals, and hexadecimal integer literals, respectively.
      *
      * @default 'decimal'
      *
      * @example
      * import jsesc = require('jsesc');
      *
      * jsesc(42, {
      *   numbers: 'binary'
      * });
      * // → '0b101010'
      *
      * jsesc(42, {
      *   numbers: 'octal'
      * });
      * // → '0o52'
      *
      * jsesc(42, {
      *   numbers: 'decimal'
      * });
      * // → '42'
      *
      * jsesc(42, {
      *   numbers: 'hexadecimal'
      * });
      * // → '0x2A'
      */
    var numbers: js.UndefOr[binary | octal | decimal | hexadecimal] = js.undefined
    
    /**
      * The value `'single'` for the `quotes` option means that any occurrences of `'` in the input string are
      * escaped as `\'`, so that the output can be used in a string literal wrapped in single quotes. If you want
      * to use the output as part of a string literal wrapped in double quotes, set the `quotes` option to
      * `'double'`. If you want to use the output as part of a template literal (i.e. wrapped in backticks), set
      * the `quotes` option to `'backtick'`.
      *
      * @default 'single'
      *
      * @example
      * import jsesc = require('jsesc');
      *
      * jsesc('`Lorem` ipsum "dolor" sit \'amet\' etc.');
      * // → 'Lorem ipsum "dolor" sit \\\'amet\\\' etc.'
      *
      * jsesc('`Lorem` ipsum "dolor" sit \'amet\' etc.', {
      *   quotes: 'single'
      * });
      * // → '`Lorem` ipsum "dolor" sit \\\'amet\\\' etc.'
      * // → "`Lorem` ipsum \"dolor\" sit \\'amet\\' etc."
      *
      * jsesc('`Lorem` ipsum "dolor" sit \'amet\' etc.', {
      *   quotes: 'double'
      * });
      * // → '`Lorem` ipsum \\"dolor\\" sit \'amet\' etc.'
      * // → "`Lorem` ipsum \\\"dolor\\\" sit 'amet' etc."
      *
      * jsesc('`Lorem` ipsum "dolor" sit \'amet\' etc.', {
      *   quotes: 'backtick'
      * });
      * // → '\\`Lorem\\` ipsum "dolor" sit \'amet\' etc.'
      * // → "\\`Lorem\\` ipsum \"dolor\" sit 'amet' etc."
      * // → `\\\`Lorem\\\` ipsum "dolor" sit 'amet' etc.`
      *
      * // This setting also affects the output for arrays and objects:
      * jsesc({ 'Ich ♥ Bücher': 'foo 𝌆 bar' }, {
      *   quotes: 'double'
      * });
      * // → '{"Ich \\\u2665 B\\xFCcher":"foo \\\uD834\\\uDF06 bar"}'
      *
      * jsesc([ 'Ich ♥ Bücher', 'foo 𝌆 bar' ], {
      *   quotes: 'double'
      * });
      * // → '["Ich \\\u2665 B\\xFCcher","foo \\\uD834\\\uDF06 bar"]'
      */
    var quotes: js.UndefOr[single | double | backtick] = js.undefined
    
    /**
      * When enabled, the output is a valid JavaScript string literal wrapped in quotes. The type of quotes can be
      * specified through the `quotes` setting.
      *
      * @default false (disabled)
      *
      * @example
      * import jsesc = require('jsesc');
      *
      * jsesc('Lorem ipsum "dolor" sit \'amet\' etc.', {
      *   quotes: 'single',
      *   wrap: true
      * });
      * // → '\'Lorem ipsum "dolor" sit \\\'amet\\\' etc.\''
      * // → "\'Lorem ipsum \"dolor\" sit \\\'amet\\\' etc.\'"
      *
      * jsesc('Lorem ipsum "dolor" sit \'amet\' etc.', {
      *   quotes: 'double',
      *   wrap: true
      * });
      * // → '"Lorem ipsum \\"dolor\\" sit \'amet\' etc."'
      * // → "\"Lorem ipsum \\\"dolor\\\" sit \'amet\' etc.\""
      */
    var wrap: js.UndefOr[Boolean] = js.undefined
  }
  object Opts {
    
    inline def apply(): Opts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Opts]
    }
    
    extension [Self <: Opts](x: Self) {
      
      inline def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      inline def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
      
      inline def setEs6(value: Boolean): Self = StObject.set(x, "es6", value.asInstanceOf[js.Any])
      
      inline def setEs6Undefined: Self = StObject.set(x, "es6", js.undefined)
      
      inline def setEscapeEverything(value: Boolean): Self = StObject.set(x, "escapeEverything", value.asInstanceOf[js.Any])
      
      inline def setEscapeEverythingUndefined: Self = StObject.set(x, "escapeEverything", js.undefined)
      
      inline def setIndent(value: String): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      inline def setIndentLevel(value: Double): Self = StObject.set(x, "indentLevel", value.asInstanceOf[js.Any])
      
      inline def setIndentLevelUndefined: Self = StObject.set(x, "indentLevel", js.undefined)
      
      inline def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
      
      inline def setIsScriptContext(value: Boolean): Self = StObject.set(x, "isScriptContext", value.asInstanceOf[js.Any])
      
      inline def setIsScriptContextUndefined: Self = StObject.set(x, "isScriptContext", js.undefined)
      
      inline def setJson(value: Boolean): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
      
      inline def setLowercaseHex(value: Boolean): Self = StObject.set(x, "lowercaseHex", value.asInstanceOf[js.Any])
      
      inline def setLowercaseHexUndefined: Self = StObject.set(x, "lowercaseHex", js.undefined)
      
      inline def setMinimal(value: Boolean): Self = StObject.set(x, "minimal", value.asInstanceOf[js.Any])
      
      inline def setMinimalUndefined: Self = StObject.set(x, "minimal", js.undefined)
      
      inline def setNumbers(value: binary | octal | decimal | hexadecimal): Self = StObject.set(x, "numbers", value.asInstanceOf[js.Any])
      
      inline def setNumbersUndefined: Self = StObject.set(x, "numbers", js.undefined)
      
      inline def setQuotes(value: single | double | backtick): Self = StObject.set(x, "quotes", value.asInstanceOf[js.Any])
      
      inline def setQuotesUndefined: Self = StObject.set(x, "quotes", js.undefined)
      
      inline def setWrap(value: Boolean): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      
      inline def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
    }
  }
}
