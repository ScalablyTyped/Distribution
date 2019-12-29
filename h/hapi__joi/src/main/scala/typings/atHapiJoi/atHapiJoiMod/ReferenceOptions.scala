package typings.atHapiJoi.atHapiJoiMod

import typings.atHapiJoi.Anon_Global
import typings.atHapiJoi.atHapiJoiBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReferenceOptions extends HierarchySeparatorOptions {
  /**
    * a function with the signature `function(value)` where `value` is the resolved reference value and the return value is the adjusted value to use.
    * Note that the adjust feature will not perform any type validation on the adjusted value and it must match the value expected by the rule it is used in.
    * Cannot be used with `map`.
    *
    * @example `(value) => value + 5`
    */
  var adjust: js.UndefOr[js.Function1[/* value */ js.Any, _]] = js.undefined
  /**
    * If set to a number, sets the reference relative starting point.
    * Cannot be combined with separator prefix characters.
    * Defaults to the reference key prefix (or 1 if none present)
    */
  var ancestor: js.UndefOr[Double] = js.undefined
  /**
    * creates an in-reference.
    */
  var in: js.UndefOr[Boolean] = js.undefined
  /**
    * when true, the reference resolves by reaching into maps and sets.
    */
  var iterables: js.UndefOr[Boolean] = js.undefined
  /**
    * an array of array pairs using the format `[[key, value], [key, value]]` used to maps the resolved reference value to another value.
    * If the resolved value is not in the map, it is returned as-is.
    * Cannot be used with `adjust`.
    */
  var map: js.UndefOr[js.Array[js.Tuple2[_, _]]] = js.undefined
  /**
    * overrides default prefix characters.
    */
  var prefix: js.UndefOr[Anon_Global] = js.undefined
}

object ReferenceOptions {
  @scala.inline
  def apply(
    adjust: /* value */ js.Any => _ = null,
    ancestor: Int | Double = null,
    in: js.UndefOr[Boolean] = js.undefined,
    iterables: js.UndefOr[Boolean] = js.undefined,
    map: js.Array[js.Tuple2[_, _]] = null,
    prefix: Anon_Global = null,
    separator: String | `false` = null
  ): ReferenceOptions = {
    val __obj = js.Dynamic.literal()
    if (adjust != null) __obj.updateDynamic("adjust")(js.Any.fromFunction1(adjust))
    if (ancestor != null) __obj.updateDynamic("ancestor")(ancestor.asInstanceOf[js.Any])
    if (!js.isUndefined(in)) __obj.updateDynamic("in")(in.asInstanceOf[js.Any])
    if (!js.isUndefined(iterables)) __obj.updateDynamic("iterables")(iterables.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReferenceOptions]
  }
}

