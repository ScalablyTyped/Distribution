package typings.igniteDashUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgTreeGridLocale
  extends /**
	 * Option for IgTreeGridLocale
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Specifies the collapse indicator tooltip text.
  	 *
  	 */
  var collapseTooltipText: js.UndefOr[String] = js.undefined
  /**
  	 * Specifies the expansion indicator tooltip text.
  	 *
  	 */
  var expandTooltipText: js.UndefOr[String] = js.undefined
}

object IgTreeGridLocale {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgTreeGridLocale
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    collapseTooltipText: String = null,
    expandTooltipText: String = null
  ): IgTreeGridLocale = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (collapseTooltipText != null) __obj.updateDynamic("collapseTooltipText")(collapseTooltipText)
    if (expandTooltipText != null) __obj.updateDynamic("expandTooltipText")(expandTooltipText)
    __obj.asInstanceOf[IgTreeGridLocale]
  }
}

