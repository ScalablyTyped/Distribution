package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgZoombar
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[Any] {
  
  /**
    * Specifies how the target widget's clone is rendered inside the Zoombar.
    * object A valid set of properties to initialize the clone with.
    *
    *
    * Valid values:
    * "auto" Options for initializing the clone will be inferred from the target widget. Certain properties will be altered to make the clone more suitable for using inside the Zoombar.
    * "none" No clone of the target widget will be initialized inside the Zoombar.
    */
  @JSName("clone")
  var clone_FIgZoombar: js.UndefOr[String | js.Object] = js.undefined
  
  /**
    * Specifies the default zoom in percentages.
    *
    */
  var defaultZoomWindow: js.UndefOr[IgZoombarDefaultZoomWindow] = js.undefined
  
  /**
    * Specifies the height of the Zoombar.
    *
    *
    * Valid values:
    * "null" The Zoombar will stretch vertically to fit its container if it has height set, otherwise assumes 70px.
    */
  var height: js.UndefOr[Double | String] = js.undefined
  
  /**
    * Specifies the animation duration (in milliseconds) when hover style is applied or removed from elements.
    *
    */
  var hoverStyleAnimationDuration: js.UndefOr[Double] = js.undefined
  
  /**
    * Set/Get the locale language setting for the widget.
    *
    */
  var language: js.UndefOr[String] = js.undefined
  
  /**
    * Set/Get the locale setting for the widget.
    *
    */
  var locale: js.UndefOr[Any] = js.undefined
  
  /**
    * Specifies a provider class which interfaces the widget that is being zoomed.
    * object Provider class to use. The provider should implement all methods in the $.ig.ZoombarProviderDefault class and is suggested to be extended from it.
    */
  var provider: js.UndefOr[Any] = js.undefined
  
  /**
    * Event fired after a provider is created based on the options.provider value. If an instance is passed as a value for the option the event won't fire.
    * Use the event when utilizing a custom provider to assign options such as the zoomed widget's instance so that the provider's API is usable when igZoombar initializes its rendering.
    */
  var providerCreated: js.UndefOr[ProviderCreatedEvent] = js.undefined
  
  /**
    * Set/Get the regional setting for the widget.
    *
    */
  var regional: js.UndefOr[String | js.Object] = js.undefined
  
  /**
    * Initial tabIndex for the Zoombar container elements.
    *
    */
  var tabIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the element on which the widget the Zoombar is attached to is initialized.
    * object A valid jQuery object, the first element of which is that element.
    *
    */
  var target: js.UndefOr[String | js.Object] = js.undefined
  
  /**
    * Specifies the width of the Zoombar.
    *
    *
    * Valid values:
    * "auto" The width of the Zoombar will be the same as the widget it is attached to.
    * "number" The widget width in pixels (px).
    * "string" The widget width can be set in pixels (px) and percentage (%).
    * "null" The Zoombar will stretch horizontally to fit its container if it has width set, otherwise assumes auto.
    */
  var width: js.UndefOr[String | Double] = js.undefined
  
  /**
    * Event fired when the user stops dragging the zoom window.
    */
  var windowDragEnded: js.UndefOr[WindowDragEndedEvent] = js.undefined
  
  /**
    * Event fired when the user attemtps to stop dragging the zoom window.
    */
  var windowDragEnding: js.UndefOr[WindowDragEndingEvent] = js.undefined
  
  /**
    * Event fired when the user starts dragging the zoom window.
    */
  var windowDragStarted: js.UndefOr[WindowDragStartedEvent] = js.undefined
  
  /**
    * Event fired when the user attempts to drag the zoom window.
    */
  var windowDragStarting: js.UndefOr[WindowDragStartingEvent] = js.undefined
  
  /**
    * Event fired when the user drags the zoom window.
    */
  var windowDragging: js.UndefOr[WindowDraggingEvent] = js.undefined
  
  /**
    * Specifies the pan duration (in milliseconds) when the window changes position. Set to 0 for snap.
    *
    */
  var windowPanDuration: js.UndefOr[Double] = js.undefined
  
  /**
    * Event fired after the user resizes the zoom window with the window"s handles.
    */
  var windowResized: js.UndefOr[WindowResizedEvent] = js.undefined
  
  /**
    * Event fired when the user resizes the zoom window with the window"s handles.
    */
  var windowResizing: js.UndefOr[WindowResizingEvent] = js.undefined
  
  /**
    * Specifies when the zoom effect is applied.
    *
    *
    * Valid values:
    * "immediate" The zoom action is applied as the end-user interacts with the zoom window.
    * "deferred" The zoom action is applied after the interaction with the zoom window completes.
    */
  var zoomAction: js.UndefOr[String] = js.undefined
  
  /**
    * Event fired after a zoom action is applied.
    */
  var zoomChanged: js.UndefOr[ZoomChangedEvent] = js.undefined
  
  /**
    * Event fired before a zoom action is applied
    */
  var zoomChanging: js.UndefOr[ZoomChangingEvent] = js.undefined
  
  /**
    * The minimal width the zoom window can have in percentages.
    *
    */
  var zoomWindowMinWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the distance (in percents) the zoom window moves when the left or right scroll bar buttons are clicked.
    *
    */
  var zoomWindowMoveDistance: js.UndefOr[Double] = js.undefined
}
object IgZoombar {
  
