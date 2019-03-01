package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgDialogLocale
  extends /**
	 * Option for IgDialogLocale
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Gets/Sets the title/tooltip for the close button in the dialog.
  	 *
  	 */
  var closeButtonTitle: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets/Sets the title/tooltip for the maximize button in the dialog.
  	 *
  	 */
  var maximizeButtonTitle: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets/Sets the title/tooltip for the minimize button in the dialog.
  	 *
  	 */
  var minimizeButtonTitle: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets/Sets the title/tooltip for the pin button in the dialog.
  	 *
  	 */
  var pinButtonTitle: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets/Sets the title/tooltip for the restore button in the dialog.
  	 *
  	 */
  var restoreButtonTitle: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets/Sets the title/tooltip for the pin button in the dialog.
  	 *
  	 */
  var unpinButtonTitle: js.UndefOr[java.lang.String] = js.undefined
}

object IgDialogLocale {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgDialogLocale
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    closeButtonTitle: java.lang.String = null,
    maximizeButtonTitle: java.lang.String = null,
    minimizeButtonTitle: java.lang.String = null,
    pinButtonTitle: java.lang.String = null,
    restoreButtonTitle: java.lang.String = null,
    unpinButtonTitle: java.lang.String = null
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

