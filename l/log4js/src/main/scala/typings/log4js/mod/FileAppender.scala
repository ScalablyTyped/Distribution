package typings.log4js.mod

import typings.log4js.log4jsStrings.file
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileAppender extends Appender {
  // (default value = 5) - the number of old log files to keep during log rolling.
  var backups: js.UndefOr[Double] = js.undefined
  var compress: js.UndefOr[Boolean] = js.undefined
  var encoding: js.UndefOr[String] = js.undefined
  // the path of the file where you want your logs written.
  var filename: String
  var flags: js.UndefOr[String] = js.undefined
   // compress the backups
  // keep the file extension when rotating logs
  var keepFileExt: js.UndefOr[Boolean] = js.undefined
  // defaults to basic layout
  var layout: js.UndefOr[Layout] = js.undefined
  // the maximum size (in bytes) for the log file. If not specified, then no log rolling will happen.
  var maxLogSize: js.UndefOr[Double | String] = js.undefined
  var mode: js.UndefOr[Double] = js.undefined
  var numBackups: js.UndefOr[Double] = js.undefined
  var `type`: file
}

object FileAppender {
  @scala.inline
  def apply(
    filename: String,
    `type`: file,
    backups: js.UndefOr[Double] = js.undefined,
    compress: js.UndefOr[Boolean] = js.undefined,
    encoding: String = null,
    flags: String = null,
    keepFileExt: js.UndefOr[Boolean] = js.undefined,
    layout: Layout = null,
    maxLogSize: Double | String = null,
    mode: js.UndefOr[Double] = js.undefined,
    numBackups: js.UndefOr[Double] = js.undefined
  ): FileAppender = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(backups)) __obj.updateDynamic("backups")(backups.get.asInstanceOf[js.Any])
    if (!js.isUndefined(compress)) __obj.updateDynamic("compress")(compress.get.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (flags != null) __obj.updateDynamic("flags")(flags.asInstanceOf[js.Any])
    if (!js.isUndefined(keepFileExt)) __obj.updateDynamic("keepFileExt")(keepFileExt.get.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (maxLogSize != null) __obj.updateDynamic("maxLogSize")(maxLogSize.asInstanceOf[js.Any])
    if (!js.isUndefined(mode)) __obj.updateDynamic("mode")(mode.get.asInstanceOf[js.Any])
    if (!js.isUndefined(numBackups)) __obj.updateDynamic("numBackups")(numBackups.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileAppender]
  }
}

