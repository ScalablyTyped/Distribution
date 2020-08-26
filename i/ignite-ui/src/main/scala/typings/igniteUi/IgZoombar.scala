package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgZoombar
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
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
  var clone_FIgZoombar: js.UndefOr[String | js.Object] = js.native
  /**
    * Specifies the default zoom in percentages.
    *
    */
  var defaultZoomWindow: js.UndefOr[IgZoombarDefaultZoomWindow] = js.native
  /**
    * Specifies the height of the Zoombar.
    *
    *
    * Valid values:
    * "null" The Zoombar will stretch vertically to fit its container if it has height set, otherwise assumes 70px.
    */
  var height: js.UndefOr[Double | String] = js.native
  /**
    * Specifies the animation duration (in milliseconds) when hover style is applied or removed from elements.
    *
    */
  var hoverStyleAnimationDuration: js.UndefOr[Double] = js.native
  /**
    * Set/Get the locale language setting for the widget.
    *
    */
  var language: js.UndefOr[String] = js.native
  /**
    * Set/Get the locale setting for the widget.
    *
    */
  var locale: js.UndefOr[js.Any] = js.native
  /**
    * Specifies a provider class which interfaces the widget that is being zoomed.
    * object Provider class to use. The provider should implement all methods in the $.ig.ZoombarProviderDefault class and is suggested to be extended from it.
    */
  var provider: js.UndefOr[js.Any] = js.native
  /**
    * Event fired after a provider is created based on the options.provider value. If an instance is passed as a value for the option the event won't fire.
    * Use the event when utilizing a custom provider to assign options such as the zoomed widget's instance so that the provider's API is usable when igZoombar initializes its rendering.
    */
  var providerCreated: js.UndefOr[ProviderCreatedEvent] = js.native
  /**
    * Set/Get the regional setting for the widget.
    *
    */
  var regional: js.UndefOr[String | js.Object] = js.native
  /**
    * Initial tabIndex for the Zoombar container elements.
    *
    */
  var tabIndex: js.UndefOr[Double] = js.native
  /**
    * Specifies the element on which the widget the Zoombar is attached to is initialized.
    * object A valid jQuery object, the first element of which is that element.
    *
    */
  var target: js.UndefOr[String | js.Object] = js.native
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
  var width: js.UndefOr[String | Double] = js.native
  /**
    * Event fired when the user stops dragging the zoom window.
    */
  var windowDragEnded: js.UndefOr[WindowDragEndedEvent] = js.native
  /**
    * Event fired when the user attemtps to stop dragging the zoom window.
    */
  var windowDragEnding: js.UndefOr[WindowDragEndingEvent] = js.native
  /**
    * Event fired when the user starts dragging the zoom window.
    */
  var windowDragStarted: js.UndefOr[WindowDragStartedEvent] = js.native
  /**
    * Event fired when the user attempts to drag the zoom window.
    */
  var windowDragStarting: js.UndefOr[WindowDragStartingEvent] = js.native
  /**
    * Event fired when the user drags the zoom window.
    */
  var windowDragging: js.UndefOr[WindowDraggingEvent] = js.native
  /**
    * Specifies the pan duration (in milliseconds) when the window changes position. Set to 0 for snap.
    *
    */
  var windowPanDuration: js.UndefOr[Double] = js.native
  /**
    * Event fired after the user resizes the zoom window with the window"s handles.
    */
  var windowResized: js.UndefOr[WindowResizedEvent] = js.native
  /**
    * Event fired when the user resizes the zoom window with the window"s handles.
    */
  var windowResizing: js.UndefOr[WindowResizingEvent] = js.native
  /**
    * Specifies when the zoom effect is applied.
    *
    *
    * Valid values:
    * "immediate" The zoom action is applied as the end-user interacts with the zoom window.
    * "deferred" The zoom action is applied after the interaction with the zoom window completes.
    */
  var zoomAction: js.UndefOr[String] = js.native
  /**
    * Event fired after a zoom action is applied.
    */
  var zoomChanged: js.UndefOr[ZoomChangedEvent] = js.native
  /**
    * Event fired before a zoom action is applied
    */
  var zoomChanging: js.UndefOr[ZoomChangingEvent] = js.native
  /**
    * The minimal width the zoom window can have in percentages.
    *
    */
  var zoomWindowMinWidth: js.UndefOr[Double] = js.native
  /**
    * Specifies the distance (in percents) the zoom window moves when the left or right scroll bar buttons are clicked.
    *
    */
  var zoomWindowMoveDistance: js.UndefOr[Double] = js.native
}

