package typings.highlightDotJs.highlightDotJsMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IModeBase extends js.Object {
  var aliases: js.UndefOr[js.Array[String]] = js.undefined
  var begin: js.UndefOr[String | RegExp] = js.undefined
  var beginKeyword: js.UndefOr[String] = js.undefined
  var case_insensitive: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var end: js.UndefOr[String | RegExp] = js.undefined
  var endsWithParent: js.UndefOr[Boolean] = js.undefined
  var excludeBegin: js.UndefOr[Boolean] = js.undefined
  var excludeEnd: js.UndefOr[Boolean] = js.undefined
  var illegal: js.UndefOr[String] = js.undefined
  var lexems: js.UndefOr[String] = js.undefined
  var relevance: js.UndefOr[Double] = js.undefined
  var returnBegin: js.UndefOr[Boolean] = js.undefined
  var returnEnd: js.UndefOr[Boolean] = js.undefined
  var starts: js.UndefOr[String] = js.undefined
  var subLanguage: js.UndefOr[String] = js.undefined
  var subLanguageMode: js.UndefOr[String] = js.undefined
  var variants: js.UndefOr[js.Array[IMode]] = js.undefined
}

object IModeBase {
  @scala.inline
  def apply(
    aliases: js.Array[String] = null,
    begin: String | RegExp = null,
    beginKeyword: String = null,
    case_insensitive: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    end: String | RegExp = null,
    endsWithParent: js.UndefOr[Boolean] = js.undefined,
    excludeBegin: js.UndefOr[Boolean] = js.undefined,
    excludeEnd: js.UndefOr[Boolean] = js.undefined,
    illegal: String = null,
    lexems: String = null,
    relevance: Int | Double = null,
    returnBegin: js.UndefOr[Boolean] = js.undefined,
    returnEnd: js.UndefOr[Boolean] = js.undefined,
    starts: String = null,
    subLanguage: String = null,
    subLanguageMode: String = null,
    variants: js.Array[IMode] = null
  ): IModeBase = {
    val __obj = js.Dynamic.literal()
    if (aliases != null) __obj.updateDynamic("aliases")(aliases.asInstanceOf[js.Any])
    if (begin != null) __obj.updateDynamic("begin")(begin.asInstanceOf[js.Any])
    if (beginKeyword != null) __obj.updateDynamic("beginKeyword")(beginKeyword.asInstanceOf[js.Any])
    if (!js.isUndefined(case_insensitive)) __obj.updateDynamic("case_insensitive")(case_insensitive.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (!js.isUndefined(endsWithParent)) __obj.updateDynamic("endsWithParent")(endsWithParent.asInstanceOf[js.Any])
    if (!js.isUndefined(excludeBegin)) __obj.updateDynamic("excludeBegin")(excludeBegin.asInstanceOf[js.Any])
    if (!js.isUndefined(excludeEnd)) __obj.updateDynamic("excludeEnd")(excludeEnd.asInstanceOf[js.Any])
    if (illegal != null) __obj.updateDynamic("illegal")(illegal.asInstanceOf[js.Any])
    if (lexems != null) __obj.updateDynamic("lexems")(lexems.asInstanceOf[js.Any])
    if (relevance != null) __obj.updateDynamic("relevance")(relevance.asInstanceOf[js.Any])
    if (!js.isUndefined(returnBegin)) __obj.updateDynamic("returnBegin")(returnBegin.asInstanceOf[js.Any])
    if (!js.isUndefined(returnEnd)) __obj.updateDynamic("returnEnd")(returnEnd.asInstanceOf[js.Any])
    if (starts != null) __obj.updateDynamic("starts")(starts.asInstanceOf[js.Any])
    if (subLanguage != null) __obj.updateDynamic("subLanguage")(subLanguage.asInstanceOf[js.Any])
    if (subLanguageMode != null) __obj.updateDynamic("subLanguageMode")(subLanguageMode.asInstanceOf[js.Any])
    if (variants != null) __obj.updateDynamic("variants")(variants.asInstanceOf[js.Any])
    __obj.asInstanceOf[IModeBase]
  }
}

