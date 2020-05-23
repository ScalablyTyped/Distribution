package typings.joi.mod

import org.scalablytyped.runtime.StringDictionary
import typings.joi.anon.WrapArrays
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  root ? :string,   key ? :string,   messages ? :{  wrapArrays ? :boolean}, [key: string] : joi.joi.LanguageOptions} & std.Partial<std.Record<joi.joi.Types, joi.joi.LanguageOptions>> */
trait LanguageRootOptions extends /* key */ StringDictionary[LanguageOptions] {
  var alternatives: js.UndefOr[LanguageOptions] = js.undefined
  var any: js.UndefOr[LanguageOptions] = js.undefined
  var array: js.UndefOr[LanguageOptions] = js.undefined
  var binary: js.UndefOr[LanguageOptions] = js.undefined
  var boolean: js.UndefOr[LanguageOptions] = js.undefined
  var date: js.UndefOr[LanguageOptions] = js.undefined
  var function: js.UndefOr[LanguageOptions] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  var `lazy`: js.UndefOr[LanguageOptions] = js.undefined
  var messages: js.UndefOr[WrapArrays] = js.undefined
  var number: js.UndefOr[LanguageOptions] = js.undefined
  var `object`: js.UndefOr[LanguageOptions] = js.undefined
  var root: js.UndefOr[String] = js.undefined
  var string: js.UndefOr[LanguageOptions] = js.undefined
}

object LanguageRootOptions {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[LanguageOptions] = null,
    alternatives: js.UndefOr[Null | LanguageOptions] = js.undefined,
    any: js.UndefOr[Null | LanguageOptions] = js.undefined,
    array: js.UndefOr[Null | LanguageOptions] = js.undefined,
    binary: js.UndefOr[Null | LanguageOptions] = js.undefined,
    boolean: js.UndefOr[Null | LanguageOptions] = js.undefined,
    date: js.UndefOr[Null | LanguageOptions] = js.undefined,
    function: js.UndefOr[Null | LanguageOptions] = js.undefined,
    key: String = null,
    `lazy`: js.UndefOr[Null | LanguageOptions] = js.undefined,
    messages: WrapArrays = null,
    number: js.UndefOr[Null | LanguageOptions] = js.undefined,
    `object`: js.UndefOr[Null | LanguageOptions] = js.undefined,
    root: String = null,
    string: js.UndefOr[Null | LanguageOptions] = js.undefined
  ): LanguageRootOptions = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(alternatives)) __obj.updateDynamic("alternatives")(alternatives.asInstanceOf[js.Any])
    if (!js.isUndefined(any)) __obj.updateDynamic("any")(any.asInstanceOf[js.Any])
    if (!js.isUndefined(array)) __obj.updateDynamic("array")(array.asInstanceOf[js.Any])
    if (!js.isUndefined(binary)) __obj.updateDynamic("binary")(binary.asInstanceOf[js.Any])
    if (!js.isUndefined(boolean)) __obj.updateDynamic("boolean")(boolean.asInstanceOf[js.Any])
    if (!js.isUndefined(date)) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (!js.isUndefined(function)) __obj.updateDynamic("function")(function.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(`lazy`)) __obj.updateDynamic("lazy")(`lazy`.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (!js.isUndefined(number)) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    if (!js.isUndefined(`object`)) __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (!js.isUndefined(string)) __obj.updateDynamic("string")(string.asInstanceOf[js.Any])
    __obj.asInstanceOf[LanguageRootOptions]
  }
}

