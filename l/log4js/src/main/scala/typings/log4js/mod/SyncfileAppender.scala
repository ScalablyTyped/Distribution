package typings.log4js.mod

import typings.log4js.log4jsStrings.fileSync
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SyncfileAppender extends StObject {
  
  // (defaults to 5) the number of old log files to keep (excluding the hot file).
  var backups: js.UndefOr[Double] = js.undefined
  
  // (defaults to utf-8)
  var encoding: js.UndefOr[String] = js.undefined
  
  // the path of the file where you want your logs written.
  var filename: String
  
  // (defaults to a)
  var flags: js.UndefOr[String] = js.undefined
  
  // (defaults to BasicLayout)
  var layout: js.UndefOr[Layout] = js.undefined
  
  // (defaults to undefined) the maximum size (in bytes) for the log file. If not specified or 0, then no log rolling will happen.
  var maxLogSize: js.UndefOr[Double | String] = js.undefined
  
  // (defaults to 0o600)
  var mode: js.UndefOr[Double] = js.undefined
  
  var `type`: fileSync
}
object SyncfileAppender {
  
  inline def apply(filename: String): SyncfileAppender = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("fileSync")
    __obj.asInstanceOf[SyncfileAppender]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SyncfileAppender] (val x: Self) extends AnyVal {
    
    inline def setBackups(value: Double): Self = StObject.set(x, "backups", value.asInstanceOf[js.Any])
    
    inline def setBackupsUndefined: Self = StObject.set(x, "backups", js.undefined)
    
    inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setFlags(value: String): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
    
    inline def setLayout(value: Layout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setMaxLogSize(value: Double | String): Self = StObject.set(x, "maxLogSize", value.asInstanceOf[js.Any])
    
    inline def setMaxLogSizeUndefined: Self = StObject.set(x, "maxLogSize", js.undefined)
    
    inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setType(value: fileSync): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
