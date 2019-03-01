package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgHierarchicalGridLocale
  extends /**
	 * Option for IgHierarchicalGridLocale
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Specifies the default tooltip applied to an expand column cell, that is currently expanded.
  	 *
  	 */
  var collapseTooltip: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Specifies the default tooltip applied to an expand column cell, that is currently collapsed.
  	 *
  	 */
  var expandTooltip: js.UndefOr[java.lang.String] = js.undefined
}

object IgHierarchicalGridLocale {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgHierarchicalGridLocale
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    collapseTooltip: java.lang.String = null,
    expandTooltip: java.lang.String = null
  ): IgHierarchicalGridLocale = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (collapseTooltip != null) __obj.updateDynamic("collapseTooltip")(collapseTooltip)
    if (expandTooltip != null) __obj.updateDynamic("expandTooltip")(expandTooltip)
    __obj.asInstanceOf[IgHierarchicalGridLocale]
  }
}

