package typings
package log4jsLib.log4jsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait FileAppender extends js.Object {
  // (default value = 5) - the number of old log files to keep during log rolling.
  var backups: js.UndefOr[scala.Double] = js.undefined
  var compress: js.UndefOr[scala.Boolean] = js.undefined
  var encoding: js.UndefOr[java.lang.String] = js.undefined
  // the path of the file where you want your logs written.
  var filename: java.lang.String
  var flags: js.UndefOr[java.lang.String] = js.undefined
   // compress the backups
  // keep the file extension when rotating logs
  var keepFileExt: js.UndefOr[scala.Boolean] = js.undefined
  // defaults to basic layout
  var layout: js.UndefOr[Layout] = js.undefined
  // the maximum size (in bytes) for the log file. If not specified, then no log rolling will happen.
  var maxLogSize: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var mode: js.UndefOr[scala.Double] = js.undefined
  var numBackups: js.UndefOr[scala.Double] = js.undefined
  var `type`: log4jsLib.log4jsLibStrings.file
}

