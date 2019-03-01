package typings
package joiLib.joiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationOptions extends js.Object {
  /**
    * when true, stops validation on the first error, otherwise returns all the errors found. Defaults to true.
    */
  var abortEarly: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * when true, allows object to contain unknown keys which are ignored. Defaults to false.
    */
  var allowUnknown: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * provides an external data set to be used in references
    */
  var context: js.UndefOr[Context] = js.undefined
  /**
    * when true, attempts to cast values to the required types (e.g. a string to a number). Defaults to true.
    */
  var convert: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * overrides individual error messages. Defaults to no override ({}).
    */
  var language: js.UndefOr[LanguageRootOptions] = js.undefined
  /**
    * when true, do not apply default values. Defaults to false.
    */
  var noDefaults: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * sets the default presence requirements. Supported modes: 'optional', 'required', and 'forbidden'. Defaults to 'optional'.
    */
  var presence: js.UndefOr[
    joiLib.joiLibStrings.optional | joiLib.joiLibStrings.required | joiLib.joiLibStrings.forbidden
  ] = js.undefined
  /**
    * when true, ignores unknown keys with a function value. Defaults to false.
    */
  var skipFunctions: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * remove unknown elements from objects and arrays. Defaults to false
    * - when true, all unknown elements will be removed
    * - when an object:
    *      - objects - set to true to remove unknown keys from objects
    */
  var stripUnknown: js.UndefOr[scala.Boolean | joiLib.Anon_Arrays] = js.undefined
}

object ValidationOptions {
  @scala.inline
  def apply(
    abortEarly: js.UndefOr[scala.Boolean] = js.undefined,
    allowUnknown: js.UndefOr[scala.Boolean] = js.undefined,
    context: Context = null,
    convert: js.UndefOr[scala.Boolean] = js.undefined,
    language: LanguageRootOptions = null,
    noDefaults: js.UndefOr[scala.Boolean] = js.undefined,
    presence: joiLib.joiLibStrings.optional | joiLib.joiLibStrings.required | joiLib.joiLibStrings.forbidden = null,
    skipFunctions: js.UndefOr[scala.Boolean] = js.undefined,
    stripUnknown: scala.Boolean | joiLib.Anon_Arrays = null
  ): ValidationOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(abortEarly)) __obj.updateDynamic("abortEarly")(abortEarly)
    if (!js.isUndefined(allowUnknown)) __obj.updateDynamic("allowUnknown")(allowUnknown)
    if (context != null) __obj.updateDynamic("context")(context)
    if (!js.isUndefined(convert)) __obj.updateDynamic("convert")(convert)
    if (language != null) __obj.updateDynamic("language")(language)
    if (!js.isUndefined(noDefaults)) __obj.updateDynamic("noDefaults")(noDefaults)
    if (presence != null) __obj.updateDynamic("presence")(presence.asInstanceOf[js.Any])
    if (!js.isUndefined(skipFunctions)) __obj.updateDynamic("skipFunctions")(skipFunctions)
    if (stripUnknown != null) __obj.updateDynamic("stripUnknown")(stripUnknown.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationOptions]
  }
}

