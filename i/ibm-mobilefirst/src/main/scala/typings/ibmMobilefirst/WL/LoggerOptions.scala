package typings.ibmMobilefirst.WL

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoggerOptions extends js.Object {
  var autoSendLogs: js.UndefOr[Boolean] = js.native
  /**
    * @deprecated since version 6.2. use filters instead.
    */
  var blacklist: js.UndefOr[js.Array[String]] = js.native
  var callback: js.UndefOr[LoggerCallback] = js.native
  var capture: js.UndefOr[Boolean] = js.native
  var filters: js.UndefOr[Filter] = js.native
  var level: js.UndefOr[js.Array[String] | String | Double] = js.native
  var maxFileSize: js.UndefOr[Double] = js.native
  var pkg: js.UndefOr[String] = js.native
  var pretty: js.UndefOr[Boolean] = js.native
  var stacktrace: js.UndefOr[Boolean] = js.native
  var stringify: js.UndefOr[Boolean] = js.native
  var tag: js.UndefOr[Tag] = js.native
  /**
    * @deprecated since version 6.2. use filters instead.
    */
  var whitelist: js.UndefOr[js.Array[String]] = js.native
}

object LoggerOptions {
  @scala.inline
  def apply(): LoggerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoggerOptions]
  }
  @scala.inline
  implicit class LoggerOptionsOps[Self <: LoggerOptions] (val x: Self) extends AnyVal {
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
    def setAutoSendLogs(value: Boolean): Self = this.set("autoSendLogs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoSendLogs: Self = this.set("autoSendLogs", js.undefined)
    @scala.inline
    def setBlacklistVarargs(value: String*): Self = this.set("blacklist", js.Array(value :_*))
    @scala.inline
    def setBlacklist(value: js.Array[String]): Self = this.set("blacklist", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlacklist: Self = this.set("blacklist", js.undefined)
    @scala.inline
    def setCallback(value: (/* message */ String | js.Array[String], /* level */ String, /* package */ String) => Unit): Self = this.set("callback", js.Any.fromFunction3(value))
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    @scala.inline
    def setCapture(value: Boolean): Self = this.set("capture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCapture: Self = this.set("capture", js.undefined)
    @scala.inline
    def setFilters(value: Filter): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    @scala.inline
    def setLevelVarargs(value: String*): Self = this.set("level", js.Array(value :_*))
    @scala.inline
    def setLevel(value: js.Array[String] | String | Double): Self = this.set("level", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    @scala.inline
    def setMaxFileSize(value: Double): Self = this.set("maxFileSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxFileSize: Self = this.set("maxFileSize", js.undefined)
    @scala.inline
    def setPkg(value: String): Self = this.set("pkg", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePkg: Self = this.set("pkg", js.undefined)
    @scala.inline
    def setPretty(value: Boolean): Self = this.set("pretty", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePretty: Self = this.set("pretty", js.undefined)
    @scala.inline
    def setStacktrace(value: Boolean): Self = this.set("stacktrace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStacktrace: Self = this.set("stacktrace", js.undefined)
    @scala.inline
    def setStringify(value: Boolean): Self = this.set("stringify", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStringify: Self = this.set("stringify", js.undefined)
    @scala.inline
    def setTag(value: Tag): Self = this.set("tag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
    @scala.inline
    def setWhitelistVarargs(value: String*): Self = this.set("whitelist", js.Array(value :_*))
    @scala.inline
    def setWhitelist(value: js.Array[String]): Self = this.set("whitelist", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWhitelist: Self = this.set("whitelist", js.undefined)
  }
  
}

