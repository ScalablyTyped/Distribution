package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgLayoutManager
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[Any] {
  
  /**
    * Options specific to a border layout
    *
    */
  var borderLayout: js.UndefOr[IgLayoutManagerBorderLayout] = js.undefined
  
  /**
    * Options specific to grid layout mode
    *
    */
  var gridLayout: js.UndefOr[IgLayoutManagerGridLayout] = js.undefined
  
  /**
    * Gets/Sets height of the layout container.
    *
    */
  var height: js.UndefOr[String | Double] = js.undefined
  
  /**
    * Event fired after items are resized.
    *                     Use ui.owner to get a reference to the layout manager performing resizing.
    */
  var internalResized: js.UndefOr[InternalResizedEvent] = js.undefined
  
  /**
    * Event fired before items are resized.
    *                     Use ui.owner to get a reference to the layout manager performing resizing.
    */
  var internalResizing: js.UndefOr[InternalResizingEvent] = js.undefined
  
  /**
    * Number of items to render, this is only applicable to layouts: vertical and flow
    *
    */
  var itemCount: js.UndefOr[Double] = js.undefined
  
  /**
    * Event fired after an item has been rendered in the container.
    *                     Function takes arguments evt and ui.
    *                     Use ui.owner to get reference to the igLayoutManager.
    *                     Use ui.itemData to get a reference of item's settings, such as colspan ,rowspan, etc.
    *                     Use ui.index to get a reference of the item's index, if the layout is flow or vertical
    *                     Use ui.item to get a reference to the rendered item
    */
  var itemRendered: js.UndefOr[ItemRenderedEvent] = js.undefined
  
  /**
    * Event fired before an item is rendered in the container.
    *                     Function takes arguments evt and ui.
    *                     Use ui.owner to get reference to the igLayoutManager.
    *                     Use ui.itemData to get a reference of item's settings, such as colspan ,rowspan, etc.
    *                     Use ui.index to get a reference of the item's index, if the layout is flow or vertical
    *                     Use ui.item to get a reference to the rendered item
    */
  var itemRendering: js.UndefOr[ItemRenderingEvent] = js.undefined
  
  /**
    * An array of item descriptions
    *                     this assumes the container is empty, and every item
    *                     is described by rowspan, colspan, etc. - otherwise values of
    *                     1 are assumed
    *                     items can have various properties some of which may not be applicable
    *                     depending on the layoutMode.
    *                     for example rowSpan/colSpan/colIndex/rowIndex are only applicable to gridlayout
    *
    */
  var items: js.UndefOr[js.Array[IgLayoutManagerItem]] = js.undefined
  
  /**
    * Defines the layout type
    *                 grid Column type can be set with grid layout
    *                 border Column type can be set with border layout
    *                 flow Column type can be set with flow layout
    *                 column Column type can be set with column layout
    *                 vertical Column type can be set with vertical layout
    *
    *
    * Valid values:
    * "grid"
    * "border"
    * "flow"
    * "column"
    * "vertical"
    */
  var layoutMode: js.UndefOr[Any] = js.undefined
  
  /**
    * Event fired after all items are rendered.
    *                     Function takes arguments evt and ui.
    *                     Use ui.owner to get reference to the igLayoutManager.
    */
  var rendered: js.UndefOr[RenderedEvent] = js.undefined
  
  /**
    * Gets/Sets width of the layout container.
    *
    */
  var width: js.UndefOr[String | Double] = js.undefined
}
object IgLayoutManager {
  
  inline def apply(): IgLayoutManager = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgLayoutManager]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IgLayoutManager] (val x: Self) extends AnyVal {
    
    inline def setBorderLayout(value: IgLayoutManagerBorderLayout): Self = StObject.set(x, "borderLayout", value.asInstanceOf[js.Any])
    
    inline def setBorderLayoutUndefined: Self = StObject.set(x, "borderLayout", js.undefined)
    
    inline def setGridLayout(value: IgLayoutManagerGridLayout): Self = StObject.set(x, "gridLayout", value.asInstanceOf[js.Any])
    
    inline def setGridLayoutUndefined: Self = StObject.set(x, "gridLayout", js.undefined)
    
    inline def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setInternalResized(value: (/* event */ Event, /* ui */ InternalResizedEventUIParam) => Unit): Self = StObject.set(x, "internalResized", js.Any.fromFunction2(value))
    
    inline def setInternalResizedUndefined: Self = StObject.set(x, "internalResized", js.undefined)
    
    inline def setInternalResizing(value: (/* event */ Event, /* ui */ InternalResizingEventUIParam) => Unit): Self = StObject.set(x, "internalResizing", js.Any.fromFunction2(value))
    
    inline def setInternalResizingUndefined: Self = StObject.set(x, "internalResizing", js.undefined)
    
    inline def setItemCount(value: Double): Self = StObject.set(x, "itemCount", value.asInstanceOf[js.Any])
    
    inline def setItemCountUndefined: Self = StObject.set(x, "itemCount", js.undefined)
    
    inline def setItemRendered(value: (/* event */ Event, /* ui */ ItemRenderedEventUIParam) => Unit): Self = StObject.set(x, "itemRendered", js.Any.fromFunction2(value))
    
    inline def setItemRenderedUndefined: Self = StObject.set(x, "itemRendered", js.undefined)
    
    inline def setItemRendering(value: (/* event */ Event, /* ui */ ItemRenderingEventUIParam) => Unit): Self = StObject.set(x, "itemRendering", js.Any.fromFunction2(value))
    
    inline def setItemRenderingUndefined: Self = StObject.set(x, "itemRendering", js.undefined)
    
    inline def setItems(value: js.Array[IgLayoutManagerItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: IgLayoutManagerItem*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setLayoutMode(value: Any): Self = StObject.set(x, "layoutMode", value.asInstanceOf[js.Any])
    
    inline def setLayoutModeUndefined: Self = StObject.set(x, "layoutMode", js.undefined)
    
    inline def setRendered(value: (/* event */ Event, /* ui */ RenderedEventUIParam) => Unit): Self = StObject.set(x, "rendered", js.Any.fromFunction2(value))
    
    inline def setRenderedUndefined: Self = StObject.set(x, "rendered", js.undefined)
    
    inline def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
