package typings.jestDevServer.anon

import typings.std.Record
import typings.waitOn.mod.HttpSignature
import typings.waitOn.mod.WaitOnAuth
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<wait-on.wait-on.WaitOnOptions> */
@js.native
trait PartialWaitOnOptions extends js.Object {
  var auth: js.UndefOr[WaitOnAuth] = js.native
  var delay: js.UndefOr[Double] = js.native
  var followAllRedirects: js.UndefOr[Boolean] = js.native
  var followRedirect: js.UndefOr[Boolean] = js.native
  var headers: js.UndefOr[Record[String, _]] = js.native
  var httpSignature: js.UndefOr[HttpSignature] = js.native
  var httpTimeout: js.UndefOr[Double] = js.native
  var interval: js.UndefOr[Double] = js.native
  var log: js.UndefOr[Boolean] = js.native
  var resources: js.UndefOr[js.Array[String]] = js.native
  var reverse: js.UndefOr[Boolean] = js.native
  var simultaneous: js.UndefOr[Double] = js.native
  var strictSSL: js.UndefOr[Boolean] = js.native
  var tcpTimeout: js.UndefOr[Double] = js.native
  var timeout: js.UndefOr[Double] = js.native
  var verbose: js.UndefOr[Boolean] = js.native
  var window: js.UndefOr[Double] = js.native
}

object PartialWaitOnOptions {
  @scala.inline
  def apply(): PartialWaitOnOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialWaitOnOptions]
  }
  @scala.inline
  implicit class PartialWaitOnOptionsOps[Self <: PartialWaitOnOptions] (val x: Self) extends AnyVal {
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
    def setAuth(value: WaitOnAuth): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    @scala.inline
    def setFollowAllRedirects(value: Boolean): Self = this.set("followAllRedirects", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFollowAllRedirects: Self = this.set("followAllRedirects", js.undefined)
    @scala.inline
    def setFollowRedirect(value: Boolean): Self = this.set("followRedirect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFollowRedirect: Self = this.set("followRedirect", js.undefined)
    @scala.inline
    def setHeaders(value: Record[String, _]): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setHttpSignature(value: HttpSignature): Self = this.set("httpSignature", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHttpSignature: Self = this.set("httpSignature", js.undefined)
    @scala.inline
    def setHttpTimeout(value: Double): Self = this.set("httpTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHttpTimeout: Self = this.set("httpTimeout", js.undefined)
    @scala.inline
    def setInterval(value: Double): Self = this.set("interval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
    @scala.inline
    def setLog(value: Boolean): Self = this.set("log", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLog: Self = this.set("log", js.undefined)
    @scala.inline
    def setResourcesVarargs(value: String*): Self = this.set("resources", js.Array(value :_*))
    @scala.inline
    def setResources(value: js.Array[String]): Self = this.set("resources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResources: Self = this.set("resources", js.undefined)
    @scala.inline
    def setReverse(value: Boolean): Self = this.set("reverse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReverse: Self = this.set("reverse", js.undefined)
    @scala.inline
    def setSimultaneous(value: Double): Self = this.set("simultaneous", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSimultaneous: Self = this.set("simultaneous", js.undefined)
    @scala.inline
    def setStrictSSL(value: Boolean): Self = this.set("strictSSL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrictSSL: Self = this.set("strictSSL", js.undefined)
    @scala.inline
    def setTcpTimeout(value: Double): Self = this.set("tcpTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTcpTimeout: Self = this.set("tcpTimeout", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    @scala.inline
    def setVerbose(value: Boolean): Self = this.set("verbose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerbose: Self = this.set("verbose", js.undefined)
    @scala.inline
    def setWindow(value: Double): Self = this.set("window", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWindow: Self = this.set("window", js.undefined)
  }
  
}

