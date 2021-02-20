package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SplitterPane extends StObject {
  
  var collapsed: js.UndefOr[Boolean] = js.native
  
  var collapsedSize: js.UndefOr[String] = js.native
  
  var collapsible: js.UndefOr[Boolean] = js.native
  
  var contentUrl: js.UndefOr[String] = js.native
  
  var max: js.UndefOr[String] = js.native
  
  var min: js.UndefOr[String] = js.native
  
  var resizable: js.UndefOr[Boolean] = js.native
  
  var scrollable: js.UndefOr[Boolean] = js.native
  
  var size: js.UndefOr[String] = js.native
}
object SplitterPane {
  
  @scala.inline
  def apply(): SplitterPane = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SplitterPane]
  }
  
  @scala.inline
  implicit class SplitterPaneMutableBuilder[Self <: SplitterPane] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollapsedSize(value: String): Self = StObject.set(x, "collapsedSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollapsedSizeUndefined: Self = StObject.set(x, "collapsedSize", js.undefined)
    
    @scala.inline
    def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
    
    @scala.inline
    def setCollapsible(value: Boolean): Self = StObject.set(x, "collapsible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollapsibleUndefined: Self = StObject.set(x, "collapsible", js.undefined)
    
    @scala.inline
    def setContentUrl(value: String): Self = StObject.set(x, "contentUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUrlUndefined: Self = StObject.set(x, "contentUrl", js.undefined)
    
    @scala.inline
    def setMax(value: String): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMin(value: String): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setResizable(value: Boolean): Self = StObject.set(x, "resizable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResizableUndefined: Self = StObject.set(x, "resizable", js.undefined)
    
    @scala.inline
    def setScrollable(value: Boolean): Self = StObject.set(x, "scrollable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollableUndefined: Self = StObject.set(x, "scrollable", js.undefined)
    
    @scala.inline
    def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
