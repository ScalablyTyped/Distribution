package typings.jsYaml.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DumpOptions extends js.Object {
  /**
    * if true flow sequences will be condensed, omitting the space between `key: value` or `a, b`. Eg. `'[a,b]'` or `{a:{b:c}}`.
    * Can be useful when using yaml for pretty URL query params as spaces are %-encoded. (default: false).
    */
  var condenseFlow: js.UndefOr[Boolean] = js.undefined
  /** specifies level of nesting, when to switch from block to flow style for collections. -1 means block style everwhere */
  var flowLevel: js.UndefOr[Double] = js.undefined
  /** indentation width to use (in spaces). */
  var indent: js.UndefOr[Double] = js.undefined
  /** set max line width. (default: 80) */
  var lineWidth: js.UndefOr[Double] = js.undefined
  /** when true, will not add an indentation level to array elements */
  var noArrayIndent: js.UndefOr[Boolean] = js.undefined
  /** if true don't try to be compatible with older yaml versions. Currently: don't quote "yes", "no" and so on, as required for YAML 1.1 (default: false) */
  var noCompatMode: js.UndefOr[Boolean] = js.undefined
  /** if true, don't convert duplicate objects into references (default: false) */
  var noRefs: js.UndefOr[Boolean] = js.undefined
  /** specifies a schema to use. */
  var schema: js.UndefOr[SchemaDefinition] = js.undefined
  /** do not throw on invalid types (like function in the safe schema) and skip pairs and single values with such types. */
  var skipInvalid: js.UndefOr[Boolean] = js.undefined
  /** if true, sort keys when dumping YAML. If a function, use the function to sort the keys. (default: false) */
  var sortKeys: js.UndefOr[Boolean | (js.Function2[/* a */ js.Any, /* b */ js.Any, Double])] = js.undefined
  /** Each tag may have own set of styles.    - "tag" => "style" map. */
  var styles: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object DumpOptions {
  @scala.inline
  def apply(
    condenseFlow: js.UndefOr[Boolean] = js.undefined,
    flowLevel: js.UndefOr[Double] = js.undefined,
    indent: js.UndefOr[Double] = js.undefined,
    lineWidth: js.UndefOr[Double] = js.undefined,
    noArrayIndent: js.UndefOr[Boolean] = js.undefined,
    noCompatMode: js.UndefOr[Boolean] = js.undefined,
    noRefs: js.UndefOr[Boolean] = js.undefined,
    schema: SchemaDefinition = null,
    skipInvalid: js.UndefOr[Boolean] = js.undefined,
    sortKeys: Boolean | (js.Function2[/* a */ js.Any, /* b */ js.Any, Double]) = null,
    styles: StringDictionary[js.Any] = null
  ): DumpOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(condenseFlow)) __obj.updateDynamic("condenseFlow")(condenseFlow.get.asInstanceOf[js.Any])
    if (!js.isUndefined(flowLevel)) __obj.updateDynamic("flowLevel")(flowLevel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(indent)) __obj.updateDynamic("indent")(indent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lineWidth)) __obj.updateDynamic("lineWidth")(lineWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(noArrayIndent)) __obj.updateDynamic("noArrayIndent")(noArrayIndent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(noCompatMode)) __obj.updateDynamic("noCompatMode")(noCompatMode.get.asInstanceOf[js.Any])
    if (!js.isUndefined(noRefs)) __obj.updateDynamic("noRefs")(noRefs.get.asInstanceOf[js.Any])
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    if (!js.isUndefined(skipInvalid)) __obj.updateDynamic("skipInvalid")(skipInvalid.get.asInstanceOf[js.Any])
    if (sortKeys != null) __obj.updateDynamic("sortKeys")(sortKeys.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[DumpOptions]
  }
}

