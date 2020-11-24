package typings.imagemapster.mod.global.ImageMapster

import typings.imagemapster.mod.global.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnShowToolTipData extends js.Object {
  
  var areaOptions: AreaRenderingOptions = js.native
  
  /**
    * map key for this area
    */
  var key: String = js.native
  
  /**
    * current state of the area
    */
  var selected: Boolean = js.native
  
  /**
    * jQuery object of the tooltip container
    */
  var toolTip: JQuery = js.native
}
object OnShowToolTipData {
  
  @scala.inline
  def apply(areaOptions: AreaRenderingOptions, key: String, selected: Boolean, toolTip: JQuery): OnShowToolTipData = {
    val __obj = js.Dynamic.literal(areaOptions = areaOptions.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], toolTip = toolTip.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnShowToolTipData]
  }
  
  @scala.inline
  implicit class OnShowToolTipDataOps[Self <: OnShowToolTipData] (val x: Self) extends AnyVal {
    
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
    def setAreaOptions(value: AreaRenderingOptions): Self = this.set("areaOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolTip(value: JQuery): Self = this.set("toolTip", value.asInstanceOf[js.Any])
  }
}
