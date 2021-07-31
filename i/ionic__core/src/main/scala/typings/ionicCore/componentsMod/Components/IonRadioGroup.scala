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
  
  @scala.inline
  def apply(allowEmptySelection: Boolean, name: String): IonRadioGroup = {
    val __obj = js.Dynamic.literal(allowEmptySelection = allowEmptySelection.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonRadioGroup]
  }
  
  @scala.inline
  implicit class IonRadioGroupMutableBuilder[Self <: IonRadioGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowEmptySelection(value: Boolean): Self = StObject.set(x, "allowEmptySelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueNull: Self = StObject.set(x, "value", null)
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
