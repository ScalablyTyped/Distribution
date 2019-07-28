package typings.igniteDashUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgDialogLocale
  extends /**
	 * Option for IgDialogLocale
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Gets/Sets the title/tooltip for the close button in the dialog.
  	 *
  	 */
  var closeButtonTitle: js.UndefOr[String] = js.undefined
  /**
  	 * Gets/Sets the title/tooltip for the maximize button in the dialog.
  	 *
  	 */
  var maximizeButtonTitle: js.UndefOr[String] = js.undefined
  /**
  	 * Gets/Sets the title/tooltip for the minimize button in the dialog.
  	 *
  	 */
  var minimizeButtonTitle: js.UndefOr[String] = js.undefined
  /**
  	 * Gets/Sets the title/tooltip for the pin button in the dialog.
  	 *
  	 */
  var pinButtonTitle: js.UndefOr[String] = js.undefined
  /**
  	 * Gets/Sets the title/tooltip for the restore button in the dialog.
  	 *
  	 */
  var restoreButtonTitle: js.UndefOr[String] = js.undefined
  /**
  	 * Gets/Sets the title/tooltip for the pin button in the dialog.
  	 *
  	 */
  var unpinButtonTitle: js.UndefOr[String] = js.undefined
}

object IgDialogLocale {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgDialogLocale
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    closeButtonTitle: String = null,
    maximizeButtonTitle: String = null,
    minimizeButtonTitle: String = null,
    pinButtonTitle: String = null,
    restoreButtonTitle: String = null,
    unpinButtonTitle: String = null
  ): IgDialogLocale = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (closeButtonTitle != null) __obj.updateDynamic("closeButtonTitle")(closeButtonTitle)
    if (maximizeButtonTitle != null) __obj.updateDynamic("maximizeButtonTitle")(maximizeButtonTitle)
    if (minimizeButtonTitle != null) __obj.updateDynamic("minimizeButtonTitle")(minimizeButtonTitle)
    if (pinButtonTitle != null) __obj.updateDynamic("pinButtonTitle")(pinButtonTitle)
    if (restoreButtonTitle != null) __obj.updateDynamic("restoreButtonTitle")(restoreButtonTitle)
    if (unpinButtonTitle != null) __obj.updateDynamic("unpinButtonTitle")(unpinButtonTitle)
    __obj.asInstanceOf[IgDialogLocale]
  }
}

