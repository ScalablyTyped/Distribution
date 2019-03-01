package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgPivotViewPivotGridPanel
  extends /**
	 * Option for IgPivotViewPivotGridPanel
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Determines if the panel containing the igPivotGrid will initially collapsed.
  	 */
  var collapsed: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Determines if the panel containing the igPivotGrid will be collapsible.
  	 */
  var collapsible: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Determines if the panel containing the igPivotGrid will be resizable.
  	 */
  var resizable: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Determines the size of the igPivotGrid panel.
  	 *
  	 * Valid values:
  	 * "string" The panel size can be set in pixels (px).
  	 * "number" The size can be set as a number.
  	 * "null" will automatically size the panel.
  	 */
  var size: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

object IgPivotViewPivotGridPanel {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgPivotViewPivotGridPanel
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    collapsed: js.UndefOr[scala.Boolean] = js.undefined,
    collapsible: js.UndefOr[scala.Boolean] = js.undefined,
    resizable: js.UndefOr[scala.Boolean] = js.undefined,
    size: java.lang.String | scala.Double = null
  ): IgPivotViewPivotGridPanel = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(collapsed)) __obj.updateDynamic("collapsed")(collapsed)
    if (!js.isUndefined(collapsible)) __obj.updateDynamic("collapsible")(collapsible)
    if (!js.isUndefined(resizable)) __obj.updateDynamic("resizable")(resizable)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgPivotViewPivotGridPanel]
  }
}

