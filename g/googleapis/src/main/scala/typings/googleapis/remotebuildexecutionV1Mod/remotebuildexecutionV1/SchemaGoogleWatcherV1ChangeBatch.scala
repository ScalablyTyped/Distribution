package typings.googleapis.remotebuildexecutionV1Mod.remotebuildexecutionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A batch of Change messages.
  */
@js.native
trait SchemaGoogleWatcherV1ChangeBatch extends js.Object {
  /**
    * A list of Change messages.
    */
  var changes: js.UndefOr[js.Array[SchemaGoogleWatcherV1Change]] = js.native
}

object SchemaGoogleWatcherV1ChangeBatch {
  @scala.inline
  def apply(changes: js.Array[SchemaGoogleWatcherV1Change] = null): SchemaGoogleWatcherV1ChangeBatch = {
    val __obj = js.Dynamic.literal()
    if (changes != null) __obj.updateDynamic("changes")(changes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleWatcherV1ChangeBatch]
  }
}

