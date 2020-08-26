package typings.httpProxy.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProxyTargetDetailed extends js.Object {
  var ca: js.UndefOr[String] = js.native
  var cert: js.UndefOr[String] = js.native
  var ciphers: js.UndefOr[String] = js.native
  var host: String = js.native
  var hostname: js.UndefOr[String] = js.native
  var key: js.UndefOr[String] = js.native
  var passphrase: js.UndefOr[String] = js.native
  var pfx: js.UndefOr[Buffer | String] = js.native
  var port: Double = js.native
  var protocol: js.UndefOr[String] = js.native
  var secureProtocol: js.UndefOr[String] = js.native
  var socketPath: js.UndefOr[String] = js.native
}

object ProxyTargetDetailed {
  @scala.inline
  def apply(host: String, port: Double): ProxyTargetDetailed = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProxyTargetDetailed]
  }
  @scala.inline
  implicit class ProxyTargetDetailedOps[Self <: ProxyTargetDetailed] (val x: Self) extends AnyVal {
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
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def setCa(value: String): Self = this.set("ca", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCa: Self = this.set("ca", js.undefined)
    @scala.inline
    def setCert(value: String): Self = this.set("cert", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCert: Self = this.set("cert", js.undefined)
    @scala.inline
    def setCiphers(value: String): Self = this.set("ciphers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCiphers: Self = this.set("ciphers", js.undefined)
    @scala.inline
    def setHostname(value: String): Self = this.set("hostname", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHostname: Self = this.set("hostname", js.undefined)
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setPassphrase(value: String): Self = this.set("passphrase", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassphrase: Self = this.set("passphrase", js.undefined)
    @scala.inline
    def setPfx(value: Buffer | String): Self = this.set("pfx", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePfx: Self = this.set("pfx", js.undefined)
    @scala.inline
    def setProtocol(value: String): Self = this.set("protocol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
    @scala.inline
    def setSecureProtocol(value: String): Self = this.set("secureProtocol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecureProtocol: Self = this.set("secureProtocol", js.undefined)
    @scala.inline
    def setSocketPath(value: String): Self = this.set("socketPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSocketPath: Self = this.set("socketPath", js.undefined)
  }
  
}

