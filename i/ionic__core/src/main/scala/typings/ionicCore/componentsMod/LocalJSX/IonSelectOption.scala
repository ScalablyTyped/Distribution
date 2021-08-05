package typings.ionicCore.componentsMod.LocalJSX

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IonSelectOption extends StObject {
  
  /**
    * If `true`, the user cannot interact with the select option. This property does not apply when `interface="action-sheet"` as `ion-action-sheet` does not allow for disabled buttons.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The text value of the option.
    */
  var value: js.UndefOr[js.Any | Null] = js.undefined
}
object IonSelectOption {
  
  inline def apply(): IonSelectOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonSelectOption]
  }
  
  extension [Self <: IonSelectOption](x: Self) {
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
