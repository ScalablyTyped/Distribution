package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgHierarchicalGridLocale
  extends /**
	 * Option for IgHierarchicalGridLocale
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Specifies the default tooltip applied to an expand column cell, that is currently expanded.
  	 *
  	 */
  var collapseTooltip: js.UndefOr[String] = js.undefined
  /**
  	 * Specifies the default tooltip applied to an expand column cell, that is currently collapsed.
  	 *
  	 */
  var expandTooltip: js.UndefOr[String] = js.undefined
}

object IgHierarchicalGridLocale {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgHierarchicalGridLocale
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    collapseTooltip: String = null,
    expandTooltip: String = null
  ): IgHierarchicalGridLocale = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (collapseTooltip != null) __obj.updateDynamic("collapseTooltip")(collapseTooltip.asInstanceOf[js.Any])
    if (expandTooltip != null) __obj.updateDynamic("expandTooltip")(expandTooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgHierarchicalGridLocale]
  }
}

