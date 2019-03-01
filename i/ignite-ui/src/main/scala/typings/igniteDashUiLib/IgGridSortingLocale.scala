package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgGridSortingLocale
  extends /**
	 * Option for IgGridSortingLocale
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Ascending text used for header title.
  	 *
  	 */
  var ascending: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Descending text used for header title.
  	 *
  	 */
  var descending: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Specifies the text shown in the feature chooser item for sorting in ascending order (displayed only on touch environment).
  	 *
  	 */
  var featureChooserSortAsc: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Specifies the text shown in the feature chooser item for sorting in descending order (displayed only on touch environment).
  	 *
  	 */
  var featureChooserSortDesc: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Specifies the text of the feature chooser sorting button.
  	 *
  	 */
  var featureChooserText: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Specifies text of button which applies changes in modal dialog.
  	 *
  	 */
  var modalDialogButtonApplyText: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Specifies text of button which cancels the changes in the advanced sorting modal dialog.
  	 *
  	 */
  var modalDialogButtonCancelText: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Specifies caption for each ascending sorted column in multiple sorting dialog.
  	 *
  	 */
  var modalDialogCaptionButtonAsc: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Specifies caption for each descending sorted column in multiple sorting dialog.
  	 *
  	 */
  var modalDialogCaptionButtonDesc: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Specifies caption for unsort button in multiple sorting dialog.
  	 *
  	 */
  var modalDialogCaptionButtonUnsort: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Specifies caption text for multiple sorting dialog.
  	 *
  	 */
  var modalDialogCaptionText: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Specifies reset button text in the modal dialog.
  	 *
  	 */
  var modalDialogResetButton: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Specifies sortby button text for each unsorted column in multiple sorting dialog.
  	 *
  	 */
  var modalDialogSortByButtonText: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Custom sorted column tooltip in [igTemplating](http://www.igniteui.com/help/igtemplating-overview) format.
  	 *
  	 */
  var sortedColumnTooltip: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Unsorted column tooltip.
  	 *
  	 */
  var unsortedColumnTooltip: js.UndefOr[java.lang.String] = js.undefined
}

object IgGridSortingLocale {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgGridSortingLocale
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    ascending: java.lang.String = null,
    descending: java.lang.String = null,
    featureChooserSortAsc: java.lang.String = null,
    featureChooserSortDesc: java.lang.String = null,
    featureChooserText: java.lang.String = null,
    modalDialogButtonApplyText: java.lang.String = null,
    modalDialogButtonCancelText: java.lang.String = null,
    modalDialogCaptionButtonAsc: java.lang.String = null,
    modalDialogCaptionButtonDesc: java.lang.String = null,
    modalDialogCaptionButtonUnsort: java.lang.String = null,
    modalDialogCaptionText: java.lang.String = null,
    modalDialogResetButton: java.lang.String = null,
    modalDialogSortByButtonText: java.lang.String = null,
    sortedColumnTooltip: java.lang.String = null,
    unsortedColumnTooltip: java.lang.String = null
  ): IgGridSortingLocale = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (ascending != null) __obj.updateDynamic("ascending")(ascending)
    if (descending != null) __obj.updateDynamic("descending")(descending)
    if (featureChooserSortAsc != null) __obj.updateDynamic("featureChooserSortAsc")(featureChooserSortAsc)
    if (featureChooserSortDesc != null) __obj.updateDynamic("featureChooserSortDesc")(featureChooserSortDesc)
    if (featureChooserText != null) __obj.updateDynamic("featureChooserText")(featureChooserText)
    if (modalDialogButtonApplyText != null) __obj.updateDynamic("modalDialogButtonApplyText")(modalDialogButtonApplyText)
    if (modalDialogButtonCancelText != null) __obj.updateDynamic("modalDialogButtonCancelText")(modalDialogButtonCancelText)
    if (modalDialogCaptionButtonAsc != null) __obj.updateDynamic("modalDialogCaptionButtonAsc")(modalDialogCaptionButtonAsc)
    if (modalDialogCaptionButtonDesc != null) __obj.updateDynamic("modalDialogCaptionButtonDesc")(modalDialogCaptionButtonDesc)
    if (modalDialogCaptionButtonUnsort != null) __obj.updateDynamic("modalDialogCaptionButtonUnsort")(modalDialogCaptionButtonUnsort)
    if (modalDialogCaptionText != null) __obj.updateDynamic("modalDialogCaptionText")(modalDialogCaptionText)
    if (modalDialogResetButton != null) __obj.updateDynamic("modalDialogResetButton")(modalDialogResetButton)
    if (modalDialogSortByButtonText != null) __obj.updateDynamic("modalDialogSortByButtonText")(modalDialogSortByButtonText)
    if (sortedColumnTooltip != null) __obj.updateDynamic("sortedColumnTooltip")(sortedColumnTooltip)
    if (unsortedColumnTooltip != null) __obj.updateDynamic("unsortedColumnTooltip")(unsortedColumnTooltip)
    __obj.asInstanceOf[IgGridSortingLocale]
  }
}

