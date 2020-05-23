package typings.jsonpathPlus.mod

import typings.jsonpathPlus.jsonpathPlusStrings.all
import typings.jsonpathPlus.jsonpathPlusStrings.parent
import typings.jsonpathPlus.jsonpathPlusStrings.parentProperty
import typings.jsonpathPlus.jsonpathPlusStrings.path
import typings.jsonpathPlus.jsonpathPlusStrings.pointer
import typings.jsonpathPlus.jsonpathPlusStrings.value
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONPathOptions extends js.Object {
  /**
    * If this is supplied as false, one may call the evaluate method
    *  manually.
    *
    * @default true
    */
  var autostart: js.UndefOr[Boolean] = js.undefined
  /**
    * If supplied, a callback will be called immediately upon retrieval of
    * an end point value.
    *
    * The three arguments supplied will be the value of the payload
    * (according to `resultType`), the type of the payload (whether it is
    * a normal "value" or a "property" name), and a full payload object
    * (with all `resultType`s).
    *
    * @default undefined
    */
  var callback: js.UndefOr[JSONPathCallback] = js.undefined
  /**
    * Whether the returned array of results will be flattened to a
    *   single dimension array.
    *
    * @default false
    */
  var flatten: js.UndefOr[Boolean] = js.undefined
  /**
    * The JSON object to evaluate (whether of null, boolean, number,
    *   string, object, or array type).
    */
  var json: Null | Boolean | Double | String | js.Object | js.Array[_]
  /**
    * In the current absence of JSON Schema support,
    * one can determine types beyond the built-in types by adding the
    * perator `@other()` at the end of one's query.
    *
    * If such a path is encountered, the `otherTypeCallback` will be invoked
    * with the value of the item, its path, its parent, and its parent's
    * property name, and it should return a boolean indicating whether the
    * supplied value belongs to the "other" type or not (or it may handle
    * transformations and return false).
    *
    * @default undefined
    *   <A function that throws an error when `@other()` is encountered>
    */
  var otherTypeCallback: js.UndefOr[JSONPathOtherTypeCallback] = js.undefined
  /**
    * In the event that a query could be made to return the root node,
    * this allows the parent of that root node to be returned within results.
    *
    * @default null
    */
  var parent: js.UndefOr[Null | js.Any] = js.undefined
  /**
    * In the event that a query could be made to return the root node,
    * this allows the parentProperty of that root node to be returned within
    * results.
    *
    * @default null
    */
  var parentProperty: js.UndefOr[Null | js.Any] = js.undefined
  /**
    * The JSONPath expression as a (normalized or unnormalized) string or
    *   array.
    */
  var path: String | js.Array[_]
  /**
    * Although JavaScript evaluation expressions are allowed by default,
    * for security reasons (if one is operating on untrusted user input,
    * for example), one may wish to set this option to true to throw
    * exceptions when these expressions are attempted.
    *
    * @default false
    */
  var preventEval: js.UndefOr[Boolean] = js.undefined
  /**
    * Can be case-insensitive form of "value", "path", "pointer", "parent",
    *   or "parentProperty" to determine respectively whether to return
    *   results as the values of the found items, as their absolute paths,
    *   as JSON Pointers to the absolute paths, as their parent objects,
    *   or as their parent's property name.
    *
    * If set to "all", all of these types will be returned on an object with
    *   the type as key name.
    *
    * @default 'value'
    */
  var resultType: js.UndefOr[value | path | pointer | parent | parentProperty | all] = js.undefined
  /**
    * Key-value map of variables to be available to code evaluations such
    *   as filtering expressions.
    * (Note that the current path and value will also be available to those
    *   expressions; see the Syntax section for details.)
    */
  var sandbox: js.UndefOr[Map[String, _]] = js.undefined
  /**
    * Whether or not to wrap the results in an array.
    *
    * If wrap is set to false, and no results are found, undefined will be
    *   returned (as opposed to an empty array when wrap is set to true).
    *
    * If wrap is set to false and a single non-array result is found, that
    *   result will be the only item returned (not within an array).
    *
    * An array will still be returned if multiple results are found, however.
    * To avoid ambiguities (in the case where it is necessary to distinguish
    * between a result which is a failure and one which is an empty array),
    * it is recommended to switch the default to false.
    *
    * @default true
    */
  var wrap: js.UndefOr[Boolean] = js.undefined
}

object JSONPathOptions {
  @scala.inline
  def apply(
    path: String | js.Array[_],
    autostart: js.UndefOr[Boolean] = js.undefined,
    callback: (/* payload */ js.Any, /* payloadType */ js.Any, /* fullPayload */ js.Any) => js.Any = null,
    flatten: js.UndefOr[Boolean] = js.undefined,
    json: Boolean | Double | String | js.Object | js.Array[_] = null,
    otherTypeCallback: /* repeated */ js.Any => Unit = null,
    parent: js.UndefOr[Null | js.Any] = js.undefined,
    parentProperty: js.UndefOr[Null | js.Any] = js.undefined,
    preventEval: js.UndefOr[Boolean] = js.undefined,
    resultType: value | path | pointer | parent | parentProperty | all = null,
    sandbox: Map[String, _] = null,
    wrap: js.UndefOr[Boolean] = js.undefined
  ): JSONPathOptions = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any])
    if (!js.isUndefined(autostart)) __obj.updateDynamic("autostart")(autostart.get.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction3(callback))
    if (!js.isUndefined(flatten)) __obj.updateDynamic("flatten")(flatten.get.asInstanceOf[js.Any])
    if (otherTypeCallback != null) __obj.updateDynamic("otherTypeCallback")(js.Any.fromFunction1(otherTypeCallback))
    if (!js.isUndefined(parent)) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (!js.isUndefined(parentProperty)) __obj.updateDynamic("parentProperty")(parentProperty.asInstanceOf[js.Any])
    if (!js.isUndefined(preventEval)) __obj.updateDynamic("preventEval")(preventEval.get.asInstanceOf[js.Any])
    if (resultType != null) __obj.updateDynamic("resultType")(resultType.asInstanceOf[js.Any])
    if (sandbox != null) __obj.updateDynamic("sandbox")(sandbox.asInstanceOf[js.Any])
    if (!js.isUndefined(wrap)) __obj.updateDynamic("wrap")(wrap.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSONPathOptions]
  }
}

