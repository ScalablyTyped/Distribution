package typings
package lightshipLib.lightshipMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserConfigurationType extends js.Object {
  /* Run Iapetus only if service is detected ro be running in Kubernetes. Default: true. */
  var detectKubernetes: js.UndefOr[scala.Boolean] = js.undefined
  /* The port on which the Lightship service listens. This port must be different than your main service port, if any. The default port is 9000.*/
  var port: js.UndefOr[scala.Double] = js.undefined
  /* An a array of [signal events]{@link https://nodejs.org/api/process.html#process_signal_events}. Default: [SIGTERM]. */
  var signals: js.UndefOr[js.Array[nodeLib.NodeJSNs.Signals]] = js.undefined
  /* A number of milliseconds before force full termination. Default: 60000. */
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

object UserConfigurationType {
  @scala.inline
  def apply(
    detectKubernetes: js.UndefOr[scala.Boolean] = js.undefined,
    port: scala.Int | scala.Double = null,
    signals: js.Array[nodeLib.NodeJSNs.Signals] = null,
    timeout: scala.Int | scala.Double = null
  ): UserConfigurationType = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(detectKubernetes)) __obj.updateDynamic("detectKubernetes")(detectKubernetes)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (signals != null) __obj.updateDynamic("signals")(signals)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserConfigurationType]
  }
}

