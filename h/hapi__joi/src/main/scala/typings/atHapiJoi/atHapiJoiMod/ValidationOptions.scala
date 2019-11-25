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

trait ValidationOptions extends js.Object {
  /**
    * when true, stops validation on the first error, otherwise returns all the errors found.
    *
    * @default true
    */
  var abortEarly: js.UndefOr[Boolean] = js.undefined
  /**
    * when true, allows object to contain unknown keys which are ignored.
    *
    * @default false
    */
  var allowUnknown: js.UndefOr[Boolean] = js.undefined
  /**
    * when true, schema caching is enabled (for schemas with explicit caching rules).
    *
    * @default false
    */
  var cache: js.UndefOr[Boolean] = js.undefined
  /**
    * provides an external data set to be used in references
    */
  var context: js.UndefOr[Context] = js.undefined
  /**
    * when true, attempts to cast values to the required types (e.g. a string to a number).
    *
    * @default true
    */
  var convert: js.UndefOr[Boolean] = js.undefined
  /**
    * sets the string format used when converting dates to strings in error messages and casting.
    *
    * @default 'iso'
    */
  var dateFormat: js.UndefOr[date | iso | string | time | utc] = js.undefined
  /**
    * when true, valid results and throw errors are decorated with a debug property which includes an array of the validation steps used to generate the returned result.
    *
    * @default false
    */
  var debug: js.UndefOr[Boolean] = js.undefined
  /**
    * error formatting settings.
    */
  var errors: js.UndefOr[ErrorFormattingOptions] = js.undefined
  /**
    * if false, the external rules set with `any.external()` are ignored, which is required to ignore any external validations in synchronous mode (or an exception is thrown).
    *
    * @default true
    */
  var externals: js.UndefOr[Boolean] = js.undefined
  /**
    * overrides individual error messages. Defaults to no override (`{}`).
    * Messages use the same rules as templates.
    * Variables in double braces `{{var}}` are HTML escaped if the option `errors.escapeHtml` is set to true.
    *
    * @default {}
    */
  var messages: js.UndefOr[LanguageMessages] = js.undefined
  /**
    * when true, do not apply default values.
    *
    * @default false
    */
  var noDefaults: js.UndefOr[Boolean] = js.undefined
  /**
    * when true, inputs are shallow cloned to include non-enumerables properties.
    *
    * @default false
    */
  var nonEnumerables: js.UndefOr[Boolean] = js.undefined
  /**
    * sets the default presence requirements. Supported modes: 'optional', 'required', and 'forbidden'.
    *
    * @default 'optional'
    */
  var presence: js.UndefOr[PresenceMode] = js.undefined
  /**
    * when true, ignores unknown keys with a function value.
    *
    * @default false
    */
  var skipFunctions: js.UndefOr[Boolean] = js.undefined
  /**
    * remove unknown elements from objects and arrays.
    * - when true, all unknown elements will be removed
    * - when an object:
    *      - objects - set to true to remove unknown keys from objects
    *
    * @default false
    */
  var stripUnknown: js.UndefOr[Boolean | Anon_Arrays] = js.undefined
}

object ValidationOptions {
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
    stripUnknown: Boolean | Anon_Arrays = null
  ): ValidationOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(abortEarly)) __obj.updateDynamic("abortEarly")(abortEarly.asInstanceOf[js.Any])
    if (!js.isUndefined(allowUnknown)) __obj.updateDynamic("allowUnknown")(allowUnknown.asInstanceOf[js.Any])
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (!js.isUndefined(convert)) __obj.updateDynamic("convert")(convert.asInstanceOf[js.Any])
    if (dateFormat != null) __obj.updateDynamic("dateFormat")(dateFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (!js.isUndefined(externals)) __obj.updateDynamic("externals")(externals.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (!js.isUndefined(noDefaults)) __obj.updateDynamic("noDefaults")(noDefaults.asInstanceOf[js.Any])
    if (!js.isUndefined(nonEnumerables)) __obj.updateDynamic("nonEnumerables")(nonEnumerables.asInstanceOf[js.Any])
    if (presence != null) __obj.updateDynamic("presence")(presence.asInstanceOf[js.Any])
    if (!js.isUndefined(skipFunctions)) __obj.updateDynamic("skipFunctions")(skipFunctions.asInstanceOf[js.Any])
    if (stripUnknown != null) __obj.updateDynamic("stripUnknown")(stripUnknown.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationOptions]
  }
}

