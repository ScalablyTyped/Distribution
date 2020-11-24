package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgLayoutManager
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Options specific to a border layout
    *
    */
  var borderLayout: js.UndefOr[IgLayoutManagerBorderLayout] = js.native
  
  /**
    * Options specific to grid layout mode
    *
    */
  var gridLayout: js.UndefOr[IgLayoutManagerGridLayout] = js.native
  
  /**
    * Gets/Sets height of the layout container.
    *
    */
  var height: js.UndefOr[String | Double] = js.native
  
  /**
    * Event fired after items are resized.
    *                     Use ui.owner to get a reference to the layout manager performing resizing.
    */
  var internalResized: js.UndefOr[InternalResizedEvent] = js.native
  
  /**
    * Event fired before items are resized.
    *                     Use ui.owner to get a reference to the layout manager performing resizing.
    */
  var internalResizing: js.UndefOr[InternalResizingEvent] = js.native
  
  /**
    * Number of items to render, this is only applicable to layouts: vertical and flow
    *
    */
  var itemCount: js.UndefOr[Double] = js.native
  
  /**
    * Event fired after an item has been rendered in the container.
    *                     Function takes arguments evt and ui.
    *                     Use ui.owner to get reference to the igLayoutManager.
    *                     Use ui.itemData to get a reference of item's settings, such as colspan ,rowspan, etc.
    *                     Use ui.index to get a reference of the item's index, if the layout is flow or vertical
    *                     Use ui.item to get a reference to the rendered item
    */
  var itemRendered: js.UndefOr[ItemRenderedEvent] = js.native
  
  /**
    * Event fired before an item is rendered in the container.
    *                     Function takes arguments evt and ui.
    *                     Use ui.owner to get reference to the igLayoutManager.
    *                     Use ui.itemData to get a reference of item's settings, such as colspan ,rowspan, etc.
    *                     Use ui.index to get a reference of the item's index, if the layout is flow or vertical
    *                     Use ui.item to get a reference to the rendered item
    */
  var itemRendering: js.UndefOr[ItemRenderingEvent] = js.native
  
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
  var items: js.UndefOr[js.Array[IgLayoutManagerItem]] = js.native
  
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
  var layoutMode: js.UndefOr[js.Any] = js.native
  
  /**
    * Event fired after all items are rendered.
    *                     Function takes arguments evt and ui.
    *                     Use ui.owner to get reference to the igLayoutManager.
    */
  var rendered: js.UndefOr[RenderedEvent] = js.native
  
  /**
    * Gets/Sets width of the layout container.
    *
    */
  var width: js.UndefOr[String | Double] = js.native
}
object IgLayoutManager {
  
  @scala.inline
  def apply(): IgLayoutManager = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgLayoutManager]
  }
  
  @scala.inline
  implicit class IgLayoutManagerOps[Self <: IgLayoutManager] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBorderLayout(value: IgLayoutManagerBorderLayout): Self = this.set("borderLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderLayout: Self = this.set("borderLayout", js.undefined)
    
    @scala.inline
    def setGridLayout(value: IgLayoutManagerGridLayout): Self = this.set("gridLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGridLayout: Self = this.set("gridLayout", js.undefined)
    
    @scala.inline
    def setHeight(value: String | Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setInternalResized(value: (/* event */ Event, /* ui */ InternalResizedEventUIParam) => Unit): Self = this.set("internalResized", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteInternalResized: Self = this.set("internalResized", js.undefined)
    
    @scala.inline
    def setInternalResizing(value: (/* event */ Event, /* ui */ InternalResizingEventUIParam) => Unit): Self = this.set("internalResizing", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteInternalResizing: Self = this.set("internalResizing", js.undefined)
    
    @scala.inline
    def setItemCount(value: Double): Self = this.set("itemCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemCount: Self = this.set("itemCount", js.undefined)
    
    @scala.inline
    def setItemRendered(value: (/* event */ Event, /* ui */ ItemRenderedEventUIParam) => Unit): Self = this.set("itemRendered", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteItemRendered: Self = this.set("itemRendered", js.undefined)
    
    @scala.inline
    def setItemRendering(value: (/* event */ Event, /* ui */ ItemRenderingEventUIParam) => Unit): Self = this.set("itemRendering", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteItemRendering: Self = this.set("itemRendering", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: IgLayoutManagerItem*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[IgLayoutManagerItem]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    
    @scala.inline
    def setLayoutMode(value: js.Any): Self = this.set("layoutMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayoutMode: Self = this.set("layoutMode", js.undefined)
    
    @scala.inline
    def setRendered(value: (/* event */ Event, /* ui */ RenderedEventUIParam) => Unit): Self = this.set("rendered", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteRendered: Self = this.set("rendered", js.undefined)
    
    @scala.inline
    def setWidth(value: String | Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
