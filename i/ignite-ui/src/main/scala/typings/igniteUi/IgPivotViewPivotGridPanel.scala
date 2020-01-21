package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgPivotViewPivotGridPanel
  extends /**
	 * Option for IgPivotViewPivotGridPanel
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Determines if the panel containing the igPivotGrid will initially collapsed.
  	 */
  var collapsed: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Determines if the panel containing the igPivotGrid will be collapsible.
  	 */
  var collapsible: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Determines if the panel containing the igPivotGrid will be resizable.
  	 */
  var resizable: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Determines the size of the igPivotGrid panel.
  	 *
  	 * Valid values:
  	 * "string" The panel size can be set in pixels (px).
  	 * "number" The size can be set as a number.
  	 * "null" will automatically size the panel.
  	 */
  var size: js.UndefOr[String | Double] = js.undefined
}

object IgPivotViewPivotGridPanel {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgPivotViewPivotGridPanel
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    collapsed: js.UndefOr[Boolean] = js.undefined,
    collapsible: js.UndefOr[Boolean] = js.undefined,
    resizable: js.UndefOr[Boolean] = js.undefined,
    size: String | Double = null
  ): IgPivotViewPivotGridPanel = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(collapsed)) __obj.updateDynamic("collapsed")(collapsed.asInstanceOf[js.Any])
    if (!js.isUndefined(collapsible)) __obj.updateDynamic("collapsible")(collapsible.asInstanceOf[js.Any])
    if (!js.isUndefined(resizable)) __obj.updateDynamic("resizable")(resizable.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgPivotViewPivotGridPanel]
  }
}

