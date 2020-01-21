package typings.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Message for specifying the start activities to crawl.
  */
@js.native
trait SchemaRoboStartingIntent extends js.Object {
  var launcherActivity: js.UndefOr[SchemaLauncherActivityIntent] = js.native
  var startActivity: js.UndefOr[SchemaStartActivityIntent] = js.native
  /**
    * Timeout in seconds for each intent.
    */
  var timeout: js.UndefOr[String] = js.native
}

object SchemaRoboStartingIntent {
  @scala.inline
  def apply(
    launcherActivity: SchemaLauncherActivityIntent = null,
    startActivity: SchemaStartActivityIntent = null,
    timeout: String = null
  ): SchemaRoboStartingIntent = {
    val __obj = js.Dynamic.literal()
    if (launcherActivity != null) __obj.updateDynamic("launcherActivity")(launcherActivity.asInstanceOf[js.Any])
    if (startActivity != null) __obj.updateDynamic("startActivity")(startActivity.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRoboStartingIntent]
  }
}

