package typings.highlightDotJs.highlightDotJsMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICompiledMode extends IModeBase {
  var compiled: Boolean
  var contains: js.UndefOr[js.Array[ICompiledMode]] = js.undefined
  var keywords: js.UndefOr[js.Object] = js.undefined
  var terminator_end: js.UndefOr[String] = js.undefined
  var terminators: RegExp
}

object ICompiledMode {
  @scala.inline
  def apply(
    compiled: Boolean,
    terminators: RegExp,
    aliases: js.Array[String] = null,
    begin: String | RegExp = null,
    beginKeyword: String = null,
    case_insensitive: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    contains: js.Array[ICompiledMode] = null,
    end: String | RegExp = null,
    endsWithParent: js.UndefOr[Boolean] = js.undefined,
    excludeBegin: js.UndefOr[Boolean] = js.undefined,
    excludeEnd: js.UndefOr[Boolean] = js.undefined,
    illegal: String = null,
    keywords: js.Object = null,
    lexems: String = null,
    relevance: Int | Double = null,
    returnBegin: js.UndefOr[Boolean] = js.undefined,
    returnEnd: js.UndefOr[Boolean] = js.undefined,
    starts: String = null,
    subLanguage: String = null,
    subLanguageMode: String = null,
    terminator_end: String = null,
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

