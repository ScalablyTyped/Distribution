package typings.log4js.mod

import typings.log4js.log4jsStrings.file
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileAppender
  extends StObject
     with Appender {
  
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
  def apply(filename: String): FileAppender = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("file")
    __obj.asInstanceOf[FileAppender]
  }
  
  @scala.inline
  implicit class FileAppenderMutableBuilder[Self <: FileAppender] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackups(value: Double): Self = StObject.set(x, "backups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackupsUndefined: Self = StObject.set(x, "backups", js.undefined)
    
    @scala.inline
    def setCompress(value: Boolean): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
    
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
    def setMaxLogSize(value: Double | String): Self = StObject.set(x, "maxLogSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxLogSizeUndefined: Self = StObject.set(x, "maxLogSize", js.undefined)
    
    @scala.inline
    def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setNumBackups(value: Double): Self = StObject.set(x, "numBackups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumBackupsUndefined: Self = StObject.set(x, "numBackups", js.undefined)
    
    @scala.inline
    def setType(value: file): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