  inline def apply(): IgZoombar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgZoombar]
  }
  
  extension [Self <: IgZoombar](x: Self) {
    
    inline def setClone_(value: String | js.Object): Self = StObject.set(x, "clone", value.asInstanceOf[js.Any])
    
    inline def setClone_Undefined: Self = StObject.set(x, "clone", js.undefined)
    
    inline def setDefaultZoomWindow(value: IgZoombarDefaultZoomWindow): Self = StObject.set(x, "defaultZoomWindow", value.asInstanceOf[js.Any])
    
    inline def setDefaultZoomWindowUndefined: Self = StObject.set(x, "defaultZoomWindow", js.undefined)
    
    inline def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setHoverStyleAnimationDuration(value: Double): Self = StObject.set(x, "hoverStyleAnimationDuration", value.asInstanceOf[js.Any])
    
    inline def setHoverStyleAnimationDurationUndefined: Self = StObject.set(x, "hoverStyleAnimationDuration", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setLocale(value: Any): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setProvider(value: Any): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    inline def setProviderCreated(value: (/* event */ Event, /* ui */ ProviderCreatedEventUIParam) => Unit): Self = StObject.set(x, "providerCreated", js.Any.fromFunction2(value))
    
    inline def setProviderCreatedUndefined: Self = StObject.set(x, "providerCreated", js.undefined)
    
    inline def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
    
    inline def setRegional(value: String | js.Object): Self = StObject.set(x, "regional", value.asInstanceOf[js.Any])
    
    inline def setRegionalUndefined: Self = StObject.set(x, "regional", js.undefined)
    
    inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    
    inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
    
    inline def setTarget(value: String | js.Object): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setWindowDragEnded(value: (/* event */ Event, /* ui */ WindowDragEndedEventUIParam) => Unit): Self = StObject.set(x, "windowDragEnded", js.Any.fromFunction2(value))
    
    inline def setWindowDragEndedUndefined: Self = StObject.set(x, "windowDragEnded", js.undefined)
    
    inline def setWindowDragEnding(value: (/* event */ Event, /* ui */ WindowDragEndingEventUIParam) => Unit): Self = StObject.set(x, "windowDragEnding", js.Any.fromFunction2(value))
    
    inline def setWindowDragEndingUndefined: Self = StObject.set(x, "windowDragEnding", js.undefined)
    
    inline def setWindowDragStarted(value: (/* event */ Event, /* ui */ WindowDragStartedEventUIParam) => Unit): Self = StObject.set(x, "windowDragStarted", js.Any.fromFunction2(value))
    
    inline def setWindowDragStartedUndefined: Self = StObject.set(x, "windowDragStarted", js.undefined)
    
    inline def setWindowDragStarting(value: (/* event */ Event, /* ui */ WindowDragStartingEventUIParam) => Unit): Self = StObject.set(x, "windowDragStarting", js.Any.fromFunction2(value))
    
    inline def setWindowDragStartingUndefined: Self = StObject.set(x, "windowDragStarting", js.undefined)
    
    inline def setWindowDragging(value: (/* event */ Event, /* ui */ WindowDraggingEventUIParam) => Unit): Self = StObject.set(x, "windowDragging", js.Any.fromFunction2(value))
    
    inline def setWindowDraggingUndefined: Self = StObject.set(x, "windowDragging", js.undefined)
    
    inline def setWindowPanDuration(value: Double): Self = StObject.set(x, "windowPanDuration", value.asInstanceOf[js.Any])
    
    inline def setWindowPanDurationUndefined: Self = StObject.set(x, "windowPanDuration", js.undefined)
    
    inline def setWindowResized(value: (/* event */ Event, /* ui */ WindowResizedEventUIParam) => Unit): Self = StObject.set(x, "windowResized", js.Any.fromFunction2(value))
    
    inline def setWindowResizedUndefined: Self = StObject.set(x, "windowResized", js.undefined)
    
    inline def setWindowResizing(value: (/* event */ Event, /* ui */ WindowResizingEventUIParam) => Unit): Self = StObject.set(x, "windowResizing", js.Any.fromFunction2(value))
    
    inline def setWindowResizingUndefined: Self = StObject.set(x, "windowResizing", js.undefined)
    
    inline def setZoomAction(value: String): Self = StObject.set(x, "zoomAction", value.asInstanceOf[js.Any])
    
    inline def setZoomActionUndefined: Self = StObject.set(x, "zoomAction", js.undefined)
    
    inline def setZoomChanged(value: (/* event */ Event, /* ui */ ZoomChangedEventUIParam) => Unit): Self = StObject.set(x, "zoomChanged", js.Any.fromFunction2(value))
    
    inline def setZoomChangedUndefined: Self = StObject.set(x, "zoomChanged", js.undefined)
    
    inline def setZoomChanging(value: (/* event */ Event, /* ui */ ZoomChangingEventUIParam) => Unit): Self = StObject.set(x, "zoomChanging", js.Any.fromFunction2(value))
    
    inline def setZoomChangingUndefined: Self = StObject.set(x, "zoomChanging", js.undefined)
    
    inline def setZoomWindowMinWidth(value: Double): Self = StObject.set(x, "zoomWindowMinWidth", value.asInstanceOf[js.Any])
    
    inline def setZoomWindowMinWidthUndefined: Self = StObject.set(x, "zoomWindowMinWidth", js.undefined)
    
    inline def setZoomWindowMoveDistance(value: Double): Self = StObject.set(x, "zoomWindowMoveDistance", value.asInstanceOf[js.Any])
    
    inline def setZoomWindowMoveDistanceUndefined: Self = StObject.set(x, "zoomWindowMoveDistance", js.undefined)
  }
}
