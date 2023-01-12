package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgSplitterPanel
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[Any] {
  
  /**
    * Gets whether the panel is initially collapsed
    *
    */
  var collapsed: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets whether the panel can be collapsed
    *
    */
  var collapsible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets the maximum size that the panel can have
    *
    */
  var max: js.UndefOr[String | Double] = js.undefined
  
  /**
    * Gets the minimum size that the panel can have
    *
    */
  var min: js.UndefOr[String | Double] = js.undefined
  
  /**
    * Gets whether the panel can be resized
    *
    */
  var resizable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets the size of the panel
    *
    */
  var size: js.UndefOr[String | Double] = js.undefined
}
object IgSplitterPanel {
  
  inline def apply(): IgSplitterPanel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgSplitterPanel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IgSplitterPanel] (val x: Self) extends AnyVal {
    
    inline def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
    
    inline def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
    
    inline def setCollapsible(value: Boolean): Self = StObject.set(x, "collapsible", value.asInstanceOf[js.Any])
    
    inline def setCollapsibleUndefined: Self = StObject.set(x, "collapsible", js.undefined)
    
    inline def setMax(value: String | Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: String | Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setResizable(value: Boolean): Self = StObject.set(x, "resizable", value.asInstanceOf[js.Any])
    
    inline def setResizableUndefined: Self = StObject.set(x, "resizable", js.undefined)
    
    inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
