package typings.jupyterlabCoreutils.activitymonitorMod.ActivityMonitor

import typings.luminoSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to construct a new `ActivityMonitor`.
  */
trait IOptions[Sender, Args] extends js.Object {
  /**
    * The signal to monitor.
    */
  var signal: ISignal[Sender, Args]
  /**
    * The activity timeout in milliseconds.
    *
    * The default is 1 second.
    */
  var timeout: js.UndefOr[Double] = js.undefined
}

object IOptions {
  @scala.inline
  def apply[Sender, Args](signal: ISignal[Sender, Args], timeout: Int | Double = null): IOptions[Sender, Args] = {
    val __obj = js.Dynamic.literal(signal = signal.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions[Sender, Args]]
  }
}

