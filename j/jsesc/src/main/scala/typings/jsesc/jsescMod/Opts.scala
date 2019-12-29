package typings.jsesc.jsescMod

import typings.jsesc.jsescStrings.backtick
import typings.jsesc.jsescStrings.binary
import typings.jsesc.jsescStrings.decimal
import typings.jsesc.jsescStrings.double
import typings.jsesc.jsescStrings.hexadecimal
import typings.jsesc.jsescStrings.octal
import typings.jsesc.jsescStrings.single
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Opts extends js.Object {
  /**
    * The compact option takes a boolean value (true or false), and defaults to true (enabled). When enabled,
    * the output for arrays and objects is as compact as possible; it’s not formatted nicely.
    */
  var compact: js.UndefOr[Boolean] = js.undefined
  /**
    * The es6 option takes a boolean value (true or false), and defaults to false (disabled). When enabled, any
    * astral Unicode symbols in the input are escaped using ECMAScript 6 Unicode code point escape sequences
    * instead of using separate escape sequences for each surrogate half. If backwards compatibility with ES5
    * environments is a concern, don’t enable this setting. If the json setting is enabled, the value for the es6
    * setting is ignored (as if it was false).
    */
  var es6: js.UndefOr[Boolean] = js.undefined
  /**
    * The escapeEverything option takes a boolean value (true or false), and defaults to false (disabled). When
    * enabled, all the symbols in the output are escaped — even printable ASCII symbols.
    */
  var escapeEverything: js.UndefOr[Boolean] = js.undefined
  /**
    * The indent option takes a string value, and defaults to '\t'. When the compact setting is enabled (true),
    * the value of the indent option is used to format the output for arrays and objects.
    */
  var indent: js.UndefOr[String] = js.undefined
  /**
    * The indentLevel option takes a numeric value, and defaults to 0. It represents the current indentation level,
    * i.e. the number of times the value of the indent option is repeated.
    */
  var indentLevel: js.UndefOr[Double] = js.undefined
  /**
    * The isScriptContext option takes a boolean value (true or false), and defaults to false (disabled). When
    * enabled, occurrences of </script and </style in the output are escaped as <\/script and <\/style, and <!--
    * is escaped as \x3C!-- (or \\u003C!-- when the json option is enabled). This setting is useful when jsesc’s
    * output ends up as part of a <script> or <style> element in an HTML document.
    */
  var isScriptContext: js.UndefOr[Boolean] = js.undefined
  /**
    * The json option takes a boolean value (true or false), and defaults to false (disabled). When enabled, the
    * output is valid JSON. Hexadecimal character escape sequences and the \v or \0 escape sequences are not used.
    * Setting json: true implies quotes: 'double', wrap: true, es6: false, although these values can still be
    * overridden if needed — but in such cases, the output won’t be valid JSON anymore.
    */
  var json: js.UndefOr[Boolean] = js.undefined
  /**
    * The lowercaseHex option takes a boolean value (true or false), and defaults to false (disabled). When enabled,
    * any alphabetical hexadecimal digits in escape sequences as well as any hexadecimal integer literals (see the
    * numbers option) in the output are in lowercase.
    */
  var lowercaseHex: js.UndefOr[Boolean] = js.undefined
  /**
    * The minimal option takes a boolean value (true or false), and defaults to false (disabled). When enabled,
    * only a limited set of symbols in the output are escaped: \0, \b, \t, \n, \f, \r, \\, \\u2028, \\u2029.
    */
  var minimal: js.UndefOr[Boolean] = js.undefined
  /**
    * The default value for the numbers option is 'decimal'. This means that any numeric values are represented
    * using decimal integer literals. Other valid options are binary, octal, and hexadecimal, which result in
    * binary integer literals, octal integer literals, and hexadecimal integer literals, respectively.
    */
  var numbers: js.UndefOr[binary | octal | decimal | hexadecimal] = js.undefined
  /**
    * The default value for the quotes option is 'single'. This means that any occurrences of ' in the input
    * string are escaped as \', so that the output can be used in a string literal wrapped in single quotes.
    */
  var quotes: js.UndefOr[single | double | backtick] = js.undefined
  /**
    * The wrap option takes a boolean value (true or false), and defaults to false (disabled). When enabled, the
    * output is a valid JavaScript string literal wrapped in quotes. The type of quotes can be specified through
    * the quotes setting.
    */
  var wrap: js.UndefOr[Boolean] = js.undefined
}

object Opts {
  @scala.inline
  def apply(
    compact: js.UndefOr[Boolean] = js.undefined,
    es6: js.UndefOr[Boolean] = js.undefined,
    escapeEverything: js.UndefOr[Boolean] = js.undefined,
    indent: String = null,
    indentLevel: Int | Double = null,
    isScriptContext: js.UndefOr[Boolean] = js.undefined,
    json: js.UndefOr[Boolean] = js.undefined,
    lowercaseHex: js.UndefOr[Boolean] = js.undefined,
    minimal: js.UndefOr[Boolean] = js.undefined,
    numbers: binary | octal | decimal | hexadecimal = null,
    quotes: single | double | backtick = null,
    wrap: js.UndefOr[Boolean] = js.undefined
  ): Opts = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact.asInstanceOf[js.Any])
    if (!js.isUndefined(es6)) __obj.updateDynamic("es6")(es6.asInstanceOf[js.Any])
    if (!js.isUndefined(escapeEverything)) __obj.updateDynamic("escapeEverything")(escapeEverything.asInstanceOf[js.Any])
    if (indent != null) __obj.updateDynamic("indent")(indent.asInstanceOf[js.Any])
    if (indentLevel != null) __obj.updateDynamic("indentLevel")(indentLevel.asInstanceOf[js.Any])
    if (!js.isUndefined(isScriptContext)) __obj.updateDynamic("isScriptContext")(isScriptContext.asInstanceOf[js.Any])
    if (!js.isUndefined(json)) __obj.updateDynamic("json")(json.asInstanceOf[js.Any])
    if (!js.isUndefined(lowercaseHex)) __obj.updateDynamic("lowercaseHex")(lowercaseHex.asInstanceOf[js.Any])
    if (!js.isUndefined(minimal)) __obj.updateDynamic("minimal")(minimal.asInstanceOf[js.Any])
    if (numbers != null) __obj.updateDynamic("numbers")(numbers.asInstanceOf[js.Any])
    if (quotes != null) __obj.updateDynamic("quotes")(quotes.asInstanceOf[js.Any])
    if (!js.isUndefined(wrap)) __obj.updateDynamic("wrap")(wrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[Opts]
  }
}

