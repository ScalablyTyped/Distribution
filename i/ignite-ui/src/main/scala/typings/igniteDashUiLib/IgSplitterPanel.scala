package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgSplitterPanel
  extends /**
	 * Option for IgSplitterPanel
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Gets whether the panel is initially collapsed
  	 *
  	 */
  var collapsed: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets whether the panel can be collapsed
  	 *
  	 */
  var collapsible: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets the maximum size that the panel can have
  	 *
  	 */
  var max: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /**
  	 * Gets the minimum size that the panel can have
  	 *
  	 */
  var min: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /**
  	 * Gets whether the panel can be resized
  	 *
  	 */
  var resizable: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets the size of the panel
  	 *
  	 */
  var size: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

object IgSplitterPanel {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgSplitterPanel
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    collapsed: js.UndefOr[scala.Boolean] = js.undefined,
    collapsible: js.UndefOr[scala.Boolean] = js.undefined,
    max: java.lang.String | scala.Double = null,
    min: java.lang.String | scala.Double = null,
    resizable: js.UndefOr[scala.Boolean] = js.undefined,
    size: java.lang.String | scala.Double = null
  ): IgSplitterPanel = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(collapsed)) __obj.updateDynamic("collapsed")(collapsed)
    if (!js.isUndefined(collapsible)) __obj.updateDynamic("collapsible")(collapsible)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (!js.isUndefined(resizable)) __obj.updateDynamic("resizable")(resizable)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgSplitterPanel]
  }
}

