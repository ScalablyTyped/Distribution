package typings.joi.mod

import typings.joi.AnonArrays
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationOptions extends js.Object {
  /**
    * when true, stops validation on the first error, otherwise returns all the errors found. Defaults to true.
    */
  var abortEarly: js.UndefOr[Boolean] = js.undefined
  /**
    * when true, allows object to contain unknown keys which are ignored. Defaults to false.
    */
  var allowUnknown: js.UndefOr[Boolean] = js.undefined
  /**
    * provides an external data set to be used in references
    */
  var context: js.UndefOr[Context] = js.undefined
  /**
    * when true, attempts to cast values to the required types (e.g. a string to a number). Defaults to true.
    */
  var convert: js.UndefOr[Boolean] = js.undefined
  /**
    * overrides individual error messages. Defaults to no override ({}).
    */
  var language: js.UndefOr[LanguageRootOptions] = js.undefined
  /**
    * when true, do not apply default values. Defaults to false.
    */
  var noDefaults: js.UndefOr[Boolean] = js.undefined
  /**
    * sets the default presence requirements. Supported modes: 'optional', 'required', and 'forbidden'. Defaults to 'optional'.
    */
  var presence: js.UndefOr[
    typings.joi.joiStrings.optional | typings.joi.joiStrings.required | typings.joi.joiStrings.forbidden
  ] = js.undefined
  /**
    * when true, ignores unknown keys with a function value. Defaults to false.
    */
  var skipFunctions: js.UndefOr[Boolean] = js.undefined
  /**
    * remove unknown elements from objects and arrays. Defaults to false
    * - when true, all unknown elements will be removed
    * - when an object:
    *      - objects - set to true to remove unknown keys from objects
    */
  var stripUnknown: js.UndefOr[Boolean | AnonArrays] = js.undefined
}

object ValidationOptions {
  @scala.inline
  def apply(
    abortEarly: js.UndefOr[Boolean] = js.undefined,
    allowUnknown: js.UndefOr[Boolean] = js.undefined,
    context: Context = null,
    convert: js.UndefOr[Boolean] = js.undefined,
    language: LanguageRootOptions = null,
    noDefaults: js.UndefOr[Boolean] = js.undefined,
    presence: typings.joi.joiStrings.optional | typings.joi.joiStrings.required | typings.joi.joiStrings.forbidden = null,
    skipFunctions: js.UndefOr[Boolean] = js.undefined,
    stripUnknown: Boolean | AnonArrays = null
  ): ValidationOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(abortEarly)) __obj.updateDynamic("abortEarly")(abortEarly.asInstanceOf[js.Any])
    if (!js.isUndefined(allowUnknown)) __obj.updateDynamic("allowUnknown")(allowUnknown.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (!js.isUndefined(convert)) __obj.updateDynamic("convert")(convert.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (!js.isUndefined(noDefaults)) __obj.updateDynamic("noDefaults")(noDefaults.asInstanceOf[js.Any])
    if (presence != null) __obj.updateDynamic("presence")(presence.asInstanceOf[js.Any])
    if (!js.isUndefined(skipFunctions)) __obj.updateDynamic("skipFunctions")(skipFunctions.asInstanceOf[js.Any])
    if (stripUnknown != null) __obj.updateDynamic("stripUnknown")(stripUnknown.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationOptions]
  }
}

