package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgZoombar
  extends /**
	 * Option for igZoombar
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
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
  var clone_FIgZoombar: js.UndefOr[java.lang.String | js.Object] = js.undefined
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
  var height: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
  	 * Specifies the animation duration (in milliseconds) when hover style is applied or removed from elements.
  	 *
  	 */
  var hoverStyleAnimationDuration: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Set/Get the locale language setting for the widget.
  	 *
  	 */
  var language: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Set/Get the locale setting for the widget.
  	 *
  	 */
  var locale: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Specifies a provider class which interfaces the widget that is being zoomed.
  	 * object Provider class to use. The provider should implement all methods in the $.ig.ZoombarProviderDefault class and is suggested to be extended from it.
  	 */
  var provider: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Event fired after a provider is created based on the options.provider value. If an instance is passed as a value for the option the event won't fire.
  	 * Use the event when utilizing a custom provider to assign options such as the zoomed widget's instance so that the provider's API is usable when igZoombar initializes its rendering.
  	 */
  var providerCreated: js.UndefOr[ProviderCreatedEvent] = js.undefined
  /**
  	 * Set/Get the regional setting for the widget.
  	 *
  	 */
  var regional: js.UndefOr[java.lang.String | js.Object] = js.undefined
  /**
  	 * Initial tabIndex for the Zoombar container elements.
  	 *
  	 */
  var tabIndex: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Specifies the element on which the widget the Zoombar is attached to is initialized.
  	 * object A valid jQuery object, the first element of which is that element.
  	 *
  	 */
  var target: js.UndefOr[java.lang.String | js.Object] = js.undefined
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
  var width: js.UndefOr[java.lang.String | scala.Double] = js.undefined
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
  var windowPanDuration: js.UndefOr[scala.Double] = js.undefined
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
  var zoomAction: js.UndefOr[java.lang.String] = js.undefined
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
  var zoomWindowMinWidth: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Specifies the distance (in percents) the zoom window moves when the left or right scroll bar buttons are clicked.
  	 *
  	 */
  var zoomWindowMoveDistance: js.UndefOr[scala.Double] = js.undefined
}

