package typings.igniteUi

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
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (dropDownMoveFirstText != null) __obj.updateDynamic("dropDownMoveFirstText")(dropDownMoveFirstText.asInstanceOf[js.Any])
    if (dropDownMoveLastText != null) __obj.updateDynamic("dropDownMoveLastText")(dropDownMoveLastText.asInstanceOf[js.Any])
    if (dropDownMoveLeftText != null) __obj.updateDynamic("dropDownMoveLeftText")(dropDownMoveLeftText.asInstanceOf[js.Any])
    if (dropDownMoveRightText != null) __obj.updateDynamic("dropDownMoveRightText")(dropDownMoveRightText.asInstanceOf[js.Any])
    if (featureChooserSubmenuText != null) __obj.updateDynamic("featureChooserSubmenuText")(featureChooserSubmenuText.asInstanceOf[js.Any])
    if (movingDialogButtonApplyText != null) __obj.updateDynamic("movingDialogButtonApplyText")(movingDialogButtonApplyText.asInstanceOf[js.Any])
    if (movingDialogButtonCancelText != null) __obj.updateDynamic("movingDialogButtonCancelText")(movingDialogButtonCancelText.asInstanceOf[js.Any])
    if (movingDialogCaptionButtonAsc != null) __obj.updateDynamic("movingDialogCaptionButtonAsc")(movingDialogCaptionButtonAsc.asInstanceOf[js.Any])
    if (movingDialogCaptionButtonDesc != null) __obj.updateDynamic("movingDialogCaptionButtonDesc")(movingDialogCaptionButtonDesc.asInstanceOf[js.Any])
    if (movingDialogCaptionText != null) __obj.updateDynamic("movingDialogCaptionText")(movingDialogCaptionText.asInstanceOf[js.Any])
    if (movingDialogCloseButtonTitle != null) __obj.updateDynamic("movingDialogCloseButtonTitle")(movingDialogCloseButtonTitle.asInstanceOf[js.Any])
    if (movingDialogDisplayText != null) __obj.updateDynamic("movingDialogDisplayText")(movingDialogDisplayText.asInstanceOf[js.Any])
    if (movingDialogDropTooltipText != null) __obj.updateDynamic("movingDialogDropTooltipText")(movingDialogDropTooltipText.asInstanceOf[js.Any])
    if (movingToolTipMove != null) __obj.updateDynamic("movingToolTipMove")(movingToolTipMove.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgGridColumnMovingLocale]
  }
}

