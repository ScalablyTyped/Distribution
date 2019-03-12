package typings
package httpDashGracefulDashShutdownLib.httpDashGracefulDashShutdownMod.GracefulShutdownNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var development: js.UndefOr[scala.Boolean] = js.undefined
  var `finally`: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onShutdown: js.UndefOr[js.Function0[js.Promise[scala.Unit]]] = js.undefined
  var signals: js.UndefOr[java.lang.String] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    development: js.UndefOr[scala.Boolean] = js.undefined,
    `finally`: () => scala.Unit = null,
    onShutdown: () => js.Promise[scala.Unit] = null,
    signals: java.lang.String = null,
    timeout: scala.Int | scala.Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(development)) __obj.updateDynamic("development")(development)
    if (`finally` != null) __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    if (onShutdown != null) __obj.updateDynamic("onShutdown")(js.Any.fromFunction0(onShutdown))
    if (signals != null) __obj.updateDynamic("signals")(signals)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

