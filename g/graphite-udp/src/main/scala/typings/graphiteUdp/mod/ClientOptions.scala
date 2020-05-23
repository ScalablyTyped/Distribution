package typings.graphiteUdp.mod

import typings.graphiteUdp.graphiteUdpStrings.udp4
import typings.graphiteUdp.graphiteUdpStrings.udp6
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientOptions extends js.Object {
  /**
    * called when metrics are sent
    * Defaults to null
    */
  var callback: js.UndefOr[js.Function2[/* error */ Error, /* metrics */ js.Any, Unit]] = js.undefined
  /**
    * graphite server host or ip
    * Defaults to 127.0.0.1
    */
  var host: js.UndefOr[String] = js.undefined
  /**
    * Interval to group metrics by in milliseconds
    * Defaults to 5000 (5s)
    */
  var interval: js.UndefOr[Double] = js.undefined
  /**
    * split into smaller UDP packets
    * Defaults to 4096
    */
  var maxPacketSize: js.UndefOr[Double] = js.undefined
  /**
    * graphite server udp port
    * Defaults to 2003
    */
  var port: js.UndefOr[Double] = js.undefined
  /**
    * Prefix for each metric name
    * Defaults to ''
    */
  var prefix: js.UndefOr[String] = js.undefined
  /**
    * Suffix for each metrtic name
    * Defaults to ''
    */
  var suffix: js.UndefOr[String] = js.undefined
  /**
    * udp type (udp4 or udp6)
    * Defaults to udp4
    */
  var `type`: js.UndefOr[udp4 | udp6] = js.undefined
  /**
    * log messages to console
    * Defaults to false
    */
  var verbose: js.UndefOr[Boolean] = js.undefined
}

object ClientOptions {
  @scala.inline
  def apply(
    callback: (/* error */ Error, /* metrics */ js.Any) => Unit = null,
    host: String = null,
    interval: js.UndefOr[Double] = js.undefined,
    maxPacketSize: js.UndefOr[Double] = js.undefined,
    port: js.UndefOr[Double] = js.undefined,
    prefix: String = null,
    suffix: String = null,
    `type`: udp4 | udp6 = null,
    verbose: js.UndefOr[Boolean] = js.undefined
  ): ClientOptions = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction2(callback))
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (!js.isUndefined(interval)) __obj.updateDynamic("interval")(interval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxPacketSize)) __obj.updateDynamic("maxPacketSize")(maxPacketSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (suffix != null) __obj.updateDynamic("suffix")(suffix.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientOptions]
  }
}

