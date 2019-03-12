package typings
package jjuLib.jjuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseOptions extends js.Object {
  /**
    * Operation mode (default 'json5'). Set to 'json' if you want to throw on non-strict json files.
    */
  var mode: js.UndefOr[
    jjuLib.jjuLibStrings.json5 | jjuLib.jjuLibStrings.json | jjuLib.jjuLibStrings.cjson
  ] = js.undefined
  /**
    * Create object as `Object.create(null)` instead of `{}`.
    * - If reserved_keys != 'replace', default is false.
    * - If reserved_keys == 'replace', default is true.
    *
    * It is usually unsafe and not recommended to change this option to false in the last case.
    */
  var null_prototype: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * What to do with reserved keys (default 'ignore').
    * - "ignore" - ignore reserved keys
    * - "throw" - throw SyntaxError in case of reserved keys
    * - "replace" - replace reserved keys, this is the default JSON.parse behaviour, unsafe
    */
  var reserved_keys: js.UndefOr[
    jjuLib.jjuLibStrings.ignore | jjuLib.jjuLibStrings.`throw` | jjuLib.jjuLibStrings.replace
  ] = js.undefined
  /**
    * Reviver function (follows the JSON spec). This function is called for each member of the object.
    * If a member contains nested objects, the nested objects are transformed before the parent object is.
    */
  var reviver: js.UndefOr[js.Function2[/* key */ js.Any, /* value */ js.Any, _]] = js.undefined
}

object ParseOptions {
  @scala.inline
  def apply(
    mode: jjuLib.jjuLibStrings.json5 | jjuLib.jjuLibStrings.json | jjuLib.jjuLibStrings.cjson = null,
    null_prototype: js.UndefOr[scala.Boolean] = js.undefined,
    reserved_keys: jjuLib.jjuLibStrings.ignore | jjuLib.jjuLibStrings.`throw` | jjuLib.jjuLibStrings.replace = null,
    reviver: (/* key */ js.Any, /* value */ js.Any) => _ = null
  ): ParseOptions = {
    val __obj = js.Dynamic.literal()
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (!js.isUndefined(null_prototype)) __obj.updateDynamic("null_prototype")(null_prototype)
    if (reserved_keys != null) __obj.updateDynamic("reserved_keys")(reserved_keys.asInstanceOf[js.Any])
    if (reviver != null) __obj.updateDynamic("reviver")(js.Any.fromFunction2(reviver))
    __obj.asInstanceOf[ParseOptions]
  }
}

