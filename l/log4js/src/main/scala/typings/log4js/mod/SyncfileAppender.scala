package typings.log4js.mod

import typings.log4js.log4jsStrings.fileSync
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
  implicit class SyncfileAppenderOps[Self <: SyncfileAppender] (val x: Self) extends AnyVal {
    
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
    def setType(value: fileSync): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackups(value: Double): Self = this.set("backups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackups: Self = this.set("backups", js.undefined)
    
    @scala.inline
    def setLayout(value: Layout): Self = this.set("layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    
    @scala.inline
    def setMaxLogSize(value: Double | String): Self = this.set("maxLogSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxLogSize: Self = this.set("maxLogSize", js.undefined)
  }
}
