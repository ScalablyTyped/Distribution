package typings.ky.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DownloadProgress extends js.Object {
  
  var percent: Double = js.native
  
  /**
  	Note: If it's not possible to retrieve the body size, it will be `0`.
  	*/
  var totalBytes: Double = js.native
  
  var transferredBytes: Double = js.native
}
object DownloadProgress {
  
  @scala.inline
  def apply(percent: Double, totalBytes: Double, transferredBytes: Double): DownloadProgress = {
    val __obj = js.Dynamic.literal(percent = percent.asInstanceOf[js.Any], totalBytes = totalBytes.asInstanceOf[js.Any], transferredBytes = transferredBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadProgress]
  }
  
  @scala.inline
  implicit class DownloadProgressOps[Self <: DownloadProgress] (val x: Self) extends AnyVal {
    
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
    def setPercent(value: Double): Self = this.set("percent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalBytes(value: Double): Self = this.set("totalBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransferredBytes(value: Double): Self = this.set("transferredBytes", value.asInstanceOf[js.Any])
  }
}
