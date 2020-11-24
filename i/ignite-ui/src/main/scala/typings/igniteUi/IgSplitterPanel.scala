package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgSplitterPanel
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Gets whether the panel is initially collapsed
    *
    */
  var collapsed: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets whether the panel can be collapsed
    *
    */
  var collapsible: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets the maximum size that the panel can have
    *
    */
  var max: js.UndefOr[String | Double] = js.native
  
  /**
    * Gets the minimum size that the panel can have
    *
    */
  var min: js.UndefOr[String | Double] = js.native
  
  /**
    * Gets whether the panel can be resized
    *
    */
  var resizable: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets the size of the panel
    *
    */
  var size: js.UndefOr[String | Double] = js.native
}
object IgSplitterPanel {
  
  @scala.inline
  def apply(): IgSplitterPanel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgSplitterPanel]
  }
  
  @scala.inline
  implicit class IgSplitterPanelOps[Self <: IgSplitterPanel] (val x: Self) extends AnyVal {
    
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
    def setCollapsed(value: Boolean): Self = this.set("collapsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollapsed: Self = this.set("collapsed", js.undefined)
    
    @scala.inline
    def setCollapsible(value: Boolean): Self = this.set("collapsible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollapsible: Self = this.set("collapsible", js.undefined)
    
    @scala.inline
    def setMax(value: String | Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMin(value: String | Double): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    
    @scala.inline
    def setResizable(value: Boolean): Self = this.set("resizable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResizable: Self = this.set("resizable", js.undefined)
    
    @scala.inline
    def setSize(value: String | Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
}
