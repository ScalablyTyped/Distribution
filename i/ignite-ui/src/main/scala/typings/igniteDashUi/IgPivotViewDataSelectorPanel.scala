package typings.igniteDashUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgPivotViewDataSelectorPanel
  extends /**
	 * Option for IgPivotViewDataSelectorPanel
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Determines if the panel containing the igPivotDataSelector will initially collapsed.
  	 */
  var collapsed: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Determines if the panel containing the igPivotDataSelector will be collapsible.
  	 */
  var collapsible: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Determines the position of the data selector panel inside the igPivotView widget.
  	 */
  var location: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Determines if the panel containing the igPivotDataSelector will be resizable.
  	 */
  var resizable: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Determines the size of the igPivotDataSelector  panel. The recommended value is 250px.
  	 *
  	 * Valid values:
  	 * "string" The panel size can be set in pixels (px).
  	 * "number" The size can be set as a number.
  	 * "null" will automatically size the panel.
  	 */
  var size: js.UndefOr[String | Double] = js.undefined
}

object IgPivotViewDataSelectorPanel {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgPivotViewDataSelectorPanel
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    collapsed: js.UndefOr[Boolean] = js.undefined,
    collapsible: js.UndefOr[Boolean] = js.undefined,
    location: js.Any = null,
    resizable: js.UndefOr[Boolean] = js.undefined,
    size: String | Double = null
  ): IgPivotViewDataSelectorPanel = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(collapsed)) __obj.updateDynamic("collapsed")(collapsed)
    if (!js.isUndefined(collapsible)) __obj.updateDynamic("collapsible")(collapsible)
    if (location != null) __obj.updateDynamic("location")(location)
    if (!js.isUndefined(resizable)) __obj.updateDynamic("resizable")(resizable)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgPivotViewDataSelectorPanel]
  }
}

