package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import typings.kendoUi.kendo.data.HierarchicalDataSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContextMenuOptions extends StObject {
  
  var activate: js.UndefOr[js.Function1[/* e */ ContextMenuActivateEvent, Unit]] = js.native
  
  var alignToAnchor: js.UndefOr[Boolean] = js.native
  
  var animation: js.UndefOr[Boolean | ContextMenuAnimation] = js.native
  
  var appendTo: js.UndefOr[String | JQuery] = js.native
  
  var close: js.UndefOr[js.Function1[/* e */ ContextMenuCloseEvent, Unit]] = js.native
  
  var closeOnClick: js.UndefOr[Boolean] = js.native
  
  var copyAnchorStyles: js.UndefOr[Boolean] = js.native
  
  var dataContentField: js.UndefOr[String] = js.native
  
  var dataImageUrlField: js.UndefOr[String] = js.native
  
  var dataSource: js.UndefOr[js.Any | HierarchicalDataSource] = js.native
  
  var dataSpriteCssClassField: js.UndefOr[String] = js.native
  
  var dataTextField: js.UndefOr[String] = js.native
  
  var dataUrlField: js.UndefOr[String] = js.native
  
  var deactivate: js.UndefOr[js.Function1[/* e */ ContextMenuDeactivateEvent, Unit]] = js.native
  
  var direction: js.UndefOr[String] = js.native
  
  var filter: js.UndefOr[String] = js.native
  
  var hoverDelay: js.UndefOr[Double] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var open: js.UndefOr[js.Function1[/* e */ ContextMenuOpenEvent, Unit]] = js.native
  
  var orientation: js.UndefOr[String] = js.native
  
  var popupCollision: js.UndefOr[String] = js.native
  
  var scrollable: js.UndefOr[Boolean | ContextMenuScrollable] = js.native
  
  var select: js.UndefOr[js.Function1[/* e */ ContextMenuSelectEvent, Unit]] = js.native
  
  var showOn: js.UndefOr[String] = js.native
  
  var target: js.UndefOr[String | JQuery] = js.native
}
object ContextMenuOptions {
  
  @scala.inline
  def apply(): ContextMenuOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContextMenuOptions]
  }
  
  @scala.inline
  implicit class ContextMenuOptionsMutableBuilder[Self <: ContextMenuOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivate(value: /* e */ ContextMenuActivateEvent => Unit): Self = StObject.set(x, "activate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setActivateUndefined: Self = StObject.set(x, "activate", js.undefined)
    
    @scala.inline
    def setAlignToAnchor(value: Boolean): Self = StObject.set(x, "alignToAnchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignToAnchorUndefined: Self = StObject.set(x, "alignToAnchor", js.undefined)
    
    @scala.inline
    def setAnimation(value: Boolean | ContextMenuAnimation): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    @scala.inline
    def setAppendTo(value: String | JQuery): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppendToUndefined: Self = StObject.set(x, "appendTo", js.undefined)
    
    @scala.inline
    def setClose(value: /* e */ ContextMenuCloseEvent => Unit): Self = StObject.set(x, "close", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCloseOnClick(value: Boolean): Self = StObject.set(x, "closeOnClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseOnClickUndefined: Self = StObject.set(x, "closeOnClick", js.undefined)
    
    @scala.inline
    def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    @scala.inline
    def setCopyAnchorStyles(value: Boolean): Self = StObject.set(x, "copyAnchorStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyAnchorStylesUndefined: Self = StObject.set(x, "copyAnchorStyles", js.undefined)
    
    @scala.inline
    def setDataContentField(value: String): Self = StObject.set(x, "dataContentField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataContentFieldUndefined: Self = StObject.set(x, "dataContentField", js.undefined)
    
    @scala.inline
    def setDataImageUrlField(value: String): Self = StObject.set(x, "dataImageUrlField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataImageUrlFieldUndefined: Self = StObject.set(x, "dataImageUrlField", js.undefined)
    
    @scala.inline
    def setDataSource(value: js.Any | HierarchicalDataSource): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    @scala.inline
    def setDataSpriteCssClassField(value: String): Self = StObject.set(x, "dataSpriteCssClassField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSpriteCssClassFieldUndefined: Self = StObject.set(x, "dataSpriteCssClassField", js.undefined)
    
    @scala.inline
    def setDataTextField(value: String): Self = StObject.set(x, "dataTextField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataTextFieldUndefined: Self = StObject.set(x, "dataTextField", js.undefined)
    
    @scala.inline
    def setDataUrlField(value: String): Self = StObject.set(x, "dataUrlField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUrlFieldUndefined: Self = StObject.set(x, "dataUrlField", js.undefined)
    
    @scala.inline
    def setDeactivate(value: /* e */ ContextMenuDeactivateEvent => Unit): Self = StObject.set(x, "deactivate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDeactivateUndefined: Self = StObject.set(x, "deactivate", js.undefined)
    
    @scala.inline
    def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    @scala.inline
    def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setHoverDelay(value: Double): Self = StObject.set(x, "hoverDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverDelayUndefined: Self = StObject.set(x, "hoverDelay", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOpen(value: /* e */ ContextMenuOpenEvent => Unit): Self = StObject.set(x, "open", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    
    @scala.inline
    def setOrientation(value: String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    @scala.inline
    def setPopupCollision(value: String): Self = StObject.set(x, "popupCollision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopupCollisionUndefined: Self = StObject.set(x, "popupCollision", js.undefined)
    
    @scala.inline
    def setScrollable(value: Boolean | ContextMenuScrollable): Self = StObject.set(x, "scrollable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollableUndefined: Self = StObject.set(x, "scrollable", js.undefined)
    
    @scala.inline
    def setSelect(value: /* e */ ContextMenuSelectEvent => Unit): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    
    @scala.inline
    def setShowOn(value: String): Self = StObject.set(x, "showOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowOnUndefined: Self = StObject.set(x, "showOn", js.undefined)
    
    @scala.inline
    def setTarget(value: String | JQuery): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
