package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
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
  implicit class IgGridSortingLocaleMutableBuilder[Self <: IgGridSortingLocale] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAscending(value: String): Self = StObject.set(x, "ascending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAscendingUndefined: Self = StObject.set(x, "ascending", js.undefined)
    
    @scala.inline
    def setDescending(value: String): Self = StObject.set(x, "descending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescendingUndefined: Self = StObject.set(x, "descending", js.undefined)
    
    @scala.inline
    def setFeatureChooserSortAsc(value: String): Self = StObject.set(x, "featureChooserSortAsc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeatureChooserSortAscUndefined: Self = StObject.set(x, "featureChooserSortAsc", js.undefined)
    
    @scala.inline
    def setFeatureChooserSortDesc(value: String): Self = StObject.set(x, "featureChooserSortDesc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeatureChooserSortDescUndefined: Self = StObject.set(x, "featureChooserSortDesc", js.undefined)
    
    @scala.inline
    def setFeatureChooserText(value: String): Self = StObject.set(x, "featureChooserText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeatureChooserTextUndefined: Self = StObject.set(x, "featureChooserText", js.undefined)
    
    @scala.inline
    def setModalDialogButtonApplyText(value: String): Self = StObject.set(x, "modalDialogButtonApplyText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModalDialogButtonApplyTextUndefined: Self = StObject.set(x, "modalDialogButtonApplyText", js.undefined)
    
    @scala.inline
    def setModalDialogButtonCancelText(value: String): Self = StObject.set(x, "modalDialogButtonCancelText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModalDialogButtonCancelTextUndefined: Self = StObject.set(x, "modalDialogButtonCancelText", js.undefined)
    
    @scala.inline
    def setModalDialogCaptionButtonAsc(value: String): Self = StObject.set(x, "modalDialogCaptionButtonAsc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModalDialogCaptionButtonAscUndefined: Self = StObject.set(x, "modalDialogCaptionButtonAsc", js.undefined)
    
    @scala.inline
    def setModalDialogCaptionButtonDesc(value: String): Self = StObject.set(x, "modalDialogCaptionButtonDesc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModalDialogCaptionButtonDescUndefined: Self = StObject.set(x, "modalDialogCaptionButtonDesc", js.undefined)
    
    @scala.inline
    def setModalDialogCaptionButtonUnsort(value: String): Self = StObject.set(x, "modalDialogCaptionButtonUnsort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModalDialogCaptionButtonUnsortUndefined: Self = StObject.set(x, "modalDialogCaptionButtonUnsort", js.undefined)
    
    @scala.inline
    def setModalDialogCaptionText(value: String): Self = StObject.set(x, "modalDialogCaptionText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModalDialogCaptionTextUndefined: Self = StObject.set(x, "modalDialogCaptionText", js.undefined)
    
    @scala.inline
    def setModalDialogResetButton(value: String): Self = StObject.set(x, "modalDialogResetButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModalDialogResetButtonUndefined: Self = StObject.set(x, "modalDialogResetButton", js.undefined)
    
    @scala.inline
    def setModalDialogSortByButtonText(value: String): Self = StObject.set(x, "modalDialogSortByButtonText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModalDialogSortByButtonTextUndefined: Self = StObject.set(x, "modalDialogSortByButtonText", js.undefined)
    
    @scala.inline
    def setSortedColumnTooltip(value: String): Self = StObject.set(x, "sortedColumnTooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortedColumnTooltipUndefined: Self = StObject.set(x, "sortedColumnTooltip", js.undefined)
    
    @scala.inline
    def setUnsortedColumnTooltip(value: String): Self = StObject.set(x, "unsortedColumnTooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnsortedColumnTooltipUndefined: Self = StObject.set(x, "unsortedColumnTooltip", js.undefined)
  }
}
