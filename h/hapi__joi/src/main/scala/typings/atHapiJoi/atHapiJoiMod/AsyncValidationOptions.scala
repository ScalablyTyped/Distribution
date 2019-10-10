package typings.atHapiJoi.atHapiJoiMod

import typings.atHapiJoi.Anon_Arrays
import typings.atHapiJoi.atHapiJoiStrings.date
import typings.atHapiJoi.atHapiJoiStrings.iso
import typings.atHapiJoi.atHapiJoiStrings.string
import typings.atHapiJoi.atHapiJoiStrings.time
import typings.atHapiJoi.atHapiJoiStrings.utc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsyncValidationOptions extends ValidationOptions {
  /**
    * when true, warnings are returned alongside the value (i.e. `{ value, warning }`).
    *
    * @default false
    */
  var warnings: js.UndefOr[Boolean] = js.undefined
}

object AsyncValidationOptions {
  @scala.inline
  def apply(
    abortEarly: js.UndefOr[Boolean] = js.undefined,
    allowUnknown: js.UndefOr[Boolean] = js.undefined,
    cache: js.UndefOr[Boolean] = js.undefined,
    context: Context = null,
    convert: js.UndefOr[Boolean] = js.undefined,
    dateFormat: date | iso | string | time | utc = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    errors: ErrorFormattingOptions = null,
    externals: js.UndefOr[Boolean] = js.undefined,
    messages: LanguageMessages = null,
    noDefaults: js.UndefOr[Boolean] = js.undefined,
    nonEnumerables: js.UndefOr[Boolean] = js.undefined,
    presence: PresenceMode = null,
    skipFunctions: js.UndefOr[Boolean] = js.undefined,
    stripUnknown: Boolean | Anon_Arrays = null,
    warnings: js.UndefOr[Boolean] = js.undefined
  ): AsyncValidationOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(abortEarly)) __obj.updateDynamic("abortEarly")(abortEarly)
    if (!js.isUndefined(allowUnknown)) __obj.updateDynamic("allowUnknown")(allowUnknown)
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache)
    if (context != null) __obj.updateDynamic("context")(context)
    if (!js.isUndefined(convert)) __obj.updateDynamic("convert")(convert)
    if (dateFormat != null) __obj.updateDynamic("dateFormat")(dateFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (errors != null) __obj.updateDynamic("errors")(errors)
    if (!js.isUndefined(externals)) __obj.updateDynamic("externals")(externals)
    if (messages != null) __obj.updateDynamic("messages")(messages)
    if (!js.isUndefined(noDefaults)) __obj.updateDynamic("noDefaults")(noDefaults)
    if (!js.isUndefined(nonEnumerables)) __obj.updateDynamic("nonEnumerables")(nonEnumerables)
    if (presence != null) __obj.updateDynamic("presence")(presence)
    if (!js.isUndefined(skipFunctions)) __obj.updateDynamic("skipFunctions")(skipFunctions)
    if (stripUnknown != null) __obj.updateDynamic("stripUnknown")(stripUnknown.asInstanceOf[js.Any])
    if (!js.isUndefined(warnings)) __obj.updateDynamic("warnings")(warnings)
    __obj.asInstanceOf[AsyncValidationOptions]
  }
}

