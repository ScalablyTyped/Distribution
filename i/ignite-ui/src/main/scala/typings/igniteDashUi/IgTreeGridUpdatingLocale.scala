package typings.igniteDashUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgTreeGridUpdatingLocale
  extends /**
	 * Option for IgTreeGridUpdatingLocale
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Specifies the label of the add child button in touch environment.
  	 *
  	 */
  var addChildButtonLabel: js.UndefOr[String] = js.undefined
  /**
  	 * Specifies the add child tooltip text.
  	 *
  	 */
  var addChildTooltip: js.UndefOr[String] = js.undefined
}

object IgTreeGridUpdatingLocale {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgTreeGridUpdatingLocale
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    addChildButtonLabel: String = null,
    addChildTooltip: String = null
  ): IgTreeGridUpdatingLocale = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (addChildButtonLabel != null) __obj.updateDynamic("addChildButtonLabel")(addChildButtonLabel)
    if (addChildTooltip != null) __obj.updateDynamic("addChildTooltip")(addChildTooltip)
    __obj.asInstanceOf[IgTreeGridUpdatingLocale]
  }
}

