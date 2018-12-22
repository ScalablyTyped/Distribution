package typings
package jsDashYamlLib.jsDashYamlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DumpOptions extends js.Object {
  /**
  	 * if true flow sequences will be condensed, omitting the space between `key: value` or `a, b`. Eg. `'[a,b]'` or `{a:{b:c}}`.
  	 * Can be useful when using yaml for pretty URL query params as spaces are %-encoded. (default: false).
  	 */
  var condenseFlow: js.UndefOr[scala.Boolean] = js.undefined
  /** specifies level of nesting, when to switch from block to flow style for collections. -1 means block style everwhere */
  var flowLevel: js.UndefOr[scala.Double] = js.undefined
  /** indentation width to use (in spaces). */
  var indent: js.UndefOr[scala.Double] = js.undefined
  /** set max line width. (default: 80) */
  var lineWidth: js.UndefOr[scala.Double] = js.undefined
  /** if true don't try to be compatible with older yaml versions. Currently: don't quote "yes", "no" and so on, as required for YAML 1.1 (default: false) */
  var noCompatMode: js.UndefOr[scala.Boolean] = js.undefined
  /** if true, don't convert duplicate objects into references (default: false) */
  var noRefs: js.UndefOr[scala.Boolean] = js.undefined
  /** specifies a schema to use. */
  var schema: js.UndefOr[SchemaDefinition] = js.undefined
  /** do not throw on invalid types (like function in the safe schema) and skip pairs and single values with such types. */
  var skipInvalid: js.UndefOr[scala.Boolean] = js.undefined
  /** if true, sort keys when dumping YAML. If a function, use the function to sort the keys. (default: false) */
  var sortKeys: js.UndefOr[scala.Boolean | (js.Function2[/* a */ js.Any, /* b */ js.Any, scala.Double])] = js.undefined
  /** Each tag may have own set of styles.	- "tag" => "style" map. */
  var styles: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
}

