package typings.log4js.log4jsMod

import typings.log4js.log4jsStrings.fileSync
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SyncfileAppender extends Appender {
  // (default value = 5) - the number of old log files to keep during log rolling.
  var backups: js.UndefOr[Double] = js.undefined
  // the path of the file where you want your logs written.
  var filename: String
  // defaults to basic layout
  var layout: js.UndefOr[Layout] = js.undefined
  // the maximum size (in bytes) for the log file. If not specified, then no log rolling will happen.
  var maxLogSize: js.UndefOr[Double | String] = js.undefined
  var `type`: fileSync
}

object SyncfileAppender {
  @scala.inline
  def apply(
    filename: String,
    `type`: fileSync,
    backups: Int | Double = null,
    layout: Layout = null,
    maxLogSize: Double | String = null
  ): SyncfileAppender = {
    val __obj = js.Dynamic.literal(filename = filename)
    __obj.updateDynamic("type")(`type`)
    if (backups != null) __obj.updateDynamic("backups")(backups.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout)
    if (maxLogSize != null) __obj.updateDynamic("maxLogSize")(maxLogSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyncfileAppender]
  }
}

