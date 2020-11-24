package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapControls extends js.Object {
  
  var attribution: js.UndefOr[Boolean | MapControlsAttribution] = js.native
  
  var navigator: js.UndefOr[Boolean | MapControlsNavigator] = js.native
  
  var zoom: js.UndefOr[Boolean | MapControlsZoom] = js.native
}
object MapControls {
  
  @scala.inline
  def apply(): MapControls = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapControls]
  }
  
  @scala.inline
  implicit class MapControlsOps[Self <: MapControls] (val x: Self) extends AnyVal {
    
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
    def setAttribution(value: Boolean | MapControlsAttribution): Self = this.set("attribution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttribution: Self = this.set("attribution", js.undefined)
    
    @scala.inline
    def setNavigator(value: Boolean | MapControlsNavigator): Self = this.set("navigator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNavigator: Self = this.set("navigator", js.undefined)
    
    @scala.inline
    def setZoom(value: Boolean | MapControlsZoom): Self = this.set("zoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoom: Self = this.set("zoom", js.undefined)
  }
}
