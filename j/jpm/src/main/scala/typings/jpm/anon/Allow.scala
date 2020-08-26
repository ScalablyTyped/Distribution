package typings.jpm.anon

import typings.jpm.jpmStrings.end
import typings.jpm.jpmStrings.ready
import typings.jpm.jpmStrings.start
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Allow extends js.Object {
  var allow: js.UndefOr[Script] = js.native
  var contentScript: js.UndefOr[String | js.Array[String]] = js.native
  var contentScriptFile: js.UndefOr[String | js.Array[String]] = js.native
  var contentScriptOptions: js.UndefOr[js.Any] = js.native
  var contentScriptWhen: js.UndefOr[start | ready | end] = js.native
  var contentURL: js.UndefOr[String] = js.native
  var include: js.UndefOr[String | (js.Array[RegExp | String]) | RegExp] = js.native
  var onMessage: js.UndefOr[js.Function1[/* message */ String, _]] = js.native
}

object Allow {
  @scala.inline
  def apply(): Allow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Allow]
  }
  @scala.inline
  implicit class AllowOps[Self <: Allow] (val x: Self) extends AnyVal {
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
    def setAllow(value: Script): Self = this.set("allow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllow: Self = this.set("allow", js.undefined)
    @scala.inline
    def setContentScriptVarargs(value: String*): Self = this.set("contentScript", js.Array(value :_*))
    @scala.inline
    def setContentScript(value: String | js.Array[String]): Self = this.set("contentScript", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentScript: Self = this.set("contentScript", js.undefined)
    @scala.inline
    def setContentScriptFileVarargs(value: String*): Self = this.set("contentScriptFile", js.Array(value :_*))
    @scala.inline
    def setContentScriptFile(value: String | js.Array[String]): Self = this.set("contentScriptFile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentScriptFile: Self = this.set("contentScriptFile", js.undefined)
    @scala.inline
    def setContentScriptOptions(value: js.Any): Self = this.set("contentScriptOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentScriptOptions: Self = this.set("contentScriptOptions", js.undefined)
    @scala.inline
    def setContentScriptWhen(value: start | ready | end): Self = this.set("contentScriptWhen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentScriptWhen: Self = this.set("contentScriptWhen", js.undefined)
    @scala.inline
    def setContentURL(value: String): Self = this.set("contentURL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentURL: Self = this.set("contentURL", js.undefined)
    @scala.inline
    def setIncludeVarargs(value: (RegExp | String)*): Self = this.set("include", js.Array(value :_*))
    @scala.inline
    def setInclude(value: String | (js.Array[RegExp | String]) | RegExp): Self = this.set("include", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInclude: Self = this.set("include", js.undefined)
    @scala.inline
    def setOnMessage(value: /* message */ String => _): Self = this.set("onMessage", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMessage: Self = this.set("onMessage", js.undefined)
  }
  
}