object IgZoombar {
  @scala.inline
  def apply(): IgZoombar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgZoombar]
  }
  @scala.inline
  implicit class IgZoombarOps[Self <: IgZoombar] (val x: Self) extends AnyVal {
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
    def setClone(value: String | js.Object): Self = this.set("clone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClone: Self = this.set("clone", js.undefined)
    @scala.inline
    def setDefaultZoomWindow(value: IgZoombarDefaultZoomWindow): Self = this.set("defaultZoomWindow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultZoomWindow: Self = this.set("defaultZoomWindow", js.undefined)
    @scala.inline
    def setHeight(value: Double | String): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setHoverStyleAnimationDuration(value: Double): Self = this.set("hoverStyleAnimationDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHoverStyleAnimationDuration: Self = this.set("hoverStyleAnimationDuration", js.undefined)
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    @scala.inline
    def setLocale(value: js.Any): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setProvider(value: js.Any): Self = this.set("provider", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvider: Self = this.set("provider", js.undefined)
    @scala.inline
    def setProviderCreated(value: (/* event */ Event, /* ui */ ProviderCreatedEventUIParam) => Unit): Self = this.set("providerCreated", js.Any.fromFunction2(value))
    @scala.inline
    def deleteProviderCreated: Self = this.set("providerCreated", js.undefined)
    @scala.inline
    def setRegional(value: String | js.Object): Self = this.set("regional", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegional: Self = this.set("regional", js.undefined)
    @scala.inline
    def setTabIndex(value: Double): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabIndex: Self = this.set("tabIndex", js.undefined)
    @scala.inline
    def setTarget(value: String | js.Object): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    @scala.inline
    def setWidth(value: String | Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setWindowDragEnded(value: (/* event */ Event, /* ui */ WindowDragEndedEventUIParam) => Unit): Self = this.set("windowDragEnded", js.Any.fromFunction2(value))
    @scala.inline
    def deleteWindowDragEnded: Self = this.set("windowDragEnded", js.undefined)
    @scala.inline
    def setWindowDragEnding(value: (/* event */ Event, /* ui */ WindowDragEndingEventUIParam) => Unit): Self = this.set("windowDragEnding", js.Any.fromFunction2(value))
    @scala.inline
    def deleteWindowDragEnding: Self = this.set("windowDragEnding", js.undefined)
    @scala.inline
    def setWindowDragStarted(value: (/* event */ Event, /* ui */ WindowDragStartedEventUIParam) => Unit): Self = this.set("windowDragStarted", js.Any.fromFunction2(value))
    @scala.inline
    def deleteWindowDragStarted: Self = this.set("windowDragStarted", js.undefined)
    @scala.inline
    def setWindowDragStarting(value: (/* event */ Event, /* ui */ WindowDragStartingEventUIParam) => Unit): Self = this.set("windowDragStarting", js.Any.fromFunction2(value))
    @scala.inline
    def deleteWindowDragStarting: Self = this.set("windowDragStarting", js.undefined)
    @scala.inline
    def setWindowDragging(value: (/* event */ Event, /* ui */ WindowDraggingEventUIParam) => Unit): Self = this.set("windowDragging", js.Any.fromFunction2(value))
    @scala.inline
    def deleteWindowDragging: Self = this.set("windowDragging", js.undefined)
    @scala.inline
    def setWindowPanDuration(value: Double): Self = this.set("windowPanDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWindowPanDuration: Self = this.set("windowPanDuration", js.undefined)
    @scala.inline
    def setWindowResized(value: (/* event */ Event, /* ui */ WindowResizedEventUIParam) => Unit): Self = this.set("windowResized", js.Any.fromFunction2(value))
    @scala.inline
    def deleteWindowResized: Self = this.set("windowResized", js.undefined)
    @scala.inline
    def setWindowResizing(value: (/* event */ Event, /* ui */ WindowResizingEventUIParam) => Unit): Self = this.set("windowResizing", js.Any.fromFunction2(value))
    @scala.inline
    def deleteWindowResizing: Self = this.set("windowResizing", js.undefined)
    @scala.inline
    def setZoomAction(value: String): Self = this.set("zoomAction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomAction: Self = this.set("zoomAction", js.undefined)
    @scala.inline
    def setZoomChanged(value: (/* event */ Event, /* ui */ ZoomChangedEventUIParam) => Unit): Self = this.set("zoomChanged", js.Any.fromFunction2(value))
    @scala.inline
    def deleteZoomChanged: Self = this.set("zoomChanged", js.undefined)
    @scala.inline
    def setZoomChanging(value: (/* event */ Event, /* ui */ ZoomChangingEventUIParam) => Unit): Self = this.set("zoomChanging", js.Any.fromFunction2(value))
    @scala.inline
    def deleteZoomChanging: Self = this.set("zoomChanging", js.undefined)
    @scala.inline
    def setZoomWindowMinWidth(value: Double): Self = this.set("zoomWindowMinWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomWindowMinWidth: Self = this.set("zoomWindowMinWidth", js.undefined)
    @scala.inline
    def setZoomWindowMoveDistance(value: Double): Self = this.set("zoomWindowMoveDistance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomWindowMoveDistance: Self = this.set("zoomWindowMoveDistance", js.undefined)
  }
  
}

