package typings.log4js.mod

import typings.log4js.log4jsStrings.file
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileAppender extends Appender {
  // (default value = 5) - the number of old log files to keep during log rolling.
  var backups: js.UndefOr[Double] = js.native
  var compress: js.UndefOr[Boolean] = js.native
  var encoding: js.UndefOr[String] = js.native
  // the path of the file where you want your logs written.
  var filename: String = js.native
  var flags: js.UndefOr[String] = js.native
   // compress the backups
  // keep the file extension when rotating logs
  var keepFileExt: js.UndefOr[Boolean] = js.native
  // defaults to basic layout
  var layout: js.UndefOr[Layout] = js.native
  // the maximum size (in bytes) for the log file. If not specified, then no log rolling will happen.
  var maxLogSize: js.UndefOr[Double | String] = js.native
  var mode: js.UndefOr[Double] = js.native
  var numBackups: js.UndefOr[Double] = js.native
  var `type`: file = js.native
}

object FileAppender {
  @scala.inline
  def apply(filename: String, `type`: file): FileAppender = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileAppender]
  }
  @scala.inline
  implicit class FileAppenderOps[Self <: FileAppender] (val x: Self) extends AnyVal {
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
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: file): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setBackups(value: Double): Self = this.set("backups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackups: Self = this.set("backups", js.undefined)
    @scala.inline
    def setCompress(value: Boolean): Self = this.set("compress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompress: Self = this.set("compress", js.undefined)
    @scala.inline
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    @scala.inline
    def setFlags(value: String): Self = this.set("flags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlags: Self = this.set("flags", js.undefined)
    @scala.inline
    def setKeepFileExt(value: Boolean): Self = this.set("keepFileExt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeepFileExt: Self = this.set("keepFileExt", js.undefined)
    @scala.inline
    def setLayout(value: Layout): Self = this.set("layout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    @scala.inline
    def setMaxLogSize(value: Double | String): Self = this.set("maxLogSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxLogSize: Self = this.set("maxLogSize", js.undefined)
    @scala.inline
    def setMode(value: Double): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setNumBackups(value: Double): Self = this.set("numBackups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumBackups: Self = this.set("numBackups", js.undefined)
  }
  
}

