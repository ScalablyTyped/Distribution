package typings.igniteDashUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgPopoverHeaderTemplate
  extends /**
	 * Option for IgPopoverHeaderTemplate
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Controls whether the popover renders a functional close button
  	 */
  var closeButton: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Sets the content for the popover header
  	 */
  var title: js.UndefOr[String] = js.undefined
}

object IgPopoverHeaderTemplate {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgPopoverHeaderTemplate
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    closeButton: js.UndefOr[Boolean] = js.undefined,
    title: String = null
  ): IgPopoverHeaderTemplate = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(closeButton)) __obj.updateDynamic("closeButton")(closeButton.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgPopoverHeaderTemplate]
  }
}

