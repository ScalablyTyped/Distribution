package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgGridSortingLocale
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Ascending text used for header title.
    *
    */
  var ascending: js.UndefOr[String] = js.native
  
  /**
    * Descending text used for header title.
    *
    */
  var descending: js.UndefOr[String] = js.native
  
  /**
    * Specifies the text shown in the feature chooser item for sorting in ascending order (displayed only on touch environment).
    *
    */
  var featureChooserSortAsc: js.UndefOr[String] = js.native
  
  /**
    * Specifies the text shown in the feature chooser item for sorting in descending order (displayed only on touch environment).
    *
    */
  var featureChooserSortDesc: js.UndefOr[String] = js.native
  
  /**
    * Specifies the text of the feature chooser sorting button.
    *
    */
  var featureChooserText: js.UndefOr[String] = js.native
  
  /**
    * Specifies text of button which applies changes in modal dialog.
    *
    */
  var modalDialogButtonApplyText: js.UndefOr[String] = js.native
  
  /**
    * Specifies text of button which cancels the changes in the advanced sorting modal dialog.
    *
    */
  var modalDialogButtonCancelText: js.UndefOr[String] = js.native
  
  /**
    * Specifies caption for each ascending sorted column in multiple sorting dialog.
    *
    */
  var modalDialogCaptionButtonAsc: js.UndefOr[String] = js.native
  
  /**
    * Specifies caption for each descending sorted column in multiple sorting dialog.
    *
    */
  var modalDialogCaptionButtonDesc: js.UndefOr[String] = js.native
  
  /**
    * Specifies caption for unsort button in multiple sorting dialog.
    *
    */
  var modalDialogCaptionButtonUnsort: js.UndefOr[String] = js.native
  
  /**
    * Specifies caption text for multiple sorting dialog.
    *
    */
  var modalDialogCaptionText: js.UndefOr[String] = js.native
  
  /**
    * Specifies reset button text in the modal dialog.
    *
    */
  var modalDialogResetButton: js.UndefOr[String] = js.native
  
  /**
    * Specifies sortby button text for each unsorted column in multiple sorting dialog.
    *
    */
  var modalDialogSortByButtonText: js.UndefOr[String] = js.native
  
  /**
    * Custom sorted column tooltip in [igTemplating](http://www.igniteui.com/help/igtemplating-overview) format.
    *
    */
  var sortedColumnTooltip: js.UndefOr[String] = js.native
  
  /**
    * Unsorted column tooltip.
    *
    */
  var unsortedColumnTooltip: js.UndefOr[String] = js.native
}
object IgGridSortingLocale {
  
  @scala.inline
  def apply(): IgGridSortingLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridSortingLocale]
  }
  
  @scala.inline
  implicit class IgGridSortingLocaleOps[Self <: IgGridSortingLocale] (val x: Self) extends AnyVal {
    
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
    def setAscending(value: String): Self = this.set("ascending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAscending: Self = this.set("ascending", js.undefined)
    
    @scala.inline
    def setDescending(value: String): Self = this.set("descending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescending: Self = this.set("descending", js.undefined)
    
    @scala.inline
    def setFeatureChooserSortAsc(value: String): Self = this.set("featureChooserSortAsc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFeatureChooserSortAsc: Self = this.set("featureChooserSortAsc", js.undefined)
    
    @scala.inline
    def setFeatureChooserSortDesc(value: String): Self = this.set("featureChooserSortDesc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFeatureChooserSortDesc: Self = this.set("featureChooserSortDesc", js.undefined)
    
    @scala.inline
    def setFeatureChooserText(value: String): Self = this.set("featureChooserText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFeatureChooserText: Self = this.set("featureChooserText", js.undefined)
    
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
    def setModalDialogCaptionButtonUnsort(value: String): Self = this.set("modalDialogCaptionButtonUnsort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModalDialogCaptionButtonUnsort: Self = this.set("modalDialogCaptionButtonUnsort", js.undefined)
    
    @scala.inline
    def setModalDialogCaptionText(value: String): Self = this.set("modalDialogCaptionText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModalDialogCaptionText: Self = this.set("modalDialogCaptionText", js.undefined)
    
    @scala.inline
    def setModalDialogResetButton(value: String): Self = this.set("modalDialogResetButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModalDialogResetButton: Self = this.set("modalDialogResetButton", js.undefined)
    
    @scala.inline
    def setModalDialogSortByButtonText(value: String): Self = this.set("modalDialogSortByButtonText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModalDialogSortByButtonText: Self = this.set("modalDialogSortByButtonText", js.undefined)
    
    @scala.inline
    def setSortedColumnTooltip(value: String): Self = this.set("sortedColumnTooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortedColumnTooltip: Self = this.set("sortedColumnTooltip", js.undefined)
    
    @scala.inline
    def setUnsortedColumnTooltip(value: String): Self = this.set("unsortedColumnTooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnsortedColumnTooltip: Self = this.set("unsortedColumnTooltip", js.undefined)
  }
}
