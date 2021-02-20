package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
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
  implicit class IgSplitterPanelMutableBuilder[Self <: IgSplitterPanel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
    
    @scala.inline
    def setCollapsible(value: Boolean): Self = StObject.set(x, "collapsible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollapsibleUndefined: Self = StObject.set(x, "collapsible", js.undefined)
    
    @scala.inline
    def setMax(value: String | Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMin(value: String | Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setResizable(value: Boolean): Self = StObject.set(x, "resizable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResizableUndefined: Self = StObject.set(x, "resizable", js.undefined)
    
    @scala.inline
    def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
