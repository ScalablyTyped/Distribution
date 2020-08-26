package typings.jpm.anon

import typings.jpm.contextMenuMod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccessKey extends js.Object {
  var accessKey: js.UndefOr[String] = js.native
  var contentScript: js.UndefOr[String] = js.native
  var contentScriptFile: js.UndefOr[String] = js.native
  var context: js.UndefOr[Context | js.Array[Context]] = js.native
  var data: js.UndefOr[js.Any] = js.native
  var image: js.UndefOr[String] = js.native
  var label: String = js.native
  var onMessage: js.UndefOr[js.Function1[/* message */ js.UndefOr[js.Any], _]] = js.native
}

object AccessKey {
  @scala.inline
  def apply(label: String): AccessKey = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessKey]
  }
  @scala.inline
  implicit class AccessKeyOps[Self <: AccessKey] (val x: Self) extends AnyVal {
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
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccessKey(value: String): Self = this.set("accessKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessKey: Self = this.set("accessKey", js.undefined)
    @scala.inline
    def setContentScript(value: String): Self = this.set("contentScript", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentScript: Self = this.set("contentScript", js.undefined)
    @scala.inline
    def setContentScriptFile(value: String): Self = this.set("contentScriptFile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentScriptFile: Self = this.set("contentScriptFile", js.undefined)
    @scala.inline
    def setContextVarargs(value: Context*): Self = this.set("context", js.Array(value :_*))
    @scala.inline
    def setContext(value: Context | js.Array[Context]): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setImage(value: String): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    @scala.inline
    def setOnMessage(value: /* message */ js.UndefOr[js.Any] => _): Self = this.set("onMessage", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMessage: Self = this.set("onMessage", js.undefined)
  }
  
}

