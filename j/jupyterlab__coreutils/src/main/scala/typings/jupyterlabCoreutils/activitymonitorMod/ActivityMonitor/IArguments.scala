package typings.jupyterlabCoreutils.activitymonitorMod.ActivityMonitor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The argument object for an activity timeout.
  *
  */
trait IArguments[Sender, Args] extends js.Object {
  /**
    * The most recent argument object.
    */
  var args: Args
  /**
    * The most recent sender object.
    */
  var sender: Sender
}

object IArguments {
  @scala.inline
  def apply[Sender, Args](args: Args, sender: Sender): IArguments[Sender, Args] = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[IArguments[Sender, Args]]
  }
}

