package typings.log4js.mod

import typings.log4js.log4jsStrings.dateFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateFileAppender extends StObject {
  
  // (defaults to false) include the pattern in the name of the current log file.
  var alwaysIncludePattern: js.UndefOr[Boolean] = js.undefined
  
  // (defaults to false) compress the backup files using gzip (backup files will have .gz extension)
  var compress: js.UndefOr[Boolean] = js.undefined
  
  // (defaults to utf-8)
  var encoding: js.UndefOr[String] = js.undefined
  
  // (defaults to .) the filename separator when rolling. e.g.: abc.log`.`2013-08-30 or abc`.`2013-08-30.log (keepFileExt)
  var fileNameSep: js.UndefOr[String] = js.undefined
  
  // the path of the file where you want your logs written.
  var filename: String
  
  // (defaults to a)
  var flags: js.UndefOr[String] = js.undefined
  
  // (defaults to false) preserve the file extension when rotating log files (`file.log` becomes `file.2017-05-30.log` instead of `file.log.2017-05-30`).
  var keepFileExt: js.UndefOr[Boolean] = js.undefined
  
  // (defaults to BasicLayout)
  var layout: js.UndefOr[Layout] = js.undefined
  
  // (defaults to 0o600)
  var mode: js.UndefOr[Double] = js.undefined
  
  // (defaults to 1) the number of old files that matches the pattern to keep (excluding the hot file).
  var numBackups: js.UndefOr[Double] = js.undefined
  
  // (defaults to yyyy-MM-dd) the pattern to use to determine when to roll the logs.
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
  var pattern: js.UndefOr[String] = js.undefined
  
  var `type`: dateFile
}
object DateFileAppender {
  
  inline def apply(filename: String): DateFileAppender = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("dateFile")
    __obj.asInstanceOf[DateFileAppender]
  }
  
  extension [Self <: DateFileAppender](x: Self) {
    
    inline def setAlwaysIncludePattern(value: Boolean): Self = StObject.set(x, "alwaysIncludePattern", value.asInstanceOf[js.Any])
    
    inline def setAlwaysIncludePatternUndefined: Self = StObject.set(x, "alwaysIncludePattern", js.undefined)
    
    inline def setCompress(value: Boolean): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
    
    inline def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
    
    inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    inline def setFileNameSep(value: String): Self = StObject.set(x, "fileNameSep", value.asInstanceOf[js.Any])
    
    inline def setFileNameSepUndefined: Self = StObject.set(x, "fileNameSep", js.undefined)
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setFlags(value: String): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
    
    inline def setKeepFileExt(value: Boolean): Self = StObject.set(x, "keepFileExt", value.asInstanceOf[js.Any])
    
    inline def setKeepFileExtUndefined: Self = StObject.set(x, "keepFileExt", js.undefined)
    
    inline def setLayout(value: Layout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setNumBackups(value: Double): Self = StObject.set(x, "numBackups", value.asInstanceOf[js.Any])
    
    inline def setNumBackupsUndefined: Self = StObject.set(x, "numBackups", js.undefined)
    
    inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    
    inline def setType(value: dateFile): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
