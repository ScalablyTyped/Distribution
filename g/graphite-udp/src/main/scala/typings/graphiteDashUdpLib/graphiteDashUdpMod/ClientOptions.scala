package typings
package graphiteDashUdpLib.graphiteDashUdpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientOptions extends js.Object {
  /**
  	 * called when metrics are sent
  	 * Defaults to null
  	 */
  var callback: js.UndefOr[js.Function2[/* error */ stdLib.Error, /* metrics */ js.Any, scala.Unit]] = js.undefined
  /**
  	 * graphite server host or ip
  	 * Defaults to 127.0.0.1
  	 */
  var host: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Interval to group metrics by in milliseconds
  	 * Defaults to 5000 (5s)
  	 */
  var interval: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * split into smaller UDP packets
  	 * Defaults to 4096
  	 */
  var maxPacketSize: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * graphite server udp port
  	 * Defaults to 2003
  	 */
  var port: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Prefix for each metric name
  	 * Defaults to ''
  	 */
  var prefix: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Suffix for each metrtic name
  	 * Defaults to ''
  	 */
  var suffix: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * udp type (udp4 or udp6)
  	 * Defaults to udp4
  	 */
  var `type`: js.UndefOr[
    graphiteDashUdpLib.graphiteDashUdpLibStrings.udp4 | graphiteDashUdpLib.graphiteDashUdpLibStrings.udp6
  ] = js.undefined
  /**
  	 * log messages to console
  	 * Defaults to false
  	 */
  var verbose: js.UndefOr[scala.Boolean] = js.undefined
}

object ClientOptions {
  @scala.inline
  def apply(
    callback: (/* error */ stdLib.Error, /* metrics */ js.Any) => scala.Unit = null,
    host: java.lang.String = null,
    interval: scala.Int | scala.Double = null,
    maxPacketSize: scala.Int | scala.Double = null,
    port: scala.Int | scala.Double = null,
    prefix: java.lang.String = null,
    suffix: java.lang.String = null,
    `type`: graphiteDashUdpLib.graphiteDashUdpLibStrings.udp4 | graphiteDashUdpLib.graphiteDashUdpLibStrings.udp6 = null,
    verbose: js.UndefOr[scala.Boolean] = js.undefined
  ): ClientOptions = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction2(callback))
    if (host != null) __obj.updateDynamic("host")(host)
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (maxPacketSize != null) __obj.updateDynamic("maxPacketSize")(maxPacketSize.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (suffix != null) __obj.updateDynamic("suffix")(suffix)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose)
    __obj.asInstanceOf[ClientOptions]
  }
}

