package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgSplitter
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * Fired after collapsing is performed
    *
    *                 Function takes arguments evt and ui.
    *                 Use ui.owner to get a reference to the splitter instance.
    *                 Use ui.index to get an index of collapsed panel.
    */
  var collapsed: js.UndefOr[CollapsedEvent] = js.undefined
  /**
    * Specifies drag delta of the split bar. In order to start dragging "move", the mouse has to be moved specific distance from its original position.
    *
    */
  var dragDelta: js.UndefOr[Double] = js.undefined
  /**
    * Fired after expanding is performed
    *
    *                 Function takes arguments evt and ui.
    *                 Use ui.owner to get a reference to the splitter instance.
    *                 Use ui.index to get an index of expanded panel.
    */
  var expanded: js.UndefOr[ExpandedEvent] = js.undefined
  /**
    * Gets/Sets the height of the container.
    *
    *
    * Valid values:
    * "null" will fit the tree inside its parent container, if no other widths are defined.
    */
  var height: js.UndefOr[String | Double] = js.undefined
  /**
    * Set/Get the locale language setting for the widget.
    *
    */
  var language: js.UndefOr[String] = js.undefined
  /**
    * Fired after the panels are refreshed because of browser"s resizing.
    *
    *                 Function takes arguments evt and ui.
    *                 Use ui.owner to get a reference to the splitter instance.
    */
  var layoutRefreshed: js.UndefOr[LayoutRefreshedEvent] = js.undefined
  /**
    * Fired before the panels are refreshed because of browser"s resizing.
    *
    *                 Function takes arguments evt and ui.
    *                 Use ui.owner to get a reference to the splitter instance.
    */
  var layoutRefreshing: js.UndefOr[LayoutRefreshingEvent] = js.undefined
  /**
    * Set/Get the locale setting for the widget.
    *
    */
  var locale: js.UndefOr[js.Any] = js.undefined
  /**
    * Specifies the orientation of the splitter.
    *
    *
    * Valid values:
    * "vertical"
    * "horizontal"
    */
  var orientation: js.UndefOr[String] = js.undefined
  /**
    * Array of objects options that specify the panels settings. The panels are no more than two. Settings are specified via enumeration.
    *
    */
  var panels: js.UndefOr[js.Array[IgSplitterPanel]] = js.undefined
  /**
    * Set/Get the regional setting for the widget.
    *
    */
  var regional: js.UndefOr[String | js.Object] = js.undefined
  /**
    * Fired after split bar move is performed
    *
    *                 Function takes arguments evt and ui.
    *                 Use ui.owner to get a reference to the splitter instance.
    */
  var resizeEnded: js.UndefOr[ResizeEndedEvent] = js.undefined
  /**
    * Specifies whether the other splitters on the page will be resized as this splitter resizes.
    *
    */
  var resizeOtherSplitters: js.UndefOr[Boolean] = js.undefined
  /**
    * Fired before split bar move is performed
    *
    *                 Function takes arguments evt and ui.
    *                 Use ui.owner to get a reference to the splitter instance.
    */
  var resizeStarted: js.UndefOr[ResizeStartedEvent] = js.undefined
  /**
    * Fired while split bar move is performed
    *
    *                 Function takes arguments evt and ui.
    *                 Use ui.owner to get a reference to the splitter instance.
    */
  var resizing: js.UndefOr[ResizingEvent] = js.undefined
  /**
    * Gets/Sets the width of the container.
    *
    *
    * Valid values:
    * "null" will stretch to fit data, if no other widths are defined.
    */
  var width: js.UndefOr[String | Double] = js.undefined
}

object IgSplitter {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    collapsed: (/* event */ Event, /* ui */ CollapsedEventUIParam) => Unit = null,
    dragDelta: js.UndefOr[Double] = js.undefined,
    expanded: (/* event */ Event, /* ui */ ExpandedEventUIParam) => Unit = null,
    height: String | Double = null,
    language: String = null,
    layoutRefreshed: (/* event */ Event, /* ui */ LayoutRefreshedEventUIParam) => Unit = null,
    layoutRefreshing: (/* event */ Event, /* ui */ LayoutRefreshingEventUIParam) => Unit = null,
    locale: js.Any = null,
    orientation: String = null,
    panels: js.Array[IgSplitterPanel] = null,
    regional: String | js.Object = null,
    resizeEnded: (/* event */ Event, /* ui */ ResizeEndedEventUIParam) => Unit = null,
    resizeOtherSplitters: js.UndefOr[Boolean] = js.undefined,
    resizeStarted: (/* event */ Event, /* ui */ ResizeStartedEventUIParam) => Unit = null,
    resizing: (/* event */ Event, /* ui */ ResizingEventUIParam) => Unit = null,
    width: String | Double = null
  ): IgSplitter = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (collapsed != null) __obj.updateDynamic("collapsed")(js.Any.fromFunction2(collapsed))
    if (!js.isUndefined(dragDelta)) __obj.updateDynamic("dragDelta")(dragDelta.get.asInstanceOf[js.Any])
    if (expanded != null) __obj.updateDynamic("expanded")(js.Any.fromFunction2(expanded))
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (layoutRefreshed != null) __obj.updateDynamic("layoutRefreshed")(js.Any.fromFunction2(layoutRefreshed))
    if (layoutRefreshing != null) __obj.updateDynamic("layoutRefreshing")(js.Any.fromFunction2(layoutRefreshing))
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (panels != null) __obj.updateDynamic("panels")(panels.asInstanceOf[js.Any])
    if (regional != null) __obj.updateDynamic("regional")(regional.asInstanceOf[js.Any])
    if (resizeEnded != null) __obj.updateDynamic("resizeEnded")(js.Any.fromFunction2(resizeEnded))
    if (!js.isUndefined(resizeOtherSplitters)) __obj.updateDynamic("resizeOtherSplitters")(resizeOtherSplitters.get.asInstanceOf[js.Any])
    if (resizeStarted != null) __obj.updateDynamic("resizeStarted")(js.Any.fromFunction2(resizeStarted))
    if (resizing != null) __obj.updateDynamic("resizing")(js.Any.fromFunction2(resizing))
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgSplitter]
  }
}

