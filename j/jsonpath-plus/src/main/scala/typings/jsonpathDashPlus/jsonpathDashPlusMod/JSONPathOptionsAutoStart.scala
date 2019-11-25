package typings.jsonpathDashPlus.jsonpathDashPlusMod

import typings.jsonpathDashPlus.jsonpathDashPlusNumbers.`false`
import typings.jsonpathDashPlus.jsonpathDashPlusStrings.all
import typings.jsonpathDashPlus.jsonpathDashPlusStrings.parent
import typings.jsonpathDashPlus.jsonpathDashPlusStrings.parentProperty
import typings.jsonpathDashPlus.jsonpathDashPlusStrings.path
import typings.jsonpathDashPlus.jsonpathDashPlusStrings.pointer
import typings.jsonpathDashPlus.jsonpathDashPlusStrings.value
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONPathOptionsAutoStart extends JSONPathOptions {
  @JSName("autostart")
  var autostart_JSONPathOptionsAutoStart: `false`
}

object JSONPathOptionsAutoStart {
  @scala.inline
  def apply(
    autostart: `false`,
    path: String | js.Array[_],
    callback: (/* payload */ js.Any, /* payloadType */ js.Any, /* fullPayload */ js.Any) => js.Any = null,
    flatten: js.UndefOr[Boolean] = js.undefined,
    json: Boolean | Double | String | js.Object | js.Array[_] = null,
    otherTypeCallback: /* repeated */ js.Any => Unit = null,
    parent: js.Any = null,
    parentProperty: js.Any = null,
    preventEval: js.UndefOr[Boolean] = js.undefined,
    resultType: value | path | pointer | parent | parentProperty | all = null,
    sandbox: Map[String, _] = null,
    wrap: js.UndefOr[Boolean] = js.undefined
  ): JSONPathOptionsAutoStart = {
    val __obj = js.Dynamic.literal(autostart = autostart.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction3(callback))
    if (!js.isUndefined(flatten)) __obj.updateDynamic("flatten")(flatten.asInstanceOf[js.Any])
    if (json != null) __obj.updateDynamic("json")(json.asInstanceOf[js.Any])
    if (otherTypeCallback != null) __obj.updateDynamic("otherTypeCallback")(js.Any.fromFunction1(otherTypeCallback))
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (parentProperty != null) __obj.updateDynamic("parentProperty")(parentProperty.asInstanceOf[js.Any])
    if (!js.isUndefined(preventEval)) __obj.updateDynamic("preventEval")(preventEval.asInstanceOf[js.Any])
    if (resultType != null) __obj.updateDynamic("resultType")(resultType.asInstanceOf[js.Any])
    if (sandbox != null) __obj.updateDynamic("sandbox")(sandbox.asInstanceOf[js.Any])
    if (!js.isUndefined(wrap)) __obj.updateDynamic("wrap")(wrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSONPathOptionsAutoStart]
  }
}

