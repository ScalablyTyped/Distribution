package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgTreeGridLocale
  extends /**
	 * Option for IgTreeGridLocale
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Specifies the collapse indicator tooltip text.
  	 *
  	 */
  var collapseTooltipText: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Specifies the expansion indicator tooltip text.
  	 *
  	 */
  var expandTooltipText: js.UndefOr[java.lang.String] = js.undefined
}

object IgTreeGridLocale {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgTreeGridLocale
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    collapseTooltipText: java.lang.String = null,
    expandTooltipText: java.lang.String = null
  ): IgTreeGridLocale = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (collapseTooltipText != null) __obj.updateDynamic("collapseTooltipText")(collapseTooltipText)
    if (expandTooltipText != null) __obj.updateDynamic("expandTooltipText")(expandTooltipText)
    __obj.asInstanceOf[IgTreeGridLocale]
  }
}

