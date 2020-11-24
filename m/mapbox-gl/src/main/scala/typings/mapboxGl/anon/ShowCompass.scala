package typings.mapboxGl.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShowCompass extends js.Object {
  
  var showCompass: js.UndefOr[Boolean] = js.native
  
  var showZoom: js.UndefOr[Boolean] = js.native
  
  var visualizePitch: js.UndefOr[Boolean] = js.native
}
object ShowCompass {
  
  @scala.inline
  def apply(): ShowCompass = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShowCompass]
  }
  
  @scala.inline
  implicit class ShowCompassOps[Self <: ShowCompass] (val x: Self) extends AnyVal {
    
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
    def setShowCompass(value: Boolean): Self = this.set("showCompass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowCompass: Self = this.set("showCompass", js.undefined)
    
    @scala.inline
    def setShowZoom(value: Boolean): Self = this.set("showZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowZoom: Self = this.set("showZoom", js.undefined)
    
    @scala.inline
    def setVisualizePitch(value: Boolean): Self = this.set("visualizePitch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisualizePitch: Self = this.set("visualizePitch", js.undefined)
  }
}
