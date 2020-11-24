package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartZoomableMousewheel extends js.Object {
  
  var lock: js.UndefOr[String] = js.native
}
object ChartZoomableMousewheel {
  
  @scala.inline
  def apply(): ChartZoomableMousewheel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartZoomableMousewheel]
  }
  
  @scala.inline
  implicit class ChartZoomableMousewheelOps[Self <: ChartZoomableMousewheel] (val x: Self) extends AnyVal {
    
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
    def setLock(value: String): Self = this.set("lock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLock: Self = this.set("lock", js.undefined)
  }
}
