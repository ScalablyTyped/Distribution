package typings
package i18nextLib.i18nextMod.i18nextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait InterpolationOptions extends js.Object {
  /**
           * 	global variables to use in interpolation replacements
           * @default undefined
           */
  var defaultVariables: js.UndefOr[ScalablyTyped.runtime.StringDictionary[js.Any]] = js.undefined
  /**
           * 	escape function
           * @default str => str
           */
  var escape: js.UndefOr[js.Function1[/* str */ java.lang.String, java.lang.String]] = js.undefined
  /**
           * 	escape passed in values to avoid xss injection
           * @default true
           */
  var escapeValue: js.UndefOr[scala.Boolean] = js.undefined
  /**
           *  format function see formatting for details
           * @default noop
           */
  var format: js.UndefOr[FormatFunction] = js.undefined
  /**
           * 	used to separate format from interpolation value
           * @default ','
           */
  var formatSeparator: js.UndefOr[java.lang.String] = js.undefined
  /**
           * 	after how many interpolation runs to break out before throwing a stack overflow
           * @default 1000
           */
  var maxReplaces: js.UndefOr[scala.Double] = js.undefined
  /**
           * prefix for nesting
           * @default '$t('
           */
  var nestingPrefix: js.UndefOr[java.lang.String] = js.undefined
  /**
           * 	escaped prefix for nesting (regexSafe)
           * @default undefined
           */
  var nestingPrefixEscaped: js.UndefOr[java.lang.String] = js.undefined
  /**
           * 	suffix for nesting
           * @default ')'
           */
  var nestingSuffix: js.UndefOr[java.lang.String] = js.undefined
  /**
           * 	escaped suffix for nesting (regexSafe)
           * @default undefined
           */
  var nestingSuffixEscaped: js.UndefOr[java.lang.String] = js.undefined
  /**
           * 	prefix for interpolation
           * @default '{{'
           */
  var prefix: js.UndefOr[java.lang.String] = js.undefined
  /**
           * 	escaped prefix for interpolation (regexSafe)
           * @default undefined
           */
  var prefixEscaped: js.UndefOr[java.lang.String] = js.undefined
  /**
           * 	suffix for interpolation
           * @default '}}'
           */
  var suffix: js.UndefOr[java.lang.String] = js.undefined
  /**
           * 	escaped suffix for interpolation (regexSafe)
           * @default undefined
           */
  var suffixEscaped: js.UndefOr[java.lang.String] = js.undefined
  /**
           * 	prefix to unescaped mode
           * @default '-'
           */
  var unescapePrefix: js.UndefOr[java.lang.String] = js.undefined
  /**
           * 	suffix to unescaped mode
           * @default undefined
           */
  var unescapeSuffix: js.UndefOr[java.lang.String] = js.undefined
  /**
           * 	If true, then value passed into escape function is not casted to string, use with custom escape function that does its own type check
           * @default false
           */
  var useRawValueToEscape: js.UndefOr[scala.Boolean] = js.undefined
}

