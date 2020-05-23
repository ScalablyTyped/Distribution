package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgDialogLocale
  extends /**
  * Option for JSONPDataSourceSettings
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
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    closeButtonTitle: String = null,
    maximizeButtonTitle: String = null,
    minimizeButtonTitle: String = null,
    pinButtonTitle: String = null,
    restoreButtonTitle: String = null,
    unpinButtonTitle: String = null
  ): IgDialogLocale = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (closeButtonTitle != null) __obj.updateDynamic("closeButtonTitle")(closeButtonTitle.asInstanceOf[js.Any])
    if (maximizeButtonTitle != null) __obj.updateDynamic("maximizeButtonTitle")(maximizeButtonTitle.asInstanceOf[js.Any])
    if (minimizeButtonTitle != null) __obj.updateDynamic("minimizeButtonTitle")(minimizeButtonTitle.asInstanceOf[js.Any])
    if (pinButtonTitle != null) __obj.updateDynamic("pinButtonTitle")(pinButtonTitle.asInstanceOf[js.Any])
    if (restoreButtonTitle != null) __obj.updateDynamic("restoreButtonTitle")(restoreButtonTitle.asInstanceOf[js.Any])
    if (unpinButtonTitle != null) __obj.updateDynamic("unpinButtonTitle")(unpinButtonTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgDialogLocale]
  }
}

