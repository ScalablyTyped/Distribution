package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IgGridResponsive
  extends /**
	 * Option for igGridResponsive
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * When windowWidthToRenderVertically is null, determine minimal widths columns can take before
  	 * forcing vertical rendering for the grid
  	 *
  	 */
  var allowedColumnWidthPerType: js.UndefOr[IgGridResponsiveAllowedColumnWidthPerType] = js.undefined
  /**
  	 * A list of column settings that specifies how columns will react based on the environment the grid is run on.
  	 *
  	 */
  var columnSettings: js.UndefOr[js.Array[IgGridResponsiveColumnSetting]] = js.undefined
  /**
  	 * Enable or disable the responsive vertical rendering for the grid.
  	 *
  	 */
  var enableVerticalRendering: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * If this option is set to true the widget will ensure the grid's width is always set to 100%.
  	 *
  	 */
  var forceResponsiveGridWidth: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Enables/disables feature inheritance for the child layouts. NOTE: It only applies for igHierarchicalGrid.
  	 */
  var inherit: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * The width of the properties column when vertical rendering is enabled
  	 *
  	 *
  	 * Valid values:
  	 * "string" The width in a (%) string
  	 * "number" The width as a number in percents
  	 */
  var propertiesColumnWidth: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /**
  	 * If this option is set to true an igResponsiveContainer widget will be attached to the igGrid control which will notify the feature when changes in the width of the container occur.
  	 *
  	 */
  var reactOnContainerWidthChanges: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Event fired after a hiding operation is executed on the collection of columns.
  	 */
  var responsiveColumnHidden: js.UndefOr[ResponsiveColumnHiddenEvent] = js.undefined
  /**
  	 * Event fired before a hiding operation is executed on a collection of columns.
  	 */
  var responsiveColumnHiding: js.UndefOr[ResponsiveColumnHidingEvent] = js.undefined
  /**
  	 * Event fired before a showing operation is executed on a collection of columns.
  	 */
  var responsiveColumnShowing: js.UndefOr[ResponsiveColumnShowingEvent] = js.undefined
  /**
  	 * Event fired after a showing operation is executed on the collection of columns.
  	 */
  var responsiveColumnShown: js.UndefOr[ResponsiveColumnShownEvent] = js.undefined
  /**
  	 * Event which is fired when the widget detects an environment change.
  	 */
  var responsiveModeChanged: js.UndefOr[ResponsiveModeChangedEvent] = js.undefined
  /**
  	 * The recognized types of environments and their configuration.
  	 *
  	 */
  var responsiveModes: js.UndefOr[js.Any] = js.undefined
  /**
  	 * The amount of pixels the window needs to resize with for the grid to respond.
  	 *
  	 */
  var responsiveSensitivity: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Specifies a template to render a record with in a list-view style layout per mode.
  	 *
  	 */
  var singleColumnTemplate: js.UndefOr[js.Any] = js.undefined
  /**
  	 * The width of the values column when vertical rendering is enabled
  	 *
  	 *
  	 * Valid values:
  	 * "string" The width in a (%) string
  	 * "number" The width as a number in percents
  	 */
  var valuesColumnWidth: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /**
  	 * The window's width under which the grid will render its contents vertically.
  	 *
  	 *
  	 * Valid values:
  	 * "string" The width in a (px) string
  	 * "number" The width as a number
  	 * "null" The grid will determine when to render this mode automatically.
  	 */
  var windowWidthToRenderVertically: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

