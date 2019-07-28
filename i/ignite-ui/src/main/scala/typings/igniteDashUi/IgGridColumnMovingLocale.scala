package typings.igniteDashUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgGridColumnMovingLocale
  extends /**
	 * Option for IgGridColumnMovingLocale
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Specifies caption for the move first dropdown button.
  	 *
  	 */
  var dropDownMoveFirstText: js.UndefOr[String] = js.undefined
  /**
  	 * Specifies caption for the move last dropdown button.
  	 *
  	 */
  var dropDownMoveLastText: js.UndefOr[String] = js.undefined
  /**
  	 * Specifies caption for the move left dropdown button.
  	 *
  	 */
  var dropDownMoveLeftText: js.UndefOr[String] = js.undefined
  /**
  	 * Specifies caption for the move right dropdown button.
  	 *
  	 */
  var dropDownMoveRightText: js.UndefOr[String] = js.undefined
  /**
  	 * Specifies caption text for the feature chooser submenu button.
  	 *
  	 */
  var featureChooserSubmenuText: js.UndefOr[String] = js.undefined
  /**
  	 * Specifies the apply button text.
  	 *
  	 */
  var movingDialogButtonApplyText: js.UndefOr[String] = js.undefined
  /**
  	 * Specifies the cancel button text.
  	 *
  	 */
  var movingDialogButtonCancelText: js.UndefOr[String] = js.undefined
  /**
  	 * Specifies caption for each move up button in the column moving dialog.
  	 *
  	 */
  var movingDialogCaptionButtonAsc: js.UndefOr[String] = js.undefined
  /**
  	 * Specifies caption for each move down button in the column moving dialog.
  	 *
  	 */
  var movingDialogCaptionButtonDesc: js.UndefOr[String] = js.undefined
  /**
  	 * Specifies caption text for the column moving dialog.
  	 *
  	 */
  var movingDialogCaptionText: js.UndefOr[String] = js.undefined
  /**
  	 * Specifies title for close dialog button.
  	 *
  	 */
  var movingDialogCloseButtonTitle: js.UndefOr[String] = js.undefined
  /**
  	 * Specifies caption text for the feature chooser entry.
  	 *
  	 */
  var movingDialogDisplayText: js.UndefOr[String] = js.undefined
  /**
  	 * Specifies text for drop tooltip in column moving dialog.
  	 *
  	 */
  var movingDialogDropTooltipText: js.UndefOr[String] = js.undefined
  /**
  	 * Specifies tooltip text for the move indicator.
  	 *
  	 */
  var movingToolTipMove: js.UndefOr[String] = js.undefined
}

object IgGridColumnMovingLocale {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgGridColumnMovingLocale
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    dropDownMoveFirstText: String = null,
    dropDownMoveLastText: String = null,
    dropDownMoveLeftText: String = null,
    dropDownMoveRightText: String = null,
    featureChooserSubmenuText: String = null,
    movingDialogButtonApplyText: String = null,
    movingDialogButtonCancelText: String = null,
    movingDialogCaptionButtonAsc: String = null,
    movingDialogCaptionButtonDesc: String = null,
    movingDialogCaptionText: String = null,
    movingDialogCloseButtonTitle: String = null,
    movingDialogDisplayText: String = null,
    movingDialogDropTooltipText: String = null,
    movingToolTipMove: String = null
  ): IgGridColumnMovingLocale = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (dropDownMoveFirstText != null) __obj.updateDynamic("dropDownMoveFirstText")(dropDownMoveFirstText)
    if (dropDownMoveLastText != null) __obj.updateDynamic("dropDownMoveLastText")(dropDownMoveLastText)
    if (dropDownMoveLeftText != null) __obj.updateDynamic("dropDownMoveLeftText")(dropDownMoveLeftText)
    if (dropDownMoveRightText != null) __obj.updateDynamic("dropDownMoveRightText")(dropDownMoveRightText)
    if (featureChooserSubmenuText != null) __obj.updateDynamic("featureChooserSubmenuText")(featureChooserSubmenuText)
    if (movingDialogButtonApplyText != null) __obj.updateDynamic("movingDialogButtonApplyText")(movingDialogButtonApplyText)
    if (movingDialogButtonCancelText != null) __obj.updateDynamic("movingDialogButtonCancelText")(movingDialogButtonCancelText)
    if (movingDialogCaptionButtonAsc != null) __obj.updateDynamic("movingDialogCaptionButtonAsc")(movingDialogCaptionButtonAsc)
    if (movingDialogCaptionButtonDesc != null) __obj.updateDynamic("movingDialogCaptionButtonDesc")(movingDialogCaptionButtonDesc)
    if (movingDialogCaptionText != null) __obj.updateDynamic("movingDialogCaptionText")(movingDialogCaptionText)
    if (movingDialogCloseButtonTitle != null) __obj.updateDynamic("movingDialogCloseButtonTitle")(movingDialogCloseButtonTitle)
    if (movingDialogDisplayText != null) __obj.updateDynamic("movingDialogDisplayText")(movingDialogDisplayText)
    if (movingDialogDropTooltipText != null) __obj.updateDynamic("movingDialogDropTooltipText")(movingDialogDropTooltipText)
    if (movingToolTipMove != null) __obj.updateDynamic("movingToolTipMove")(movingToolTipMove)
    __obj.asInstanceOf[IgGridColumnMovingLocale]
  }
}

