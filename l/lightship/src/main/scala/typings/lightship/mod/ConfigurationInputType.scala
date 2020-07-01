package typings.lightship.mod

import typings.node.NodeJS.Signals
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigurationInputType extends js.Object {
  /**
    * Run Lightship in local mode when Kubernetes is not detected.
    * @default true.
    */
  var detectKubernetes: js.UndefOr[Boolean] = js.undefined
  /**
    * A number of milliseconds before forcefull termination if process does not gracefully exit.
    * The timer starts when `lightship.shutdown()` is called. This includes the time allowed to live beacons.
    * @default 60_000
    */
  var gracefulShutdownTimeout: js.UndefOr[Double] = js.undefined
  /**
    * The port on which the Lightship service listens. This port must be different than your main service port, if any.
    * @default 9000
    */
  var port: js.UndefOr[Double] = js.undefined
  /**
    * A number of milliseconds before forceful termination if shutdown handlers do not complete. The timer starts when the first shutdown handler is called.
    * @default 5000
    */
  var shutdownHandlerTimeout: js.UndefOr[Double] = js.undefined
  /**
    * An a array of [signal events](https://nodejs.org/api/process.html#process_signal_events).
    * @default [SIGTERM, SIGHUP, SIGINT].
    */
  var signals: js.UndefOr[js.Array[Signals]] = js.undefined
  /**
    * Method used to terminate Node.js process
    * @default `() => { process.exit(1) };`
    */
  var terminate: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object ConfigurationInputType {
  @scala.inline
  def apply(
    detectKubernetes: js.UndefOr[Boolean] = js.undefined,
    gracefulShutdownTimeout: js.UndefOr[Double] = js.undefined,
    port: js.UndefOr[Double] = js.undefined,
    shutdownHandlerTimeout: js.UndefOr[Double] = js.undefined,
    signals: js.Array[Signals] = null,
    terminate: () => Unit = null
  ): ConfigurationInputType = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(detectKubernetes)) __obj.updateDynamic("detectKubernetes")(detectKubernetes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(gracefulShutdownTimeout)) __obj.updateDynamic("gracefulShutdownTimeout")(gracefulShutdownTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shutdownHandlerTimeout)) __obj.updateDynamic("shutdownHandlerTimeout")(shutdownHandlerTimeout.get.asInstanceOf[js.Any])
    if (signals != null) __obj.updateDynamic("signals")(signals.asInstanceOf[js.Any])
    if (terminate != null) __obj.updateDynamic("terminate")(js.Any.fromFunction0(terminate))
    __obj.asInstanceOf[ConfigurationInputType]
  }
}

