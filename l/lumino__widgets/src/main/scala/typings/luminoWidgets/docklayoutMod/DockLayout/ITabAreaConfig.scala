package typings.luminoWidgets.docklayoutMod.DockLayout

import typings.luminoWidgets.luminoWidgetsStrings.`tab-area`
import typings.luminoWidgets.widgetMod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A layout config object for a tab area.
  */
@js.native
trait ITabAreaConfig extends AreaConfig {
  
  /**
    * The index of the selected tab.
    */
  var currentIndex: Double = js.native
  
  /**
    * The discriminated type of the config object.
    */
  var `type`: `tab-area` = js.native
  
  /**
    * The widgets contained in the tab area.
    */
  var widgets: js.Array[Widget] = js.native
}
object ITabAreaConfig {
  
  @scala.inline
  def apply(currentIndex: Double, `type`: `tab-area`, widgets: js.Array[Widget]): ITabAreaConfig = {
    val __obj = js.Dynamic.literal(currentIndex = currentIndex.asInstanceOf[js.Any], widgets = widgets.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITabAreaConfig]
  }
  
  @scala.inline
  implicit class ITabAreaConfigOps[Self <: ITabAreaConfig] (val x: Self) extends AnyVal {
    
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
    def setCurrentIndex(value: Double): Self = this.set("currentIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `tab-area`): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidgetsVarargs(value: Widget*): Self = this.set("widgets", js.Array(value :_*))
    
    @scala.inline
    def setWidgets(value: js.Array[Widget]): Self = this.set("widgets", value.asInstanceOf[js.Any])
  }
}
