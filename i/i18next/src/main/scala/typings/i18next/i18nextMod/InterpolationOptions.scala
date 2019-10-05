package typings.i18next.i18nextMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InterpolationOptions extends js.Object {
  /**
    * Global variables to use in interpolation replacements
    * @default undefined
    */
  var defaultVariables: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /**
    * Escape function
    * @default str => str
    */
  var escape: js.UndefOr[js.Function1[/* str */ String, String]] = js.undefined
  /**
    * Escape passed in values to avoid xss injection
    * @default true
    */
  var escapeValue: js.UndefOr[Boolean] = js.undefined
  /**
    * Format function see formatting for details
    * @default noop
    */
  var format: js.UndefOr[FormatFunction] = js.undefined
  /**
    * Used to separate format from interpolation value
    * @default ','
    */
  var formatSeparator: js.UndefOr[String] = js.undefined
  /**
    * After how many interpolation runs to break out before throwing a stack overflow
    * @default 1000
    */
  var maxReplaces: js.UndefOr[Double] = js.undefined
  /**
    * Prefix for nesting
    * @default '$t('
    */
  var nestingPrefix: js.UndefOr[String] = js.undefined
  /**
    * Escaped prefix for nesting (regexSafe)
    * @default undefined
    */
  var nestingPrefixEscaped: js.UndefOr[String] = js.undefined
  /**
    * Suffix for nesting
    * @default ')'
    */
  var nestingSuffix: js.UndefOr[String] = js.undefined
  /**
    * Escaped suffix for nesting (regexSafe)
    * @default undefined
    */
  var nestingSuffixEscaped: js.UndefOr[String] = js.undefined
  /**
    * Prefix for interpolation
    * @default '{{'
    */
  var prefix: js.UndefOr[String] = js.undefined
  /**
    * Escaped prefix for interpolation (regexSafe)
    * @default undefined
    */
  var prefixEscaped: js.UndefOr[String] = js.undefined
  /**
    * Suffix for interpolation
    * @default '}}'
    */
  var suffix: js.UndefOr[String] = js.undefined
  /**
    * Escaped suffix for interpolation (regexSafe)
    * @default undefined
    */
  var suffixEscaped: js.UndefOr[String] = js.undefined
  /**
    * Prefix to unescaped mode
    * @default '-'
    */
  var unescapePrefix: js.UndefOr[String] = js.undefined
  /**
    * Suffix to unescaped mode
    * @default undefined
    */
  var unescapeSuffix: js.UndefOr[String] = js.undefined
  /**
    * If true, then value passed into escape function is not casted to string, use with custom escape function that does its own type check
    * @default false
    */
  var useRawValueToEscape: js.UndefOr[Boolean] = js.undefined
}

object InterpolationOptions {
  @scala.inline
  def apply(
    defaultVariables: StringDictionary[js.Any] = null,
    escape: /* str */ String => String = null,
    escapeValue: js.UndefOr[Boolean] = js.undefined,
    format: (/* value */ js.Any, /* format */ js.UndefOr[String], /* lng */ js.UndefOr[String]) => String = null,
    formatSeparator: String = null,
    maxReplaces: Int | Double = null,
    nestingPrefix: String = null,
    nestingPrefixEscaped: String = null,
    nestingSuffix: String = null,
    nestingSuffixEscaped: String = null,
    prefix: String = null,
    prefixEscaped: String = null,
    suffix: String = null,
    suffixEscaped: String = null,
    unescapePrefix: String = null,
    unescapeSuffix: String = null,
    useRawValueToEscape: js.UndefOr[Boolean] = js.undefined
  ): InterpolationOptions = {
    val __obj = js.Dynamic.literal()
    if (defaultVariables != null) __obj.updateDynamic("defaultVariables")(defaultVariables)
    if (escape != null) __obj.updateDynamic("escape")(js.Any.fromFunction1(escape))
    if (!js.isUndefined(escapeValue)) __obj.updateDynamic("escapeValue")(escapeValue)
    if (format != null) __obj.updateDynamic("format")(js.Any.fromFunction3(format))
    if (formatSeparator != null) __obj.updateDynamic("formatSeparator")(formatSeparator)
    if (maxReplaces != null) __obj.updateDynamic("maxReplaces")(maxReplaces.asInstanceOf[js.Any])
    if (nestingPrefix != null) __obj.updateDynamic("nestingPrefix")(nestingPrefix)
    if (nestingPrefixEscaped != null) __obj.updateDynamic("nestingPrefixEscaped")(nestingPrefixEscaped)
    if (nestingSuffix != null) __obj.updateDynamic("nestingSuffix")(nestingSuffix)
    if (nestingSuffixEscaped != null) __obj.updateDynamic("nestingSuffixEscaped")(nestingSuffixEscaped)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (prefixEscaped != null) __obj.updateDynamic("prefixEscaped")(prefixEscaped)
    if (suffix != null) __obj.updateDynamic("suffix")(suffix)
    if (suffixEscaped != null) __obj.updateDynamic("suffixEscaped")(suffixEscaped)
    if (unescapePrefix != null) __obj.updateDynamic("unescapePrefix")(unescapePrefix)
    if (unescapeSuffix != null) __obj.updateDynamic("unescapeSuffix")(unescapeSuffix)
    if (!js.isUndefined(useRawValueToEscape)) __obj.updateDynamic("useRawValueToEscape")(useRawValueToEscape)
    __obj.asInstanceOf[InterpolationOptions]
  }
}

