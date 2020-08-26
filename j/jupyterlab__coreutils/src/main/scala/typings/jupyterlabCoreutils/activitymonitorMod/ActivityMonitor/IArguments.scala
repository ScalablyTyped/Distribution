package typings.jupyterlabCoreutils.activitymonitorMod.ActivityMonitor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The argument object for an activity timeout.
  *
  */
@js.native
trait IArguments[Sender, Args] extends js.Object {
  /**
    * The most recent argument object.
    */
  var args: Args = js.native
  /**
    * The most recent sender object.
    */
  var sender: Sender = js.native
}

object IArguments {
  @scala.inline
  def apply[Sender, Args](args: Args, sender: Sender): IArguments[Sender, Args] = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[IArguments[Sender, Args]]
  }
  @scala.inline
  implicit class IArgumentsOps[Self <: IArguments[_, _], Sender, Args] (val x: Self with (IArguments[Sender, Args])) extends AnyVal {
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
    def setArgs(value: Args): Self = this.set("args", value.asInstanceOf[js.Any])
    @scala.inline
    def setSender(value: Sender): Self = this.set("sender", value.asInstanceOf[js.Any])
  }
  
}

