package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgGridGroupByLocale
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * Specifies the collapse groups button tooltip.
    *
    */
  var collapseTooltip: js.UndefOr[String] = js.native
  /**
    * Specifies the group by area text.
    *
    */
  var emptyGroupByAreaContent: js.UndefOr[String] = js.native
  /**
    * Specifies the text for the hyperlink which opens the GroupBy Dialog.
    *
    */
  var emptyGroupByAreaContentSelectColumns: js.UndefOr[String] = js.native
  /**
    * Specifies the caption for the hyperlink which opens the GroupBy Dialog.
    *
    */
  var emptyGroupByAreaContentSelectColumnsCaption: js.UndefOr[String] = js.native
  /**
    * Specifies the expand groups button tooltip.
    *
    */
  var expandTooltip: js.UndefOr[String] = js.native
  /**
    * Specifies text of button which apply changes in modal dialog.
    *
    */
  var modalDialogButtonApplyText: js.UndefOr[String] = js.native
  /**
    * Specifies text of button which cancel changes in modal dialog.
    *
    */
  var modalDialogButtonCancelText: js.UndefOr[String] = js.native
  /**
    * Specifies caption for each descending sorted column in GroupBy Dialog.
    *
    */
  var modalDialogCaptionButtonAsc: js.UndefOr[String] = js.native
  /**
    * Specifies caption for each descending sorted column in GroupBy Dialog.
    *
    */
  var modalDialogCaptionButtonDesc: js.UndefOr[String] = js.native
  /**
    * Specifies caption for ungroup button in GroupBy Dialog.
    *
    */
  var modalDialogCaptionButtonUngroup: js.UndefOr[String] = js.native
  /**
    * Specifies caption text for the GroupBy Dialog.
    *
    */
  var modalDialogCaptionText: js.UndefOr[String] = js.native
  /**
    * Specifies label for "Clear all" button in the GroupBy Dialog.
    *
    */
  var modalDialogClearAllButtonLabel: js.UndefOr[String] = js.native
  /**
    * Specifies caption of layouts dropdown button in the GroupBy Dialog.
    *
    */
  var modalDialogDropDownButtonCaption: js.UndefOr[String] = js.native
  /**
    * Specifies label for layouts dropdown in the GroupBy Dialog.
    *
    */
  var modalDialogDropDownLabel: js.UndefOr[String] = js.native
  /**
    * Specifies text for group button in GroupBy Dialog.
    *
    */
  var modalDialogGroupByButtonText: js.UndefOr[String] = js.native
  /**
    * Specifies name of the root layout which is shown for the layouts in the modal dialog tree.
    *
    */
  var modalDialogRootLevelHierarchicalGrid: js.UndefOr[String] = js.native
  /**
    * Specifies the remove group button tooltip.
    *
    */
  var removeButtonTooltip: js.UndefOr[String] = js.native
  /**
    * Specifies the summary icon title.
    *
    */
  var summaryIconTitle: js.UndefOr[String] = js.native
  /**
    * Specifies the summary row title.
    *
    */
  var summaryRowTitle: js.UndefOr[String] = js.native
}

object IgGridGroupByLocale {
  @scala.inline
  def apply(): IgGridGroupByLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridGroupByLocale]
  }
  @scala.inline
  implicit class IgGridGroupByLocaleOps[Self <: IgGridGroupByLocale] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCollapseTooltip(value: String): Self = this.set("collapseTooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollapseTooltip: Self = this.set("collapseTooltip", js.undefined)
    @scala.inline
    def setEmptyGroupByAreaContent(value: String): Self = this.set("emptyGroupByAreaContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmptyGroupByAreaContent: Self = this.set("emptyGroupByAreaContent", js.undefined)
    @scala.inline
    def setEmptyGroupByAreaContentSelectColumns(value: String): Self = this.set("emptyGroupByAreaContentSelectColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmptyGroupByAreaContentSelectColumns: Self = this.set("emptyGroupByAreaContentSelectColumns", js.undefined)
    @scala.inline
    def setEmptyGroupByAreaContentSelectColumnsCaption(value: String): Self = this.set("emptyGroupByAreaContentSelectColumnsCaption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmptyGroupByAreaContentSelectColumnsCaption: Self = this.set("emptyGroupByAreaContentSelectColumnsCaption", js.undefined)
    @scala.inline
    def setExpandTooltip(value: String): Self = this.set("expandTooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpandTooltip: Self = this.set("expandTooltip", js.undefined)
    @scala.inline
    def setModalDialogButtonApplyText(value: String): Self = this.set("modalDialogButtonApplyText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModalDialogButtonApplyText: Self = this.set("modalDialogButtonApplyText", js.undefined)
    @scala.inline
    def setModalDialogButtonCancelText(value: String): Self = this.set("modalDialogButtonCancelText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModalDialogButtonCancelText: Self = this.set("modalDialogButtonCancelText", js.undefined)
    @scala.inline
    def setModalDialogCaptionButtonAsc(value: String): Self = this.set("modalDialogCaptionButtonAsc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModalDialogCaptionButtonAsc: Self = this.set("modalDialogCaptionButtonAsc", js.undefined)
    @scala.inline
    def setModalDialogCaptionButtonDesc(value: String): Self = this.set("modalDialogCaptionButtonDesc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModalDialogCaptionButtonDesc: Self = this.set("modalDialogCaptionButtonDesc", js.undefined)
    @scala.inline
    def setModalDialogCaptionButtonUngroup(value: String): Self = this.set("modalDialogCaptionButtonUngroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModalDialogCaptionButtonUngroup: Self = this.set("modalDialogCaptionButtonUngroup", js.undefined)
    @scala.inline
    def setModalDialogCaptionText(value: String): Self = this.set("modalDialogCaptionText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModalDialogCaptionText: Self = this.set("modalDialogCaptionText", js.undefined)
    @scala.inline
    def setModalDialogClearAllButtonLabel(value: String): Self = this.set("modalDialogClearAllButtonLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModalDialogClearAllButtonLabel: Self = this.set("modalDialogClearAllButtonLabel", js.undefined)
    @scala.inline
    def setModalDialogDropDownButtonCaption(value: String): Self = this.set("modalDialogDropDownButtonCaption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModalDialogDropDownButtonCaption: Self = this.set("modalDialogDropDownButtonCaption", js.undefined)
    @scala.inline
    def setModalDialogDropDownLabel(value: String): Self = this.set("modalDialogDropDownLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModalDialogDropDownLabel: Self = this.set("modalDialogDropDownLabel", js.undefined)
    @scala.inline
    def setModalDialogGroupByButtonText(value: String): Self = this.set("modalDialogGroupByButtonText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModalDialogGroupByButtonText: Self = this.set("modalDialogGroupByButtonText", js.undefined)
    @scala.inline
    def setModalDialogRootLevelHierarchicalGrid(value: String): Self = this.set("modalDialogRootLevelHierarchicalGrid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModalDialogRootLevelHierarchicalGrid: Self = this.set("modalDialogRootLevelHierarchicalGrid", js.undefined)
    @scala.inline
    def setRemoveButtonTooltip(value: String): Self = this.set("removeButtonTooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoveButtonTooltip: Self = this.set("removeButtonTooltip", js.undefined)
    @scala.inline
    def setSummaryIconTitle(value: String): Self = this.set("summaryIconTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSummaryIconTitle: Self = this.set("summaryIconTitle", js.undefined)
    @scala.inline
    def setSummaryRowTitle(value: String): Self = this.set("summaryRowTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSummaryRowTitle: Self = this.set("summaryRowTitle", js.undefined)
  }
  
}

