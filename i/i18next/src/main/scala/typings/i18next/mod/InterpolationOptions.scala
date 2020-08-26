package typings.i18next.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InterpolationOptions extends js.Object {
  /**
    * Global variables to use in interpolation replacements
    * @default undefined
    */
  var defaultVariables: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * Escape function
    * @default str => str
    */
  var escape: js.UndefOr[js.Function1[/* str */ String, String]] = js.native
  /**
    * Escape passed in values to avoid xss injection
    * @default true
    */
  var escapeValue: js.UndefOr[Boolean] = js.native
  /**
    * Format function see formatting for details
    * @default noop
    */
  var format: js.UndefOr[FormatFunction] = js.native
  /**
    * Used to separate format from interpolation value
    * @default ','
    */
  var formatSeparator: js.UndefOr[String] = js.native
  /**
    * After how many interpolation runs to break out before throwing a stack overflow
    * @default 1000
    */
  var maxReplaces: js.UndefOr[Double] = js.native
  /**
    * Separates options from key
    * @default ','
    */
  var nestingOptionsSeparator: js.UndefOr[String] = js.native
  /**
    * Prefix for nesting
    * @default '$t('
    */
  var nestingPrefix: js.UndefOr[String] = js.native
  /**
    * Escaped prefix for nesting (regexSafe)
    * @default undefined
    */
  var nestingPrefixEscaped: js.UndefOr[String] = js.native
  /**
    * Suffix for nesting
    * @default ')'
    */
  var nestingSuffix: js.UndefOr[String] = js.native
  /**
    * Escaped suffix for nesting (regexSafe)
    * @default undefined
    */
  var nestingSuffixEscaped: js.UndefOr[String] = js.native
  /**
    * Prefix for interpolation
    * @default '{{'
    */
  var prefix: js.UndefOr[String] = js.native
  /**
    * Escaped prefix for interpolation (regexSafe)
    * @default undefined
    */
  var prefixEscaped: js.UndefOr[String] = js.native
  /**
    * If true, it will skip to interpolate the variables
    * @default false
    */
  var skipOnVariables: js.UndefOr[Boolean] = js.native
  /**
    * Suffix for interpolation
    * @default '}}'
    */
  var suffix: js.UndefOr[String] = js.native
  /**
    * Escaped suffix for interpolation (regexSafe)
    * @default undefined
    */
  var suffixEscaped: js.UndefOr[String] = js.native
  /**
    * Prefix to unescaped mode
    * @default '-'
    */
  var unescapePrefix: js.UndefOr[String] = js.native
  /**
    * Suffix to unescaped mode
    * @default undefined
    */
  var unescapeSuffix: js.UndefOr[String] = js.native
  /**
    * If true, then value passed into escape function is not casted to string, use with custom escape function that does its own type check
    * @default false
    */
  var useRawValueToEscape: js.UndefOr[Boolean] = js.native
}

object InterpolationOptions {
  @scala.inline
  def apply(): InterpolationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InterpolationOptions]
  }
  @scala.inline
  implicit class InterpolationOptionsOps[Self <: InterpolationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDefaultVariables(value: StringDictionary[js.Any]): Self = this.set("defaultVariables", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultVariables: Self = this.set("defaultVariables", js.undefined)
    @scala.inline
    def setEscape(value: /* str */ String => String): Self = this.set("escape", js.Any.fromFunction1(value))
    @scala.inline
    def deleteEscape: Self = this.set("escape", js.undefined)
    @scala.inline
    def setEscapeValue(value: Boolean): Self = this.set("escapeValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEscapeValue: Self = this.set("escapeValue", js.undefined)
    @scala.inline
    def setFormat(
      value: (/* value */ js.Any, /* format */ js.UndefOr[String], /* lng */ js.UndefOr[String]) => String
    ): Self = this.set("format", js.Any.fromFunction3(value))
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setFormatSeparator(value: String): Self = this.set("formatSeparator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormatSeparator: Self = this.set("formatSeparator", js.undefined)
    @scala.inline
    def setMaxReplaces(value: Double): Self = this.set("maxReplaces", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxReplaces: Self = this.set("maxReplaces", js.undefined)
    @scala.inline
    def setNestingOptionsSeparator(value: String): Self = this.set("nestingOptionsSeparator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNestingOptionsSeparator: Self = this.set("nestingOptionsSeparator", js.undefined)
    @scala.inline
    def setNestingPrefix(value: String): Self = this.set("nestingPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNestingPrefix: Self = this.set("nestingPrefix", js.undefined)
    @scala.inline
    def setNestingPrefixEscaped(value: String): Self = this.set("nestingPrefixEscaped", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNestingPrefixEscaped: Self = this.set("nestingPrefixEscaped", js.undefined)
    @scala.inline
    def setNestingSuffix(value: String): Self = this.set("nestingSuffix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNestingSuffix: Self = this.set("nestingSuffix", js.undefined)
    @scala.inline
    def setNestingSuffixEscaped(value: String): Self = this.set("nestingSuffixEscaped", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNestingSuffixEscaped: Self = this.set("nestingSuffixEscaped", js.undefined)
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    @scala.inline
    def setPrefixEscaped(value: String): Self = this.set("prefixEscaped", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixEscaped: Self = this.set("prefixEscaped", js.undefined)
    @scala.inline
    def setSkipOnVariables(value: Boolean): Self = this.set("skipOnVariables", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipOnVariables: Self = this.set("skipOnVariables", js.undefined)
    @scala.inline
    def setSuffix(value: String): Self = this.set("suffix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuffix: Self = this.set("suffix", js.undefined)
    @scala.inline
    def setSuffixEscaped(value: String): Self = this.set("suffixEscaped", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuffixEscaped: Self = this.set("suffixEscaped", js.undefined)
    @scala.inline
    def setUnescapePrefix(value: String): Self = this.set("unescapePrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnescapePrefix: Self = this.set("unescapePrefix", js.undefined)
    @scala.inline
    def setUnescapeSuffix(value: String): Self = this.set("unescapeSuffix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnescapeSuffix: Self = this.set("unescapeSuffix", js.undefined)
    @scala.inline
    def setUseRawValueToEscape(value: Boolean): Self = this.set("useRawValueToEscape", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseRawValueToEscape: Self = this.set("useRawValueToEscape", js.undefined)
  }
  
}

