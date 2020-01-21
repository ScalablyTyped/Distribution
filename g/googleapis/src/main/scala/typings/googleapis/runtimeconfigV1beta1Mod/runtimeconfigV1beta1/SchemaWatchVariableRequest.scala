package typings.googleapis.runtimeconfigV1beta1Mod.runtimeconfigV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request for the `WatchVariable()` method.
  */
@js.native
trait SchemaWatchVariableRequest extends js.Object {
  /**
    * If specified, checks the current timestamp of the variable and if the
    * current timestamp is newer than `newerThan` timestamp, the method returns
    * immediately.  If not specified or the variable has an older timestamp,
    * the watcher waits for a the value to change before returning.
    */
  var newerThan: js.UndefOr[String] = js.native
}

object SchemaWatchVariableRequest {
  @scala.inline
  def apply(newerThan: String = null): SchemaWatchVariableRequest = {
    val __obj = js.Dynamic.literal()
    if (newerThan != null) __obj.updateDynamic("newerThan")(newerThan.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaWatchVariableRequest]
  }
}

