package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgGridSortingLocale
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[Any] {
  
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
  
  inline def apply(): IgGridSortingLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridSortingLocale]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IgGridSortingLocale] (val x: Self) extends AnyVal {
    
    inline def setAscending(value: String): Self = StObject.set(x, "ascending", value.asInstanceOf[js.Any])
    
    inline def setAscendingUndefined: Self = StObject.set(x, "ascending", js.undefined)
    
    inline def setDescending(value: String): Self = StObject.set(x, "descending", value.asInstanceOf[js.Any])
    
    inline def setDescendingUndefined: Self = StObject.set(x, "descending", js.undefined)
    
    inline def setFeatureChooserSortAsc(value: String): Self = StObject.set(x, "featureChooserSortAsc", value.asInstanceOf[js.Any])
    
    inline def setFeatureChooserSortAscUndefined: Self = StObject.set(x, "featureChooserSortAsc", js.undefined)
    
    inline def setFeatureChooserSortDesc(value: String): Self = StObject.set(x, "featureChooserSortDesc", value.asInstanceOf[js.Any])
    
    inline def setFeatureChooserSortDescUndefined: Self = StObject.set(x, "featureChooserSortDesc", js.undefined)
    
    inline def setFeatureChooserText(value: String): Self = StObject.set(x, "featureChooserText", value.asInstanceOf[js.Any])
    
    inline def setFeatureChooserTextUndefined: Self = StObject.set(x, "featureChooserText", js.undefined)
    
    inline def setModalDialogButtonApplyText(value: String): Self = StObject.set(x, "modalDialogButtonApplyText", value.asInstanceOf[js.Any])
    
    inline def setModalDialogButtonApplyTextUndefined: Self = StObject.set(x, "modalDialogButtonApplyText", js.undefined)
    
    inline def setModalDialogButtonCancelText(value: String): Self = StObject.set(x, "modalDialogButtonCancelText", value.asInstanceOf[js.Any])
    
    inline def setModalDialogButtonCancelTextUndefined: Self = StObject.set(x, "modalDialogButtonCancelText", js.undefined)
    
    inline def setModalDialogCaptionButtonAsc(value: String): Self = StObject.set(x, "modalDialogCaptionButtonAsc", value.asInstanceOf[js.Any])
    
    inline def setModalDialogCaptionButtonAscUndefined: Self = StObject.set(x, "modalDialogCaptionButtonAsc", js.undefined)
    
    inline def setModalDialogCaptionButtonDesc(value: String): Self = StObject.set(x, "modalDialogCaptionButtonDesc", value.asInstanceOf[js.Any])
    
    inline def setModalDialogCaptionButtonDescUndefined: Self = StObject.set(x, "modalDialogCaptionButtonDesc", js.undefined)
    
    inline def setModalDialogCaptionButtonUnsort(value: String): Self = StObject.set(x, "modalDialogCaptionButtonUnsort", value.asInstanceOf[js.Any])
    
    inline def setModalDialogCaptionButtonUnsortUndefined: Self = StObject.set(x, "modalDialogCaptionButtonUnsort", js.undefined)
    
    inline def setModalDialogCaptionText(value: String): Self = StObject.set(x, "modalDialogCaptionText", value.asInstanceOf[js.Any])
    
    inline def setModalDialogCaptionTextUndefined: Self = StObject.set(x, "modalDialogCaptionText", js.undefined)
    
    inline def setModalDialogResetButton(value: String): Self = StObject.set(x, "modalDialogResetButton", value.asInstanceOf[js.Any])
    
    inline def setModalDialogResetButtonUndefined: Self = StObject.set(x, "modalDialogResetButton", js.undefined)
    
    inline def setModalDialogSortByButtonText(value: String): Self = StObject.set(x, "modalDialogSortByButtonText", value.asInstanceOf[js.Any])
    
    inline def setModalDialogSortByButtonTextUndefined: Self = StObject.set(x, "modalDialogSortByButtonText", js.undefined)
    
    inline def setSortedColumnTooltip(value: String): Self = StObject.set(x, "sortedColumnTooltip", value.asInstanceOf[js.Any])
    
    inline def setSortedColumnTooltipUndefined: Self = StObject.set(x, "sortedColumnTooltip", js.undefined)
    
    inline def setUnsortedColumnTooltip(value: String): Self = StObject.set(x, "unsortedColumnTooltip", value.asInstanceOf[js.Any])
    
    inline def setUnsortedColumnTooltipUndefined: Self = StObject.set(x, "unsortedColumnTooltip", js.undefined)
  }
}
