package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IgSplitter
  extends /**
	 * Option for igSplitter
	 */
/* optionName */ ScalablyTyped.runtime.StringDictionary[js.Any] {
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
  var dragDelta: js.UndefOr[scala.Double] = js.undefined
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
  var height: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /**
  	 * Set/Get the locale language setting for the widget.
  	 *
  	 */
  var language: js.UndefOr[java.lang.String] = js.undefined
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
  var orientation: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Array of objects options that specify the panels settings. The panels are no more than two. Settings are specified via enumeration.
  	 *
  	 */
  var panels: js.UndefOr[js.Array[IgSplitterPanel]] = js.undefined
  /**
  	 * Set/Get the regional setting for the widget.
  	 *
  	 */
  var regional: js.UndefOr[java.lang.String | js.Object] = js.undefined
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
  var resizeOtherSplitters: js.UndefOr[scala.Boolean] = js.undefined
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
  var width: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

