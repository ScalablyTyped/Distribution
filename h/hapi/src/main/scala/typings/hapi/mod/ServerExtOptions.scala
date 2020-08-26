package typings.hapi.mod

import typings.hapi.hapiStrings.plugin
import typings.hapi.hapiStrings.server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerExtOptions extends js.Object {
  /**
    * a string or array of strings of plugin names this method must execute after (on the same event). Otherwise, extension methods are executed in the order added.
    */
  var after: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * a string or array of strings of plugin names this method must execute before (on the same event). Otherwise, extension methods are executed in the order added.
    */
  var before: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * a context object passed back to the provided method (via this) when called. Ignored if the method is an arrow function.
    */
  var bind: js.UndefOr[js.Object] = js.native
  /**
    * if set to 'plugin' when adding a request extension points the extension is only added to routes defined by the current plugin. Not allowed when configuring route-level extensions, or when
    * adding server extensions. Defaults to 'server' which applies to any route added to the server the extension is added to.
    */
  var sandbox: js.UndefOr[server | plugin] = js.native
}

object ServerExtOptions {
  @scala.inline
  def apply(): ServerExtOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerExtOptions]
  }
  @scala.inline
  implicit class ServerExtOptionsOps[Self <: ServerExtOptions] (val x: Self) extends AnyVal {
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
    def setAfterVarargs(value: String*): Self = this.set("after", js.Array(value :_*))
    @scala.inline
    def setAfter(value: String | js.Array[String]): Self = this.set("after", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfter: Self = this.set("after", js.undefined)
    @scala.inline
    def setBeforeVarargs(value: String*): Self = this.set("before", js.Array(value :_*))
    @scala.inline
    def setBefore(value: String | js.Array[String]): Self = this.set("before", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBefore: Self = this.set("before", js.undefined)
    @scala.inline
    def setBind(value: js.Object): Self = this.set("bind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBind: Self = this.set("bind", js.undefined)
    @scala.inline
    def setSandbox(value: server | plugin): Self = this.set("sandbox", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSandbox: Self = this.set("sandbox", js.undefined)
  }
  
}

