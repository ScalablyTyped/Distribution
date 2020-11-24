package typings.hlsJs.mod

import typings.hlsJs.anon.Audio
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait bufferAppendedData extends js.Object {
  
  var pending: Double = js.native
  
  var timeRanges: Audio = js.native
}
object bufferAppendedData {
  
  @scala.inline
  def apply(pending: Double, timeRanges: Audio): bufferAppendedData = {
    val __obj = js.Dynamic.literal(pending = pending.asInstanceOf[js.Any], timeRanges = timeRanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[bufferAppendedData]
  }
  
  @scala.inline
  implicit class bufferAppendedDataOps[Self <: bufferAppendedData] (val x: Self) extends AnyVal {
    
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
    def setPending(value: Double): Self = this.set("pending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeRanges(value: Audio): Self = this.set("timeRanges", value.asInstanceOf[js.Any])
  }
}
