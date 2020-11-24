package typings.mapsjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Data extends js.Object {
  
  var data: js.Array[js.Object] = js.native
  
  var dataFormat: js.UndefOr[String] = js.native
  
  var maxAvailableZoomLevel: js.UndefOr[Double] = js.native
  
  var timeoutMs: js.UndefOr[Double] = js.native
}
object Data {
  
  @scala.inline
  def apply(data: js.Array[js.Object]): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
  
  @scala.inline
  implicit class DataOps[Self <: Data] (val x: Self) extends AnyVal {
    
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
    def setDataVarargs(value: js.Object*): Self = this.set("data", js.Array(value :_*))
    
    @scala.inline
    def setData(value: js.Array[js.Object]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataFormat(value: String): Self = this.set("dataFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataFormat: Self = this.set("dataFormat", js.undefined)
    
    @scala.inline
    def setMaxAvailableZoomLevel(value: Double): Self = this.set("maxAvailableZoomLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxAvailableZoomLevel: Self = this.set("maxAvailableZoomLevel", js.undefined)
    
    @scala.inline
    def setTimeoutMs(value: Double): Self = this.set("timeoutMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeoutMs: Self = this.set("timeoutMs", js.undefined)
  }
}
