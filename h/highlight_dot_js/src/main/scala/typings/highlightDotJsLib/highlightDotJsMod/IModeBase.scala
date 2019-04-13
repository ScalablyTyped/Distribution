package typings
package highlightDotJsLib.highlightDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IModeBase extends js.Object {
  var aliases: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var begin: js.UndefOr[java.lang.String | stdLib.RegExp] = js.undefined
  var beginKeyword: js.UndefOr[java.lang.String] = js.undefined
  var case_insensitive: js.UndefOr[scala.Boolean] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var end: js.UndefOr[java.lang.String | stdLib.RegExp] = js.undefined
  var endsWithParent: js.UndefOr[scala.Boolean] = js.undefined
  var excludeBegin: js.UndefOr[scala.Boolean] = js.undefined
  var excludeEnd: js.UndefOr[scala.Boolean] = js.undefined
  var illegal: js.UndefOr[java.lang.String] = js.undefined
  var lexems: js.UndefOr[java.lang.String] = js.undefined
  var relevance: js.UndefOr[scala.Double] = js.undefined
  var returnBegin: js.UndefOr[scala.Boolean] = js.undefined
  var returnEnd: js.UndefOr[scala.Boolean] = js.undefined
  var starts: js.UndefOr[java.lang.String] = js.undefined
  var subLanguage: js.UndefOr[java.lang.String] = js.undefined
  var subLanguageMode: js.UndefOr[java.lang.String] = js.undefined
  var variants: js.UndefOr[js.Array[IMode]] = js.undefined
}

object IModeBase {
  @scala.inline
  def apply(
    aliases: js.Array[java.lang.String] = null,
    begin: java.lang.String | stdLib.RegExp = null,
    beginKeyword: java.lang.String = null,
    case_insensitive: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    end: java.lang.String | stdLib.RegExp = null,
    endsWithParent: js.UndefOr[scala.Boolean] = js.undefined,
    excludeBegin: js.UndefOr[scala.Boolean] = js.undefined,
    excludeEnd: js.UndefOr[scala.Boolean] = js.undefined,
    illegal: java.lang.String = null,
    lexems: java.lang.String = null,
    relevance: scala.Int | scala.Double = null,
    returnBegin: js.UndefOr[scala.Boolean] = js.undefined,
    returnEnd: js.UndefOr[scala.Boolean] = js.undefined,
    starts: java.lang.String = null,
    subLanguage: java.lang.String = null,
    subLanguageMode: java.lang.String = null,
    variants: js.Array[IMode] = null
  ): IModeBase = {
    val __obj = js.Dynamic.literal()
    if (aliases != null) __obj.updateDynamic("aliases")(aliases)
    if (begin != null) __obj.updateDynamic("begin")(begin.asInstanceOf[js.Any])
    if (beginKeyword != null) __obj.updateDynamic("beginKeyword")(beginKeyword)
    if (!js.isUndefined(case_insensitive)) __obj.updateDynamic("case_insensitive")(case_insensitive)
    if (className != null) __obj.updateDynamic("className")(className)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (!js.isUndefined(endsWithParent)) __obj.updateDynamic("endsWithParent")(endsWithParent)
    if (!js.isUndefined(excludeBegin)) __obj.updateDynamic("excludeBegin")(excludeBegin)
    if (!js.isUndefined(excludeEnd)) __obj.updateDynamic("excludeEnd")(excludeEnd)
    if (illegal != null) __obj.updateDynamic("illegal")(illegal)
    if (lexems != null) __obj.updateDynamic("lexems")(lexems)
    if (relevance != null) __obj.updateDynamic("relevance")(relevance.asInstanceOf[js.Any])
    if (!js.isUndefined(returnBegin)) __obj.updateDynamic("returnBegin")(returnBegin)
    if (!js.isUndefined(returnEnd)) __obj.updateDynamic("returnEnd")(returnEnd)
    if (starts != null) __obj.updateDynamic("starts")(starts)
    if (subLanguage != null) __obj.updateDynamic("subLanguage")(subLanguage)
    if (subLanguageMode != null) __obj.updateDynamic("subLanguageMode")(subLanguageMode)
    if (variants != null) __obj.updateDynamic("variants")(variants)
    __obj.asInstanceOf[IModeBase]
  }
}

