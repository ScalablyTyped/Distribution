package typings.jsonpathPlus.anon

import typings.jsonpathPlus.mod.JSONPathCallback
import typings.jsonpathPlus.mod.JSONPathOtherTypeCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Callback extends js.Object {
  var callback: js.UndefOr[JSONPathCallback] = js.native
  var json: Null | Boolean | Double | String | js.Object | js.Array[_] = js.native
  var otherTypeCallback: js.UndefOr[JSONPathOtherTypeCallback] = js.native
  var path: String | js.Array[_] = js.native
}

object Callback {
  @scala.inline
  def apply(path: String | js.Array[_]): Callback = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Callback]
  }
  @scala.inline
  implicit class CallbackOps[Self <: Callback] (val x: Self) extends AnyVal {
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
    def setCallback(value: (/* payload */ js.Any, /* payloadType */ js.Any, /* fullPayload */ js.Any) => js.Any): Self = this.set("callback", js.Any.fromFunction3(value))
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
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
  }
  
}

