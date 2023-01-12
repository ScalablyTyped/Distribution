package typings.kendoUi.kendo.mobile.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollapsibleOptions extends StObject {
  
  var animation: js.UndefOr[Boolean] = js.undefined
  
  var collapse: js.UndefOr[js.Function1[/* e */ CollapsibleEvent, Unit]] = js.undefined
  
  var collapsed: js.UndefOr[Boolean] = js.undefined
  
  var expand: js.UndefOr[js.Function1[/* e */ CollapsibleEvent, Unit]] = js.undefined
  
  var expandIcon: js.UndefOr[String] = js.undefined
  
  var iconPosition: js.UndefOr[String] = js.undefined
  
  var inset: js.UndefOr[Boolean] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
}
object CollapsibleOptions {
  
  inline def apply(): CollapsibleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollapsibleOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CollapsibleOptions] (val x: Self) extends AnyVal {
    
    inline def setAnimation(value: Boolean): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    inline def setCollapse(value: /* e */ CollapsibleEvent => Unit): Self = StObject.set(x, "collapse", js.Any.fromFunction1(value))
    
    inline def setCollapseUndefined: Self = StObject.set(x, "collapse", js.undefined)
    
    inline def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
    
    inline def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
    
    inline def setExpand(value: /* e */ CollapsibleEvent => Unit): Self = StObject.set(x, "expand", js.Any.fromFunction1(value))
    
    inline def setExpandIcon(value: String): Self = StObject.set(x, "expandIcon", value.asInstanceOf[js.Any])
    
    inline def setExpandIconUndefined: Self = StObject.set(x, "expandIcon", js.undefined)
    
    inline def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
    
    inline def setIconPosition(value: String): Self = StObject.set(x, "iconPosition", value.asInstanceOf[js.Any])
    
    inline def setIconPositionUndefined: Self = StObject.set(x, "iconPosition", js.undefined)
    
    inline def setInset(value: Boolean): Self = StObject.set(x, "inset", value.asInstanceOf[js.Any])
    
    inline def setInsetUndefined: Self = StObject.set(x, "inset", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
