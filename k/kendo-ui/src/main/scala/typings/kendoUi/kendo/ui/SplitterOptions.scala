package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SplitterOptions extends StObject {
  
  var collapse: js.UndefOr[js.Function1[/* e */ SplitterCollapseEvent, Unit]] = js.native
  
  var contentLoad: js.UndefOr[js.Function1[/* e */ SplitterContentLoadEvent, Unit]] = js.native
  
  var error: js.UndefOr[js.Function1[/* e */ SplitterErrorEvent, Unit]] = js.native
  
  var expand: js.UndefOr[js.Function1[/* e */ SplitterExpandEvent, Unit]] = js.native
  
  var layoutChange: js.UndefOr[js.Function1[/* e */ SplitterEvent, Unit]] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var orientation: js.UndefOr[String] = js.native
  
  var panes: js.UndefOr[js.Array[SplitterPane]] = js.native
  
  var resize: js.UndefOr[js.Function1[/* e */ SplitterEvent, Unit]] = js.native
}
object SplitterOptions {
  
  @scala.inline
  def apply(): SplitterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SplitterOptions]
  }
  
  @scala.inline
  implicit class SplitterOptionsMutableBuilder[Self <: SplitterOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollapse(value: /* e */ SplitterCollapseEvent => Unit): Self = StObject.set(x, "collapse", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCollapseUndefined: Self = StObject.set(x, "collapse", js.undefined)
    
    @scala.inline
    def setContentLoad(value: /* e */ SplitterContentLoadEvent => Unit): Self = StObject.set(x, "contentLoad", js.Any.fromFunction1(value))
    
    @scala.inline
    def setContentLoadUndefined: Self = StObject.set(x, "contentLoad", js.undefined)
    
    @scala.inline
    def setError(value: /* e */ SplitterErrorEvent => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setExpand(value: /* e */ SplitterExpandEvent => Unit): Self = StObject.set(x, "expand", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
    
    @scala.inline
    def setLayoutChange(value: /* e */ SplitterEvent => Unit): Self = StObject.set(x, "layoutChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLayoutChangeUndefined: Self = StObject.set(x, "layoutChange", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOrientation(value: String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    @scala.inline
    def setPanes(value: js.Array[SplitterPane]): Self = StObject.set(x, "panes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPanesUndefined: Self = StObject.set(x, "panes", js.undefined)
    
    @scala.inline
    def setPanesVarargs(value: SplitterPane*): Self = StObject.set(x, "panes", js.Array(value :_*))
    
    @scala.inline
    def setResize(value: /* e */ SplitterEvent => Unit): Self = StObject.set(x, "resize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
  }
}
