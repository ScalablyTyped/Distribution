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

@js.native
trait JSONPathOptions extends js.Object {
  /**
    * If this is supplied as false, one may call the evaluate method
    *  manually.
    *
    * @default true
    */
  var autostart: js.UndefOr[Boolean] = js.native
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
  var callback: js.UndefOr[JSONPathCallback] = js.native
  /**
    * Whether the returned array of results will be flattened to a
    *   single dimension array.
    *
    * @default false
    */
  var flatten: js.UndefOr[Boolean] = js.native
  /**
    * The JSON object to evaluate (whether of null, boolean, number,
    *   string, object, or array type).
    */
  var json: Null | Boolean | Double | String | js.Object | js.Array[_] = js.native
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
  var otherTypeCallback: js.UndefOr[JSONPathOtherTypeCallback] = js.native
  /**
    * In the event that a query could be made to return the root node,
    * this allows the parent of that root node to be returned within results.
    *
    * @default null
    */
  var parent: js.UndefOr[Null | js.Any] = js.native
  /**
    * In the event that a query could be made to return the root node,
    * this allows the parentProperty of that root node to be returned within
    * results.
    *
    * @default null
    */
  var parentProperty: js.UndefOr[Null | js.Any] = js.native
  /**
    * The JSONPath expression as a (normalized or unnormalized) string or
    *   array.
    */
  var path: String | js.Array[_] = js.native
  /**
    * Although JavaScript evaluation expressions are allowed by default,
    * for security reasons (if one is operating on untrusted user input,
    * for example), one may wish to set this option to true to throw
    * exceptions when these expressions are attempted.
    *
    * @default false
    */
  var preventEval: js.UndefOr[Boolean] = js.native
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
  var resultType: js.UndefOr[value | path | pointer | parent | parentProperty | all] = js.native
  /**
    * Key-value map of variables to be available to code evaluations such
    *   as filtering expressions.
    * (Note that the current path and value will also be available to those
    *   expressions; see the Syntax section for details.)
    */
  var sandbox: js.UndefOr[Map[String, _]] = js.native
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
  var wrap: js.UndefOr[Boolean] = js.native
}

object JSONPathOptions {
  @scala.inline
  def apply(path: String | js.Array[_]): JSONPathOptions = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSONPathOptions]
  }
  @scala.inline
  implicit class JSONPathOptionsOps[Self <: JSONPathOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPathVarargs(value: js.Any*): Self = this.set("path", js.Array(value :_*))
    @scala.inline
    def setPath(value: String | js.Array[_]): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutostart(value: Boolean): Self = this.set("autostart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutostart: Self = this.set("autostart", js.undefined)
    @scala.inline
    def setCallback(value: (/* payload */ js.Any, /* payloadType */ js.Any, /* fullPayload */ js.Any) => js.Any): Self = this.set("callback", js.Any.fromFunction3(value))
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    @scala.inline
    def setFlatten(value: Boolean): Self = this.set("flatten", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlatten: Self = this.set("flatten", js.undefined)
    @scala.inline
    def setJsonVarargs(value: js.Any*): Self = this.set("json", js.Array(value :_*))
    @scala.inline
    def setJson(value: Boolean | Double | String | js.Object | js.Array[_]): Self = this.set("json", value.asInstanceOf[js.Any])
    @scala.inline
    def setJsonNull: Self = this.set("json", null)
    @scala.inline
    def setOtherTypeCallback(value: /* repeated */ js.Any => Unit): Self = this.set("otherTypeCallback", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOtherTypeCallback: Self = this.set("otherTypeCallback", js.undefined)
    @scala.inline
    def setParent(value: js.Any): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    @scala.inline
    def setParentNull: Self = this.set("parent", null)
    @scala.inline
    def setParentProperty(value: js.Any): Self = this.set("parentProperty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentProperty: Self = this.set("parentProperty", js.undefined)
    @scala.inline
    def setParentPropertyNull: Self = this.set("parentProperty", null)
    @scala.inline
    def setPreventEval(value: Boolean): Self = this.set("preventEval", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreventEval: Self = this.set("preventEval", js.undefined)
    @scala.inline
    def setResultType(value: value | path | pointer | parent | parentProperty | all): Self = this.set("resultType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResultType: Self = this.set("resultType", js.undefined)
    @scala.inline
    def setSandbox(value: Map[String, _]): Self = this.set("sandbox", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSandbox: Self = this.set("sandbox", js.undefined)
    @scala.inline
    def setWrap(value: Boolean): Self = this.set("wrap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrap: Self = this.set("wrap", js.undefined)
  }
  
}

