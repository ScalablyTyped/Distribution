package typings.jupyterlabCoreutils.activitymonitorMod.ActivityMonitor

import typings.luminoSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to construct a new `ActivityMonitor`.
  */
@js.native
trait IOptions[Sender, Args] extends js.Object {
  /**
    * The signal to monitor.
    */
  var signal: ISignal[Sender, Args] = js.native
  /**
    * The activity timeout in milliseconds.
    *
    * The default is 1 second.
    */
  var timeout: js.UndefOr[Double] = js.native
}

object IOptions {
  @scala.inline
  def apply[Sender, Args](signal: ISignal[Sender, Args]): IOptions[Sender, Args] = {
    val __obj = js.Dynamic.literal(signal = signal.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions[Sender, Args]]
  }
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions[_, _], Sender, Args] (val x: Self with (IOptions[Sender, Args])) extends AnyVal {
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
    def setSignal(value: ISignal[Sender, Args]): Self = this.set("signal", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}

