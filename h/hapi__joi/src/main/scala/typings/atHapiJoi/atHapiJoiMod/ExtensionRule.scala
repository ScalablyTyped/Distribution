package typings.atHapiJoi.atHapiJoiMod

import typings.atHapiJoi.atHapiJoiNumbers.`false`
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtensionRule extends js.Object {
  /**
    * alternative name for this rule.
    */
  var alias: js.UndefOr[String] = js.undefined
  /**
    * list of arguments accepted by `method`.
    */
  var args: js.UndefOr[js.Array[RuleArgs | String]] = js.undefined
  /**
    * Dual rule: converts or validates.
    */
  var convert: js.UndefOr[Boolean] = js.undefined
  var manifest: js.UndefOr[Boolean] = js.undefined
  /**
    * rule body.
    */
  var method: js.UndefOr[RuleMethod | `false`] = js.undefined
  /**
    * whether rule supports multiple invocations.
    */
  var multi: js.UndefOr[Boolean] = js.undefined
  /**
    * undocumented flags.
    */
  var priority: js.UndefOr[Boolean] = js.undefined
  /**
    * validation function.
    */
  var validate: js.UndefOr[
    js.Function4[
      /* value */ js.Any, 
      /* helpers */ js.Any, 
      /* args */ Record[String, _], 
      /* options */ js.Any, 
      _
    ]
  ] = js.undefined
}

object ExtensionRule {
  @scala.inline
  def apply(
    alias: String = null,
    args: js.Array[RuleArgs | String] = null,
    convert: js.UndefOr[Boolean] = js.undefined,
    manifest: js.UndefOr[Boolean] = js.undefined,
    method: RuleMethod | `false` = null,
    multi: js.UndefOr[Boolean] = js.undefined,
    priority: js.UndefOr[Boolean] = js.undefined,
    validate: (/* value */ js.Any, /* helpers */ js.Any, /* args */ Record[String, _], /* options */ js.Any) => _ = null
  ): ExtensionRule = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (args != null) __obj.updateDynamic("args")(args)
    if (!js.isUndefined(convert)) __obj.updateDynamic("convert")(convert)
    if (!js.isUndefined(manifest)) __obj.updateDynamic("manifest")(manifest)
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (!js.isUndefined(multi)) __obj.updateDynamic("multi")(multi)
    if (!js.isUndefined(priority)) __obj.updateDynamic("priority")(priority)
    if (validate != null) __obj.updateDynamic("validate")(js.Any.fromFunction4(validate))
    __obj.asInstanceOf[ExtensionRule]
  }
}

