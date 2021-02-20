package typings.log4js.mod

import typings.log4js.log4jsStrings.fileSync
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SyncfileAppender extends Appender {
  
  // (default value = 5) - the number of old log files to keep during log rolling.
  var backups: js.UndefOr[Double] = js.native
  
  // the path of the file where you want your logs written.
  var filename: String = js.native
  
  // defaults to basic layout
  var layout: js.UndefOr[Layout] = js.native
  
  // the maximum size (in bytes) for the log file. If not specified, then no log rolling will happen.
  var maxLogSize: js.UndefOr[Double | String] = js.native
  
  var `type`: fileSync = js.native
}
object SyncfileAppender {
  
  @scala.inline
  def apply(filename: String, `type`: fileSync): SyncfileAppender = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyncfileAppender]
  }
  
  @scala.inline
  implicit class SyncfileAppenderMutableBuilder[Self <: SyncfileAppender] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackups(value: Double): Self = StObject.set(x, "backups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackupsUndefined: Self = StObject.set(x, "backups", js.undefined)
    
    @scala.inline
    def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayout(value: Layout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    @scala.inline
    def setMaxLogSize(value: Double | String): Self = StObject.set(x, "maxLogSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxLogSizeUndefined: Self = StObject.set(x, "maxLogSize", js.undefined)
    
    @scala.inline
    def setType(value: fileSync): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
