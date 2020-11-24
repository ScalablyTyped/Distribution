package typings.leaflet.mod.Control_

import typings.leaflet.mod.ControlOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ZoomOptions extends ControlOptions {
  
  var zoomInText: js.UndefOr[String] = js.native
  
  var zoomInTitle: js.UndefOr[String] = js.native
  
  var zoomOutText: js.UndefOr[String] = js.native
  
  var zoomOutTitle: js.UndefOr[String] = js.native
}
object ZoomOptions {
  
  @scala.inline
  def apply(): ZoomOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZoomOptions]
  }
  
  @scala.inline
  implicit class ZoomOptionsOps[Self <: ZoomOptions] (val x: Self) extends AnyVal {
    
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
    def setZoomInText(value: String): Self = this.set("zoomInText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomInText: Self = this.set("zoomInText", js.undefined)
    
    @scala.inline
    def setZoomInTitle(value: String): Self = this.set("zoomInTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomInTitle: Self = this.set("zoomInTitle", js.undefined)
    
    @scala.inline
    def setZoomOutText(value: String): Self = this.set("zoomOutText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomOutText: Self = this.set("zoomOutText", js.undefined)
    
    @scala.inline
    def setZoomOutTitle(value: String): Self = this.set("zoomOutTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomOutTitle: Self = this.set("zoomOutTitle", js.undefined)
  }
}
