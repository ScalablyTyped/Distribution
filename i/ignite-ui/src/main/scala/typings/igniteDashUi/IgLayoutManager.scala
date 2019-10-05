package typings.igniteDashUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgLayoutManager
  extends /**
	 * Option for igLayoutManager
	 */
/* optionName */ StringDictionary[js.Any] {
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
  var layoutMode: js.UndefOr[js.Any] = js.undefined
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
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for igLayoutManager
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    borderLayout: IgLayoutManagerBorderLayout = null,
    gridLayout: IgLayoutManagerGridLayout = null,
    height: String | Double = null,
    internalResized: (/* event */ Event, /* ui */ InternalResizedEventUIParam) => Unit = null,
    internalResizing: (/* event */ Event, /* ui */ InternalResizingEventUIParam) => Unit = null,
    itemCount: Int | Double = null,
    itemRendered: (/* event */ Event, /* ui */ ItemRenderedEventUIParam) => Unit = null,
    itemRendering: (/* event */ Event, /* ui */ ItemRenderingEventUIParam) => Unit = null,
    items: js.Array[IgLayoutManagerItem] = null,
    layoutMode: js.Any = null,
    rendered: (/* event */ Event, /* ui */ RenderedEventUIParam) => Unit = null,
    width: String | Double = null
  ): IgLayoutManager = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (borderLayout != null) __obj.updateDynamic("borderLayout")(borderLayout)
    if (gridLayout != null) __obj.updateDynamic("gridLayout")(gridLayout)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (internalResized != null) __obj.updateDynamic("internalResized")(js.Any.fromFunction2(internalResized))
    if (internalResizing != null) __obj.updateDynamic("internalResizing")(js.Any.fromFunction2(internalResizing))
    if (itemCount != null) __obj.updateDynamic("itemCount")(itemCount.asInstanceOf[js.Any])
    if (itemRendered != null) __obj.updateDynamic("itemRendered")(js.Any.fromFunction2(itemRendered))
    if (itemRendering != null) __obj.updateDynamic("itemRendering")(js.Any.fromFunction2(itemRendering))
    if (items != null) __obj.updateDynamic("items")(items)
    if (layoutMode != null) __obj.updateDynamic("layoutMode")(layoutMode)
    if (rendered != null) __obj.updateDynamic("rendered")(js.Any.fromFunction2(rendered))
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgLayoutManager]
  }
}

