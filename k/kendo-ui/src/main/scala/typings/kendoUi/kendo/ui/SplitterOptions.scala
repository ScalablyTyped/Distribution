package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SplitterOptions extends StObject {
  
  var collapse: js.UndefOr[js.Function1[/* e */ SplitterCollapseEvent, Unit]] = js.undefined
  
  var contentLoad: js.UndefOr[js.Function1[/* e */ SplitterContentLoadEvent, Unit]] = js.undefined
  
  var error: js.UndefOr[js.Function1[/* e */ SplitterErrorEvent, Unit]] = js.undefined
  
  var expand: js.UndefOr[js.Function1[/* e */ SplitterExpandEvent, Unit]] = js.undefined
  
  var layoutChange: js.UndefOr[js.Function1[/* e */ SplitterEvent, Unit]] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var orientation: js.UndefOr[String] = js.undefined
  
  var panes: js.UndefOr[js.Array[SplitterPane]] = js.undefined
  
  var resize: js.UndefOr[js.Function1[/* e */ SplitterEvent, Unit]] = js.undefined
}
object SplitterOptions {
  
  inline def apply(): SplitterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SplitterOptions]
  }
  
  extension [Self <: SplitterOptions](x: Self) {
    
    inline def setCollapse(value: /* e */ SplitterCollapseEvent => Unit): Self = StObject.set(x, "collapse", js.Any.fromFunction1(value))
    
    inline def setCollapseUndefined: Self = StObject.set(x, "collapse", js.undefined)
    
    inline def setContentLoad(value: /* e */ SplitterContentLoadEvent => Unit): Self = StObject.set(x, "contentLoad", js.Any.fromFunction1(value))
    
    inline def setContentLoadUndefined: Self = StObject.set(x, "contentLoad", js.undefined)
    
    inline def setError(value: /* e */ SplitterErrorEvent => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setExpand(value: /* e */ SplitterExpandEvent => Unit): Self = StObject.set(x, "expand", js.Any.fromFunction1(value))
    
    inline def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
    
    inline def setLayoutChange(value: /* e */ SplitterEvent => Unit): Self = StObject.set(x, "layoutChange", js.Any.fromFunction1(value))
    
    inline def setLayoutChangeUndefined: Self = StObject.set(x, "layoutChange", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOrientation(value: String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setPanes(value: js.Array[SplitterPane]): Self = StObject.set(x, "panes", value.asInstanceOf[js.Any])
    
    inline def setPanesUndefined: Self = StObject.set(x, "panes", js.undefined)
    
    inline def setPanesVarargs(value: SplitterPane*): Self = StObject.set(x, "panes", js.Array(value*))
    
    inline def setResize(value: /* e */ SplitterEvent => Unit): Self = StObject.set(x, "resize", js.Any.fromFunction1(value))
    
    inline def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
  }
}
