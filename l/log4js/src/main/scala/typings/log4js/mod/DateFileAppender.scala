package typings.log4js.mod

import typings.log4js.log4jsStrings.dateFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DateFileAppender extends Appender {
  
  // include the pattern in the name of the current log file as well as the backups.(default false)
  var alwaysIncludePattern: js.UndefOr[Boolean] = js.native
  
  // compress the backup files during rolling (backup files will have .gz extension)(default false)
  var compress: js.UndefOr[Boolean] = js.native
  
  // if this value is greater than zero, then files older than that many days will be deleted during log rolling.(default 0)
  var daysToKeep: js.UndefOr[Double] = js.native
  
  // default “utf-8”
  var encoding: js.UndefOr[String] = js.native
  
  // the path of the file where you want your logs written.
  var filename: String = js.native
  
  // default ‘a’
  var flags: js.UndefOr[String] = js.native
  
  // keep the file extension when rotating logs
  var keepFileExt: js.UndefOr[Boolean] = js.native
  
  // defaults to basic layout
  var layout: js.UndefOr[Layout] = js.native
  
  // default 0644
  var mode: js.UndefOr[Double] = js.native
  
  // defaults to .yyyy-MM-dd - the pattern to use to determine when to roll the logs.
  /**
    * The following strings are recognised in the pattern:
    *  - yyyy : the full year, use yy for just the last two digits
    *  - MM   : the month
    *  - dd   : the day of the month
    *  - hh   : the hour of the day (24-hour clock)
    *  - mm   : the minute of the hour
    *  - ss   : seconds
    *  - SSS  : milliseconds (although I'm not sure you'd want to roll your logs every millisecond)
    *  - O    : timezone (capital letter o)
    */
  var pattern: js.UndefOr[String] = js.native
  
  var `type`: dateFile = js.native
}
object DateFileAppender {
  
  @scala.inline
  def apply(filename: String, `type`: dateFile): DateFileAppender = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateFileAppender]
  }
  
  @scala.inline
  implicit class DateFileAppenderOps[Self <: DateFileAppender] (val x: Self) extends AnyVal {
    
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
    def setType(value: dateFile): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlwaysIncludePattern(value: Boolean): Self = this.set("alwaysIncludePattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlwaysIncludePattern: Self = this.set("alwaysIncludePattern", js.undefined)
    
    @scala.inline
    def setCompress(value: Boolean): Self = this.set("compress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompress: Self = this.set("compress", js.undefined)
    
    @scala.inline
    def setDaysToKeep(value: Double): Self = this.set("daysToKeep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDaysToKeep: Self = this.set("daysToKeep", js.undefined)
    
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
    def setMode(value: Double): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setPattern(value: String): Self = this.set("pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePattern: Self = this.set("pattern", js.undefined)
  }
}
