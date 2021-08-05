package typings.ionicCore.componentsMod.Components

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IonRadioGroup extends StObject {
  
  /**
    * If `true`, the radios can be deselected.
    */
  var allowEmptySelection: Boolean
  
  /**
    * The name of the control, which is submitted with the form data.
    */
  var name: String
  
  /**
    * the value of the radio group.
    */
  var value: js.UndefOr[js.Any | Null] = js.undefined
}
object IonRadioGroup {
  
  inline def apply(allowEmptySelection: Boolean, name: String): IonRadioGroup = {
    val __obj = js.Dynamic.literal(allowEmptySelection = allowEmptySelection.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonRadioGroup]
  }
  
  extension [Self <: IonRadioGroup](x: Self) {
    
    inline def setAllowEmptySelection(value: Boolean): Self = StObject.set(x, "allowEmptySelection", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
