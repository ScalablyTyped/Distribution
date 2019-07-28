package typings.igniteDashUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgToolbarLocale
  extends /**
	 * Option for IgToolbarLocale
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Gets/Sets collapse button title.
  	 *
  	 */
  var collapseButtonTitle: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets/Sets expand button title.
  	 *
  	 */
  var expandButtonTitle: js.UndefOr[js.Any] = js.undefined
}

object IgToolbarLocale {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgToolbarLocale
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    collapseButtonTitle: js.Any = null,
    expandButtonTitle: js.Any = null
  ): IgToolbarLocale = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (collapseButtonTitle != null) __obj.updateDynamic("collapseButtonTitle")(collapseButtonTitle)
    if (expandButtonTitle != null) __obj.updateDynamic("expandButtonTitle")(expandButtonTitle)
    __obj.asInstanceOf[IgToolbarLocale]
  }
}

