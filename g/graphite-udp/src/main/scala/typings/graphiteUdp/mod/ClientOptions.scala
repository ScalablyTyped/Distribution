package typings.graphiteUdp.mod

import typings.graphiteUdp.graphiteUdpStrings.udp4
import typings.graphiteUdp.graphiteUdpStrings.udp6
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientOptions extends js.Object {
  /**
    * called when metrics are sent
    * Defaults to null
    */
  var callback: js.UndefOr[js.Function2[/* error */ Error, /* metrics */ js.Any, Unit]] = js.native
  /**
    * graphite server host or ip
    * Defaults to 127.0.0.1
    */
  var host: js.UndefOr[String] = js.native
  /**
    * Interval to group metrics by in milliseconds
    * Defaults to 5000 (5s)
    */
  var interval: js.UndefOr[Double] = js.native
  /**
    * split into smaller UDP packets
    * Defaults to 4096
    */
  var maxPacketSize: js.UndefOr[Double] = js.native
  /**
    * graphite server udp port
    * Defaults to 2003
    */
  var port: js.UndefOr[Double] = js.native
  /**
    * Prefix for each metric name
    * Defaults to ''
    */
  var prefix: js.UndefOr[String] = js.native
  /**
    * Suffix for each metrtic name
    * Defaults to ''
    */
  var suffix: js.UndefOr[String] = js.native
  /**
    * udp type (udp4 or udp6)
    * Defaults to udp4
    */
  var `type`: js.UndefOr[udp4 | udp6] = js.native
  /**
    * log messages to console
    * Defaults to false
    */
  var verbose: js.UndefOr[Boolean] = js.native
}

object ClientOptions {
  @scala.inline
  def apply(): ClientOptions = {
    val __obj = js.Dynamic.literal()
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
    def setCallback(value: (/* error */ Error, /* metrics */ js.Any) => Unit): Self = this.set("callback", js.Any.fromFunction2(value))
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    @scala.inline
    def setInterval(value: Double): Self = this.set("interval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
    @scala.inline
    def setMaxPacketSize(value: Double): Self = this.set("maxPacketSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxPacketSize: Self = this.set("maxPacketSize", js.undefined)
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    @scala.inline
    def setSuffix(value: String): Self = this.set("suffix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuffix: Self = this.set("suffix", js.undefined)
    @scala.inline
    def setType(value: udp4 | udp6): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setVerbose(value: Boolean): Self = this.set("verbose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerbose: Self = this.set("verbose", js.undefined)
  }
  
}

