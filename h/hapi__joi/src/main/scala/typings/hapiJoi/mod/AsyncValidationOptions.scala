package typings.hapiJoi.mod

import typings.hapiJoi.anon.Arrays
import typings.hapiJoi.hapiJoiStrings.date
import typings.hapiJoi.hapiJoiStrings.iso
import typings.hapiJoi.hapiJoiStrings.string
import typings.hapiJoi.hapiJoiStrings.time
import typings.hapiJoi.hapiJoiStrings.utc
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
    stripUnknown: Boolean | Arrays = null,
    warnings: js.UndefOr[Boolean] = js.undefined
  ): AsyncValidationOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(abortEarly)) __obj.updateDynamic("abortEarly")(abortEarly.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowUnknown)) __obj.updateDynamic("allowUnknown")(allowUnknown.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache.get.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (!js.isUndefined(convert)) __obj.updateDynamic("convert")(convert.get.asInstanceOf[js.Any])
    if (dateFormat != null) __obj.updateDynamic("dateFormat")(dateFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.get.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (!js.isUndefined(externals)) __obj.updateDynamic("externals")(externals.get.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (!js.isUndefined(noDefaults)) __obj.updateDynamic("noDefaults")(noDefaults.get.asInstanceOf[js.Any])
    if (!js.isUndefined(nonEnumerables)) __obj.updateDynamic("nonEnumerables")(nonEnumerables.get.asInstanceOf[js.Any])
    if (presence != null) __obj.updateDynamic("presence")(presence.asInstanceOf[js.Any])
    if (!js.isUndefined(skipFunctions)) __obj.updateDynamic("skipFunctions")(skipFunctions.get.asInstanceOf[js.Any])
    if (stripUnknown != null) __obj.updateDynamic("stripUnknown")(stripUnknown.asInstanceOf[js.Any])
    if (!js.isUndefined(warnings)) __obj.updateDynamic("warnings")(warnings.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncValidationOptions]
  }
}

