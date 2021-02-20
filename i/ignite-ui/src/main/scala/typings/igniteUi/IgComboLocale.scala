package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgComboLocale
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Gets/Sets title for html element which represent the clear button.
    *
    */
  var clearButtonTitle: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets/Sets title for html element which represent the drop-down button.
    *
    */
  var dropDownButtonTitle: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets/Sets text of list item for condition when [filteringType](ui.igcombo#options:filteringType) option is enabled and no match was found.
    *
    */
  var noMatchFoundText: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets/Sets value that is displayed when input field is empty.
    *
    */
  var placeHolder: js.UndefOr[js.Any] = js.native
}
object IgComboLocale {
  
  @scala.inline
  def apply(): IgComboLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgComboLocale]
  }
  
  @scala.inline
  implicit class IgComboLocaleMutableBuilder[Self <: IgComboLocale] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClearButtonTitle(value: js.Any): Self = StObject.set(x, "clearButtonTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearButtonTitleUndefined: Self = StObject.set(x, "clearButtonTitle", js.undefined)
    
    @scala.inline
    def setDropDownButtonTitle(value: js.Any): Self = StObject.set(x, "dropDownButtonTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropDownButtonTitleUndefined: Self = StObject.set(x, "dropDownButtonTitle", js.undefined)
    
    @scala.inline
    def setNoMatchFoundText(value: js.Any): Self = StObject.set(x, "noMatchFoundText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoMatchFoundTextUndefined: Self = StObject.set(x, "noMatchFoundText", js.undefined)
    
    @scala.inline
    def setPlaceHolder(value: js.Any): Self = StObject.set(x, "placeHolder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceHolderUndefined: Self = StObject.set(x, "placeHolder", js.undefined)
  }
}
