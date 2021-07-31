package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgPivotViewPivotGridPanel
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Determines if the panel containing the igPivotGrid will initially collapsed.
    */
  var collapsed: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Determines if the panel containing the igPivotGrid will be collapsible.
    */
  var collapsible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Determines if the panel containing the igPivotGrid will be resizable.
    */
  var resizable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Determines the size of the igPivotGrid panel.
    *
    * Valid values:
    * "string" The panel size can be set in pixels (px).
    * "number" The size can be set as a number.
    * "null" will automatically size the panel.
    */
  var size: js.UndefOr[String | Double] = js.undefined
}
object IgPivotViewPivotGridPanel {
  
  @scala.inline
  def apply(): IgPivotViewPivotGridPanel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgPivotViewPivotGridPanel]
  }
  
  @scala.inline
  implicit class IgPivotViewPivotGridPanelMutableBuilder[Self <: IgPivotViewPivotGridPanel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
    
    @scala.inline
    def setCollapsible(value: Boolean): Self = StObject.set(x, "collapsible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollapsibleUndefined: Self = StObject.set(x, "collapsible", js.undefined)
    
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
