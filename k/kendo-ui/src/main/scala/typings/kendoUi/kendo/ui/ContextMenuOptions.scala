package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import typings.kendoUi.kendo.data.HierarchicalDataSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContextMenuOptions extends StObject {
  
  var activate: js.UndefOr[js.Function1[/* e */ ContextMenuActivateEvent, Unit]] = js.undefined
  
  var alignToAnchor: js.UndefOr[Boolean] = js.undefined
  
  var animation: js.UndefOr[Boolean | ContextMenuAnimation] = js.undefined
  
  var appendTo: js.UndefOr[String | JQuery] = js.undefined
  
  var close: js.UndefOr[js.Function1[/* e */ ContextMenuCloseEvent, Unit]] = js.undefined
  
  var closeOnClick: js.UndefOr[Boolean] = js.undefined
  
  var copyAnchorStyles: js.UndefOr[Boolean] = js.undefined
  
  var dataContentField: js.UndefOr[String] = js.undefined
  
  var dataImageUrlField: js.UndefOr[String] = js.undefined
  
  var dataSource: js.UndefOr[Any | HierarchicalDataSource] = js.undefined
  
  var dataSpriteCssClassField: js.UndefOr[String] = js.undefined
  
  var dataTextField: js.UndefOr[String] = js.undefined
  
  var dataUrlField: js.UndefOr[String] = js.undefined
  
  var deactivate: js.UndefOr[js.Function1[/* e */ ContextMenuDeactivateEvent, Unit]] = js.undefined
  
  var direction: js.UndefOr[String] = js.undefined
  
  var filter: js.UndefOr[String] = js.undefined
  
  var hoverDelay: js.UndefOr[Double] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var open: js.UndefOr[js.Function1[/* e */ ContextMenuOpenEvent, Unit]] = js.undefined
  
  var orientation: js.UndefOr[String] = js.undefined
  
  var popupCollision: js.UndefOr[String] = js.undefined
  
  var scrollable: js.UndefOr[Boolean | ContextMenuScrollable] = js.undefined
  
  var select: js.UndefOr[js.Function1[/* e */ ContextMenuSelectEvent, Unit]] = js.undefined
  
  var showOn: js.UndefOr[String] = js.undefined
  
  var target: js.UndefOr[String | JQuery] = js.undefined
}
object ContextMenuOptions {
  
  inline def apply(): ContextMenuOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContextMenuOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContextMenuOptions] (val x: Self) extends AnyVal {
    
    inline def setActivate(value: /* e */ ContextMenuActivateEvent => Unit): Self = StObject.set(x, "activate", js.Any.fromFunction1(value))
    
    inline def setActivateUndefined: Self = StObject.set(x, "activate", js.undefined)
    
    inline def setAlignToAnchor(value: Boolean): Self = StObject.set(x, "alignToAnchor", value.asInstanceOf[js.Any])
    
    inline def setAlignToAnchorUndefined: Self = StObject.set(x, "alignToAnchor", js.undefined)
    
    inline def setAnimation(value: Boolean | ContextMenuAnimation): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    inline def setAppendTo(value: String | JQuery): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
    
    inline def setAppendToUndefined: Self = StObject.set(x, "appendTo", js.undefined)
    
    inline def setClose(value: /* e */ ContextMenuCloseEvent => Unit): Self = StObject.set(x, "close", js.Any.fromFunction1(value))
    
    inline def setCloseOnClick(value: Boolean): Self = StObject.set(x, "closeOnClick", value.asInstanceOf[js.Any])
    
    inline def setCloseOnClickUndefined: Self = StObject.set(x, "closeOnClick", js.undefined)
    
    inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    inline def setCopyAnchorStyles(value: Boolean): Self = StObject.set(x, "copyAnchorStyles", value.asInstanceOf[js.Any])
    
    inline def setCopyAnchorStylesUndefined: Self = StObject.set(x, "copyAnchorStyles", js.undefined)
    
    inline def setDataContentField(value: String): Self = StObject.set(x, "dataContentField", value.asInstanceOf[js.Any])
    
    inline def setDataContentFieldUndefined: Self = StObject.set(x, "dataContentField", js.undefined)
    
    inline def setDataImageUrlField(value: String): Self = StObject.set(x, "dataImageUrlField", value.asInstanceOf[js.Any])
    
    inline def setDataImageUrlFieldUndefined: Self = StObject.set(x, "dataImageUrlField", js.undefined)
    
    inline def setDataSource(value: Any | HierarchicalDataSource): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setDataSpriteCssClassField(value: String): Self = StObject.set(x, "dataSpriteCssClassField", value.asInstanceOf[js.Any])
    
    inline def setDataSpriteCssClassFieldUndefined: Self = StObject.set(x, "dataSpriteCssClassField", js.undefined)
    
    inline def setDataTextField(value: String): Self = StObject.set(x, "dataTextField", value.asInstanceOf[js.Any])
    
    inline def setDataTextFieldUndefined: Self = StObject.set(x, "dataTextField", js.undefined)
    
    inline def setDataUrlField(value: String): Self = StObject.set(x, "dataUrlField", value.asInstanceOf[js.Any])
    
    inline def setDataUrlFieldUndefined: Self = StObject.set(x, "dataUrlField", js.undefined)
    
    inline def setDeactivate(value: /* e */ ContextMenuDeactivateEvent => Unit): Self = StObject.set(x, "deactivate", js.Any.fromFunction1(value))
    
    inline def setDeactivateUndefined: Self = StObject.set(x, "deactivate", js.undefined)
    
    inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setHoverDelay(value: Double): Self = StObject.set(x, "hoverDelay", value.asInstanceOf[js.Any])
    
    inline def setHoverDelayUndefined: Self = StObject.set(x, "hoverDelay", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOpen(value: /* e */ ContextMenuOpenEvent => Unit): Self = StObject.set(x, "open", js.Any.fromFunction1(value))
    
    inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    
    inline def setOrientation(value: String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setPopupCollision(value: String): Self = StObject.set(x, "popupCollision", value.asInstanceOf[js.Any])
    
    inline def setPopupCollisionUndefined: Self = StObject.set(x, "popupCollision", js.undefined)
    
    inline def setScrollable(value: Boolean | ContextMenuScrollable): Self = StObject.set(x, "scrollable", value.asInstanceOf[js.Any])
    
    inline def setScrollableUndefined: Self = StObject.set(x, "scrollable", js.undefined)
    
    inline def setSelect(value: /* e */ ContextMenuSelectEvent => Unit): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
    
    inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    
    inline def setShowOn(value: String): Self = StObject.set(x, "showOn", value.asInstanceOf[js.Any])
    
    inline def setShowOnUndefined: Self = StObject.set(x, "showOn", js.undefined)
    
    inline def setTarget(value: String | JQuery): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
