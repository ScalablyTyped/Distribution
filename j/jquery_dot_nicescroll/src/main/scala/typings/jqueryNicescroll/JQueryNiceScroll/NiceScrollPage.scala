package typings.jqueryNicescroll.JQueryNiceScroll

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NiceScrollPage extends js.Object {
  
  var h: Double = js.native
  
  var height: Double = js.native
  
  var maxh: Double = js.native
  
  var maxw: Double = js.native
  
  var w: Double = js.native
  
  var width: Double = js.native
}
object NiceScrollPage {
  
  @scala.inline
  def apply(h: Double, height: Double, maxh: Double, maxw: Double, w: Double, width: Double): NiceScrollPage = {
    val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], maxh = maxh.asInstanceOf[js.Any], maxw = maxw.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[NiceScrollPage]
  }
  
  @scala.inline
  implicit class NiceScrollPageOps[Self <: NiceScrollPage] (val x: Self) extends AnyVal {
    
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
    def setH(value: Double): Self = this.set("h", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxh(value: Double): Self = this.set("maxh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxw(value: Double): Self = this.set("maxw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setW(value: Double): Self = this.set("w", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
}
