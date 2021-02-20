package typings.log4js.mod

import typings.log4js.log4jsStrings.dateFile
import org.scalablytyped.runtime.StObject
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
  implicit class DateFileAppenderMutableBuilder[Self <: DateFileAppender] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlwaysIncludePattern(value: Boolean): Self = StObject.set(x, "alwaysIncludePattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlwaysIncludePatternUndefined: Self = StObject.set(x, "alwaysIncludePattern", js.undefined)
    
    @scala.inline
    def setCompress(value: Boolean): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
    
    @scala.inline
    def setDaysToKeep(value: Double): Self = StObject.set(x, "daysToKeep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDaysToKeepUndefined: Self = StObject.set(x, "daysToKeep", js.undefined)
    
    @scala.inline
    def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    @scala.inline
    def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlags(value: String): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
    
    @scala.inline
    def setKeepFileExt(value: Boolean): Self = StObject.set(x, "keepFileExt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepFileExtUndefined: Self = StObject.set(x, "keepFileExt", js.undefined)
    
    @scala.inline
    def setLayout(value: Layout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    @scala.inline
    def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    
    @scala.inline
    def setType(value: dateFile): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
