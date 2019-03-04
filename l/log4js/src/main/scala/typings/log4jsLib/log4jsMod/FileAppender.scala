package typings
package log4jsLib.log4jsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileAppender extends Appender {
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

object FileAppender {
  @scala.inline
  def apply(
    filename: java.lang.String,
    `type`: log4jsLib.log4jsLibStrings.file,
    backups: scala.Int | scala.Double = null,
    compress: js.UndefOr[scala.Boolean] = js.undefined,
    encoding: java.lang.String = null,
    flags: java.lang.String = null,
    keepFileExt: js.UndefOr[scala.Boolean] = js.undefined,
    layout: Layout = null,
    maxLogSize: scala.Double | java.lang.String = null,
    mode: scala.Int | scala.Double = null,
    numBackups: scala.Int | scala.Double = null
  ): FileAppender = {
    val __obj = js.Dynamic.literal(filename = filename)
    __obj.updateDynamic("type")(`type`)
    if (backups != null) __obj.updateDynamic("backups")(backups.asInstanceOf[js.Any])
    if (!js.isUndefined(compress)) __obj.updateDynamic("compress")(compress)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (flags != null) __obj.updateDynamic("flags")(flags)
    if (!js.isUndefined(keepFileExt)) __obj.updateDynamic("keepFileExt")(keepFileExt)
    if (layout != null) __obj.updateDynamic("layout")(layout)
    if (maxLogSize != null) __obj.updateDynamic("maxLogSize")(maxLogSize.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (numBackups != null) __obj.updateDynamic("numBackups")(numBackups.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileAppender]
  }
}

