package typings.jqueryClientsidelogging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientSideLoggingObject extends js.Object {
          // The variable to send the log message through as.
  var client_info: js.UndefOr[ClientSideLoggingClientInfoObject] = js.native
  var error_url: js.UndefOr[String] = js.native
      // Whether or not to send native js errors as well (using window.onerror).
  var hijack_console: js.UndefOr[Boolean] = js.native
          // The url to which errors logs are sent
  var info_url: js.UndefOr[String] = js.native
          // The url to which standard logs are sent
  var log_level: js.UndefOr[Double] = js.native
          // The url to which info logs are sent
  var log_url: js.UndefOr[String] = js.native
          // The level at which to log. This allows you to keep the calls to the logging in your code and just change this variable to log varying degrees. 1 = only error, 2 = error & log, 3 = error, log & info
  var native_error: js.UndefOr[Boolean] = js.native
      // Hijacks the default console functionality (ie: all your console.error/info/log are belong to us).
  var query_var: js.UndefOr[String] = js.native
}

object ClientSideLoggingObject {
  @scala.inline
  def apply(): ClientSideLoggingObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientSideLoggingObject]
  }
  @scala.inline
  implicit class ClientSideLoggingObjectOps[Self <: ClientSideLoggingObject] (val x: Self) extends AnyVal {
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
    def setClient_info(value: ClientSideLoggingClientInfoObject): Self = this.set("client_info", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClient_info: Self = this.set("client_info", js.undefined)
    @scala.inline
    def setError_url(value: String): Self = this.set("error_url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError_url: Self = this.set("error_url", js.undefined)
    @scala.inline
    def setHijack_console(value: Boolean): Self = this.set("hijack_console", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHijack_console: Self = this.set("hijack_console", js.undefined)
    @scala.inline
    def setInfo_url(value: String): Self = this.set("info_url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInfo_url: Self = this.set("info_url", js.undefined)
    @scala.inline
    def setLog_level(value: Double): Self = this.set("log_level", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLog_level: Self = this.set("log_level", js.undefined)
    @scala.inline
    def setLog_url(value: String): Self = this.set("log_url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLog_url: Self = this.set("log_url", js.undefined)
    @scala.inline
    def setNative_error(value: Boolean): Self = this.set("native_error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNative_error: Self = this.set("native_error", js.undefined)
    @scala.inline
    def setQuery_var(value: String): Self = this.set("query_var", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuery_var: Self = this.set("query_var", js.undefined)
  }
  
}

