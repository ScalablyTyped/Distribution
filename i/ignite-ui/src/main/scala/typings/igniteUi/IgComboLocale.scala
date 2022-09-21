package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgComboLocale
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[Any] {
  
  /**
    * Gets/Sets title for html element which represent the clear button.
    *
    */
  var clearButtonTitle: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets/Sets title for html element which represent the drop-down button.
    *
    */
  var dropDownButtonTitle: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets/Sets text of list item for condition when [filteringType](ui.igcombo#options:filteringType) option is enabled and no match was found.
    *
    */
  var noMatchFoundText: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets/Sets value that is displayed when input field is empty.
    *
    */
  var placeHolder: js.UndefOr[Any] = js.undefined
}
object IgComboLocale {
  
  inline def apply(): IgComboLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgComboLocale]
  }
  
  extension [Self <: IgComboLocale](x: Self) {
    
    inline def setClearButtonTitle(value: Any): Self = StObject.set(x, "clearButtonTitle", value.asInstanceOf[js.Any])
    
    inline def setClearButtonTitleUndefined: Self = StObject.set(x, "clearButtonTitle", js.undefined)
    
    inline def setDropDownButtonTitle(value: Any): Self = StObject.set(x, "dropDownButtonTitle", value.asInstanceOf[js.Any])
    
    inline def setDropDownButtonTitleUndefined: Self = StObject.set(x, "dropDownButtonTitle", js.undefined)
    
    inline def setNoMatchFoundText(value: Any): Self = StObject.set(x, "noMatchFoundText", value.asInstanceOf[js.Any])
    
    inline def setNoMatchFoundTextUndefined: Self = StObject.set(x, "noMatchFoundText", js.undefined)
    
    inline def setPlaceHolder(value: Any): Self = StObject.set(x, "placeHolder", value.asInstanceOf[js.Any])
    
    inline def setPlaceHolderUndefined: Self = StObject.set(x, "placeHolder", js.undefined)
  }
}
