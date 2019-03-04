package typings
package highlightDotJsLib.highlightDotJsMod.hljsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICompiledMode extends IModeBase {
  var compiled: scala.Boolean
  var contains: js.UndefOr[js.Array[ICompiledMode]] = js.undefined
  var keywords: js.UndefOr[js.Object] = js.undefined
  var terminator_end: js.UndefOr[java.lang.String] = js.undefined
  var terminators: stdLib.RegExp
}

object ICompiledMode {
  @scala.inline
  def apply(
    compiled: scala.Boolean,
    terminators: stdLib.RegExp,
    aliases: js.Array[java.lang.String] = null,
    begin: java.lang.String | stdLib.RegExp = null,
    beginKeyword: java.lang.String = null,
    case_insensitive: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    contains: js.Array[ICompiledMode] = null,
    end: java.lang.String | stdLib.RegExp = null,
    endsWithParent: js.UndefOr[scala.Boolean] = js.undefined,
    excludeBegin: js.UndefOr[scala.Boolean] = js.undefined,
    excludeEnd: js.UndefOr[scala.Boolean] = js.undefined,
    illegal: java.lang.String = null,
    keywords: js.Object = null,
    lexems: java.lang.String = null,
    relevance: scala.Int | scala.Double = null,
    returnBegin: js.UndefOr[scala.Boolean] = js.undefined,
    returnEnd: js.UndefOr[scala.Boolean] = js.undefined,
    starts: java.lang.String = null,
    subLanguage: java.lang.String = null,
    subLanguageMode: java.lang.String = null,
    terminator_end: java.lang.String = null,
    variants: js.Array[IMode] = null
  ): ICompiledMode = {
    val __obj = js.Dynamic.literal(compiled = compiled, terminators = terminators)
    if (aliases != null) __obj.updateDynamic("aliases")(aliases)
    if (begin != null) __obj.updateDynamic("begin")(begin.asInstanceOf[js.Any])
    if (beginKeyword != null) __obj.updateDynamic("beginKeyword")(beginKeyword)
    if (!js.isUndefined(case_insensitive)) __obj.updateDynamic("case_insensitive")(case_insensitive)
    if (className != null) __obj.updateDynamic("className")(className)
    if (contains != null) __obj.updateDynamic("contains")(contains)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (!js.isUndefined(endsWithParent)) __obj.updateDynamic("endsWithParent")(endsWithParent)
    if (!js.isUndefined(excludeBegin)) __obj.updateDynamic("excludeBegin")(excludeBegin)
    if (!js.isUndefined(excludeEnd)) __obj.updateDynamic("excludeEnd")(excludeEnd)
    if (illegal != null) __obj.updateDynamic("illegal")(illegal)
    if (keywords != null) __obj.updateDynamic("keywords")(keywords)
    if (lexems != null) __obj.updateDynamic("lexems")(lexems)
    if (relevance != null) __obj.updateDynamic("relevance")(relevance.asInstanceOf[js.Any])
    if (!js.isUndefined(returnBegin)) __obj.updateDynamic("returnBegin")(returnBegin)
    if (!js.isUndefined(returnEnd)) __obj.updateDynamic("returnEnd")(returnEnd)
    if (starts != null) __obj.updateDynamic("starts")(starts)
    if (subLanguage != null) __obj.updateDynamic("subLanguage")(subLanguage)
    if (subLanguageMode != null) __obj.updateDynamic("subLanguageMode")(subLanguageMode)
    if (terminator_end != null) __obj.updateDynamic("terminator_end")(terminator_end)
    if (variants != null) __obj.updateDynamic("variants")(variants)
    __obj.asInstanceOf[ICompiledMode]
  }
}

