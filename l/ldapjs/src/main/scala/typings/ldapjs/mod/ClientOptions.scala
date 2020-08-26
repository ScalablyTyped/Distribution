package typings.ldapjs.mod

import typings.ldapjs.anon.FailAfter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientOptions extends js.Object {
  var bindCredentials: js.UndefOr[String] = js.native
  var bindDN: js.UndefOr[String] = js.native
  var connectTimeout: js.UndefOr[Double] = js.native
  var idleTimeout: js.UndefOr[Double] = js.native
  var log: js.UndefOr[js.Any] = js.native
  var queueDisable: js.UndefOr[Boolean] = js.native
  var queueSize: js.UndefOr[Double] = js.native
  var queueTimeout: js.UndefOr[Double] = js.native
  var reconnect: js.UndefOr[Boolean | FailAfter] = js.native
  var socketPath: js.UndefOr[String] = js.native
  var strictDN: js.UndefOr[Boolean] = js.native
  var timeout: js.UndefOr[Double] = js.native
  var tlsOptions: js.UndefOr[js.Object] = js.native
  var url: String = js.native
}

object ClientOptions {
  @scala.inline
  def apply(url: String): ClientOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientOptions]
  }
  @scala.inline
  implicit class ClientOptionsOps[Self <: ClientOptions] (val x: Self) extends AnyVal {
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
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setBindCredentials(value: String): Self = this.set("bindCredentials", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBindCredentials: Self = this.set("bindCredentials", js.undefined)
    @scala.inline
    def setBindDN(value: String): Self = this.set("bindDN", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBindDN: Self = this.set("bindDN", js.undefined)
    @scala.inline
    def setConnectTimeout(value: Double): Self = this.set("connectTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectTimeout: Self = this.set("connectTimeout", js.undefined)
    @scala.inline
    def setIdleTimeout(value: Double): Self = this.set("idleTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdleTimeout: Self = this.set("idleTimeout", js.undefined)
    @scala.inline
    def setLog(value: js.Any): Self = this.set("log", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLog: Self = this.set("log", js.undefined)
    @scala.inline
    def setQueueDisable(value: Boolean): Self = this.set("queueDisable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueueDisable: Self = this.set("queueDisable", js.undefined)
    @scala.inline
    def setQueueSize(value: Double): Self = this.set("queueSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueueSize: Self = this.set("queueSize", js.undefined)
    @scala.inline
    def setQueueTimeout(value: Double): Self = this.set("queueTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueueTimeout: Self = this.set("queueTimeout", js.undefined)
    @scala.inline
    def setReconnect(value: Boolean | FailAfter): Self = this.set("reconnect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReconnect: Self = this.set("reconnect", js.undefined)
    @scala.inline
    def setSocketPath(value: String): Self = this.set("socketPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSocketPath: Self = this.set("socketPath", js.undefined)
    @scala.inline
    def setStrictDN(value: Boolean): Self = this.set("strictDN", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrictDN: Self = this.set("strictDN", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    @scala.inline
    def setTlsOptions(value: js.Object): Self = this.set("tlsOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTlsOptions: Self = this.set("tlsOptions", js.undefined)
  }
  
}

