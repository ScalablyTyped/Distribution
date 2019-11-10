package typings.jsonpathDashPlus

import typings.jsonpathDashPlus.jsonpathDashPlusMod.JSONPathCallback
import typings.jsonpathDashPlus.jsonpathDashPlusMod.JSONPathOtherTypeCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Callback extends js.Object {
  var callback: js.UndefOr[JSONPathCallback] = js.undefined
  var json: Null | Boolean | Double | String | js.Object | js.Array[_]
  var otherTypeCallback: js.UndefOr[JSONPathOtherTypeCallback] = js.undefined
  var path: String | js.Array[_]
}

object Anon_Callback {
  @scala.inline
  def apply(
    path: String | js.Array[_],
    callback: (/* payload */ js.Any, /* payloadType */ js.Any, /* fullPayload */ js.Any) => js.Any = null,
    json: Boolean | Double | String | js.Object | js.Array[_] = null,
    otherTypeCallback: /* repeated */ js.Any => Unit = null
  ): Anon_Callback = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction3(callback))
    if (json != null) __obj.updateDynamic("json")(json.asInstanceOf[js.Any])
    if (otherTypeCallback != null) __obj.updateDynamic("otherTypeCallback")(js.Any.fromFunction1(otherTypeCallback))
    __obj.asInstanceOf[Anon_Callback]
  }
}

