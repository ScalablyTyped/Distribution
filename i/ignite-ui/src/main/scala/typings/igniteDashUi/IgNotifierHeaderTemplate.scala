package typings.igniteDashUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgNotifierHeaderTemplate
  extends /**
	 * Option for IgNotifierHeaderTemplate
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Controls whether the popover renders a functional close button
  	 *
  	 */
  var closeButton: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Sets the content for the popover header.
  	 *
  	 */
  var title: js.UndefOr[String] = js.undefined
}

object IgNotifierHeaderTemplate {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgNotifierHeaderTemplate
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    closeButton: js.UndefOr[Boolean] = js.undefined,
    title: String = null
  ): IgNotifierHeaderTemplate = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(closeButton)) __obj.updateDynamic("closeButton")(closeButton)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[IgNotifierHeaderTemplate]
  }
}

