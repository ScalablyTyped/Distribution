package typings.httpDashGracefulDashShutdown.httpDashGracefulDashShutdownMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var development: js.UndefOr[Boolean] = js.undefined
  var `finally`: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onShutdown: js.UndefOr[js.Function1[/* signal */ String, js.Promise[Unit]]] = js.undefined
  var signals: js.UndefOr[String] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    development: js.UndefOr[Boolean] = js.undefined,
    `finally`: () => Unit = null,
    onShutdown: /* signal */ String => js.Promise[Unit] = null,
    signals: String = null,
    timeout: Int | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(development)) __obj.updateDynamic("development")(development.asInstanceOf[js.Any])
    if (`finally` != null) __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    if (onShutdown != null) __obj.updateDynamic("onShutdown")(js.Any.fromFunction1(onShutdown))
    if (signals != null) __obj.updateDynamic("signals")(signals.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

