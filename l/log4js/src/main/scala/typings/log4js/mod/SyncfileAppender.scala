package typings.log4js.mod

import typings.log4js.log4jsStrings.fileSync
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SyncfileAppender
  extends StObject
     with Appender {
  
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
  
  inline def apply(filename: String): SyncfileAppender = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("fileSync")
    __obj.asInstanceOf[SyncfileAppender]
  }
  
  extension [Self <: SyncfileAppender](x: Self) {
    
    inline def setBackups(value: Double): Self = StObject.set(x, "backups", value.asInstanceOf[js.Any])
    
    inline def setBackupsUndefined: Self = StObject.set(x, "backups", js.undefined)
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setLayout(value: Layout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setMaxLogSize(value: Double | String): Self = StObject.set(x, "maxLogSize", value.asInstanceOf[js.Any])
    
    inline def setMaxLogSizeUndefined: Self = StObject.set(x, "maxLogSize", js.undefined)
    
    inline def setType(value: fileSync): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
