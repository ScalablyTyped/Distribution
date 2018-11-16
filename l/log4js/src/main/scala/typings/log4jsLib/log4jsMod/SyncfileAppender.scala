package typings
package log4jsLib.log4jsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SyncfileAppender extends js.Object {
  // (default value = 5) - the number of old log files to keep during log rolling.
  var backups: js.UndefOr[scala.Double] = js.undefined
  // the path of the file where you want your logs written.
  var filename: java.lang.String
  // defaults to basic layout
  var layout: js.UndefOr[Layout] = js.undefined
  // the maximum size (in bytes) for the log file. If not specified, then no log rolling will happen.
  var maxLogSize: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var `type`: log4jsLib.log4jsLibStrings.fileSync
}

