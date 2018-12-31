package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgPivotViewPivotGridOptionsGridOptions
  extends /**
	 * Option for IgPivotViewPivotGridOptionsGridOptions
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Enables/disables rendering of alternating row styles (odd and even rows receive different styling). Note that if a custom jQuery template is set, this has no effect and CSS for the row should be adjusted manually in the template contents.
  	 */
  var alternateRowStyles: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Caption text that will be shown above the pivot grid header.
  	 */
  var caption: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Default column width that will be set for all columns.
  	 *
  	 * Valid values:
  	 * "string" The default column width can be set in pixels (px).
  	 * "number" The default column width can be set as a number.
  	 */
  var defaultColumnWidth: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /**
  	 * Enables/disables rendering of ui-state-hover classes when the mouse is over a record. This can be useful in templating scenarios, for example, where we don't want to apply hover styling to templated content.
  	 */
  var enableHoverStyles: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * A list of grid features definitions. The supported features are Resizing and Tooltips. Each feature goes with its separate options that are documented for the feature accordingly.
  	 */
  var features: js.UndefOr[IgPivotViewPivotGridOptionsGridOptionsFeatures] = js.undefined
  /**
  	 * Headers will be fixed if this option is set to true, and only the grid data will be scrollable.
  	 */
  var fixedHeaders: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Initial tabIndex attribute that will be set on the container element.
  	 */
  var tabIndex: js.UndefOr[scala.Double] = js.undefined
}

