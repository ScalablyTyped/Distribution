package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgPopoverHeaderTemplate
  extends /**
	 * Option for IgPopoverHeaderTemplate
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Controls whether the popover renders a functional close button
  	 */
  var closeButton: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Sets the content for the popover header
  	 */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object IgPopoverHeaderTemplate {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgPopoverHeaderTemplate
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    closeButton: js.UndefOr[scala.Boolean] = js.undefined,
    title: java.lang.String = null
  ): IgPopoverHeaderTemplate = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(closeButton)) __obj.updateDynamic("closeButton")(closeButton)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[IgPopoverHeaderTemplate]
  }
}

