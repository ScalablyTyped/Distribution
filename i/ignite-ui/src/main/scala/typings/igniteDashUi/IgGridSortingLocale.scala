package typings.igniteDashUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgGridSortingLocale
  extends /**
	 * Option for IgGridSortingLocale
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Ascending text used for header title.
  	 *
  	 */
  var ascending: js.UndefOr[String] = js.undefined
  /**
  	 * Descending text used for header title.
  	 *
  	 */
  var descending: js.UndefOr[String] = js.undefined
  /**
  	 * Specifies the text shown in the feature chooser item for sorting in ascending order (displayed only on touch environment).
  	 *
  	 */
  var featureChooserSortAsc: js.UndefOr[String] = js.undefined
  /**
  	 * Specifies the text shown in the feature chooser item for sorting in descending order (displayed only on touch environment).
  	 *
  	 */
  var featureChooserSortDesc: js.UndefOr[String] = js.undefined
  /**
  	 * Specifies the text of the feature chooser sorting button.
  	 *
  	 */
  var featureChooserText: js.UndefOr[String] = js.undefined
  /**
  	 * Specifies text of button which applies changes in modal dialog.
  	 *
  	 */
  var modalDialogButtonApplyText: js.UndefOr[String] = js.undefined
  /**
  	 * Specifies text of button which cancels the changes in the advanced sorting modal dialog.
  	 *
  	 */
  var modalDialogButtonCancelText: js.UndefOr[String] = js.undefined
  /**
  	 * Specifies caption for each ascending sorted column in multiple sorting dialog.
  	 *
  	 */
  var modalDialogCaptionButtonAsc: js.UndefOr[String] = js.undefined
  /**
  	 * Specifies caption for each descending sorted column in multiple sorting dialog.
  	 *
  	 */
  var modalDialogCaptionButtonDesc: js.UndefOr[String] = js.undefined
  /**
  	 * Specifies caption for unsort button in multiple sorting dialog.
  	 *
  	 */
  var modalDialogCaptionButtonUnsort: js.UndefOr[String] = js.undefined
  /**
  	 * Specifies caption text for multiple sorting dialog.
  	 *
  	 */
  var modalDialogCaptionText: js.UndefOr[String] = js.undefined
  /**
  	 * Specifies reset button text in the modal dialog.
  	 *
  	 */
  var modalDialogResetButton: js.UndefOr[String] = js.undefined
  /**
  	 * Specifies sortby button text for each unsorted column in multiple sorting dialog.
  	 *
  	 */
  var modalDialogSortByButtonText: js.UndefOr[String] = js.undefined
  /**
  	 * Custom sorted column tooltip in [igTemplating](http://www.igniteui.com/help/igtemplating-overview) format.
  	 *
  	 */
  var sortedColumnTooltip: js.UndefOr[String] = js.undefined
  /**
  	 * Unsorted column tooltip.
  	 *
  	 */
  var unsortedColumnTooltip: js.UndefOr[String] = js.undefined
}

object IgGridSortingLocale {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgGridSortingLocale
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    ascending: String = null,
    descending: String = null,
    featureChooserSortAsc: String = null,
    featureChooserSortDesc: String = null,
    featureChooserText: String = null,
    modalDialogButtonApplyText: String = null,
    modalDialogButtonCancelText: String = null,
    modalDialogCaptionButtonAsc: String = null,
    modalDialogCaptionButtonDesc: String = null,
    modalDialogCaptionButtonUnsort: String = null,
    modalDialogCaptionText: String = null,
    modalDialogResetButton: String = null,
    modalDialogSortByButtonText: String = null,
    sortedColumnTooltip: String = null,
    unsortedColumnTooltip: String = null
  ): IgGridSortingLocale = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (ascending != null) __obj.updateDynamic("ascending")(ascending.asInstanceOf[js.Any])
    if (descending != null) __obj.updateDynamic("descending")(descending.asInstanceOf[js.Any])
    if (featureChooserSortAsc != null) __obj.updateDynamic("featureChooserSortAsc")(featureChooserSortAsc.asInstanceOf[js.Any])
    if (featureChooserSortDesc != null) __obj.updateDynamic("featureChooserSortDesc")(featureChooserSortDesc.asInstanceOf[js.Any])
    if (featureChooserText != null) __obj.updateDynamic("featureChooserText")(featureChooserText.asInstanceOf[js.Any])
    if (modalDialogButtonApplyText != null) __obj.updateDynamic("modalDialogButtonApplyText")(modalDialogButtonApplyText.asInstanceOf[js.Any])
    if (modalDialogButtonCancelText != null) __obj.updateDynamic("modalDialogButtonCancelText")(modalDialogButtonCancelText.asInstanceOf[js.Any])
    if (modalDialogCaptionButtonAsc != null) __obj.updateDynamic("modalDialogCaptionButtonAsc")(modalDialogCaptionButtonAsc.asInstanceOf[js.Any])
    if (modalDialogCaptionButtonDesc != null) __obj.updateDynamic("modalDialogCaptionButtonDesc")(modalDialogCaptionButtonDesc.asInstanceOf[js.Any])
    if (modalDialogCaptionButtonUnsort != null) __obj.updateDynamic("modalDialogCaptionButtonUnsort")(modalDialogCaptionButtonUnsort.asInstanceOf[js.Any])
    if (modalDialogCaptionText != null) __obj.updateDynamic("modalDialogCaptionText")(modalDialogCaptionText.asInstanceOf[js.Any])
    if (modalDialogResetButton != null) __obj.updateDynamic("modalDialogResetButton")(modalDialogResetButton.asInstanceOf[js.Any])
    if (modalDialogSortByButtonText != null) __obj.updateDynamic("modalDialogSortByButtonText")(modalDialogSortByButtonText.asInstanceOf[js.Any])
    if (sortedColumnTooltip != null) __obj.updateDynamic("sortedColumnTooltip")(sortedColumnTooltip.asInstanceOf[js.Any])
    if (unsortedColumnTooltip != null) __obj.updateDynamic("unsortedColumnTooltip")(unsortedColumnTooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgGridSortingLocale]
  }
}

