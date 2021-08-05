package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgSplitter
  extends StObject
     with /**
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
  
  inline def apply(): IgSplitter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgSplitter]
  }
  
  extension [Self <: IgSplitter](x: Self) {
    
    inline def setCollapsed(value: (/* event */ Event, /* ui */ CollapsedEventUIParam) => Unit): Self = StObject.set(x, "collapsed", js.Any.fromFunction2(value))
    
    inline def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
    
    inline def setDragDelta(value: Double): Self = StObject.set(x, "dragDelta", value.asInstanceOf[js.Any])
    
    inline def setDragDeltaUndefined: Self = StObject.set(x, "dragDelta", js.undefined)
    
    inline def setExpanded(value: (/* event */ Event, /* ui */ ExpandedEventUIParam) => Unit): Self = StObject.set(x, "expanded", js.Any.fromFunction2(value))
    
    inline def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
    
    inline def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setLayoutRefreshed(value: (/* event */ Event, /* ui */ LayoutRefreshedEventUIParam) => Unit): Self = StObject.set(x, "layoutRefreshed", js.Any.fromFunction2(value))
    
    inline def setLayoutRefreshedUndefined: Self = StObject.set(x, "layoutRefreshed", js.undefined)
    
    inline def setLayoutRefreshing(value: (/* event */ Event, /* ui */ LayoutRefreshingEventUIParam) => Unit): Self = StObject.set(x, "layoutRefreshing", js.Any.fromFunction2(value))
    
    inline def setLayoutRefreshingUndefined: Self = StObject.set(x, "layoutRefreshing", js.undefined)
    
    inline def setLocale(value: js.Any): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setOrientation(value: String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setPanels(value: js.Array[IgSplitterPanel]): Self = StObject.set(x, "panels", value.asInstanceOf[js.Any])
    
    inline def setPanelsUndefined: Self = StObject.set(x, "panels", js.undefined)
    
    inline def setPanelsVarargs(value: IgSplitterPanel*): Self = StObject.set(x, "panels", js.Array(value :_*))
    
    inline def setRegional(value: String | js.Object): Self = StObject.set(x, "regional", value.asInstanceOf[js.Any])
    
    inline def setRegionalUndefined: Self = StObject.set(x, "regional", js.undefined)
    
    inline def setResizeEnded(value: (/* event */ Event, /* ui */ ResizeEndedEventUIParam) => Unit): Self = StObject.set(x, "resizeEnded", js.Any.fromFunction2(value))
    
    inline def setResizeEndedUndefined: Self = StObject.set(x, "resizeEnded", js.undefined)
    
    inline def setResizeOtherSplitters(value: Boolean): Self = StObject.set(x, "resizeOtherSplitters", value.asInstanceOf[js.Any])
    
    inline def setResizeOtherSplittersUndefined: Self = StObject.set(x, "resizeOtherSplitters", js.undefined)
    
    inline def setResizeStarted(value: (/* event */ Event, /* ui */ ResizeStartedEventUIParam) => Unit): Self = StObject.set(x, "resizeStarted", js.Any.fromFunction2(value))
    
    inline def setResizeStartedUndefined: Self = StObject.set(x, "resizeStarted", js.undefined)
    
    inline def setResizing(value: (/* event */ Event, /* ui */ ResizingEventUIParam) => Unit): Self = StObject.set(x, "resizing", js.Any.fromFunction2(value))
    
    inline def setResizingUndefined: Self = StObject.set(x, "resizing", js.undefined)
    
    inline def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
