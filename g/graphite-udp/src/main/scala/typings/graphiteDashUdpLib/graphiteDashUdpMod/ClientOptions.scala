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

